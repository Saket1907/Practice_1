package com.reprep;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerProblem {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ProducerConsumerExecutor pCE = new ProducerConsumerExecutor();

        Thread producer = new Thread(new Runnable() {
            public void run(){
                pCE.producer();
            }
        });

        Thread consumer = new Thread(new Runnable() {
            public void run(){
                pCE.consumer();
            }
        });

        producer.start();
        consumer.start();
    }
}

class ProducerConsumerExecutor{

    List<Integer> sharedList = new ArrayList<Integer>();
    int CAPACITY = 2;

    public void producer(){

    }
    
    public void consumer(){

    }
}
