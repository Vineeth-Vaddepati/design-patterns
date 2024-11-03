package org.example.service.impl;

import org.example.service.Duck;
import org.example.service.fly.FlyBehaviour;
import org.example.service.fly.impl.FlyWithWings;
import org.example.service.quack.QuackBehaviour;
import org.example.service.quack.impl.CanQuack;

public class YellowDuck extends Duck {
    public YellowDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new CanQuack());
    }
    public YellowDuck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour){
       setQuackBehaviour(quackBehaviour);
       setFlyBehaviour(flyBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I am Yellow Duck !!");
    }
}
