package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testLowerTape1() {
        int[] a = {3, 1, 2, 4, 3};
        int result = solution.solution(a);
        assertTrue(1 == result);
    }

    @Test
    void testLowerTape2() {
        int[] a = {3, 1};
        int result = solution.solution(a);
        assertTrue(2 == result);
    }

    @Test
    void testLowerTape3() {
        int[] a = {-5, 1, 7, 4};
        int result = solution.solution(a);
        assertTrue(1 == result);
    }

}