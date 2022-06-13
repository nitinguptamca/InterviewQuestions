package com.prectise.advanced.concurrency;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAny {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService service = null;

        try {
            System.out.println( "Begin" );
            service = Executors.newSingleThreadExecutor();
            Random random = new Random();
            Callable<String> task = () -> "result"+random.nextInt();
            String res = service.invokeAny(List.of(task, task, task, task));

            System.out.println( res );
            
            System.out.println("End");
        } finally {
            if( service != null ) service.shutdown();
        }

    }
    
}
