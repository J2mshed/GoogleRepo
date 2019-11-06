public class ConstructorHorse {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.setName("Rakhsh");
        h1.setAge(7);
        h1.setWeight(654.3);

        String print1 = h1.getName();
        int print2 = h1.getAge();
        double print3 = h1.getWeight();

        System.out.println(print1 + "\t" + print2 + "\t" + print3);
    }


}
