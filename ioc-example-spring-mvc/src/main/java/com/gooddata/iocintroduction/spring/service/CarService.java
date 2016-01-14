package com.gooddata.iocintroduction.spring.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

import com.gooddata.iocintroduction.spring.model.ConfigurableBrake;

@Service
public class CarService {

    ConcurrentMap<String, ConfigurableBrake> brakeMap = new ConcurrentHashMap<>();

    private void addBrake(ConfigurableBrake brake) {
        if (brakeMap.containsKey(brake.getDescription())) {
            throw new IllegalArgumentException("Brake with desc.:" + brake.getDescription() + " already saved.");
        }
        brakeMap.put(brake.getDescription(), brake);
    }

}
