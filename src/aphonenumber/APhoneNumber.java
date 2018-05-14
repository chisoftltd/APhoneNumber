/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphonenumber;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chisoft
 */
public class APhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> phoneList = new ArrayList<>();
        String input;
        Scanner text = new Scanner(System.in);
        while ((input = text.nextLine()) != null) {
            phoneList.add(input);
        }

        for (int i = 0; i < phoneList.size(); i++) {
            for (int j = 0; j < phoneList.size(); j++) {

                if (phoneList.get(i).equals(phoneList.get(j)) && i != j) {
                    System.out.println("NO");
                    return;
                } else {
                }
            }
        }
        System.out.println("YES");
    }
}
