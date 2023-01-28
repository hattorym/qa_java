package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTestCheckMeatList() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals( List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTestCheckFelineFamily() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи",   feline.getFamily());
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void testGetKittens() {
    }
}