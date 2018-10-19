package deqo.lfre.mysimplestack;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class ItemTest {

    public void testCreateEmptyStack() { // Test case
// Code under test
        SimpleStack stack = new SimpleStack();
// Assertions ( oracle )
        assertTrue("A new stack should be empty ", stack.isEmpty());
        assertEquals("A new stack has no element ", 0, stack.getSize());


    }

    @Test
    public void testPush () throws EmptyStackException {
// Setup the " state of the world "
        SimpleStack stack = new SimpleStack ();
        Item item = new SimpleItem ();
// Code under test
        stack . push ( item );
// assertions ( oracle )
        assertFalse ("The stack must be not empty" , stack . isEmpty ());
        assertEquals ("The stack shoult contain 1 item",
                1, stack . getSize ());
        assertSame ("Pushed itm should be on top of stack" ,
                item , stack . peek ());
    }


    @Test ( expected = EmptyStackException . class )
    public void testPopOnEmptyStack () throws EmptyStackException {
// Setup the " state of the world "
        SimpleStack stack = new SimpleStack ();
// Code under test
        stack.pop (); // should throws an EmptyStackException .
    }

}

