
public class ConversionCodes {

    int binaryToDecimal(int number) {
        int decimal = 0, i = 1;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            decimal = decimal + (rem * i);
            i *= 2;
        }
        return decimal;
    }

    int binaryToOctal(int number) {
        int temp = binaryToDecimal(number);
        int octal = 0, i = 1;
        while (temp != 0) {
            int reminder = temp % 8;
            octal = octal + reminder * i;
            i = i * 10;
            temp = temp / 8;
        }
        return octal;
    }

    String binaryToHexadecimal(int number) {
        String hexadecimal = "";
        char hexValues[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int temp = binaryToDecimal(number);
        while (temp != 0) {
            int reminder = temp % 16;
            temp = temp / 16;
            hexadecimal = hexValues[reminder] + hexadecimal;
        }
        return hexadecimal;
    }

    int decimalToBinary(int number) {
        int binNumber = 0, i = 1;
        while (number != 0) {
            binNumber += (number % 2) * i;
            number = number / 2;
            i *= 10;
        }
        return binNumber;
    }

    int decimalToOctal(int number) {
        int octalNumber = 0, i = 1;
        while (number != 0) {
            octalNumber += (number % 8) * i;
            number = number / 8;
            i *= 10;
        }
        return octalNumber;
    }

    String decimalToHexadecimal(int number) {
        String hexadecimal = "";
        char hexValues[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (number != 0) {
            int reminder = number % 16;
            number = number / 16;
            hexadecimal = hexValues[reminder] + hexadecimal;
        }
        return hexadecimal;
    }

    int octalToBinary(int number) {
        int decimalValue = octalToDecimal(number);
        int binaryValue = decimalToBinary(decimalValue);
        return binaryValue;
    }

    int octalToDecimal(int number) {
        int decimalNumber = 0, i = 0;
        while (number != 0) {
            decimalNumber += (number % 10) * Math.pow(8, i);
            i++;
            number /= 10;
        }
        return decimalNumber;
    }

    String octalToHexadecimal(int number) {
        int decimalValue = octalToDecimal(number);
        String hexaValue = decimalToHexadecimal(decimalValue);
        return hexaValue;
    }

    String hexadecimalToBinary(String number) {
        String hexaNumber = "";
        char hexdec[] = number.toCharArray();
        int i = 0;
        while (i < hexdec.length) {
            switch (hexdec[i]) {
                case '0' ->
                    hexaNumber = hexaNumber.concat("0000");
                case '1' ->
                    hexaNumber = hexaNumber.concat("0001");
                case '2' ->
                    hexaNumber = hexaNumber.concat("0010");
                case '3' ->
                    hexaNumber = hexaNumber.concat("0011");
                case '4' ->
                    hexaNumber = hexaNumber.concat("0100");
                case '5' ->
                    hexaNumber = hexaNumber.concat("0101");
                case '6' ->
                    hexaNumber = hexaNumber.concat("0110");
                case '7' ->
                    hexaNumber = hexaNumber.concat("0111");
                case '8' ->
                    hexaNumber = hexaNumber.concat("1000");
                case '9' ->
                    hexaNumber = hexaNumber.concat("1001");
                case 'A', 'a' ->
                    hexaNumber = hexaNumber.concat("1010");
                case 'B', 'b' ->
                    hexaNumber = hexaNumber.concat("1011");
                case 'C', 'c' ->
                    hexaNumber = hexaNumber.concat("1100");
                case 'D', 'd' ->
                    hexaNumber = hexaNumber.concat("1101");
                case 'E', 'e' ->
                    hexaNumber = hexaNumber.concat("1110");
                case 'F', 'f' ->
                    hexaNumber = hexaNumber.concat("1111");
            }
            i++;
        }
        return hexaNumber;
    }

    int hexadecimalToOctal(String number) {
        int decimalValue = hexadecimalToDecimal(number);
        int octalValue = decimalToOctal(decimalValue);
        return octalValue;
    }

    int hexadecimalToDecimal(String number) {
        long binary = Long.parseLong(hexadecimalToBinary(number));
        int decimalNumber = 0, i = 0;
        while (binary != 0) {
            decimalNumber += (binary % 10) * Math.pow(2, i);
            ++i;
            binary /= 10;
        }
        return decimalNumber;
    }
}
