package com.gooddata.iocintroduction.spring.model;

import com.gooddata.iocintroduction.model.Brake;

public class ConfigurableBrake implements Brake {

    private String description;

    public ConfigurableBrake(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void apply() {

    }
}
