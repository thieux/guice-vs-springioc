package com.mathieupauly.guicevsspringioc;

import com.mathieupauly.guicevsspringioc.time.Clock;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class SpringIocTest {

    @Test
    public void classPathAppContext() {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/mathieupauly/guicevsspringioc/clock.xml");
        final Clock clock = context.getBean("clock", Clock.class);
        final Date time = clock.currentTime();

        assertNotNull(time);
    }

}