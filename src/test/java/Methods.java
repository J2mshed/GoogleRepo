public class Methods {
    String name;
    int age;

    void calculateYearsToRetirement(){
        int years = 65 -age;
        System.out.println("Years to retirement " +years);
    }

    void speak(){
        for (int i=0; i<3; i++){
        System.out.println("My name is "+name +", "+age+"years");
        }
    }

    void hello(){
        System.out.println("Hello!");
    }

}
