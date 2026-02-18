
public class Students5 {

    int id;
    String name;
    int age;

    // Two-argument constructor
    Students5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Three-argument constructor
    Students5(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {

        Students5 s1 = new Students5(101, "Rahul");
        Students5 s2 = new Students5(102, "Aman", 20);

        s1.display();
        s2.display();
    }
}
