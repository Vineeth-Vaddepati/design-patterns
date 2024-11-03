package org.example;

import org.example.service.Duck;
import org.example.service.fly.impl.FlyWithWings;
import org.example.service.impl.MallardDuck;
import org.example.service.impl.YellowDuck;
import org.example.service.quack.impl.NoQuack;

public class Main {
    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performSwim();
        duck.performFly();

        duck=new YellowDuck(new NoQuack(),new FlyWithWings());
        duck.display();
        duck.performQuack();
        duck.performSwim();
        duck.performFly();
    }
}