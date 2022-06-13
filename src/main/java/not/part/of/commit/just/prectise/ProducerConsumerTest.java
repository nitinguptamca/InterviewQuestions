package not.part.of.commit.just.prectise;

import java.util.List;
import java.util.concurrent.Semaphore;

class Consumer implements Runnable{
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Consumer( Semaphore consumerSemaphore ,Semaphore producerSemaphore){
        this.consumerSemaphore =consumerSemaphore;
        this.producerSemaphore=producerSemaphore;
    }

     @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                consumerSemaphore.acquire();
                System.out.println("Consumed : "+i);
                producerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable{
    private Semaphore consumerSemaphore;
    private Semaphore producerSemaphore;

    public Producer( Semaphore producerSemaphore ,Semaphore consumerSemaphore){
        this.consumerSemaphore =consumerSemaphore;
        this.producerSemaphore=producerSemaphore;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            try {
                producerSemaphore.acquire();
                System.out.println("Producer : "+i);
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class ProducerConsumerTest {

    static  private Semaphore consumerSemaphore = new Semaphore(0);
    static  private Semaphore producerSemaphore = new Semaphore(1);

    public static void main(String[] args) {
        Thread t1= new Thread(new Producer(producerSemaphore,consumerSemaphore) ,"producer");
        Thread t2 = new Thread(new Consumer(consumerSemaphore,producerSemaphore) ,"consumer");
        t1.start();
        t2.start();
    }

}
