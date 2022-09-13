package com.company.projekte_praxis_zweites_semester.Tiere;

class Animal {
    String species_name;
    String stomache_contents;
    String animal_name;

    public Animal (String given_species_name, String given_anmial_name)
    {
        species_name = given_species_name;
        stomache_contents = "";
        animal_name =  given_anmial_name;
    }

    public Animal (Animal another_animal)
    {
        species_name = another_animal.species_name;
        stomache_contents = another_animal.stomache_contents;
        animal_name = another_animal.animal_name;
    }

    public void feed (String food_for_this_animal)
    {
        stomache_contents = stomache_contents + food_for_this_animal + ", ";
    }

    public void make_speak()
    {
        System.out.println("\n Hello I am a " + species_name + " called " + animal_name +".");
        if (stomache_contents.length() ==0 )
        {
            System.out.print(" My stomach is empty \n");
        }
        else
        {
            System.out.print(" I have eaten: " + stomache_contents + ".\n");
        }
    }

    public void make_stomach_empty()
    {
        stomache_contents = "";
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

        another_cat.feed("milk");

        cat_object.make_speak();
        dog_object.make_speak();
        another_cat.make_speak();
    }
}
