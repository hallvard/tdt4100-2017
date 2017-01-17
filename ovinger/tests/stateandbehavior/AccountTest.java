package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.Account;

@JExercise(description = "Tests stateandbehavior.Account")
@SuppressWarnings("all")
public class AccountTest extends TestCase {
  private Account account;
  
  @Override
  protected void setUp() {
    account = new Account();
    
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      _xblockexpression = (((d1 - epsilon) < d2) && ((d1 + epsilon) > d2));
    }
    return _xblockexpression;
  }
  
  @JExercise(description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(account);
    
  }
  
  @JExercise(tests = "void deposit(double)", description = "<h3>Innskudd</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Setter inn 100 kr.: deposit(100)</li>\n\t\t</ul>\n")
  public void testDeposit() {
    _transition_exprAction__deposit_transitions0_actions0(account);
    _test__deposit_transitions0_effects0_state(account);
    
  }
  
  @JExercise(tests = "void deposit(double)", description = "<h3>Negativt innskudd</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Setter inn -50 kr.: deposit(-50)</li>\n\t\t</ul>\n")
  public void testDepositNegative() {
    _transition_exprAction__depositNegative_transitions0_actions0(account);
    _test__depositNegative_transitions0_effects0_state(account);
    
  }
  
  @JExercise(tests = "double setInterestRate(double);void deposit(double);void addInterest()", description = "<h3>Legge til renter</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Setter rentefoten: interestRate = 5</li>\n\t\t<li>Setter inn 100 kr.: deposit(100)</li>\n\t\t<li>addInterest</li>\n\t\t</ul>\n")
  public void testAddInterest() {
    _transition_exprAction__addInterest_transitions0_actions0(account);
    _test__addInterest_transitions0_effects0_state(account);
    _transition_exprAction__addInterest_transitions1_actions0(account);
    _test__addInterest_transitions1_effects0_state(account);
    _transition_exprAction__addInterest_transitions2_actions0(account);
    _test__addInterest_transitions2_effects0_state(account);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final Account it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    assertTrue("balance == 0 failed", this.operator_equals(_balance, 0));
    
  }
  
  private void _transition_exprAction__deposit_transitions0_actions0(final Account it) {
    try {
      
      it.deposit(100);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(100) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deposit_transitions0_effects0_state(final Account it) {
    _test__deposit_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__deposit_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    assertTrue("balance == 100 failed after deposit(100)", this.operator_equals(_balance, 100));
    
  }
  
  private void _transition_exprAction__depositNegative_transitions0_actions0(final Account it) {
    try {
      
      it.deposit((-50));
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(-50) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositNegative_transitions0_effects0_state(final Account it) {
    _test__depositNegative_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__depositNegative_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    assertTrue("balance == 0 failed after deposit(-50)", this.operator_equals(_balance, 0));
    
  }
  
  private void _transition_exprAction__addInterest_transitions0_actions0(final Account it) {
    try {
      
      it.setInterestRate(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("interestRate = 5 failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions0_effects0_state(final Account it) {
    _test__addInterest_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    boolean _equals = this.operator_equals(_balance, 0);
    assertTrue("balance == 0 failed after interestRate = 5", _equals);
    
    double _interestRate = it.getInterestRate();
    assertTrue("interestRate == 5 failed after interestRate = 5", this.operator_equals(_interestRate, 5));
    
  }
  
  private void _transition_exprAction__addInterest_transitions1_actions0(final Account it) {
    try {
      
      it.deposit(100);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(100) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions1_effects0_state(final Account it) {
    _test__addInterest_transitions1_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions1_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    assertTrue("balance == 100 failed after deposit(100)", this.operator_equals(_balance, 100));
    
  }
  
  private void _transition_exprAction__addInterest_transitions2_actions0(final Account it) {
    try {
      
      it.addInterest();
      } catch (junit.framework.AssertionFailedError error) {
      fail("addInterest failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions2_effects0_state(final Account it) {
    _test__addInterest_transitions2_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions2_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    assertTrue("balance == 105 failed after addInterest", this.operator_equals(_balance, 105));
    
  }
}
