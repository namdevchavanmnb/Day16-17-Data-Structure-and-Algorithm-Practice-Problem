package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean checkIfAnagrams(String firstWord, String secondWord) {
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        int compareResult = Arrays.compare(firstWordArray, secondWordArray);
        if (compareResult == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        Anagram anagramObject = new Anagram();
        System.out.println("Enter the first word : ");
        String firstWord = scannerObject.next();
        System.out.println("Enter the second word : ");
        String secondWord = scannerObject.next();
        boolean result = anagramObject.checkIfAnagrams(firstWord, secondWord);
        if(result)
            System.out.println("The words are anagrams");
        else
            System.out.println("The words are not anagrams");
    }
}

