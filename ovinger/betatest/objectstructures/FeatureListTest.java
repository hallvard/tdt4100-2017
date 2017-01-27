package objectstructures;

import java.util.ArrayList;
import java.util.Collection;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.FeatureList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;

@JExercise(description = "Tests objectstructures.FeatureList")
@SuppressWarnings("all")
public class FeatureListTest extends TestCase {
  private FeatureList featureList;
  
  @Override
  protected void setUp() {
    featureList = new FeatureList();
    
  }
  
  private boolean operator_equals(final Collection<?> col1, final Collection<?> col2) {
    return (col1.containsAll(col2) && col2.containsAll(col1));
  }
  
  private void testFeatures(final FeatureList features, final Pair<String, Double>... namesValues) {
    for (final Pair<String, Double> nameValue : namesValues) {
      {
        String _key = nameValue.getKey();
        String _plus = ("Expected a " + _key);
        String _plus_1 = (_plus + " feature");
        String _key_1 = nameValue.getKey();
        boolean _hasFeature = features.hasFeature(_key_1);
        Assert.assertTrue(_plus_1, _hasFeature);
        Double _value = nameValue.getValue();
        String _plus_2 = ("Expected " + _value);
        String _plus_3 = (_plus_2 + " as value for ");
        String _key_2 = nameValue.getKey();
        String _plus_4 = (_plus_3 + _key_2);
        Double _value_1 = nameValue.getValue();
        String _key_3 = nameValue.getKey();
        double _featureValue = features.getFeatureValue(_key_3);
        Assert.assertEquals(_plus_4, (_value_1).doubleValue(), _featureValue, 0.000001);
      }
    }
  }
  
  @JExercise(tests = "null()", description = "Tests \n\t\tinitialization\n")
  public void testTestConstructor() {
    _test__testConstructor_transitions0_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null()", description = "Tests \n\t\tinitialization\n")
  public void testTestGetNonExistingFeatureValue() {
    _test__testGetNonExistingFeatureValue_transitions0_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0)</li>\n\t\t</ul>\n")
  public void testTestAddNewFeature() {
    _test__testAddNewFeature_transitions0_source_state(featureList);
    _transition_exprAction__testAddNewFeature_transitions0_actions0(featureList);
    _test__testAddNewFeature_transitions0_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0)</li>\n\t\t<li>addFeature(\"god\", 3.0)</li>\n\t\t</ul>\n")
  public void testTestAddTwoFeatures() {
    _test__testAddTwoFeatures_transitions0_source_state(featureList);
    _transition_exprAction__testAddTwoFeatures_transitions0_actions0(featureList);
    _test__testAddTwoFeatures_transitions0_effects0_state(featureList);
    _transition_exprAction__testAddTwoFeatures_transitions1_actions0(featureList);
    _test__testAddTwoFeatures_transitions1_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0)</li>\n\t\t<li>addFeature(\"flink\", 3.0)</li>\n\t\t</ul>\n")
  public void testTestAddExistingFeature() {
    _transition_exprAction__testAddExistingFeature_transitions0_actions0(featureList);
    _test__testAddExistingFeature_transitions0_effects0_state(featureList);
    _transition_exprAction__testAddExistingFeature_transitions1_actions0(featureList);
    _test__testAddExistingFeature_transitions1_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void setFeatureValue(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0)</li>\n\t\t<li>setFeatureValue(\"flink\", 3.0)</li>\n\t\t</ul>\n")
  public void testTestSetExistingFeature() {
    _transition_exprAction__testSetExistingFeature_transitions0_actions0(featureList);
    _test__testSetExistingFeature_transitions0_effects0_state(featureList);
    _transition_exprAction__testSetExistingFeature_transitions1_actions0(featureList);
    _test__testSetExistingFeature_transitions1_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void setFeatureValue(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>setFeatureValue(\"flink\", 3.0)</li>\n\t\t</ul>\n")
  public void testTestSetNewFeature() {
    _test__testSetNewFeature_transitions0_source_state(featureList);
    _transition_exprAction__testSetNewFeature_transitions0_actions0(featureList);
    _test__testSetNewFeature_transitions0_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void increment(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0)</li>\n\t\t<li>increment(2.5)</li>\n\t\t</ul>\n")
  public void testTestIncrementFeatures() {
    _transition_exprAction__testIncrementFeatures_transitions0_actions0(featureList);
    _transition_exprAction__testIncrementFeatures_transitions0_actions1(featureList);
    _test__testIncrementFeatures_transitions0_effects0_state(featureList);
    _transition_exprAction__testIncrementFeatures_transitions1_actions0(featureList);
    _test__testIncrementFeatures_transitions1_effects0_state(featureList);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void add(objectstructures.FeatureList)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0), features2.addFeature(\"flink\", 3.0), features2.addFeature(\"god\", 4.0), add(features2)</li>\n\t\t</ul>\n")
  public void testTestAddFeatureVectorSameFeatures() {
    FeatureList features2 = _init__testAddFeatureVectorSameFeatures_features2();
    _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions0(featureList, features2);
    _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions1(featureList, features2);
    _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions2(featureList, features2);
    _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions3(featureList, features2);
    _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions4(featureList, features2);
    _test__testAddFeatureVectorSameFeatures_transitions0_effects0_state(featureList, features2);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void add(objectstructures.FeatureList)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0), features2.addFeature(\"god\", 2.0), features2.addFeature(\"bra\", 4.0), add(features2)</li>\n\t\t</ul>\n")
  public void testTestAddFeatureVectorOverlappingFeatures() {
    FeatureList features2 = _init__testAddFeatureVectorOverlappingFeatures_features2();
    _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions0(featureList, features2);
    _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions1(featureList, features2);
    _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions2(featureList, features2);
    _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions3(featureList, features2);
    _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions4(featureList, features2);
    _test__testAddFeatureVectorOverlappingFeatures_transitions0_effects0_state(featureList, features2);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void mult(objectstructures.FeatureList)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0), features2.addFeature(\"flink\", 3.0), features2.addFeature(\"god\", 4.0), mult(features2)</li>\n\t\t</ul>\n")
  public void testTestMultFeatureVectorSameFeatures() {
    FeatureList features2 = _init__testMultFeatureVectorSameFeatures_features2();
    _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions0(featureList, features2);
    _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions1(featureList, features2);
    _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions2(featureList, features2);
    _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions3(featureList, features2);
    _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions4(featureList, features2);
    _test__testMultFeatureVectorSameFeatures_transitions0_effects0_state(featureList, features2);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);void mult(objectstructures.FeatureList)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0), features2.addFeature(\"god\", 2.0), features2.addFeature(\"bra\", 4.0), mult(features2)</li>\n\t\t</ul>\n")
  public void testTestMultFeatureVectorOverlappingFeatures() {
    FeatureList features2 = _init__testMultFeatureVectorOverlappingFeatures_features2();
    _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions0(featureList, features2);
    _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions1(featureList, features2);
    _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions2(featureList, features2);
    _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions3(featureList, features2);
    _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions4(featureList, features2);
    _test__testMultFeatureVectorOverlappingFeatures_transitions0_effects0_state(featureList, features2);
    
  }
  
  @JExercise(tests = "null();void addFeature(String,double);objectstructures.FeatureList toFeatureList();void setFeatureValue(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>addFeature(\"flink\", 2.0), addFeature(\"god\", 3.0)</li>\n\t\t<li>Adding a feature to a copy shouldn\'t change the original: toFeatureList.addFeature(\"flott\", -3.0)</li>\n\t\t<li>Setting a feature of a copy shouldn\'t change the original: toFeatureList.setFeatureValue(\"flink\", -5.0)</li>\n\t\t</ul>\n")
  public void testTestToFeatureList() {
    _test__testToFeatureList_transitions0_source_state(featureList);
    _transition_exprAction__testToFeatureList_transitions0_actions0(featureList);
    _transition_exprAction__testToFeatureList_transitions0_actions1(featureList);
    _test__testToFeatureList_transitions0_effects0_state(featureList);
    _transition_exprAction__testToFeatureList_transitions1_actions0(featureList);
    _test__testToFeatureList_transitions1_effects0_state(featureList);
    _transition_exprAction__testToFeatureList_transitions2_actions0(featureList);
    _test__testToFeatureList_transitions2_effects0_state(featureList);
    
  }
  
  private void _test__testConstructor_transitions0_effects0_state(final FeatureList it) {
    _test__testConstructor_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testConstructor_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("featureNames.size == 0 failed", 0, _size);
    
  }
  
  private void _test__testGetNonExistingFeatureValue_transitions0_effects0_state(final FeatureList it) {
    _test__testGetNonExistingFeatureValue_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testGetNonExistingFeatureValue_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("featureNames.size == 0 failed", 0, _size);
    
    double _featureValue = it.getFeatureValue("a");
    assertEquals("getFeatureValue(\"a\") == 0.0 failed", 0.0, _featureValue);
    
  }
  
  private void _test__testAddNewFeature_transitions0_source_state(final FeatureList it) {
    _test__testAddNewFeature_transitions0_source_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddNewFeature_transitions0_source_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    assertNotNull("featureNames.length failed after addFeature(\"flink\", 2.0)", ((Object[])Conversions.unwrapArray(_featureNames, Object.class)).length);
    
  }
  
  private void _transition_exprAction__testAddNewFeature_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddNewFeature_transitions0_effects0_state(final FeatureList it) {
    _test__testAddNewFeature_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddNewFeature_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"flink\", 2.0)", _hasFeature);
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\") failed after addFeature(\"flink\", 2.0)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      this.testFeatures(it, _mappedTo);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0) failed after addFeature(\"flink\", 2.0): " + error.getMessage());
    }
    
  }
  
  private void _test__testAddTwoFeatures_transitions0_source_state(final FeatureList it) {
    _test__testAddTwoFeatures_transitions0_source_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddTwoFeatures_transitions0_source_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    assertNotNull("featureNames.length failed after addFeature(\"flink\", 2.0)", ((Object[])Conversions.unwrapArray(_featureNames, Object.class)).length);
    
  }
  
  private void _transition_exprAction__testAddTwoFeatures_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddTwoFeatures_transitions0_effects0_state(final FeatureList it) {
    _test__testAddTwoFeatures_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddTwoFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"flink\", 2.0)", _hasFeature);
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\") failed after addFeature(\"flink\", 2.0)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      this.testFeatures(it, _mappedTo);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0) failed after addFeature(\"flink\", 2.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddTwoFeatures_transitions1_actions0(final FeatureList it) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddTwoFeatures_transitions1_effects0_state(final FeatureList it) {
    _test__testAddTwoFeatures_transitions1_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddTwoFeatures_transitions1_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"god\", 3.0)", _hasFeature);
    
    boolean _hasFeature_1 = it.hasFeature("god");
    assertTrue("hasFeature(\"god\") failed after addFeature(\"god\", 3.0)", _hasFeature_1);
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\") failed after addFeature(\"god\", 3.0)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(3.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0, \"god\" -> 3.0) failed after addFeature(\"god\", 3.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddExistingFeature_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddExistingFeature_transitions0_effects0_state(final FeatureList it) {
    _test__testAddExistingFeature_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddExistingFeature_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"flink\", 2.0)", _hasFeature);
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\") failed after addFeature(\"flink\", 2.0)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      this.testFeatures(it, _mappedTo);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0) failed after addFeature(\"flink\", 2.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddExistingFeature_transitions1_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddExistingFeature_transitions1_effects0_state(final FeatureList it) {
    _test__testAddExistingFeature_transitions1_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testAddExistingFeature_transitions1_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"flink\", 3.0)", _hasFeature);
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\") failed after addFeature(\"flink\", 3.0)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      this.testFeatures(it, _mappedTo);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0) failed after addFeature(\"flink\", 3.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testSetExistingFeature_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testSetExistingFeature_transitions0_effects0_state(final FeatureList it) {
    _test__testSetExistingFeature_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testSetExistingFeature_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    assertTrue("hasFeature(\"flink\") failed after addFeature(\"flink\", 2.0)", it.hasFeature("flink"));
    
  }
  
  private void _transition_exprAction__testSetExistingFeature_transitions1_actions0(final FeatureList it) {
    try {
      
      it.setFeatureValue("flink", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setFeatureValue(\"flink\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testSetExistingFeature_transitions1_effects0_state(final FeatureList it) {
    _test__testSetExistingFeature_transitions1_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testSetExistingFeature_transitions1_effects0_state_objectTests0_test(final FeatureList it) {
    
    boolean _hasFeature = it.hasFeature("flink");
    assertTrue("hasFeature(\"flink\") failed after setFeatureValue(\"flink\", 3.0)", _hasFeature);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(3.0));
      this.testFeatures(it, _mappedTo);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 3.0) failed after setFeatureValue(\"flink\", 3.0): " + error.getMessage());
    }
    
  }
  
  private void _test__testSetNewFeature_transitions0_source_state(final FeatureList it) {
    _test__testSetNewFeature_transitions0_source_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testSetNewFeature_transitions0_source_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("featureNames.size == 0 failed after setFeatureValue(\"flink\", 3.0)", 0, _size);
    
  }
  
  private void _transition_exprAction__testSetNewFeature_transitions0_actions0(final FeatureList it) {
    try {
      
      it.setFeatureValue("flink", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setFeatureValue(\"flink\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testSetNewFeature_transitions0_effects0_state(final FeatureList it) {
    _test__testSetNewFeature_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testSetNewFeature_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("featureNames.size == 0 failed after setFeatureValue(\"flink\", 3.0)", 0, _size);
    
  }
  
  private void _transition_exprAction__testIncrementFeatures_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testIncrementFeatures_transitions0_actions1(final FeatureList it) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testIncrementFeatures_transitions0_effects0_state(final FeatureList it) {
    _test__testIncrementFeatures_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testIncrementFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god");
    assertTrue("featureNames == newArrayList(\"flink\", \"god\") failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0)", this.operator_equals(_featureNames, _newArrayList));
    
  }
  
  private void _transition_exprAction__testIncrementFeatures_transitions1_actions0(final FeatureList it) {
    try {
      
      it.increment(2.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("increment(2.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testIncrementFeatures_transitions1_effects0_state(final FeatureList it) {
    _test__testIncrementFeatures_transitions1_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testIncrementFeatures_transitions1_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\") failed after increment(2.5)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(4.5));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(5.5));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 4.5, \"god\" -> 5.5) failed after increment(2.5): " + error.getMessage());
    }
    
  }
  
  private FeatureList _init__testAddFeatureVectorSameFeatures_features2() {
    FeatureList _featureList = new FeatureList();
    return _featureList;
  }
  
  private void _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions0(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions1(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions2(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("flink", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"flink\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions3(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("god", 4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"god\", 4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorSameFeatures_transitions0_actions4(final FeatureList it, final FeatureList features2) {
    try {
      
      it.add(features2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("add(features2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddFeatureVectorSameFeatures_transitions0_effects0_state(final FeatureList it, final FeatureList features2) {
    _test__testAddFeatureVectorSameFeatures_transitions0_effects0_state_objectTests0_test(featureList, features2);
    
  }
  
  private void _test__testAddFeatureVectorSameFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it, final FeatureList features2) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\") failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"flink\", 3.0) ,features2.addFeature(\"god\", 4.0) ,add(features2)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(5.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(7.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 5.0, \"god\" -> 7.0) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"flink\", 3.0) ,features2.addFeature(\"god\", 4.0) ,add(features2): " + error.getMessage());
    }
    
  }
  
  private FeatureList _init__testAddFeatureVectorOverlappingFeatures_features2() {
    FeatureList _featureList = new FeatureList();
    return _featureList;
  }
  
  private void _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions0(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions1(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions2(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("god", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"god\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions3(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("bra", 4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"bra\", 4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testAddFeatureVectorOverlappingFeatures_transitions0_actions4(final FeatureList it, final FeatureList features2) {
    try {
      
      it.add(features2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("add(features2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testAddFeatureVectorOverlappingFeatures_transitions0_effects0_state(final FeatureList it, final FeatureList features2) {
    _test__testAddFeatureVectorOverlappingFeatures_transitions0_effects0_state_objectTests0_test(featureList, features2);
    
  }
  
  private void _test__testAddFeatureVectorOverlappingFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it, final FeatureList features2) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god", "bra");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\", \"bra\") failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"god\", 2.0) ,features2.addFeature(\"bra\", 4.0) ,add(features2)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(5.0));
      Pair<String, Double> _mappedTo_2 = Pair.<String, Double>of("bra", Double.valueOf(4.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1, _mappedTo_2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0, \"god\" -> 5.0, \"bra\" -> 4.0) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"god\", 2.0) ,features2.addFeature(\"bra\", 4.0) ,add(features2): " + error.getMessage());
    }
    
  }
  
  private FeatureList _init__testMultFeatureVectorSameFeatures_features2() {
    FeatureList _featureList = new FeatureList();
    return _featureList;
  }
  
  private void _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions0(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions1(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions2(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("flink", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"flink\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions3(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("god", 4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"god\", 4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorSameFeatures_transitions0_actions4(final FeatureList it, final FeatureList features2) {
    try {
      
      it.mult(features2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("mult(features2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testMultFeatureVectorSameFeatures_transitions0_effects0_state(final FeatureList it, final FeatureList features2) {
    _test__testMultFeatureVectorSameFeatures_transitions0_effects0_state_objectTests0_test(featureList, features2);
    
  }
  
  private void _test__testMultFeatureVectorSameFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it, final FeatureList features2) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\") failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"flink\", 3.0) ,features2.addFeature(\"god\", 4.0) ,mult(features2)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(6.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(12.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 6.0, \"god\" -> 12.0) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"flink\", 3.0) ,features2.addFeature(\"god\", 4.0) ,mult(features2): " + error.getMessage());
    }
    
  }
  
  private FeatureList _init__testMultFeatureVectorOverlappingFeatures_features2() {
    FeatureList _featureList = new FeatureList();
    return _featureList;
  }
  
  private void _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions0(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions1(final FeatureList it, final FeatureList features2) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions2(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("god", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"god\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions3(final FeatureList it, final FeatureList features2) {
    try {
      
      features2.addFeature("bra", 4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("features2.addFeature(\"bra\", 4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testMultFeatureVectorOverlappingFeatures_transitions0_actions4(final FeatureList it, final FeatureList features2) {
    try {
      
      it.mult(features2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("mult(features2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testMultFeatureVectorOverlappingFeatures_transitions0_effects0_state(final FeatureList it, final FeatureList features2) {
    _test__testMultFeatureVectorOverlappingFeatures_transitions0_effects0_state_objectTests0_test(featureList, features2);
    
  }
  
  private void _test__testMultFeatureVectorOverlappingFeatures_transitions0_effects0_state_objectTests0_test(final FeatureList it, final FeatureList features2) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("flink", "god", "bra");
    boolean _equals = this.operator_equals(_featureNames, _newArrayList);
    assertTrue("featureNames == newArrayList(\"flink\", \"god\", \"bra\") failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"god\", 2.0) ,features2.addFeature(\"bra\", 4.0) ,mult(features2)", _equals);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(0.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(6.0));
      Pair<String, Double> _mappedTo_2 = Pair.<String, Double>of("bra", Double.valueOf(0.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1, _mappedTo_2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 0.0, \"god\" -> 6.0, \"bra\" -> 0.0) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0) ,features2.addFeature(\"god\", 2.0) ,features2.addFeature(\"bra\", 4.0) ,mult(features2): " + error.getMessage());
    }
    
  }
  
  private void _test__testToFeatureList_transitions0_source_state(final FeatureList it) {
    _test__testToFeatureList_transitions0_source_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testToFeatureList_transitions0_source_state_objectTests0_test(final FeatureList it) {
    
    FeatureList _featureList = it.toFeatureList();
    Collection<String> _featureNames = _featureList.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("toFeatureList.featureNames.size == 0 failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0)", 0, _size);
    try {
      
      FeatureList _featureList_1 = it.toFeatureList();
      this.testFeatures(_featureList_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(toFeatureList) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testToFeatureList_transitions0_actions0(final FeatureList it) {
    try {
      
      it.addFeature("flink", 2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"flink\", 2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testToFeatureList_transitions0_actions1(final FeatureList it) {
    try {
      
      it.addFeature("god", 3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addFeature(\"god\", 3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testToFeatureList_transitions0_effects0_state(final FeatureList it) {
    _test__testToFeatureList_transitions0_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testToFeatureList_transitions0_effects0_state_objectTests0_test(final FeatureList it) {
    
    FeatureList _featureList = it.toFeatureList();
    Collection<String> _featureNames = _featureList.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("toFeatureList.featureNames.size == 2 failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0)", 2, _size);
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(3.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0, \"god\" -> 3.0) failed after addFeature(\"flink\", 2.0) ,addFeature(\"god\", 3.0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__testToFeatureList_transitions1_actions0(final FeatureList it) {
    try {
      
      FeatureList _featureList = it.toFeatureList();
      _featureList.addFeature("flott", (-3.0));
      } catch (junit.framework.AssertionFailedError error) {
      fail("toFeatureList.addFeature(\"flott\", -3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testToFeatureList_transitions1_effects0_state(final FeatureList it) {
    _test__testToFeatureList_transitions1_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testToFeatureList_transitions1_effects0_state_objectTests0_test(final FeatureList it) {
    
    Collection<String> _featureNames = it.getFeatureNames();
    int _size = _featureNames.size();
    assertEquals("featureNames.size == 2 failed after toFeatureList.addFeature(\"flott\", -3.0)", 2, _size);
    
  }
  
  private void _transition_exprAction__testToFeatureList_transitions2_actions0(final FeatureList it) {
    try {
      
      FeatureList _featureList = it.toFeatureList();
      _featureList.setFeatureValue("flink", (-5.0));
      } catch (junit.framework.AssertionFailedError error) {
      fail("toFeatureList.setFeatureValue(\"flink\", -5.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__testToFeatureList_transitions2_effects0_state(final FeatureList it) {
    _test__testToFeatureList_transitions2_effects0_state_objectTests0_test(featureList);
    
  }
  
  private void _test__testToFeatureList_transitions2_effects0_state_objectTests0_test(final FeatureList it) {
    try {
      
      Pair<String, Double> _mappedTo = Pair.<String, Double>of("flink", Double.valueOf(2.0));
      Pair<String, Double> _mappedTo_1 = Pair.<String, Double>of("god", Double.valueOf(3.0));
      this.testFeatures(it, _mappedTo, _mappedTo_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testFeatures(\"flink\" -> 2.0, \"god\" -> 3.0) failed after toFeatureList.setFeatureValue(\"flink\", -5.0): " + error.getMessage());
    }
    
  }
}
