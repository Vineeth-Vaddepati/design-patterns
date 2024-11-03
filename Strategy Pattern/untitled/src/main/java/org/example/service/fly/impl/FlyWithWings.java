package org.example.service.fly.impl;

import org.example.service.fly.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can Fly!!!!");
    }
}
