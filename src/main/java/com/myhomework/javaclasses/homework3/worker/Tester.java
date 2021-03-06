package com.myhomework.javaclasses.homework3.worker;

public class Tester extends Human implements Worker {

    public Tester(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void work() {
        if(!getSleepState()){
            System.out.println("I am testing now");
        }else{
            System.out.println("I cannot test while sleeping");
        }
    }
}
