/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
* @modifier yuvraj "vermayuv"
 modified  by Yuvraj
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int userVal;
        String userSuit;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.RandomValue());
            c.setSuit(Card.SUITS[c.RandomSuit()]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit() + magicHand[i].getValue());
        }
        
        System.out.println("Enter the value for card:");
        userVal = input.nextInt();
         System.out.println("Enter the suit: ");
        userSuit = input.nextLine();
        for(int i=0; i<magicHand.length;i++){
        if(userVal== magicHand[i].getValue()&& userSuit.equalsIgnoreCase(magicHand[i].getSuit()))
        {found=true;
        break;}}
        if(found=true)
            System.out.println("card found");
        else
            System.out.println("you are wrong");
    }
    }
    

