package com.mkyong.hashing;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    private String INPUT = "123456";

    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(INPUT).length());
    }

    @Test
    public void testHex() {
        String expected = "bb0cf6eb9b17d0f7d22b456f121257dc1254e1f01665370476383ea776df414";
        Assert.assertEquals(expected, App.sha256hex(INPUT));
    }

}