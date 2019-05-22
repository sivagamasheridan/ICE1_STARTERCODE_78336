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
 * @author Luis Castillo 
 * StudentID: 991532062
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner varCard = new Scanner(System.in);
 
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        for (int i=0; i < magicHand.length; i++){
            Card c = new Card();
            c.setValue (c.randomValue());
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i]=c;
        }
        
        System.out.println("Choose a card between 1-13");
        int cardValue = varCard.nextInt();
        varCard.nextLine();
        
        System.out.println("Choose a card suit between 1-4");
        String suitValue = varCard.nextLine();
        
        boolean found = false;
            for(int i = 0;i < magicHand.length;i++)
            {
                if(cardValue == magicHand[i].getValue() &&
                        suitValue.equalsIgnoreCase(magicHand[i].getSuit())) 
                {
                    found = true;
                    break;
                }
            }
            if (found)
            {
                System.out.println("You guess!! your choose is in the MagicHand!!");
            }
            else
            {
                System.out.println("You Loose!! your choose is NOT in the MagicHand");
            }

        }         
 }
    
    

