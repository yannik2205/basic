package com.company.Semester3.Tiere;

class Animal {
    String species_name;
    String[] stomache_contents = new String[30];
    String animal_name;
    int number_off_feedings = 0;

    public Animal()
    {
        species_name = "default animal";
        animal_name = "no name";
        stomache_contents = new String[30];
        number_off_feedings = 0;
    }
    public Animal (String given_species_name, String given_animal_name)
    {
        species_name = given_species_name;
        stomache_contents = new String[30];
        animal_name =  given_animal_name;
        number_off_feedings = 0;
    }

    public Animal (Animal another_animal)
    {
        species_name = another_animal.species_name;
        stomache_contents = another_animal.stomache_contents;
        animal_name = another_animal.animal_name;
        number_off_feedings = another_animal.number_off_feedings;
    }

    public void feed (String food_for_this_animal)
    {
        stomache_contents [number_off_feedings]= food_for_this_animal;
        number_off_feedings++;
    }

    public void make_speak()
    {
        System.out.println("\n Hello I am a " + species_name + " called " + animal_name +".");
        if (stomache_contents[0] == null )
        {
            System.out.print(" My stomach is empty \n");
        }
        else
        {
            System.out.print(" I have eaten: ");
            for (int food_index = 0; food_index < number_off_feedings; food_index++)
            {
                System.out.print(stomache_contents[food_index] + ", " );
            }
            System.out.println();
        }
    }

    public void make_stomach_empty()
    {
        stomache_contents = new String[30];
        number_off_feedings = 0;
    }
}

class Animals{
    public static void main(String[] args) {
        Animal cat_object = new Animal("cat", "Ludwig");
        Animal dog_object = new Animal("vegetarian dog", "Ivan");

        cat_object.feed("fish");
        cat_object.feed("chicken");

        dog_object.feed("salad");
        dog_object.feed("potatoes");

        Animal another_cat = new Animal(cat_object);

        Animal default_animal = new Animal();

        another_cat.feed("milk");

        Carnivore tiger = new Carnivore("tiger", "LockerNhTonne");
        Animal cow = new Animal("Cow", "Berta");
        tiger.feed(cow);


        Zoo test_zoo = new Zoo();
        test_zoo.add_animal(cat_object);
        test_zoo.add_animal(dog_object);
        test_zoo.add_animal(another_cat);
        test_zoo.add_animal(tiger);
        test_zoo.make_animals_speak();

    }
}
class Zoo
{
    Animal[] animals_in_zoo = new Animal[20];
    int number_of_animals_in_zoo = 0;
    public void add_animal(Animal new_animal_too_zoo) {
        animals_in_zoo[number_of_animals_in_zoo] = new Animal(new_animal_too_zoo);
        number_of_animals_in_zoo++;
    }
    public void make_animals_speak()
    {
        for (int animal_index = 0; animal_index < number_of_animals_in_zoo; animal_index ++)
        {
            animals_in_zoo[animal_index].make_speak();
        }
    }
}

class Carnivore extends Animal
{
    public Carnivore(String given_species_name, String given_name)
    {
        species_name  =given_species_name;
        animal_name = given_name;
        stomache_contents[number_off_feedings] = "";
    }

    public void feed(Animal animal_to_be_eaten) {
        super.feed(animal_to_be_eaten.species_name);
    }

    @Override
    public void make_speak() {
        super.make_speak();
    }
}

