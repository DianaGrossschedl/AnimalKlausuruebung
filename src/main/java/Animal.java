package main.java;

public class Animal {

    String name;
    int age;
    String species;
    String animalLoud;

    public Animal(String name, int age, String species, String animalLoud) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
        this.species = species;
        this.animalLoud = animalLoud;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud(){
        return getAnimalLoud();
    }

    public String getNameAndAge(){
        return "Name: " + getName() + " Age: " + getAge();
    }

    public String ageCategory(){
        String category;
        int age = getAge();

        if (age <= 2){
            category = "baby animal";
        }
        else if (age <= 4){
            category = "young animal";
        }
        else {category = "old animal";}

        return category;
    }

}
