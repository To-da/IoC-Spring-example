package com.gooddata.iocintroduction.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Engine;
import com.gooddata.iocintroduction.spring.model.LoggedCar;

/**
 * Unit test for {@link LoggedCar} object
 */
@RunWith(MockitoJUnitRunner.class)
public class ModelUnitTest {

    @Mock
    Engine engine;

    @Mock
    Brake brake;

    @InjectMocks
    LoggedCar car;

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
}
