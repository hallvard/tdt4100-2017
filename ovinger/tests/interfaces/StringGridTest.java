package interfaces;

import interfaces.StringGrid;
import interfaces.StringGridImpl;
import interfaces.StringGridIterator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.StringGrid")
@SuppressWarnings("all")
public class StringGridTest extends TestCase {
  private StringGrid grid;
  
  private StringGrid _init_grid() {
    StringGridImpl _stringGridImpl = new StringGridImpl(2, 3);
    return _stringGridImpl;
  }
  
  @Override
  protected void setUp() {
    grid = _init_grid();
    
  }
  
  @JExercise(tests = "void setElement(int,int,String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>grid.setElement(0, 0, \"0, 0\"), grid.setElement(0, 1, \"0, 1\"), grid.setElement(0, 2, \"0, 2\"), grid.setElement(1, 0, \"1, 0\"), grid.setElement(1, 1, \"1, 1\"), grid.setElement(1, 2, \"1, 2\")</li>\n\t\t</ul>\n")
  public void testGrid() {
    _transition_exprAction__grid_transitions0_actions0(grid);
    _transition_exprAction__grid_transitions0_actions1(grid);
    _transition_exprAction__grid_transitions0_actions2(grid);
    _transition_exprAction__grid_transitions0_actions3(grid);
    _transition_exprAction__grid_transitions0_actions4(grid);
    _transition_exprAction__grid_transitions0_actions5(grid);
    _test__grid_transitions0_effects0_state(grid);
    
  }
  
  @JExercise(tests = "void setElement(int,int,String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>grid.setElement(0, 0, \"0, 0\"), grid.setElement(0, 1, \"0, 1\"), grid.setElement(0, 2, \"0, 2\"), grid.setElement(1, 0, \"1, 0\"), grid.setElement(1, 1, \"1, 1\"), grid.setElement(1, 2, \"1, 2\")</li>\n\t\t<li>gridIterator.next == \"0, 0\"</li>\n\t\t<li>gridIterator.next == \"0, 1\"</li>\n\t\t<li>gridIterator.next == \"0, 2\"</li>\n\t\t<li>gridIterator.next == \"1, 0\"</li>\n\t\t<li>gridIterator.next == \"1, 1\"</li>\n\t\t<li>gridIterator.next == \"1, 2\"</li>\n\t\t</ul>\n")
  public void testGridIteratorRowMajor() {
    StringGridIterator gridIterator = _init__gridIteratorRowMajor_gridIterator();
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions0(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions1(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions2(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions3(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions4(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions5(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions0_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions1_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions1_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions2_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions2_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions3_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions3_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions4_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions4_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions5_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions5_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions6_actions0(grid, gridIterator);
    _test__gridIteratorRowMajor_transitions6_effects0_state(grid, gridIterator);
    
  }
  
  @JExercise(tests = "void setElement(int,int,String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>grid.setElement(0, 0, \"0, 0\"), grid.setElement(0, 1, \"0, 1\"), grid.setElement(0, 2, \"0, 2\"), grid.setElement(1, 0, \"1, 0\"), grid.setElement(1, 1, \"1, 1\"), grid.setElement(1, 2, \"1, 2\")</li>\n\t\t<li>gridIterator.next == \"0, 0\"</li>\n\t\t<li>gridIterator.next == \"1, 0\"</li>\n\t\t<li>gridIterator.next == \"0, 1\"</li>\n\t\t<li>gridIterator.next == \"1, 1\"</li>\n\t\t<li>gridIterator.next == \"0, 2\"</li>\n\t\t<li>gridIterator.next == \"1, 2\"</li>\n\t\t</ul>\n")
  public void testGridIteratorColumnMajor() {
    StringGridIterator gridIterator = _init__gridIteratorColumnMajor_gridIterator();
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions0(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions1(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions2(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions3(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions4(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions5(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions0_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions1_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions1_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions2_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions2_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions3_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions3_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions4_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions4_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions5_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions5_effects0_state(grid, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions6_actions0(grid, gridIterator);
    _test__gridIteratorColumnMajor_transitions6_effects0_state(grid, gridIterator);
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions0(final StringGrid it) {
    try {
      
      this.grid.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions1(final StringGrid it) {
    try {
      
      this.grid.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions2(final StringGrid it) {
    try {
      
      this.grid.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions3(final StringGrid it) {
    try {
      
      this.grid.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions4(final StringGrid it) {
    try {
      
      this.grid.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions5(final StringGrid it) {
    try {
      
      this.grid.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__grid_transitions0_effects0_state(final StringGrid it) {
    _test__grid_transitions0_effects0_state_objectTests0_test(grid);
    
  }
  
  private void _test__grid_transitions0_effects0_state_objectTests0_test(final StringGrid it) {
    
    String _element = it.getElement(0, 0);
    assertEquals("getElement(0, 0) == \"0, 0\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "0, 0", _element);
    
    String _element_1 = it.getElement(0, 1);
    assertEquals("getElement(0, 1) == \"0, 1\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "0, 1", _element_1);
    
    String _element_2 = it.getElement(0, 2);
    assertEquals("getElement(0, 2) == \"0, 2\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "0, 2", _element_2);
    
    String _element_3 = it.getElement(1, 0);
    assertEquals("getElement(1, 0) == \"1, 0\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "1, 0", _element_3);
    
    String _element_4 = it.getElement(1, 1);
    assertEquals("getElement(1, 1) == \"1, 1\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "1, 1", _element_4);
    
    String _element_5 = it.getElement(1, 2);
    assertEquals("getElement(1, 2) == \"1, 2\" failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", "1, 2", _element_5);
    
  }
  
  private StringGridIterator _init__gridIteratorRowMajor_gridIterator() {
    StringGridIterator _stringGridIterator = new StringGridIterator(this.grid, true);
    return _stringGridIterator;
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions1(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions2(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions3(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions4(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions5(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions1_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions2_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions3_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions4_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions5_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions6_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
  
  private StringGridIterator _init__gridIteratorColumnMajor_gridIterator() {
    StringGridIterator _stringGridIterator = new StringGridIterator(this.grid, false);
    return _stringGridIterator;
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions1(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions2(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions3(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions4(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions5(final StringGrid it, final StringGridIterator gridIterator) {
    try {
      
      this.grid.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("grid.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after grid.setElement(0, 0, \"0, 0\") ,grid.setElement(0, 1, \"0, 1\") ,grid.setElement(0, 2, \"0, 2\") ,grid.setElement(1, 0, \"1, 0\") ,grid.setElement(1, 1, \"1, 1\") ,grid.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions1_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions2_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions3_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions4_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions5_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions6_actions0(final StringGrid it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state(final StringGrid it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
}
