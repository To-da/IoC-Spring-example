package com.gooddata.iocintroduction.spring.model;

import com.gooddata.iocintroduction.model.Engine;

public class ConfigurableEngine implements Engine {

    private String description;

    public ConfigurableEngine(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void accelerate() {
    }
}
