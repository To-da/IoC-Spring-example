package com.gooddata.iocintroduction.plainjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Car;
import com.gooddata.iocintroduction.model.Engine;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class ModelUnitTest {

    @Mock
    Engine engine;

    @Mock
    Brake brake;

    @InjectMocks
    TestCar car;

    @Test
    public void testBrakes() throws Exception {
        car.speedDown();
        Mockito.verify(brake).apply();
        Mockito.verifyZeroInteractions(engine);
    }

    @Test
    public void testEngine() throws Exception {
        car.speedUp();
        Mockito.verify(engine).accelerate();
        Mockito.verifyZeroInteractions(brake);
    }

    private static class TestCar extends Car {

        TestCar(Engine engine, Brake brake) {
            super(engine, brake);
        }
    }
}
