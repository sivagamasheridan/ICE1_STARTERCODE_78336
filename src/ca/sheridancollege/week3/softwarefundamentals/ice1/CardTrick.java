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
 * @author Sivagami, Brian Furness (991553456)
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            magicHand[i].setValue(Card.randomValue());
            magicHand[i].setSuit(Card.randomSuit());
        }
		
		
		System.out.println ("Pick a card, any card");
		System.out.println ("first select a suit 1-13");
		Scanner scanner = new Scanner (System.in);
		Card card = new Card();
		int tmp;
		tmp = scanner.nextInt();
		while (tmp > 13 || tmp < 1){
			System.out.println("Please select a number from 1-13");
			tmp = scanner.nextInt();
		}
		card.setValue(tmp);
		System.out.println ("now select a suit:\n1 = Hearts\n2 = Diamonds\n3 = Spades\n4 = Clubs");
		tmp = scanner.nextInt();
		while (tmp > 4 || tmp < 1){
			System.out.println("Please select a number from 1-4");
			tmp = scanner.nextInt();
		}
		card.setSuit(Card.SUITS[tmp - 1]);
		
		for (Card c : magicHand){
			if (card.equals(c)){
				System.out.println ("This card is in the magic hand!");
				return;
			}
		}
		System.out.println("This card is not in the magic hand!");
    }
    
}
