/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

/**
 * Tests for instance methods of Graph.
 * 
 * <p>PS2 instructions: you MUST NOT add constructors, fields, or non-@Test
 * methods to this class, or change the spec of {@link #emptyInstance()}.
 * Your tests MUST only obtain Graph instances by calling emptyInstance().
 * Your tests MUST NOT refer to specific concrete implementations.
 */
public abstract class GraphInstanceTest {
    
    // Testing strategy
    /**
     *  We're testing with the Graph type being String
     *  We will test all the instance methods keeping in mind that
     *  they will be of type String.
     *  And moreover we will be testing for empty graphs only
     */
    
    /**
     * Overridden by implementation-specific test classes.
     * 
     * @return a new empty graph of the particular implementation being tested
     */
    public abstract Graph<String> emptyInstance();
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testInitialVerticesEmpty() {
        assertEquals("expected new graph to have no vertices",
                Collections.emptySet(), emptyInstance().vertices());
    }
    
    @Test
    public void testEmptyVertexAdd() {
    	assertFalse("expected false", emptyInstance().add("A"));
    }
    
    @Test
    public void testEmptyVertexSet() {
    	assertEquals("expected set to return 0 as graph is empty", 0, emptyInstance().set("A", "B", 2));
    }
    
    @Test
    public void testEmptyRemove() {
    	assertFalse("expected false as graph is empty", emptyInstance().remove("A"));
    }
    
    @Test
    public void testEmptySources() {
    	assertEquals("expected new graph to have no sources",
    			Collections.emptyMap(), emptyInstance().sources("A"));
    }
    
    @Test
    public void testEmptyTargets() {
    	assertEquals("expected new graph to have no targets",
    			Collections.emptyMap(), emptyInstance().targets("A"));
    }
    
}
