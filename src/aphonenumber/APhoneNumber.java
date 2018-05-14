/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphonenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chisoft
 */
public class APhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static final String YES = "YES";
    public static final String NO = "NO";
    private static Tree tree = new Tree();
    private static boolean isConsistent = true;

    private static class Tree {

        int node = 0;
        boolean isCons = false;
        Tree[] next = new Tree[10];

        public void setNext(int index, Tree t) {
            next[index] = t;
        }

        public Tree getTree(int index) {
            return next[index];
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        PhoneList phoneList = new PhoneList();
        try {
            phoneList.build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class PhoneList {

        public PhoneList() {
        }

        private void build() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for (int i = 0; i < t; ++i) {
                int n = Integer.parseInt(reader.readLine());
                tree = new Tree();
                isConsistent = true;
                for (int j = 0; j < n; ++j) {
                    String phone = reader.readLine();
                    if (isConsistent) {
                        buildTree(phone);
                    }
                }
                if (isConsistent) {
                    System.out.println(YES);
                } else {
                    System.out.println(NO);
                }
            }
        }

        private void buildTree(String s) {
            int len = s.length();
            Tree auxTree = tree;
            for (int i = 0; i < len; ++i) {
                int ch = Integer.parseInt(s.substring(i, i + 1));
                Tree aux = auxTree.next[ch];
                if (aux == null) {
                    aux = new Tree();
                    aux.node = 1;
                    if (i == len - 1) {
                        aux.isCons = true;
                    }
                    auxTree.setNext(ch, aux);
                    auxTree = aux;
                } else {
                    if (aux.isCons) {
                        isConsistent = false;
                        break;
                    }
                    if (i == len - 1) {
                        isConsistent = false;
                        break;
                    }
                    auxTree = aux;
                }
            }
        }

    }
}
