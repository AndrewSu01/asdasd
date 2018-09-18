/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

import java.util.Scanner;

/**
 *
 * @author 348983139
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        String f = sn.nextLine();
        int a = sn.nextInt();
         System.out.println(encode(f,a));
        System.out.println(decode(f,a));
    
       
    }

    /**
     * This method takes in a word and shifts each letter forward and returns
     * new word
     *
     * @param word A word as an input
     * @param shift How much shift is needed
     * @return The new shifted string is returned
     */
    public static String encode(String word, int shift) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            //Check if the character is an Uppercase letter
            if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                if ((word.charAt(i) + shift > 'Z')) {
                    newWord += (char) (word.charAt(i) + shift - 26);
                }
                else{
                    newWord += (char)(word.charAt(i)+shift);
                }
            }
            else if((word.charAt(i) >= 'a' && word.charAt(i)<= 'z')){
                if ((word.charAt(i) + shift > 'z')) {
                    newWord += (char) (word.charAt(i) + shift - 26);
                }
                else{
                    newWord += (char)(word.charAt(i)+shift);
                }
            }
            else{
                newWord += (char)(word.charAt(i));
            }
        }

        return newWord;
    
    }
    /**
     * This method takes in a word and shifts each letter backward and returns new word
     * @param word The input word
     * @param shift How much shift is wanted
     * @return The shifted sentence
     */
    public static String decode(String word, int shift) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            //Check if the character is an Uppercase letter
            if ((word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                if ((word.charAt(i) - shift < 'A')) {
                    newWord += (char) (word.charAt(i) - shift + 26);
                }
                else{
                    newWord += (char)(word.charAt(i)-shift);
                }
            }
            else if((word.charAt(i) >= 'a' && word.charAt(i)<= 'z')){
                if ((word.charAt(i) - shift < 'a')) {
                    newWord += (char) (word.charAt(i) - shift + 26);
                }
                else{
                    newWord += (char)(word.charAt(i)-shift);
                }
            }
            else{
                newWord += (char)(word.charAt(i));
            }
        }
        return newWord;
    }
    public static String breakCode(String text){
        String word = "";
        int shift = 0;
        String textCoded = decode(word,shift);
        String[] textDecoded = new String[26];
        
    }
}
