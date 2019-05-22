
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
 * @author gagan
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
             Card c = new Card();
            
            c.setValue(c.randomValue());
             c.setSuit(Card.SUITS[c.randomSuit()]);
             magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card c = new Card();
            System.out.println("Please enter the card value ");
            int userValue= in.nextInt();
            System.out.println("Please enter the card suit");
            String userSuits= in.nextLine();
             boolean found = false;
        for(int i = 0;i<magicHand.length;i++)
        {
            if(userValue == magicHand[i].getValue() && 
                    userSuits.equalsIgnoreCase(magicHand[i].getSuit()))
            {
                found = true;
                break;
            }
        }
     
        if (found)
                {
                    
                    System.out.println("Great, You got it!");
                }
        else
        {
        System.out.println("Better Luck next time");
        }
        }
            
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    

