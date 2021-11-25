package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal kitty;
    Animal bello;
    Animal simba;

    @BeforeEach
    void setUp() {
        kitty = new Animal("Kitty",2,"Katze","Miau");
        bello = new Animal("Bello",4,"Hund","Wuff");
        simba = new Animal("Simba",1,"Löwe","Roarr");
    }

    @Test
    void giveAnimalLoud() {

        Assertions.assertEquals("Miau", kitty.giveAnimalLoud());
        Assertions.assertEquals("Wuff", bello.giveAnimalLoud());
        Assertions.assertEquals("Roarr", simba.giveAnimalLoud());

    }

    @Test
    void getNameAndAge() {
        Assertions.assertEquals("Name: Kitty Age: 2",kitty.getNameAndAge());
        Assertions.assertEquals("Name: Bello Age: 4",bello.getNameAndAge());
        Assertions.assertEquals("Name: Simba Age: 1",simba.getNameAndAge());

        bello.setAge(-4);
        Assertions.assertEquals("Name: Bello Age: 0",bello.getNameAndAge());

        bello = new Animal("Bello",-3,"Hund","Wuff");
        Assertions.assertEquals("Name: Bello Age: 0",bello.getNameAndAge());
    }

    @Test
    void ageCategory() {

        Assertions.assertEquals("baby animal",kitty.ageCategory());
        Assertions.assertEquals("young animal",bello.ageCategory());
        Assertions.assertEquals("baby animal",simba.ageCategory());

        bello.setAge(7);
        Assertions.assertEquals("old animal",bello.ageCategory());

    }
}