public class Classe {
    public static void main(String[] args) {
        Methods method1 = new Methods();
        method1.name = "Jam";
        method1.age = 35;
        method1.speak();
        method1.hello();
        Methods methods2 = new Methods();
        methods2.name = "James";
        methods2.age = 35;
        methods2.speak();
        methods2.calculateYearsToRetirement();
    }

}
