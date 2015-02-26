package com.mathieupauly.guicevsspringioc;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mathieupauly.guicevsspringioc.time.Clock;
import com.mathieupauly.guicevsspringioc.time.NativeClockModule;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class GuiceTest {

    @Test
    public void guiceInjector() {
        final Injector injector = Guice.createInjector(new NativeClockModule());
        final Clock instance = injector.getInstance(Clock.class);
        final Date time = instance.currentTime();

        assertNotNull(time);
    }
}
