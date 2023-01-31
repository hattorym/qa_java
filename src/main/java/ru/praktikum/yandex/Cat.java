package ru.praktikum.yandex;

import java.util.List;

//Класс Кот
public class Cat {
    //Хышник
    Predator predator;

    //Этот хищник из кошачьих
    public Cat(Feline feline) {
        this.predator = feline;
    }

    //Издает звук
    public String getSound() {
        return "Мяу";
    }

    //Жрёт мясо
    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
