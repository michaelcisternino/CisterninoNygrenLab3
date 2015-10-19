package pokerTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

import pokerBase.Card;
import pokerBase.Hand;
import pokerBase.SameHandException;
import pokerEnums.eSuit;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;



public class HandTest {
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFourOfAKind() {
		ArrayList<Card> FourKind = new ArrayList <Card>();
		FourKind.add(new Card(eSuit.CLUBS, eRank.ACE));
		FourKind.add(new Card(eSuit.HEARTS, eRank.ACE));
		FourKind.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		FourKind.add(new Card(eSuit.SPADES, eRank.ACE));
		FourKind.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(FourKind);
		h.EvalHand();
		assertTrue(eHandStrength.FourOfAKind.getHandStrength() == h.getHandStrength());
		
		ArrayList<Card> FourKind2 = new ArrayList <Card>();
		FourKind2.add(new Card(eSuit.CLUBS, eRank.FIVE));
		FourKind2.add(new Card(eSuit.HEARTS, eRank.ACE));
		FourKind2.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		FourKind2.add(new Card(eSuit.SPADES, eRank.ACE));
		FourKind2.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand t = new Hand();
		t = Hand.EvalHand(FourKind);
		t.EvalHand();
		assertTrue(eHandStrength.FourOfAKind.getHandStrength() == t.getHandStrength());
		
	}
	
	@Test
	public void TestOnePair() {
		ArrayList<Card> Pair = new ArrayList <Card>();
		Pair.add(new Card(eSuit.CLUBS, eRank.ACE));
		Pair.add(new Card(eSuit.HEARTS, eRank.ACE));
		Pair.add(new Card(eSuit.DIAMONDS, eRank.TWO));
		Pair.add(new Card(eSuit.SPADES, eRank.SIX));
		Pair.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(Pair);
		h.EvalHand();
		assertTrue(eHandStrength.Pair.getHandStrength() == h.getHandStrength());
		
		ArrayList<Card> Pair2 = new ArrayList <Card>();
		Pair2.add(new Card(eSuit.CLUBS, eRank.TWO));
		Pair2.add(new Card(eSuit.HEARTS, eRank.ACE));
		Pair2.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		Pair2.add(new Card(eSuit.SPADES, eRank.SIX));
		Pair2.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand m = new Hand();
		m = Hand.EvalHand(Pair2);
		m.EvalHand();
		assertTrue(eHandStrength.Pair.getHandStrength() == m.getHandStrength());
		
		ArrayList<Card> Pair3 = new ArrayList <Card>();
		Pair3.add(new Card(eSuit.CLUBS, eRank.ACE));
		Pair3.add(new Card(eSuit.HEARTS, eRank.THREE));
		Pair3.add(new Card(eSuit.DIAMONDS, eRank.TWO));
		Pair3.add(new Card(eSuit.SPADES, eRank.TWO));
		Pair3.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand j = new Hand();
		j = Hand.EvalHand(Pair3);
		j.EvalHand();
		assertTrue(eHandStrength.Pair.getHandStrength() == j.getHandStrength());
		
		ArrayList<Card> Pair4 = new ArrayList <Card>();
		Pair4.add(new Card(eSuit.CLUBS, eRank.ACE));
		Pair4.add(new Card(eSuit.HEARTS, eRank.SEVEN));
		Pair4.add(new Card(eSuit.DIAMONDS, eRank.TWO));
		Pair4.add(new Card(eSuit.SPADES, eRank.SIX));
		Pair4.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand r = new Hand();
		r = Hand.EvalHand(Pair4);
		r.EvalHand();
		assertTrue(eHandStrength.Pair.getHandStrength() == r.getHandStrength());
		
		ArrayList<Card> Pair5 = new ArrayList <Card>();
		Pair5.add(new Card(eSuit.CLUBS, eRank.ACE));
		Pair5.add(new Card(eSuit.HEARTS, eRank.FOUR));
		Pair5.add(new Card(eSuit.DIAMONDS, eRank.TWO));
		Pair5.add(new Card(eSuit.SPADES, eRank.ACE));
		Pair5.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand e = new Hand();
		e = Hand.EvalHand(Pair5);
		e.EvalHand();
		assertTrue(eHandStrength.Pair.getHandStrength() == e.getHandStrength());
	}
	
	@Test
	public void TestTwoPair() {
		ArrayList<Card> TwoPair = new ArrayList <Card>();
		TwoPair.add(new Card(eSuit.CLUBS, eRank.ACE));
		TwoPair.add(new Card(eSuit.HEARTS, eRank.ACE));
		TwoPair.add(new Card(eSuit.DIAMONDS, eRank.FIVE));
		TwoPair.add(new Card(eSuit.SPADES, eRank.KING));
		TwoPair.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(TwoPair);
		h.EvalHand();
		assertTrue(eHandStrength.TwoPair.getHandStrength() == h.getHandStrength());
		
		ArrayList<Card> TwoPair2 = new ArrayList <Card>();
		TwoPair2.add(new Card(eSuit.CLUBS, eRank.FIVE));
		TwoPair2.add(new Card(eSuit.HEARTS, eRank.ACE));
		TwoPair2.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		TwoPair2.add(new Card(eSuit.SPADES, eRank.KING));
		TwoPair2.add(new Card(eSuit.CLUBS, eRank.FIVE));
		
		Hand t = new Hand();
		t = Hand.EvalHand(TwoPair2);
		t.EvalHand();
		assertTrue(eHandStrength.TwoPair.getHandStrength() == t.getHandStrength());
		
		ArrayList<Card> TwoPair3 = new ArrayList <Card>();
		TwoPair3.add(new Card(eSuit.CLUBS, eRank.FIVE));
		TwoPair3.add(new Card(eSuit.HEARTS, eRank.ACE));
		TwoPair3.add(new Card(eSuit.DIAMONDS, eRank.FIVE));
		TwoPair3.add(new Card(eSuit.SPADES, eRank.KING));
		TwoPair3.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand k = new Hand();
		k = Hand.EvalHand(TwoPair3);
		k.EvalHand();
		assertTrue(eHandStrength.TwoPair.getHandStrength() == k.getHandStrength());
	}
	
	@Test
	public void TestHighCard() {
		ArrayList<Card> HighCard = new ArrayList <Card>();
		HighCard.add(new Card(eSuit.CLUBS, eRank.ACE));
		HighCard.add(new Card(eSuit.HEARTS, eRank.SEVEN));
		HighCard.add(new Card(eSuit.DIAMONDS, eRank.FOUR));
		HighCard.add(new Card(eSuit.SPADES, eRank.EIGHT));
		HighCard.add(new Card(eSuit.CLUBS, eRank.JACK));
		
		Hand h = new Hand();
		h = Hand.EvalHand(HighCard);
		h.EvalHand();
		assertTrue(eHandStrength.HighCard.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestThreeOfAKind() {
		ArrayList<Card> ThreeKind = new ArrayList <Card>();
		ThreeKind.add(new Card(eSuit.CLUBS, eRank.ACE));
		ThreeKind.add(new Card(eSuit.HEARTS, eRank.FOUR));
		ThreeKind.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		ThreeKind.add(new Card(eSuit.SPADES, eRank.TEN));
		ThreeKind.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(ThreeKind);
		h.EvalHand();
		assertTrue(eHandStrength.ThreeOfAKind.getHandStrength() == h.getHandStrength());
		
		ArrayList<Card> ThreeKind2 = new ArrayList <Card>();
		ThreeKind2.add(new Card(eSuit.CLUBS, eRank.ACE));
		ThreeKind2.add(new Card(eSuit.HEARTS, eRank.FOUR));
		ThreeKind2.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		ThreeKind2.add(new Card(eSuit.SPADES, eRank.TEN));
		ThreeKind2.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand y = new Hand();
		y = Hand.EvalHand(ThreeKind2);
		y.EvalHand();
		assertTrue(eHandStrength.ThreeOfAKind.getHandStrength() == y.getHandStrength());
	}
	
	@Test
	public void TestStraight() {
		ArrayList<Card> Straight = new ArrayList <Card>();
		Straight.add(new Card(eSuit.CLUBS, eRank.FOUR));
		Straight.add(new Card(eSuit.HEARTS, eRank.SEVEN));
		Straight.add(new Card(eSuit.DIAMONDS, eRank.FIVE));
		Straight.add(new Card(eSuit.SPADES, eRank.SIX));
		Straight.add(new Card(eSuit.CLUBS, eRank.THREE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(Straight);
		h.EvalHand();
		assertTrue(eHandStrength.Straight.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestFlush() {
		ArrayList<Card> Flush = new ArrayList <Card>();
		Flush.add(new Card(eSuit.HEARTS, eRank.THREE));
		Flush.add(new Card(eSuit.HEARTS, eRank.SEVEN));
		Flush.add(new Card(eSuit.HEARTS, eRank.JACK));
		Flush.add(new Card(eSuit.HEARTS, eRank.QUEEN));
		Flush.add(new Card(eSuit.HEARTS, eRank.FIVE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(Flush);
		h.EvalHand();
		assertTrue(eHandStrength.Flush.getHandStrength() == h.getHandStrength());
	}
	
	@Test
	public void TestFullHouse() {
		ArrayList<Card> FullHouse = new ArrayList <Card>();
		FullHouse.add(new Card(eSuit.CLUBS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.HEARTS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.DIAMONDS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.SPADES, eRank.KING));
		FullHouse.add(new Card(eSuit.CLUBS, eRank.KING));
		
		Hand h = new Hand();
		h = Hand.EvalHand(FullHouse);
		h.EvalHand();
		assertTrue(eHandStrength.FullHouse.getHandStrength() == h.getHandStrength());
		
		ArrayList<Card> FullHouse2 = new ArrayList <Card>();
		FullHouse2.add(new Card(eSuit.CLUBS, eRank.FOUR));
		FullHouse2.add(new Card(eSuit.HEARTS, eRank.TWO));
		FullHouse2.add(new Card(eSuit.DIAMONDS, eRank.FOUR));
		FullHouse2.add(new Card(eSuit.SPADES, eRank.TWO));
		FullHouse2.add(new Card(eSuit.CLUBS, eRank.FOUR));
		
		Hand g = new Hand();
		g = Hand.EvalHand(FullHouse2);
		g.EvalHand();
		assertTrue(eHandStrength.FullHouse.getHandStrength() == g.getHandStrength());
	}
	
	@Test
	public void TestStraightFlush() {
		ArrayList<Card> StraightFlush = new ArrayList <Card>();
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.EIGHT));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.NINE));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.JACK));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.QUEEN));
		
		Hand h = new Hand();
		h = Hand.EvalHand(StraightFlush);
		h.EvalHand();
		assertTrue(eHandStrength.StraightFlush.getHandStrength() == h.getHandStrength());
	}
	
	/**
	 * Royal Flush test does not work because we have not implemented Joker as Wild functionality

	@Test
	public void TestRoyalFlush() {
		ArrayList<Card> RoyalFlush = new ArrayList <Card>();
		RoyalFlush.add(new Card(eSuit.HEARTS, eRank.JOKER));
		RoyalFlush.add(new Card(eSuit.HEARTS, eRank.JACK));
		RoyalFlush.add(new Card(eSuit.HEARTS, eRank.QUEEN));
		RoyalFlush.add(new Card(eSuit.HEARTS, eRank.KING));
		RoyalFlush.add(new Card(eSuit.HEARTS, eRank.ACE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(RoyalFlush);
		h.EvalHand();
		assertTrue(eHandStrength.RoyalFlush.getHandStrength() == h.getHandStrength());
	}
	*/
	
	@Test
	public void TestNaturalRoyalFlush() {
		ArrayList<Card> NaturalRoyalFlush = new ArrayList <Card>();
		NaturalRoyalFlush.add(new Card(eSuit.HEARTS, eRank.TEN));
		NaturalRoyalFlush.add(new Card(eSuit.HEARTS, eRank.JACK));
		NaturalRoyalFlush.add(new Card(eSuit.HEARTS, eRank.QUEEN));
		NaturalRoyalFlush.add(new Card(eSuit.HEARTS, eRank.KING));
		NaturalRoyalFlush.add(new Card(eSuit.HEARTS, eRank.ACE));
		
		Hand h = new Hand();
		h = Hand.EvalHand(NaturalRoyalFlush);
		h.EvalHand();
		assertTrue(eHandStrength.NaturalRoyalFlush.getHandStrength() == h.getHandStrength());
	}
	// Don't know how to call an ArrayList<Hand> method without calling it from a Hand object. Created array list as 
	// an attribute of Hand to do this just for testing purposes
	@Test
	public void BestHand() {
		ArrayList<Card> StraightFlush = new ArrayList <Card>();
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.EIGHT));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.NINE));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.TEN));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.JACK));
		StraightFlush.add(new Card(eSuit.CLUBS, eRank.QUEEN));
		
		Hand h = new Hand();
		h = Hand.EvalHand(StraightFlush);
		
		ArrayList<Card> StraightFlush2 = new ArrayList <Card>();
		StraightFlush.add(new Card(eSuit.HEARTS, eRank.EIGHT));
		StraightFlush.add(new Card(eSuit.HEARTS, eRank.NINE));
		StraightFlush.add(new Card(eSuit.HEARTS, eRank.TEN));
		StraightFlush.add(new Card(eSuit.HEARTS, eRank.JACK));
		StraightFlush.add(new Card(eSuit.HEARTS, eRank.QUEEN));
		
		Hand p = new Hand();
		p = Hand.EvalHand(StraightFlush2);
		
		ArrayList<Card> FullHouse = new ArrayList <Card>();
		FullHouse.add(new Card(eSuit.CLUBS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.HEARTS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.DIAMONDS, eRank.FOUR));
		FullHouse.add(new Card(eSuit.SPADES, eRank.KING));
		FullHouse.add(new Card(eSuit.CLUBS, eRank.KING));
		
		Hand t = new Hand();
		t = Hand.EvalHand(FullHouse);
		
		ArrayList<Card> ThreeKind = new ArrayList <Card>();
		ThreeKind.add(new Card(eSuit.CLUBS, eRank.ACE));
		ThreeKind.add(new Card(eSuit.HEARTS, eRank.FOUR));
		ThreeKind.add(new Card(eSuit.DIAMONDS, eRank.ACE));
		ThreeKind.add(new Card(eSuit.SPADES, eRank.TEN));
		ThreeKind.add(new Card(eSuit.CLUBS, eRank.ACE));
		
		Hand m = new Hand();
		m = Hand.EvalHand(ThreeKind);
		
		ArrayList<Hand> Hands = new ArrayList <Hand>();
		Hands.add(h);
		Hands.add(t);
		Hands.add(m);
		Hands.add(p);
		boolean w = false;
		
		m.setWildHands(Hands);
		
		try {
			m.PickBestHand(m.getWildHands());
		} catch (SameHandException e) {
			System.out.println("TIE! No winner.");
			e.printStackTrace();
			w = true;
		}
		
		assertTrue(w == true);
		
		}
	}




