package com.prectise.advanced.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSingleThread {
    
    public static void main(String[] args) throws Exception{
        
        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
          //  service = Executors.newFixedThreadPool(5);

            Future<Integer> res = service.submit(() -> 30+11);

            System.out.println( res.get() );
        } finally {
            if( service != null ) service.shutdown();
        }

    }
}
