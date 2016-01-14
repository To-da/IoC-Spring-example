package com.gooddata.iocintroduction.spring.model;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Car;
import com.gooddata.iocintroduction.model.Engine;

public class ConfigurableCar extends Car {

    protected ConfigurableCar(Engine engine, Brake brake) {
        super(engine, brake);
    }

    public Brake getBrake() {
        return brake;
    }

    public Engine getEngine() {
        return engine;
    }
}
