package com.madman.base.facade;

import org.junit.Test;

public class ClientTest {
    /**
     * 正常调用
     *
     * @param args
     */
    public static void main(String[] args) {
        Container container = new Container();
        Freezer freezer = new Freezer();
        container.init();
        freezer.init();
        container.run();
        freezer.run();
        container.shutdown();
        container.shutdown();
    }

    /***
     * 外观模式调用
     */
    @Test
    public void facadeTest() {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.init();
        refrigerator.run();
        refrigerator.shutdown();

    }
}

