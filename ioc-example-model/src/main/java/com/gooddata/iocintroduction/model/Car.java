package com.gooddata.iocintroduction.model;

public abstract class Car {

    protected Engine engine;

    protected Brake brake;

    protected Car(Engine engine, Brake brake) {
        this.engine = engine;
        this.brake = brake;
    }

    public void speedUp() {
        engine.accelerate();
    }

    public void speedDown() {
        brake.apply();
    }
}
