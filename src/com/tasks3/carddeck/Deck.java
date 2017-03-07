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
    	Card tmpCard;
    	int q = (int) (Math.random()*10000+40000);
    	for (int n=0; n<q; n++){
    		int m = (int) (Math.random()*31+5);
    		tmpCard = this.deck[m];
    		this.deck[m] = this.deck[m-5];
    		this.deck[m-5] = tmpCard;
    	}
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
		int i = -1;
		this.deck = new Card[Suit.values.length * Rank.values.length];
	    for (Suit suit: Suit.values) {
	        for (Rank rank: Rank.values) {
	            deck[++i] = new Card(rank,suit);
	        }
	    }
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
    
    public void deckPrn(){
	    for (int j=0; j<36; j++){
			System.out.print(this.deck[j].getSuit().getName());
			System.out.print(" ");
			System.out.println(this.deck[j].getRank().getName());
	    }	
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
		
/*		dk1.deckPrn();
		System.out.println("---------------------1------------------------");
		dk1.deck[3].setRank(Rank.SIX);
		dk1.deck[2].setRank(Rank.SIX);		
		dk1.deckPrn();
		System.out.println("---------------------2------------------------");
		dk1.order();*/
		dk1.shuffle();
		dk1.deckPrn();
		System.out.println("---------------------3------------------------");
		dk1.order();
		dk1.deckPrn();
	}
    
}
