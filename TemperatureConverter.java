public class TemperatureConverter {
    
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        
        double fahrenheit = 98.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equivalent to " + celsius + " Celsius.");

        celsius = 37;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equivalent to " + fahrenheit + " Fahrenheit.");
    }
}