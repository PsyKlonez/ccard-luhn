/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccardluhn;

/**
 *
 * @author PsY.
 */
public class LuhnAlg {

    public boolean checkCard(int[] cardNumber) {
        // Check if input is more or less digits than a card number should be. 
        if (cardNumber.length > 19 || cardNumber.length < 12) {
            return false;
        }

        int total = 0;

        // Iterate through the array from the end to begining.
        for (int i = cardNumber.length - 1; i > -1; i--) {
            if (i % 2 == 0) {
                // Array index is even.
                int doubled = cardNumber[i] * 2;
                if (doubled > 9) {
                    // Doubled number has breached double digits.
                    doubled -= 9;
                }
                total += doubled;
            } else {
                // Array index is odd.
                total += cardNumber[i];
            }
        }

        System.out.println("Total: " + total);
        // Modulus 10 on the total result.
        total %= 10;
        System.out.println("Mod 10 Total: " + total);

        // Check if value after Mod 10 is 0 or otherwise.
        if (total == 0) {
            // If value is 0 - card number is valid.
            return true;
        } else {
            // If value is anything but 0 - card number is invalid.
            return false;
        }
    }

    private String arrayToString(int[] array) {
        String returnString = "";
        for (int i = 0; i < array.length; i++) {
            returnString += array[i];
        }
        return returnString;
    }
}
