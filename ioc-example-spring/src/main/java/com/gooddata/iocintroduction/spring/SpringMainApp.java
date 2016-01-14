package com.gooddata.iocintroduction.spring;

import org.apache.commons.lang3.time.StopWatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gooddata.iocintroduction.model.Car;

@SpringBootApplication
public class SpringMainApp {

    public static void main(String[] args) {
        StopWatch stopWatch = startTimer();

        ConfigurableApplicationContext run = SpringApplication.run(SpringMainApp.class, args);

        Car carBean = run.getBean(Car.class);

        carBean.speedDown();
        carBean.speedUp();

        stopTimer(stopWatch);
    }

    private static void stopTimer(StopWatch stopWatch) {
        stopWatch.stop();
        System.out.println(stopWatch.toString());
    }

    private static StopWatch startTimer() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        return stopWatch;
    }
}
