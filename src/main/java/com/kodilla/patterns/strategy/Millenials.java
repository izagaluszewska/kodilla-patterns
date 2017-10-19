package com.kodilla.patterns.strategy;

public final class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
