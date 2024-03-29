import org.junit.Before;
import org.junit.Test;
import ru.praktikum.yandex.Cat;
import ru.praktikum.yandex.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class CatTest {
    Cat cat;

    @Before
    public void prepareData() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getCatSoundTestShouldReturnCorrectSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getCatFoodTestShouldReturnCorrectFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}