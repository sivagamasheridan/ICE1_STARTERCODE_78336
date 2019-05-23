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
 * @author Sivagami
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            c.setValue(c.getRandomValue());
            //c.setSuit(c.getRandomSuit());
            magicHand[i]=c;
            System.out.println(magicHand[i].getSuit() + magicHand[i].getValue());
        }
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the suit");
        String suit=s.nextLine();
        System.out.println("Enter the value");
        int value=s.nextInt();
        Card c=new Card();
        c.setSuit(suit);
        c.setValue(value);
          boolean found = false;
        for(int i = 0;i<magicHand.length;i++)
        {
            if(value == magicHand[i].getValue() && 
                    suit.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                found = true;
                break;
            }
        }
     
        if (found)
                {
                    
                    System.out.println("you win!");
                }
        else
        {
        System.out.println("you lose!");
        }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    


