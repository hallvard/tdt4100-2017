package encapsulation;

import encapsulation.Vehicle;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests encapsulation.Vehicle")
@SuppressWarnings("all")
public class VehicleTest extends TestCase {
  private Vehicle vehicle;
  
  private Vehicle _init_vehicle() {
    return null;
  }
  
  @Override
  protected void setUp() {
    vehicle = _init_vehicle();
    
  }
  
  private boolean operator_equals(final Character c, final String s) {
    return ((s.length() == 1) && ((c).charValue() == s.charAt(0)));
  }
  
  @JExercise(tests = "null(char,char,String)", description = "<h3>Korrekt bruk av konstrukt\u00F8r</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"EL1234\")</li>\n\t\t</ul>\n")
  public void testConstructorCorrectUse() {
    _transition_exprAction__constructorCorrectUse_transitions0_actions0(vehicle);
    _test__constructorCorrectUse_transitions0_effects0_state(vehicle);
    _transition_exprAction__constructorCorrectUse_transitions1_actions0(vehicle);
    _test__constructorCorrectUse_transitions1_effects0_state(vehicle);
    
  }
  
  @JExercise(tests = "null(char,char,String)", description = "<h3>Ugyldig drivstoff</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'Y\', \"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'H\', \"HY1234\")</li>\n\t\t</ul>\n")
  public void testConstructorInvalidFuel() {
    try {
      _transition_exprAction__constructorInvalidFuel_transitions0_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'Y', \"BN12345\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'Y', \"BN12345\")", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidFuel_transitions1_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'H', \"HY1234\")");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'H', \"HY1234\")", e_1 instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "null(char,char,String)", description = "<h3>Ugyldig kj\u00F8ret\u00F8ytype</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'P\', \'D\', \"BN12345\")</li>\n\t\t</ul>\n")
  public void testConstructorInvalidVehicleType() {
    try {
      _transition_exprAction__constructorInvalidVehicleType_transitions0_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('P', 'D', \"BN12345\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('P', 'D', \"BN12345\")", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "null(char,char,String)", description = "<h3>Ugyldig registreringsnumber</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"A1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"A12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"AB1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"AB123456\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"ABC1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"A\u00C612345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"ab12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"A1B2345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"A1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"A12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"AB123\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"AB12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"ABC1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"ABC12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"A\u00C51234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"ab1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"EL12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"EK12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"HY12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"EL12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"EK12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"HY12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'H\', \"EL12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'H\', \"EK12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'H\', \"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'E\', \"HY12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'E\', \"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"EL1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"EK1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"HY1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'D\', \"EL1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'D\', \"EK1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'D\', \"HY1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"HY1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"BN1234\")</li>\n\t\t</ul>\n")
  public void testConstructorInvalidRegistrationNumber() {
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions0_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A1234\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A1234\")", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions1_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A12345\")");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A12345\")", e_1 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions2_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AB1234\")");
    } catch (Exception e_2) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AB1234\")", e_2 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions3_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AB123456\")");
    } catch (Exception e_3) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AB123456\")", e_3 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions4_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ABC1234\")");
    } catch (Exception e_4) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ABC1234\")", e_4 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions5_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AÆ12345\")");
    } catch (Exception e_5) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AÆ12345\")", e_5 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions6_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ab12345\")");
    } catch (Exception e_6) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ab12345\")", e_6 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions7_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A1B2345\")");
    } catch (Exception e_7) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"A1B2345\")", e_7 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions8_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"A1234\")");
    } catch (Exception e_8) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"A1234\")", e_8 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions9_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"A12345\")");
    } catch (Exception e_9) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"A12345\")", e_9 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions10_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"AB123\")");
    } catch (Exception e_10) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"AB123\")", e_10 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions11_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"AB12345\")");
    } catch (Exception e_11) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"AB12345\")", e_11 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions12_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"ABC1234\")");
    } catch (Exception e_12) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"ABC1234\")", e_12 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions13_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"ABC12345\")");
    } catch (Exception e_13) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"ABC12345\")", e_13 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions14_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AÅ1234\")");
    } catch (Exception e_14) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"AÅ1234\")", e_14 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions15_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ab1234\")");
    } catch (Exception e_15) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"ab1234\")", e_15 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions16_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"EL12345\")");
    } catch (Exception e_16) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"EL12345\")", e_16 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions17_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"EK12345\")");
    } catch (Exception e_17) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"EK12345\")", e_17 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions18_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"HY12345\")");
    } catch (Exception e_18) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'G', \"HY12345\")", e_18 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions19_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"EL12345\")");
    } catch (Exception e_19) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"EL12345\")", e_19 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions20_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"EK12345\")");
    } catch (Exception e_20) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"EK12345\")", e_20 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions21_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"HY12345\")");
    } catch (Exception e_21) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"HY12345\")", e_21 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions22_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"EL12345\")");
    } catch (Exception e_22) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"EL12345\")", e_22 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions23_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"EK12345\")");
    } catch (Exception e_23) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"EK12345\")", e_23 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions24_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"BN12345\")");
    } catch (Exception e_24) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'H', \"BN12345\")", e_24 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions25_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'E', \"HY12345\")");
    } catch (Exception e_25) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'E', \"HY12345\")", e_25 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions26_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'E', \"BN12345\")");
    } catch (Exception e_26) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'E', \"BN12345\")", e_26 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions27_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"EL1234\")");
    } catch (Exception e_27) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"EL1234\")", e_27 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions28_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"EK1234\")");
    } catch (Exception e_28) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"EK1234\")", e_28 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions29_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"HY1234\")");
    } catch (Exception e_29) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'G', \"HY1234\")", e_29 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions30_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"EL1234\")");
    } catch (Exception e_30) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"EL1234\")", e_30 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions31_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"EK1234\")");
    } catch (Exception e_31) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"EK1234\")", e_31 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions32_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"HY1234\")");
    } catch (Exception e_32) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'D', \"HY1234\")", e_32 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions33_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"HY1234\")");
    } catch (Exception e_33) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"HY1234\")", e_33 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructorInvalidRegistrationNumber_transitions34_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"BN1234\")");
    } catch (Exception e_34) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"BN1234\")", e_34 instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "null(char,char,String);void setRegistrationNumber(String)", description = "<h3>Endre registreringsnummer p\u00E5 gyldig vis</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"BN12345\"), setRegistrationNumber(\"AB54321\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"EK1234\"), setRegistrationNumber(\"EL4321\")</li>\n\t\t</ul>\n")
  public void testSetRegistrationNumberCorrectUse() {
    _transition_exprAction__setRegistrationNumberCorrectUse_transitions0_actions0(vehicle);
    _transition_exprAction__setRegistrationNumberCorrectUse_transitions0_actions1(vehicle);
    _test__setRegistrationNumberCorrectUse_transitions0_effects0_state(vehicle);
    _transition_exprAction__setRegistrationNumberCorrectUse_transitions1_actions0(vehicle);
    _transition_exprAction__setRegistrationNumberCorrectUse_transitions1_actions1(vehicle);
    _test__setRegistrationNumberCorrectUse_transitions1_effects0_state(vehicle);
    
  }
  
  @JExercise(tests = "null(char,char,String);void setRegistrationNumber(String)", description = "<h3>Pr\u00F8ver \u00E5 endre registreringsnummer uten at tilstanden skal p\u00E5virkes</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"BN12345\"), setRegistrationNumber(\"AB654321\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"EL1234\"), setRegistrationNumber(\"HY1234\")</li>\n\t\t</ul>\n")
  public void testSetRegistrationNumberInvalidUseDoesntChangeState() {
    try {
      _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions0_actions0(vehicle);
      _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions0_actions1(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"BN12345\"), setRegistrationNumber(\"AB654321\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('C', 'D', \"BN12345\"), setRegistrationNumber(\"AB654321\")", e instanceof IllegalArgumentException);
    }
    _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions1_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions2_actions0(vehicle);
      _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions2_actions1(vehicle);
      fail("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"EL1234\"), setRegistrationNumber(\"HY1234\")");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after vehicle = new Vehicle('M', 'E', \"EL1234\"), setRegistrationNumber(\"HY1234\")", e_1 instanceof IllegalArgumentException);
    }
    _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions3_effects0_state(vehicle);
    
  }
  
  @JExercise(tests = "null(char,char,String);void setRegistrationNumber(String)", description = "<h3>Pr\u00F8ver \u00E5 endre registreringsnummer til noe ugyldig</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"AB12345\")</li>\n\t\t<li>setRegistrationNumber(\"A1234\")</li>\n\t\t<li>setRegistrationNumber(\"A12345\")</li>\n\t\t<li>setRegistrationNumber(\"AB1234\")</li>\n\t\t<li>setRegistrationNumber(\"AB123456\")</li>\n\t\t<li>setRegistrationNumber(\"ABC1234\")</li>\n\t\t<li>setRegistrationNumber(\"A\u00C612345\")</li>\n\t\t<li>setRegistrationNumber(\"ab12345\")</li>\n\t\t<li>setRegistrationNumber(\"A1B2345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"AB1234\")</li>\n\t\t<li>setRegistrationNumber(\"A1234\")</li>\n\t\t<li>setRegistrationNumber(\"A12345\")</li>\n\t\t<li>setRegistrationNumber(\"AB123\")</li>\n\t\t<li>setRegistrationNumber(\"AB12345\")</li>\n\t\t<li>setRegistrationNumber(\"ABC1234\")</li>\n\t\t<li>setRegistrationNumber(\"ABC12345\")</li>\n\t\t<li>setRegistrationNumber(\"A\u00C51234\")</li>\n\t\t<li>setRegistrationNumber(\"ab1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'G\', \"AB12345\")</li>\n\t\t<li>setRegistrationNumber(\"EL12345\")</li>\n\t\t<li>setRegistrationNumber(\"EK12345\")</li>\n\t\t<li>setRegistrationNumber(\"HY12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'D\', \"AB12345\")</li>\n\t\t<li>setRegistrationNumber(\"EL12345\")</li>\n\t\t<li>setRegistrationNumber(\"EK12345\")</li>\n\t\t<li>setRegistrationNumber(\"HY12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'H\', \"HY12345\")</li>\n\t\t<li>setRegistrationNumber(\"EL12345\")</li>\n\t\t<li>setRegistrationNumber(\"EK12345\")</li>\n\t\t<li>setRegistrationNumber(\"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'C\', \'E\', \"EL12345\")</li>\n\t\t<li>setRegistrationNumber(\"HY12345\")</li>\n\t\t<li>setRegistrationNumber(\"BN12345\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'G\', \"AB1234\")</li>\n\t\t<li>setRegistrationNumber(\"EL1234\")</li>\n\t\t<li>setRegistrationNumber(\"EK1234\")</li>\n\t\t<li>setRegistrationNumber(\"HY1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'D\', \"AB1234\")</li>\n\t\t<li>setRegistrationNumber(\"EL1234\")</li>\n\t\t<li>setRegistrationNumber(\"EK1234\")</li>\n\t\t<li>setRegistrationNumber(\"HY1234\")</li>\n\t\t<li>vehicle = new Vehicle(\'M\', \'E\', \"EK1234\")</li>\n\t\t<li>setRegistrationNumber(\"HY1234\")</li>\n\t\t<li>setRegistrationNumber(\"BN1234\")</li>\n\t\t</ul>\n")
  public void testSetRegistrationNumberInvalidUse() {
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions0_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions0_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions1_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1234\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1234\")", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions2_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"A12345\")");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"A12345\")", e_1 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions3_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB1234\")");
    } catch (Exception e_2) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB1234\")", e_2 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions4_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB123456\")");
    } catch (Exception e_3) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB123456\")", e_3 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions5_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC1234\")");
    } catch (Exception e_4) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC1234\")", e_4 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions6_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AÆ12345\")");
    } catch (Exception e_5) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AÆ12345\")", e_5 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions7_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"ab12345\")");
    } catch (Exception e_6) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"ab12345\")", e_6 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions8_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1B2345\")");
    } catch (Exception e_7) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1B2345\")", e_7 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions9_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions9_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions10_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1234\")");
    } catch (Exception e_8) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"A1234\")", e_8 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions11_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"A12345\")");
    } catch (Exception e_9) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"A12345\")", e_9 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions12_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB123\")");
    } catch (Exception e_10) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB123\")", e_10 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions13_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB12345\")");
    } catch (Exception e_11) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AB12345\")", e_11 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions14_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC1234\")");
    } catch (Exception e_12) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC1234\")", e_12 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions15_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC12345\")");
    } catch (Exception e_13) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"ABC12345\")", e_13 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions16_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"AÅ1234\")");
    } catch (Exception e_14) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"AÅ1234\")", e_14 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions17_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"ab1234\")");
    } catch (Exception e_15) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"ab1234\")", e_15 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions18_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions18_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions19_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")");
    } catch (Exception e_16) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")", e_16 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions20_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")");
    } catch (Exception e_17) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")", e_17 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions21_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")");
    } catch (Exception e_18) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")", e_18 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions22_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions22_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions23_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")");
    } catch (Exception e_19) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")", e_19 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions24_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")");
    } catch (Exception e_20) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")", e_20 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions25_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")");
    } catch (Exception e_21) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")", e_21 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions26_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions26_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions27_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")");
    } catch (Exception e_22) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL12345\")", e_22 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions28_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")");
    } catch (Exception e_23) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK12345\")", e_23 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions29_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN12345\")");
    } catch (Exception e_24) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN12345\")", e_24 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions30_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions30_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions31_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")");
    } catch (Exception e_25) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY12345\")", e_25 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions32_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN12345\")");
    } catch (Exception e_26) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN12345\")", e_26 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions33_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions33_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions34_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL1234\")");
    } catch (Exception e_27) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL1234\")", e_27 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions35_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK1234\")");
    } catch (Exception e_28) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK1234\")", e_28 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions36_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")");
    } catch (Exception e_29) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")", e_29 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions37_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions37_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions38_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL1234\")");
    } catch (Exception e_30) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EL1234\")", e_30 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions39_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK1234\")");
    } catch (Exception e_31) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"EK1234\")", e_31 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions40_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")");
    } catch (Exception e_32) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")", e_32 instanceof IllegalArgumentException);
    }
    _transition_exprAction__setRegistrationNumberInvalidUse_transitions41_actions0(vehicle);
    _test__setRegistrationNumberInvalidUse_transitions41_effects0_state(vehicle);
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions42_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")");
    } catch (Exception e_33) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"HY1234\")", e_33 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__setRegistrationNumberInvalidUse_transitions43_actions0(vehicle);
      fail("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN1234\")");
    } catch (Exception e_34) {
      assertTrue("IllegalArgumentException should be thrown after setRegistrationNumber(\"BN1234\")", e_34 instanceof IllegalArgumentException);
    }
    
  }
  
  private void _transition_exprAction__constructorCorrectUse_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructorCorrectUse_transitions0_effects0_state(final Vehicle it) {
    _test__constructorCorrectUse_transitions0_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__constructorCorrectUse_transitions0_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"BN12345\" failed after vehicle = new Vehicle('C', 'D', \"BN12345\")", "BN12345", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "D");
    assertTrue("getFuelType() == 'D' failed after vehicle = new Vehicle('C', 'D', \"BN12345\")", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'C' failed after vehicle = new Vehicle('C', 'D', \"BN12345\")", this.operator_equals(Character.valueOf(_vehicleType), "C"));
    
  }
  
  private void _transition_exprAction__constructorCorrectUse_transitions1_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "EL1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructorCorrectUse_transitions1_effects0_state(final Vehicle it) {
    _test__constructorCorrectUse_transitions1_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__constructorCorrectUse_transitions1_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"EL1234\" failed after vehicle = new Vehicle('M', 'E', \"EL1234\")", "EL1234", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "E");
    assertTrue("getFuelType() == 'E' failed after vehicle = new Vehicle('M', 'E', \"EL1234\")", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'M' failed after vehicle = new Vehicle('M', 'E', \"EL1234\")", this.operator_equals(Character.valueOf(_vehicleType), "M"));
    
  }
  
  private void _transition_exprAction__constructorInvalidFuel_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'Y', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'Y', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidFuel_transitions1_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'H', "HY1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'H', \"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidVehicleType_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('P', 'D', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('P', 'D', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "A1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"A1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions1_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "A12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"A12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions2_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "AB1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AB1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions3_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "AB123456");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AB123456\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions4_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "ABC1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"ABC1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions5_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "A\u00C612345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AÆ12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions6_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "ab12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"ab12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions7_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "A1B2345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"A1B2345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions8_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "A1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"A1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions9_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "A12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"A12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions10_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "AB123");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"AB123\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions11_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "AB12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"AB12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions12_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "ABC1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"ABC1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions13_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "ABC12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"ABC12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions14_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "A\u00C51234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AÅ1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions15_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "ab1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"ab1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions16_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "EL12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions17_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "EK12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions18_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "HY12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions19_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "EL12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions20_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "EK12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions21_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "HY12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions22_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'H', "EL12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'H', \"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions23_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'H', "EK12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'H', \"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions24_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'H', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'H', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions25_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'E', "HY12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'E', \"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions26_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'E', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'E', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions27_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "EL1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions28_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "EK1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions29_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "HY1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions30_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'D', "EL1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'D', \"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions31_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'D', "EK1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'D', \"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions32_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'D', "HY1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'D', \"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions33_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "HY1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructorInvalidRegistrationNumber_transitions34_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "BN1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"BN1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberCorrectUse_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberCorrectUse_transitions0_actions1(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB54321");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB54321\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberCorrectUse_transitions0_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberCorrectUse_transitions0_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberCorrectUse_transitions0_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"AB54321\" failed after vehicle = new Vehicle('C', 'D', \"BN12345\") ,setRegistrationNumber(\"AB54321\")", "AB54321", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "D");
    assertTrue("getFuelType() == 'D' failed after vehicle = new Vehicle('C', 'D', \"BN12345\") ,setRegistrationNumber(\"AB54321\")", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'C' failed after vehicle = new Vehicle('C', 'D', \"BN12345\") ,setRegistrationNumber(\"AB54321\")", this.operator_equals(Character.valueOf(_vehicleType), "C"));
    
  }
  
  private void _transition_exprAction__setRegistrationNumberCorrectUse_transitions1_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "EK1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberCorrectUse_transitions1_actions1(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL4321");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL4321\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberCorrectUse_transitions1_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberCorrectUse_transitions1_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberCorrectUse_transitions1_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"EL4321\" failed after vehicle = new Vehicle('M', 'E', \"EK1234\") ,setRegistrationNumber(\"EL4321\")", "EL4321", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "E");
    assertTrue("getFuelType() == 'E' failed after vehicle = new Vehicle('M', 'E', \"EK1234\") ,setRegistrationNumber(\"EL4321\")", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'M' failed after vehicle = new Vehicle('M', 'E', \"EK1234\") ,setRegistrationNumber(\"EL4321\")", this.operator_equals(Character.valueOf(_vehicleType), "M"));
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "BN12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions0_actions1(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB654321");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB654321\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions1_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions1_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions1_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"BN12345\" failed", "BN12345", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "D");
    assertTrue("getFuelType() == 'D' failed", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'C' failed", this.operator_equals(Character.valueOf(_vehicleType), "C"));
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions2_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "EL1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUseDoesntChangeState_transitions2_actions1(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions3_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions3_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUseDoesntChangeState_transitions3_effects0_state_objectTests0_test(final Vehicle it) {
    
    String _registrationNumber = it.getRegistrationNumber();
    assertEquals("getRegistrationNumber() == \"EL1234\" failed", "EL1234", _registrationNumber);
    
    char _fuelType = it.getFuelType();
    boolean _equals = this.operator_equals(Character.valueOf(_fuelType), "E");
    assertTrue("getFuelType() == 'E' failed", _equals);
    
    char _vehicleType = it.getVehicleType();
    assertTrue("getVehicleType() == 'M' failed", this.operator_equals(Character.valueOf(_vehicleType), "M"));
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions0_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "AB12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AB12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions0_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions0_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions0_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions1_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"A1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions2_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"A12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions3_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions4_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB123456");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB123456\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions5_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("ABC1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"ABC1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions6_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A\u00C612345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AÆ12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions7_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("ab12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"ab12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions8_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A1B2345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"A1B2345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions9_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "AB1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"AB1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions9_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions9_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions9_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions10_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"A1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions11_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"A12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions12_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB123");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB123\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions13_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("AB12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AB12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions14_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("ABC1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"ABC1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions15_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("ABC12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"ABC12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions16_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("A\u00C51234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"AÅ1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions17_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("ab1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"ab1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions18_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'G', "AB12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'G', \"AB12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions18_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions18_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions18_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions19_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions20_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EK12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions21_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions22_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'D', "AB12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'D', \"AB12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions22_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions22_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions22_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions23_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions24_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EK12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions25_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions26_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'H', "HY12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'H', \"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions26_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions26_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions26_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions27_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions28_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EK12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EK12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions29_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("BN12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions30_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('C', 'E', "EL12345");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('C', 'E', \"EL12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions30_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions30_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions30_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions31_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions32_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("BN12345");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"BN12345\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions33_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'G', "AB1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'G', \"AB1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions33_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions33_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions33_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions34_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions35_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EK1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions36_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions37_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'D', "AB1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'D', \"AB1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions37_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions37_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions37_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions38_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EL1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EL1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions39_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("EK1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions40_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions41_actions0(final Vehicle it) {
    try {
      
      Vehicle _vehicle = new Vehicle('M', 'E', "EK1234");
      this.vehicle = _vehicle;
      } catch (junit.framework.AssertionFailedError error) {
      fail("vehicle = new Vehicle('M', 'E', \"EK1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions41_effects0_state(final Vehicle it) {
    _test__setRegistrationNumberInvalidUse_transitions41_effects0_state_objectTests0_test(vehicle);
    
  }
  
  private void _test__setRegistrationNumberInvalidUse_transitions41_effects0_state_objectTests0_test(final Vehicle it) {
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions42_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("HY1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"HY1234\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__setRegistrationNumberInvalidUse_transitions43_actions0(final Vehicle it) {
    try {
      
      it.setRegistrationNumber("BN1234");
      } catch (junit.framework.AssertionFailedError error) {
      fail("setRegistrationNumber(\"BN1234\") failed: " + error.getMessage());
    }
    
  }
}
