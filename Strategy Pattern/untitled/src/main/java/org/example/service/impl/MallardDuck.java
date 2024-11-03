package org.example.service.impl;

import org.example.service.Duck;
import org.example.service.fly.FlyBehaviour;
import org.example.service.fly.impl.CannotFly;
import org.example.service.fly.impl.FlyWithWings;
import org.example.service.quack.QuackBehaviour;
import org.example.service.quack.impl.NoQuack;

public class MallardDuck extends Duck {
    //setting default behaviours for Mallard Duck
    public MallardDuck(){
        setQuackBehaviour(new NoQuack());
       setFlyBehaviour(new FlyWithWings());
    }
    //If behaviours need to be changed, then using this constructor we can change them.
    public MallardDuck(QuackBehaviour quackBehaviour,FlyBehaviour flyBehaviour){
        setQuackBehaviour(quackBehaviour);
        setFlyBehaviour(flyBehaviour);
    }


    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }
}
