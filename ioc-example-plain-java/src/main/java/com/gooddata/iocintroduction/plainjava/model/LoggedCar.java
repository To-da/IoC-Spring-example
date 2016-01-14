package com.gooddata.iocintroduction.plainjava.model;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Car;
import com.gooddata.iocintroduction.model.Engine;

public class LoggedCar extends Car {

    LoggedCar(Engine engine, Brake brake) {
        super(engine, brake);
    }

    public static LoggedCarBuilder builder() {
        return new LoggedCarBuilder();
    }
}
