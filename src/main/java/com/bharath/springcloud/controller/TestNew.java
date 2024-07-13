package com.bharath.springcloud.controller;

import lombok.SneakyThrows;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNew {

    public static void main(String[] args) {

        Thread t1 = new Thread(new EvenNumber());
        Thread t2 = new Thread(new OddNumber());
        t1.setPriority(6);
        t1.start();
        t2.start();
    }

}

class EvenNumber implements Runnable{

    @SneakyThrows
    @Override
    public void run() {
        for(int i=1; i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                Thread.sleep(1);
            }
        }
    }
}

class OddNumber implements Runnable{

    @SneakyThrows
    @Override
    public void run() {
        for(int i=1; i<=10;i++){
            if(i%2 !=0){
                System.out.println(i);
                Thread.sleep(1);
            }
        }
    }
}

