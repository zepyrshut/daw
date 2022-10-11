package Main;

import numbers.Numbers;
import passwords.GeneratePassword;

public class Main {

    public static void main(String[] args) {
//        var numbers = new Numbers();
//
//        printArray(numbers.firstFiftyEvenNumbers());
//        printArray(numbers.firstFiftyOddNumbers());
//
//        String str = "aaabaa";
//
//
//
//        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));


        var pwd = new GeneratePassword();

        System.out.println(pwd.generatePassword());

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
