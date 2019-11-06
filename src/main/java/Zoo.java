public class Zoo {
    public static void main(String[] args) {
        // Define variable
        Horse myFavoriteAnimal;
        // init the variable with new object of Horse
        myFavoriteAnimal = new Horse();
        // Or we can use this: Horse myFavoriteAnimal = new Horse();
        // Set name field value
        myFavoriteAnimal.setName("Rakhsh");
        // Set age field value
        myFavoriteAnimal.setAge(8);
        // Set weight field value
        myFavoriteAnimal.setWeight(755.4);

        System.out.println("Name:\t" + myFavoriteAnimal.getName());
        System.out.println("Age:\t" + myFavoriteAnimal.getAge());
        System.out.println("Weight:\t" + myFavoriteAnimal.getWeight());

    }
}
