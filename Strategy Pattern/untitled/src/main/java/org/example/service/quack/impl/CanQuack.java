package org.example.service.quack.impl;

import org.example.service.quack.QuackBehaviour;

public class CanQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack !!!");
    }
}
