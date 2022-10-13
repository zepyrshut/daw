package main;

import cypher.Caesar;

import java.util.Scanner;

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


//        var pwd = new GeneratePassword();
//
//        System.out.println(pwd.generatePassword());

//        var kb = new Scanner(System.in);
//        System.out.println("Introduzca una palabra a cifrar: ");
//        var word = kb.next();
//
//        System.out.println("Introduzca el desplazamiento: ");
//        var threshold = kb.nextInt();

        var word = Caesar.caesarEncrypt("xyz", 5);

        System.out.println("Cifrado: ");
        System.out.println(word);

//        word = Caesar.caesarDecrypt(word, threshold);
//
//        System.out.println("Descrifrado: ");
//        System.out.println(word);


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
