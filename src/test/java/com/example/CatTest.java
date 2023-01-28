package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


    public class CatTest {
        Cat cat;
        @Before
        public void  prepareData(){
        Feline feline = new Feline();
        cat = new Cat(feline);
        }
    @Test
    public void getCatSoundTestShouldReturnCorrectSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getCatFoodTestShouldReturnCorrectFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}