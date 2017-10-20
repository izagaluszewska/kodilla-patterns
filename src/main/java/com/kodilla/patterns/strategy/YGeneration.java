package com.kodilla.patterns.strategy;

public final class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}

