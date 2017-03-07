package com.tasks3.carddeck;

public class Cards {

	public static void main(String[] args) {
		
		Card hh = new Card(Rank.SIX, Suit.CLUBS);
		System.out.println(hh.getRank().getName());
		
		Card[] pack;
		pack = new Card[36];
		pack[1] = new Card(Rank.ACE, Suit.CLUBS);
		
		System.out.println(pack[1].getRank().getName());
		
//		Map<Integer, Card> states = new HashMap<Integer, Card>();
		

		
		//System.out.println(hh.
	}

}
