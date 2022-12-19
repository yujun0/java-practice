package com.sample;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Long>{
    
    private int n;
    
    public FibonacciTask(int n){
        this.n = n;
    }
    
    @Override
    protected Long compute() {
        
        if(n < 39){     // 門檻值
            return fibonacci(n);
        }else{
//            FibonacciTask t1 = new FibonacciTask(n - 1);
//            t1.fork();
//            FibonacciTask t2 = new FibonacciTask(n - 2);
//            return t1.join() + t2.compute();
            ForkJoinTask<Long> t1 = new FibonacciTask(n-1).fork();
            ForkJoinTask<Long> t2 = new FibonacciTask(n-2).fork();
            return t1.join() + t2.join();
        }
    }
    
    // static 遞迴
    public static long fibonacci(int n){
        if(n < 2){
            return n;            
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
   
}
