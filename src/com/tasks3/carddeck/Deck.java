package com.tasks3.carddeck;

public class Deck {
	Card[] deck;
    int index = 0;
	// Constructor
	
	public Deck(){    	
		int i = -1;
		this.deck = new Card[Suit.values.length * Rank.values.length];
	    for (Suit suit: Suit.values) {
	        for (Rank rank: Rank.values) {
	            deck[++i] = new Card(rank,suit);
	        }
	    }
	}
	
    //Перемішує колоду у випадковому порядку 
    public void shuffle() {
    }
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
    }
    
    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    	return false;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
    	return new Card(Rank.SIX, Suit.SPADES);
    }
    
	public static void main(String[] args) {
				
		Deck dk1 = new Deck();
		
		/*
		Card[] dk;
		dk = new Card[36];
		dk[1] = new Card(Rank.ACE, Suit.CLUBS);
		//System.out.println(dk1.deck.length);
		//System.out.println(pack[1].getRank().getName());
		
		int i = -1;
	    for (Suit suit: Suit.values) {
	        for (Rank rank: Rank.values) {
	            dk[++i] = new Card(rank,suit);
	        }
	    }*/
		
	    for (int j=0; j<36; j++){
			System.out.print(dk1.deck[j].getRank().getName());
			System.out.print(" ");
			System.out.println(dk1.deck[j].getSuit().getName());
	    }
		System.out.println(dk1.hasNext());
		
		System.out.println(Suit.values.length);
		System.out.println(Rank.values.length);
		System.out.println("-----------------------------------------");
		

		
	}
    
}
