package com.gooddata.iocintroduction.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Car;
import com.gooddata.iocintroduction.model.Engine;

@Component
public class LoggedCar extends Car {

    @Autowired
    protected LoggedCar(Engine engine, Brake brake) {
        super(engine, brake);
    }
}
