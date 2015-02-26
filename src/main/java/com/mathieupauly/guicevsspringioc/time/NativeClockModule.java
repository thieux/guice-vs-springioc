package com.mathieupauly.guicevsspringioc.time;

import com.google.inject.AbstractModule;

public class NativeClockModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Clock.class).to(NativeClock.class);
    }
}
