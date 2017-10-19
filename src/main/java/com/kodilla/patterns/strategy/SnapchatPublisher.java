package com.kodilla.patterns.strategy;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "I prefer Snapchat";
    }
}
