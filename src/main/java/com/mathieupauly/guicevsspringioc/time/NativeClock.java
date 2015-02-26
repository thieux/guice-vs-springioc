package com.mathieupauly.guicevsspringioc.time;

import java.util.Date;

public class NativeClock implements Clock {

    @Override
    public Date currentTime() {
        return new Date();
    }
}
