package com.arunscodes.HackerrankCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayEqv {

    static Map<Character, Character> eqv = new HashMap<>();

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        eqv.put('a','0');
        eqv.put('b','1');
        eqv.put('c','2');
        eqv.put('d','3');
        eqv.put('e','4');
        eqv.put('f','5');
        eqv.put('g','6');
        eqv.put('h','7');
        eqv.put('i','8');
        eqv.put('j','9');

        char[] numFirst = firstWord.toCharArray();
        char[] numSecond = secondWord.toCharArray();
        char[] numTarget = targetWord.toCharArray();

        numFirst = getNumberArray(numFirst,firstWord);
        numSecond = getNumberArray(numSecond,secondWord);
        numTarget = getNumberArray(numTarget,targetWord);

        if( (Integer.parseInt(String.valueOf(numFirst)) + Integer.parseInt(String.valueOf(numSecond)))
                == Integer.parseInt(String.valueOf(numTarget)) )
            return true;
        else
            return false;
    }

    static char[] getNumberArray(char[] copyVar, String wordVar){
        for(int i=0;i<wordVar.length(); i++){
            copyVar[i] = (eqv.get(wordVar.charAt(i)));
        }

        return copyVar;
    }


    public static void main(String[] args) {

        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";

        System.out.println(" Output = " +isSumEqual(firstWord,secondWord,targetWord));





    }
}
