import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

public class Horse {
    String name;
    int age;
    double weight;

    Horse(){}

    public Horse(String name){
        this.name = name;
    }

    public Horse(String name, int age){

    }

    public Horse(String name, int age, double weight){

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
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
