package encapsulation;

import encapsulation.Card;
import encapsulation.CardDeck;
import java.util.Collection;
import java.util.Collections;
import junit.framework.TestCase;
import no.hal.jex.jextest.extensions.JextestExtensions;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests encapsulation.CardDeck")
@SuppressWarnings("all")
public class CardDeckTest extends TestCase {
  private CardDeck deck;
  
  private CardDeck _init_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  @Override
  protected void setUp() {
    deck = _init_deck();
    
  }
  
  private boolean operator_assertEquals(final CardDeck it, final Collection<String> toStrings) {
    boolean _xblockexpression = false;
    {
      int _cardCount = it.getCardCount();
      int _size = toStrings.size();
      boolean _assertEquals = JextestExtensions.operator_assertEquals(_cardCount, _size);
      boolean _not = (!_assertEquals);
      if (_not) {
        return false;
      }
      int i = 0;
      for (final String toString : toStrings) {
        {
          final Card card = it.getCard(i);
          char _suit = card.getSuit();
          String _valueOf = String.valueOf(_suit);
          int _face = card.getFace();
          String _plus = (_valueOf + Integer.valueOf(_face));
          boolean _assertEquals_1 = JextestExtensions.operator_assertEquals(_plus, toString);
          boolean _not_1 = (!_assertEquals_1);
          if (_not_1) {
            return false;
          }
          i = (i + 1);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "null(int)", description = "Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(deck);
    
  }
  
  @JExercise(tests = "null(int);void shufflePerfectly()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>shufflePerfectly</li>\n\t\t</ul>\n")
  public void testShufflePerfectly() {
    _transition_exprAction__shufflePerfectly_transitions0_actions0(deck);
    _test__shufflePerfectly_transitions0_effects0_state(deck);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final CardDeck it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(deck);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final CardDeck it) {
    
    assertTrue("deck ?= #[\"S1\", \"S2\", \"H1\", \"H2\", \"D1\", \"D2\", \"C1\", \"C2\"] failed", this.operator_assertEquals(
      this.deck, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("S1", "S2", "H1", "H2", "D1", "D2", "C1", "C2"))));
    
  }
  
  private void _transition_exprAction__shufflePerfectly_transitions0_actions0(final CardDeck it) {
    try {
      
      it.shufflePerfectly();
      } catch (junit.framework.AssertionFailedError error) {
      fail("shufflePerfectly failed: " + error.getMessage());
    }
    
  }
  
  private void _test__shufflePerfectly_transitions0_effects0_state(final CardDeck it) {
    _test__shufflePerfectly_transitions0_effects0_state_objectTests0_test(deck);
    
  }
  
  private void _test__shufflePerfectly_transitions0_effects0_state_objectTests0_test(final CardDeck it) {
    
    assertTrue("deck ?= #[\"S1\", \"D1\", \"S2\", \"D2\", \"H1\", \"C1\", \"H2\", \"C2\"] failed after shufflePerfectly", this.operator_assertEquals(
      this.deck, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("S1", "D1", "S2", "D2", "H1", "C1", "H2", "C2"))));
    
  }
}
