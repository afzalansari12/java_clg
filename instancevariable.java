
public class instancevariable {

    String name;   // instance variable
    int age;       // instance variable

    // Constructor
    public instancevariable(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) {
        instancevariable obj = new instancevariable("Afzal", 20);
        obj.display();
    }
}
