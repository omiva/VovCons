package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("ENTER A CHARACTER IN LOWER CASE: ");
            Scanner ss = new Scanner(System.in);
            char letter = ss.next().charAt(0);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            {
                System.out.println("ITS A VOWEL");
                System.out.println("...........................");
            }
            else
            {
                System.out.println("ITS A CONSONANT");
                System.out.println("...........................");

            }
        }
    }
}
