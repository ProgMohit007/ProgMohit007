
import javax.swing.JOptionPane;

public class Validation {

    boolean checkBinary(String binaryNumber) {
        char values[] = {'0', '1'};
        for (int i = 0; i < binaryNumber.length(); i++) {
            int check = 0;
            for (int j = 0; j < values.length; j++) {
                if (binaryNumber.charAt(i) == values[j]) {
                    check++;
                }
            }
            if (check == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Values.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    boolean checkOctal(String octalNumber) {
        char values[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        for (int i = 0; i < octalNumber.length(); i++) {
            int check = 0;
            for (int j = 0; j < values.length; j++) {
                if (octalNumber.charAt(i) == values[j]) {
                    check++;
                }
            }
            if (check == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Values.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    boolean checkDecimal(String decimalNumber) {
        char values[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < decimalNumber.length(); i++) {
            int check = 0;
            for (int j = 0; j < values.length; j++) {
                if (decimalNumber.charAt(i) == values[j]) {
                    check++;
                }
            }
            if (check == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Values.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    boolean checkHexadecimal(String hexadecimalNumber) {
        hexadecimalNumber = hexadecimalNumber.toUpperCase();
        char values[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < hexadecimalNumber.length(); i++) {
            int check = 0;
            for (int j = 0; j < values.length; j++) {
                if (hexadecimalNumber.charAt(i) == values[j]) {
                    check++;
                }
            }
            if (check == 0) {
                JOptionPane.showMessageDialog(null, "Invalid Values.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

}
