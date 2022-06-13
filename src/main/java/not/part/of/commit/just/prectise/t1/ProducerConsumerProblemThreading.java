package not.part.of.commit.just.prectise.t1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerProblemThreading {
  static   List<String> stocks = new ArrayList<>();
  final   static int  MAX_CAPACITY=2;
    static public class Consumer implements Runnable {
        private List<String> stocks;
        public Consumer(List<String> stocks) {
            this.stocks = stocks;
        }
        @Override
        public void run() {
            while (true){
                synchronized (stocks){
                    while(stocks.size()==0) {
                        try {
                            stocks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + stocks.get(0));
                    stocks.remove(0);
                    stocks.notifyAll();
                }
            }
        }
    }

    static public class Producer implements Runnable {
        private List<String> stocks;
        public Producer(List<String> stocks) {
            this.stocks = stocks;
        }
        @Override
        public void run() {
            while (true){
                synchronized (stocks){
                    while(stocks.size()==MAX_CAPACITY) {
                        try {
                            stocks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    stocks.add(new Random().toString());
                    System.out.println(Thread.currentThread().getName() + stocks.get(0));
                    stocks.notifyAll();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Consumer(stocks) ,"Consumer");
        Thread t2 = new Thread(new Producer(stocks) ,"Producer");
        t1.start();
        t2.start();
    }
}
