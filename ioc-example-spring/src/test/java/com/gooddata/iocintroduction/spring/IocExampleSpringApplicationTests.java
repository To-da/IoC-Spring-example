package com.gooddata.iocintroduction.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gooddata.iocintroduction.model.Brake;
import com.gooddata.iocintroduction.model.Engine;
import com.gooddata.iocintroduction.spring.model.LoggedCar;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringMainApp.class)
public class IocExampleSpringApplicationTests {

    @Autowired
    LoggedCar car;

    @Autowired
    Brake brake;

    @Autowired
    Engine engine;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(car);
        Assert.assertNotNull(brake);
        Assert.assertNotNull(engine);
    }

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

    @Configuration
    static class TestConfig {

        @Bean
        @Primary
        public Engine mockedEngine() {
            return Mockito.mock(Engine.class);
        }

        @Bean
        @Primary
        public Brake mockedBrake() {
            return Mockito.mock(Brake.class);
        }
    }

}
