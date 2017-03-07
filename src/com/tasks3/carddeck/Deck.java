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
