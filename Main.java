class Person {
    private String name;
    private int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Person person1 = new Person("Alice", 30);

       
        Person person2 = new Person(person1);

       
        System.out.println("Details of person1:");
        person1.display();
        System.out.println("Details of person2:");
        person2.display();
    }
}