package mk;


public class Solution {

    public int solution(int[] a) {

        int sumOfAll = 0;
        int minVal = 0;
        int leftVal = 0;
        int rightVal = 0;
        int difference = 0;
        int result = 1001;

        for (int tmp : a) {
            sumOfAll = sumOfAll + tmp;
        }

        if (a.length == 2) {
            difference = a[0] - a[1];
            if (difference < 0) {
                difference = difference * -1;
            }
            result = difference;
        } else {

            for (int i = 0; i < a.length - 1; i++) {
                leftVal = leftVal + a[i];
                rightVal = sumOfAll - leftVal;
                difference = leftVal - rightVal;
                if (difference < 0) {
                    difference = difference * -1;
                }
                if (difference < result) {
                    result = difference;
                }
            }

        }
        return result;
    }

}
