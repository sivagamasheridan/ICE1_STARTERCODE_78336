/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Prabhasis singh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();//object of card class and c variable name.
            c.setValue(c.randomValue());//set suit is a method 
            c.setSuit(Card.SUITS[c.randomSuit()]); 
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=c;
        }

        System.out.println("enter a card value and suit");
        int cardValue = sc.nextInt();
        sc.nextLine();
        String suitValue = sc.nextLine();
        boolean found = false;
        for (Card magicHand1 : magicHand) {
            if (cardValue == magicHand1.getValue() && suitValue.equalsIgnoreCase(magicHand1.getSuit())) {
                found = true;
                break;
            }
        }
     
        if (found)
                {
                    
                    System.out.println("you got it!");
                }
        else
        {
        System.out.println("not got it!");
        }
        }
}
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    