package com.gooddata.iocintroduction.plainjava;

import org.apache.commons.lang3.time.StopWatch;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Car;
import com.gooddata.iocintroduction.model.Engine;
import com.gooddata.iocintroduction.plainjava.model.LoggedCar;

public class PlainJavaMainApp
{
    public static void main( String[] args )
    {
        StopWatch stopWatch = startTimer();

        Car loggedCar = prepareCar();

        loggedCar.speedUp();

        loggedCar.speedDown();

        stopTimer(stopWatch);
    }

    private static Car prepareCar() {
        Brake brake = () -> System.out.println("... stopping");

        Engine engine = () -> System.out.println("... accelerating");

        return LoggedCar.builder().withBrake(brake).withEngine(engine).build();
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
