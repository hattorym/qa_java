package com.example;

import java.util.List;

//Класс Лев
public class Lion {
//Есть грива (да/нет)
    boolean hasMane;
    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {          //Если самец
            hasMane = true;                 //значит есть грива
        } else if ("Самка".equals(sex)) {   //Если самка
            hasMane = false;                //гривы нет
        } else {                            //иначе - недопустимые значения на входе
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
//Кошачьи
    Feline feline = new Feline();
//Котята
    public int getKittens() {
        return feline.getKittens();
    }
//Грива
    public boolean doesHaveMane() {
        return hasMane;
    }
//Как добывает еду
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
