/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphonenumber;

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
        int ii = 0;
        System.out.println("Test 1");
        while (text.hasNext()) {
            input = text.nextLine();
            phoneList.add(input);
            System.out.println("Test 2" + phoneList.get(ii++));
            for (int i = 0; i < phoneList.size(); i++) {
                for (int j = 0; j < phoneList.size(); j++) {
                    if (phoneList.get(j).length() > 3) {
System.out.println("Test 3");
                        if ((phoneList.get(i).substring(0, 3).equals(phoneList.get(j).substring(0, 3))) && (i != j)) {
                            System.out.println("NO");
                            return;
                        } else {
                        }

                    }
                }
            }
            
            System.out.println("YES");

        }

    }
}
