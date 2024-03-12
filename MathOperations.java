public class MathOperations {
    
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method for adding three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // Method for concatenating two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }
    
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Adding two integers
        int sumIntegers = math.add(5, 3);
        System.out.println("Sum of two integers: " + sumIntegers);
        
        // Adding three doubles
        double sumDoubles = math.add(2.5, 3.9, 1.9);
        System.out.println("Sum of three doubles: " + sumDoubles);
        
        // Concatenating two strings
        String concatenatedString = math.add("Hello, ", "Kalyani!");
        System.out.println("Concatenated string: " + concatenatedString);
    }
}
