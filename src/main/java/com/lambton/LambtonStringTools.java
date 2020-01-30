/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String result = " ";

        if(s != null && !s.isEmpty()){
            String[] temp = s.split("\\s+");
            for (int i = 0; i < temp.length; i++) {
                if (i == temp.length - 1)
                    result = temp[i] + result;
                else
                    result = " " + temp[i] + result;
            }
        }
        else {
            result = null;
        }
        return result;

    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
    {
        String[] words = s.split("\\s+");
        int i = 0;
        String cap = "";
        if (words.length == 3) {
            cap = words[0].substring(0, 1).toUpperCase() + ". "
                    + words[1].substring(0, 1).toUpperCase() + ". "
                    + words[2].substring(0, 1).toUpperCase() + words[2].substring(1).toLowerCase();
        } else {
            cap = null;
        }
        return cap;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static char mostFrequent(String s)
    {
        int charactercount = 256; //setting up count for all characters
        int[] count = new int[charactercount];
        int i;
        for (i = 0; i < s.length(); i++)
            (count[s.charAt(i)])++;
        int mostFrequent = 0;
        for (i = 0; i < charactercount; i++) {
            if (count[i] > count[mostFrequent]) {
                mostFrequent = i;
            } else if (count[i] == count[mostFrequent]) {
                mostFrequent = i;
            }
        }
        return (char) mostFrequent;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(int s)
    {
        int decimal = 0;
        int p = 0;
        if(s!=0) {
            try {
                while(true){
                    if(s == 0){
                        break;
                    } else {
                        int temp = s%10;
                        decimal += temp*Math.pow(2, p);
                        s = s/10;
                        p++;
                    }
                }
            } catch (Exception e) {
                decimal = -1;
            }
        }
        else
        {
            decimal=0;
        }
        return decimal;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        if (originalString.contains(findString)) {
            originalString = originalString.replace(findString, newString);
            return originalString;
        } else
            return "String doesn't contain matched pattern";
    }

    }




