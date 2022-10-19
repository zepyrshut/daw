package main;

import cypher.Caesar;
import numbers.DecToHex;
import numbers.GreatestCommonDivisor;
import numbers.PredictingFutureTuition;
import numbers.SentinelValue;
import strings.CheckPalindrome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // SentinelValue.sentinelValue();

       // GreatestCommonDivisor.findGreatestCommonDivisor(8, 4);

        //PredictingFutureTuition.predictingFutureTuition(10000, 7);

        //String hexNumber = DecToHex.decToHex(10);

        boolean bool = CheckPalindrome.checkIfPalindrome("aba");

        System.out.println(bool);

        String str = "aabbaa";

        boolean bool2 = str.equals(new StringBuilder(str).reverse().toString());

        System.out.println(bool2);



    }

}
