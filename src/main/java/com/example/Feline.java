package com.example;

import java.util.List;

//Класс кошачьи \ животные \ хищник
public class Feline extends Animal implements Predator {
//Хищник жрёт мясо
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
//Семейство кошачьих
    @Override
    public String getFamily() {
        return "Кошачьи";
    }
//Есть котята
    public int getKittens() {
        return getKittens(1);
    }
//Количество котят
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
