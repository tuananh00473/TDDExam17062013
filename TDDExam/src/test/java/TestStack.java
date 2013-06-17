import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/17/13
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {

    protected MyStack myStack = new MyStack();

    @Test
    public void testEmptyStack(){
        assertTrue(myStack.isEmpty());
        assertEquals(0, myStack.getSize());
    }

    @Test
    public void testPushElement(){
        assertTrue(myStack.isEmpty());
        myStack.push("abc");
        assertEquals(1, myStack.getSize());
    }

    @Test
    public void testPushOneElenmentOther(){
        int oldSize = 5;
        for(int i=0; i<5; i++){
            myStack.push("" + i);
        }
        assertEquals(5, myStack.getSize());
        myStack.push("6");
        assertEquals(oldSize + 1, myStack.getSize());
    }

    @Test
    public void testShouldReturnNullWithEmptyStack(){
        assertEquals(null, myStack.top());
    }

    @Test
    public void testShouldReturnElementJustPush(){
        String element = "element";
        myStack.push(element);
        assertFalse(myStack.isEmpty());
        assertEquals(element, myStack.top());
    }

    @Test
    public void testShouldReturnMessageWithPopEmptyStack(){
        assertTrue(myStack.isEmpty());
        assertEquals(0, myStack.getSize());
        try{
            myStack.pop();
            assertEquals(-1, myStack.getSize());
            fail("RuntimeException");
        }catch (RuntimeException re){
            assertEquals("Can't pop empty Stack.", re.getMessage());
        }
    }

    @Test
    public void testShouldDecrementSize(){
        int oldSize = 5;
        for(int i=0; i<5; i++){
            myStack.push("" + i);
        }
        assertEquals(5, myStack.getSize());
        myStack.pop();
        assertEquals(oldSize - 1, myStack.getSize());
    }

    @Test
    public void testShouldReturnEmptyWhenPopStackHasSizeEqual1(){
        myStack.push("size tack = 1");
        assertFalse(myStack.isEmpty());
        assertEquals(1, myStack.getSize());
        myStack.pop();
        assertEquals(0, myStack.getSize());
    }

    @Test
    public void testTopTheElementP(){
        int oldSize = 5;
        for(int i=0; i<5; i++){
            myStack.push("" + i);
        }
        assertEquals(5, myStack.getSize());
        myStack.pop();
        assertEquals(oldSize - 1, myStack.getSize());
    }

    @Test
    public void testPushThenPop(){
        int size = 5;
        for(int i=0; i<size; i++){
            myStack.push("" + i);
        }
        assertEquals(size, myStack.getSize());
        for(int i=0; i<size; i++){
            myStack.pop();
        }
    }
}
