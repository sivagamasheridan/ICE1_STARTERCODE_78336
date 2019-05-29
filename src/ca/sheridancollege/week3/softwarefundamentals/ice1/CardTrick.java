/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Author: Jorge A. MOsquera
// ID:991549921

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
            c.setValue(Card.getRandomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.getRandomSuit());
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Card:(Value Suit)");
        int inputValue = input.nextInt();
        String inputSuit = input.next();
        
        // and search magicHand here
        
        boolean suitFound = false;
        boolean valueFound = false;
        
        for (int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getValue() == inputValue ){
                valueFound = true;
            }
            if(magicHand[i].getSuit() == inputSuit){
                suitFound = true;
            }
        }
        
        //Then report the result here
        
        if(valueFound && suitFound){
            System.out.println("The Card was found");
        }
        else
            System.out.println("Sorry, the card was not found");
    }
    
}
