public class TypeCastingDemo {

    public static void main(String[] args) {

        // Original variables
        int number = 100;
        double decimalNumber = 45.75;
        float floatNumber = 25.5f;
        char character = 'A';

        // 1. Implicit Type Casting: int to double
        double convertedDouble = number;

        System.out.println("Implicit Casting (int to double): " + convertedDouble);

        // 2. Explicit Type Casting: double to int
        int convertedInt = (int) decimalNumber;

        System.out.println("Explicit Casting (double to int): " + convertedInt);

        // 3. Explicit Type Casting: float to int
        int convertedFloat = (int) floatNumber;

        System.out.println("Float to int: " + convertedFloat);

        // 4. Character to integer conversion
        int characterValue = character;

        System.out.println("Character to int: " + characterValue);

        // 5. Convert integer to String
        String numberString = String.valueOf(number);

        System.out.println("Integer to String: " + numberString);

        // 6. Convert double to String
        String doubleString = String.valueOf(decimalNumber);

        System.out.println("Double to String: " + doubleString);

        // 7. Convert String to integer
        String ageText = "24";
        int age = Integer.parseInt(ageText);

        System.out.println("String to int: " + age);

        // 8. Convert String to double
        String priceText = "99.50";
        double price = Double.parseDouble(priceText);

        System.out.println("String to double: " + price);
    }
}