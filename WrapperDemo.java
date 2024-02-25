public class WrapperDemo {
    public static void main(String[] args) {
       
        int num = 10;

        
        Integer wrappedNum = Integer.valueOf(num);

       
        System.out.println("Wrapped value: " + wrappedNum);

       
        String str = "20";
        int parsedValue = Integer.parseInt(str);

        
        System.out.println("Parsed value: " + parsedValue);
    }
}