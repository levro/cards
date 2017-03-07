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
	
    //������� ������ � ����������� ������� 
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
    /* * ������������� ������ �� ������� �� ���������� 
    * ������� ����������: 
    * �������� �� ����� � ����� HEARTS, ���� DIAMONDS, CLUBS, SPADES 
    * ��� ����� ���� ������� ���������: Ace,King,Queen,Jack,10,9,8,7,6 
    * ��������� 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * � ��� ��� ��� DIAMONDS, CLUBS, SPADES */
    public void order() {
		int i = -1;
		this.deck = new Card[Suit.values.length * Rank.values.length];
	    for (Suit suit: Suit.values) {
	        for (Rank rank: Rank.values) {
	            deck[++i] = new Card(rank,suit);
	        }
	    }
    }
    
    //������� true � ������� ���� � ����� �� ������� �����
    public boolean hasNext() {
    	return false;
    }
    
    //"�����" ���� ����� � ������, ���� ���� ������ �� 36 ���� ������� null
    //����� ���������� � "�������" ������. ��������� ������ ������ ������� SPADES 6 ����
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace � ��� ��� �� HEARTS Ace
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
