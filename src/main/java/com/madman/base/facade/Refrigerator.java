package com.madman.base.facade;

public class Refrigerator {
    Container container = new Container();
    Freezer freezer = new Freezer();

    public void init() {
        container.init();
        freezer.init();
    }

    public void run() {
        container.run();
        freezer.run();
    }

    public void shutdown() {
        container.shutdown();
        freezer.shutdown();
    }
}

