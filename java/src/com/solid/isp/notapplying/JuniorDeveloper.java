package com.solid.isp.notapplying;

public class JuniorDeveloper implements Developer {

    @Override
    public void develops() {
        // TODO something
    }

    @Override
    public void architectApplication() {
        throw new RuntimeException("A junior developer cannot develop an architecture of a large application.");
    }

    @Override
    public void reviewCode() {
        throw new RuntimeException("A junior developer is learning how to develop.");
    }
}
