public class Box {
    private double length;
    private double width;
    private double height;

    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 1.0;
    }

    
    public double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        
        Box box1 = new Box(3.0, 4.0, 5.0);
        Box box2 = new Box(2.0, 3.0); 

        
        System.out.println("Volume of box1: " + box1.calculateVolume());
        System.out.println("Volume of box2: " + box2.calculateVolume());
    }
}