package com.tasks3.carddeck;

public class Deck {
	Card[] deck;
    int index;
    
	// Constructor	
	public Deck(){
	    index = 35;
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
    	int q = (int) (Math.random()*300+700);
    	for (int n=0; n<q; n++){
    		int l = (int) (Math.random()*32);
    		int m = (int) (Math.random()*(36-l)+l);
    		tmpCard = this.deck[m];
    		this.deck[m] = this.deck[m-l];
    		this.deck[m-l] = tmpCard;
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
		index = 35;
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
    	return index > -1;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
    	if (index >= 0)
        	return this.deck[index--];
        else return null;
    }
    
    public void deckPrn(){
    	System.out.println("---Cards in deck-"+(index+1)+"---");
	    for (int j=0; j<index+1; j++){
			System.out.print("|");
			System.out.print(this.deck[j].getSuit().getName());
			System.out.print(" ");
			System.out.println(this.deck[j].getRank().getName());
	    }
    }
	
    public void cardPrn(Card crd){
    	if (crd != null){
    		System.out.print(crd.getSuit().getName());
    		System.out.print(" ");
    		System.out.println(crd.getRank().getName());
    	}
    	else System.out.println("Card is NULL");
    }
    
    
	public static void main(String[] args) {
				
		Deck dk1 = new Deck();

		dk1.shuffle();
		dk1.deckPrn();
		//dk1.order();
		//dk1.cardPrn(dk1.deck[10]);
		/*
		for (int t=0; t<36; t++){
			dk1.cardPrn(dk1.drawOne());
			System.out.println("----------------------");	
		}
		System.out.println(dk1.hasNext());
		dk1.deckPrn();
		*/
	}
    
}
