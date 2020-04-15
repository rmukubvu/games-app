package com.spandigital.assessment.processor.receiver;

import java.io.InputStream;

public abstract class ScoreDataReceiver {
    public abstract Iterable<String> readInput(InputStream inputStream);
}
