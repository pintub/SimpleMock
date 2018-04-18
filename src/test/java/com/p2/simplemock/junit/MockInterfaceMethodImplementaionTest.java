package com.p2.simplemock.junit;

import com.p2.simplemock.exception.SimpleMockException;
import com.p2.simplemock.mock.SimpleMock;
import com.p2.simplemock.testedclasses.ISquareNumber;
import com.p2.simplemock.testedclasses.SquareNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class MockInterfaceMethodImplementaionTest {

    @Test
    public void mockSquareOfNumberByInjectingParameterAndReturns1(){
        ISquareNumber squareNumber = new SquareNumber();
        Map<String, Object> methodMockResultMap = new HashMap();
        methodMockResultMap.put("getSquare", 1);

        ISquareNumber mockSquareNumber = (ISquareNumber) SimpleMock.mock(squareNumber, methodMockResultMap);
        Assert.assertEquals(1, mockSquareNumber.getSquare(5));
    }

    @Test(expected = SimpleMockException.class)
    public void mockSquareOfNumberByInvalidMehodNameReturnsNull(){
        ISquareNumber squareNumber = new SquareNumber();
        Map<String, Object> methodMockResultMap = new HashMap();
        methodMockResultMap.put("getSquare1", 1);

        ISquareNumber mockSquareNumber = (ISquareNumber) SimpleMock.mock(squareNumber, methodMockResultMap);
        Assert.assertNull(mockSquareNumber.getSquare(5));
    }
}
