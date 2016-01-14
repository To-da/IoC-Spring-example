package com.gooddata.iocintroduction.plainjava.model;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Engine;

public class LoggedCarBuilder {
    private Engine engine;
    private Brake brake;

    public LoggedCarBuilder withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public LoggedCarBuilder withBrake(Brake brake) {
        this.brake = brake;
        return this;
    }

    public LoggedCar build() {
        return new LoggedCar(engine, brake);
    }
}