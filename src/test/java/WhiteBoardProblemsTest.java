import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WhiteBoardProblemsTest {

    @Test
    public void getIndexOfValueTest(){
        WhiteBoardProblems whiteBoardProblems = new WhiteBoardProblems();
        int[] enteredArray = new int[]{7,3,1,10,12};
        int expected = 2;

        //When
        int actual = whiteBoardProblems.getIndexOfValue(enteredArray, 1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSmallestToLargestTest(){
        //Given
        WhiteBoardProblems wBP = new WhiteBoardProblems();
        int[] enteredArray = new int[]{7,3,1,10,12};
        int[] expected = new int[]{1,3,7,10,12};

        //When
        int[] actual = wBP.getSmallestToLargest(enteredArray);

        //Then
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}