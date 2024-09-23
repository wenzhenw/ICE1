/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author wenzhen wang
 * @modifier 991753509
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*9)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        Card lucky = new Card();
        lucky.setValue(6);
        lucky.setSuit("Spades");
        magicHand[6] = lucky;
        
        int card_in = 0;
        for (int i=0; i<magicHand.length; i++)
        {
            if (magicHand[i].getValue() == lucky.getValue() &&
                    magicHand[i].getSuit().equals(lucky.getSuit())) {
                card_in += 1;
            }
        }
        if (card_in > 0) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
    
}
