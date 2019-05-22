/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author ManteshSandhu
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner in= new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random())*14+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
           
        }
        
        System.out.println("Enter a card number and suit");
        //insert code to ask the user for Card value and suit, create their card
        int cardValue=in.nextInt();
        String suitValue=in.next();
        boolean found= false;
        // and search magicHand here
        for(int i=0; i<magicHand.length;i++){
            if(magicHand[i].getValue==cardValue && 
                    suitValue.equalsIgnoreCase(magicHand[i].getSuit)){
                found = true;
                break;
                
            }}
          if (found){
              System.out.println("Your are right");}
              else 
          {System.out.println("you are wrong");
        }
        
        //Then report the result here
        }
    }
