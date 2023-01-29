package ru.praktikum.yandex;

import java.util.List;

//Хищник
public interface Predator {
    //Жрёт мясо
    List<String> eatMeat() throws Exception;

}
