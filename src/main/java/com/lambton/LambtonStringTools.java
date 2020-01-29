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
       return null;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        int decimal = 0;
        try {
            decimal = Integer.parseInt(s, 2);
        } catch (Exception e) {
            decimal = -1;
        }
        return decimal;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {

        originalString = originalString.toLowerCase();
        findString = findString.toLowerCase();
        newString = newString.toLowerCase();
        return null;
    }

    }






