import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack = new Stack();

    @Test
    public void pushStack() {
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void popStack() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void getSize() {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void throwUnderflowException() {
        assertThrows(Stack.UnderflowException.class,
                () -> stack.pop());
    }

    @Test
    public void pushXAfterPopX() {
        stack.push(10);
        assertEquals(10, stack.pop());
    }

    @Test
    public void pushXAndYAfterPopYAndX() {
        stack.push(10);
        stack.push(30);
        assertEquals(30, stack.pop());
        assertEquals(10, stack.pop());
    }
}
