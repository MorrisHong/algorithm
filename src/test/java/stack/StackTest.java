package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */
class StackTest {

    @Test
    void test() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.getSize());

        Integer pop = stack.pop();
        assertEquals(2, pop);
        assertEquals(1, stack.getSize());
    }

}