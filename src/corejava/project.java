/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corejava;
import java.util.Scanner; 
/**
 *
 * @author USER
 */
public class project  
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a sentence: "); 
        String sentence = sc.nextLine(); 
        sentence = sentence.trim(); 
        
        int charCount = sentence.length();  
        
        String[] words = sentence.split("\\s+"); 
        
        int wordCount = words.length; 
        
        String upper = sentence.toUpperCase(); 
        
        boolean containsJava = sentence.toLowerCase().contains("java"); 
 
        String replaced = sentence.replace("Java", "Python"); 

        System.out.println("\n--- Text Analysis ---"); 
        System.out.println("Original Sentence : " + sentence); 
        System.out.println("Character Count   : " + charCount); 
        System.out.println("Word Count        : " + wordCount); 
        System.out.println("Uppercase         : " + upper); 
        System.out.println("Contains 'Java'?  : " + containsJava); 
        System.out.println("After Replace     : " + replaced); 
 
sc.close(); 
} 
} 
