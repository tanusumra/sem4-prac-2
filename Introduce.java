public class Introduce {
    public static void main(String[] args) {
        
        Person person = new Person("John Doe", 30, "123 Main St");

       
        person.setName("Alice Smith");
        person.setAge(25);
        person.setAddress("456 Elm St");

       
        person.introduce();
    }
}