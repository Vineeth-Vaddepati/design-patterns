package org.example.service;

import org.example.service.fly.FlyBehaviour;
import org.example.service.quack.QuackBehaviour;

//abstract class is used to demonstrate that certain properties are constant
// and certain properties are varying
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    //Quack and fly are the actions that are varying with each type of duck but are limited set of behaviours
    public void performQuack(){
        quackBehaviour.quack();
    };
    public void performFly(){
        flyBehaviour.fly();
    };
    //This is constant behaviour for all kinds of Ducks
    public void performSwim(){
        System.out.println("I can swim !!!");
    };

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    //This is an action that is different with every duck. Hence, needs to be implemented for each duck
    public abstract void display();
}
