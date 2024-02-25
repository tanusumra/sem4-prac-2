public class Sample {
    public static void main(String[] args) {
       
        TemperatureConverter converter = new TemperatureConverter();

        
        double fahrenheit = 98.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equivalent to " + celsius + " Celsius.");

        celsius = 37;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equivalent to " + fahrenheit + " Fahrenheit.");

        
        Person person = new Person("John Doe", 30, "123 Main St");

       
        person.introduce();

        
        Calculator calculator = new Calculator();

        
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        System.out.println("Division: " + calculator.divide(a, b));
    }
}