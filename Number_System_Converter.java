import java.util.Scanner;

public class Number_System_Converter {

    // Convert Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // Start with base 2^0

        // Process each digit from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base; // Add base value if bit is 1
            }
            base *= 2; // Move to the next power of 2
        }
        return decimal;
    }

    // Convert Decimal to Binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        // Use successive division by 2 to get binary representation
        while (decimal > 0) {
            binary.insert(0, decimal % 2); // Insert remainder at the start
            decimal /= 2; // Divide decimal by 2
        }
        return binary.length() > 0 ? binary.toString() : "0"; // Return "0" if decimal is 0
    }

    // Convert Decimal to Octal
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        // Use successive division by 8 to get octal representation
        while (decimal > 0) {
            octal.insert(0, decimal % 8); // Insert remainder at the start
            decimal /= 8; // Divide decimal by 8
        }
        return octal.length() > 0 ? octal.toString() : "0"; // Return "0" if decimal is 0
    }

    // Convert Decimal to Hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        // Use successive division by 16 for hexadecimal representation
        while (decimal > 0) {
            hex.insert(0, hexChars[decimal % 16]); // Insert corresponding hex character
            decimal /= 16; // Divide decimal by 16
        }
        return hex.length() > 0 ? hex.toString() : "0"; // Return "0" if decimal is 0
    }

    // Convert Octal to Decimal
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int base = 1; // Start with base 8^0

        // Process each digit from right to left
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * base; // Multiply each digit by its base
            base *= 8; // Move to the next power of 8
        }
        return decimal;
    }

    // Convert Hexadecimal to Decimal
    public static int hexadecimalToDecimal(String hex) {
        int decimal = 0;
        int base = 1; // Start with base 16^0

        // Process each digit from right to left
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);
            int value = (hexChar >= '0' && hexChar <= '9')
                    ? hexChar - '0'
                    : 10 + (hexChar - 'A'); // Convert character to value

            decimal += value * base; // Multiply by power of 16
            base *= 16; // Move to the next power of 16
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.println("       Welcome to the NUMBER SYSTEM CONVERTER           ");
        System.out.println("*********************************************************");

        int choice = 1; // Initialize choice

        while (choice != 13) {
            // Display menu for number system conversions
            System.out.println("\nConversion Options:");
            System.out.println(" 1. Binary to Octal");
            System.out.println(" 2. Binary to Decimal");
            System.out.println(" 3. Binary to Hexadecimal");
            System.out.println(" 4. Octal to Binary");
            System.out.println(" 5. Octal to Decimal");
            System.out.println(" 6. Octal to Hexadecimal");
            System.out.println(" 7. Decimal to Binary");
            System.out.println(" 8. Decimal to Octal");
            System.out.println(" 9. Decimal to Hexadecimal");
            System.out.println("10. Hexadecimal to Binary");
            System.out.println("11. Hexadecimal to Octal");
            System.out.println("12. Hexadecimal to Decimal");
            System.out.println("13. Exit");
            System.out.print("\nEnter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // Consume newline character

            String binary, octal, hex;
            int decimal;

            switch (choice) {
                case 1: // Binary to Octal
                    System.out.print("Enter the binary number: ");
                    binary = input.nextLine();
                    decimal = binaryToDecimal(binary);
                    octal = decimalToOctal(decimal);
                    System.out.println("Octal: " + octal);
                    break;

                case 2: // Binary to Decimal
                    System.out.print("Enter the binary number: ");
                    binary = input.nextLine();
                    decimal = binaryToDecimal(binary);
                    System.out.println("Decimal: " + decimal);
                    break;

                case 3: // Binary to Hexadecimal
                    System.out.print("Enter the binary number: ");
                    binary = input.nextLine();
                    decimal = binaryToDecimal(binary);
                    hex = decimalToHexadecimal(decimal);
                    System.out.println("Hexadecimal: " + hex);
                    break;

                case 4: // Octal to Binary
                    System.out.print("Enter the octal number: ");
                    octal = input.nextLine();
                    decimal = octalToDecimal(octal);
                    binary = decimalToBinary(decimal);
                    System.out.println("Binary: " + binary);
                    break;

                case 5: // Octal to Decimal
                    System.out.print("Enter the octal number: ");
                    octal = input.nextLine();
                    decimal = octalToDecimal(octal);
                    System.out.println("Decimal: " + decimal);
                    break;

                case 6: // Octal to Hexadecimal
                    System.out.print("Enter the octal number: ");
                    octal = input.nextLine();
                    decimal = octalToDecimal(octal);
                    hex = decimalToHexadecimal(decimal);
                    System.out.println("Hexadecimal: " + hex);
                    break;

                case 7: // Decimal to Binary
                    System.out.print("Enter the decimal number: ");
                    decimal = input.nextInt();
                    binary = decimalToBinary(decimal);
                    System.out.println("Binary: " + binary);
                    break;

                case 8: // Decimal to Octal
                    System.out.print("Enter the decimal number: ");
                    decimal = input.nextInt();
                    octal = decimalToOctal(decimal);
                    System.out.println("Octal: " + octal);
                    break;

                case 9: // Decimal to Hexadecimal
                    System.out.print("Enter the decimal number: ");
                    decimal = input.nextInt();
                    hex = decimalToHexadecimal(decimal);
                    System.out.println("Hexadecimal: " + hex);
                    break;

                case 10: // Hexadecimal to Binary
                    System.out.print("Enter the hexadecimal number: ");
                    hex = input.nextLine();
                    decimal = hexadecimalToDecimal(hex);
                    binary = decimalToBinary(decimal);
                    System.out.println("Binary: " + binary);
                    break;

                case 11: // Hexadecimal to Octal
                    System.out.print("Enter the hexadecimal number: ");
                    hex = input.nextLine();
                    decimal = hexadecimalToDecimal(hex);
                    octal = decimalToOctal(decimal);
                    System.out.println("Octal: " + octal);
                    break;

                case 12: // Hexadecimal to Decimal
                    System.out.print("Enter the hexadecimal number: ");
                    hex = input.nextLine();
                    decimal = hexadecimalToDecimal(hex);
                    System.out.println("Decimal: " + decimal);
                    break;

                case 13: // Exit
                    System.out.println("Exiting... Thank you for using the NUMBER SYSTEM CONVERTER!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-13).");
                    break;
            }
        }

        input.close();
    }
}