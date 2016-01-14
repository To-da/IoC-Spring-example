package com.gooddata.iocintroduction.spring.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.gooddata.iocintroduction.spring.model.ConfigurableBrake;

@Controller
public class BrakeResource {

    private void addBrake(@RequestBody ConfigurableBrake brake) {

    }

}
