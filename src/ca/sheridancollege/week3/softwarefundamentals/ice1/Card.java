/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Objects;
// Brian Furness (via remote)

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Sivagami, Brian Furness 991553456
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
	
	public static String randomSuit() {
		return SUITS [(int) (Math.random() * 4)];
	}
   
	public static int randomValue() {
		return (int) (Math.random() * 13) + 1;
	}
   //Write two methods to generate random number of values and suits here
	
   @Override
	public boolean equals (Object o){
		if (o instanceof Card){
			return ((Card) o).getValue() == this.value && ((Card) o).getSuit().equals(this.suit);
		} else{
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 89 * hash + Objects.hashCode(this.suit);
		hash = 89 * hash + this.value;
		return hash;
	}
    
}
