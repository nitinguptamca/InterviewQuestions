package not.part.of.commit.just.prectise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerProblem {
    List<String> stock = new ArrayList<>();
    int maxCapacity = 1;

    public void consumer() throws InterruptedException {
        while (true) {
            synchronized (stock) {
                while (stock.size() <= 0) {
                    System.out.println("waiting consumer");
                    stock.wait();
                }
                System.out.println(Thread.currentThread().getName() + stock.get(0));
                stock.remove(0);
                stock.notifyAll();
            }
        }
    }


    public void producer(String s) throws InterruptedException {
        while (true) {
            synchronized (stock) {
                while (stock.size() == maxCapacity) {
                    System.out.println("waiting Producer");
                    stock.wait();
                }
                stock.add(s);
                System.out.println(Thread.currentThread().getName() + stock.get(0));
                stock.notifyAll();
            }
        }
    }


    public static void main(String[] args) {
        ProducerConsumerProblem producerConsumerProblem = new ProducerConsumerProblem();
        Random rd =new Random();
        Thread t1 = new Thread(() -> {
            try {
                producerConsumerProblem.producer("stock" + rd.nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "producer");

        Thread t2 = new Thread(() -> {
            try {
                producerConsumerProblem.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Consumer");
        t1.start();
        t2.start();
    }
}
