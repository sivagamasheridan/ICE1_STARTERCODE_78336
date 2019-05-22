/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagami
 */
import java.util.*;

public class CardTrick {
    
    // Daniel Davani Davari   SID:991502775
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            //magicHand[i].printCard(magicHand[i]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println("Please pick a card, Any card. number of card first, then suit.");
        Scanner sc = new Scanner(System.in);
        
        int userValue = sc.nextInt();
        String userSuit = sc.next();
        
        for (int j = 0; j < magicHand.length; j++) {
            
            if(userValue == magicHand[j].getValue()){
                if(userSuit.toLowerCase() == magicHand[j].getSuit().toLowerCase()){
                    System.out.println("The card is in the hand");
                    break;
                }
            }
            if(j == 6){
                System.out.println("The card is not in the hand");
            }
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
   
    
}
