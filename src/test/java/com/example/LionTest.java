package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int kittens =  lion.getKittens();
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void doesHaveMane() {
    }

    @Test
    public void getFood() {
    }
}