package com.p2.simplemock.simplejunit;

import com.p2.simplemock.mock.SimpleMock;
import com.p2.simplemock.testedclasses.SquareNumberv2;
import com.p2.simpletest.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class MockInterfaceMethodImplementaionTest {

    @Test
    public void mockSquareOfNumberByInjectingConstructorAndReturns1(){
        SquareNumberv2 squareNumberv2 = new SquareNumberv2();
        Map<String, Object> methodMockResultMap = new HashMap();
        methodMockResultMap.put("getSquare", 1);

        SquareNumberv2 mockSquareNumber = (SquareNumberv2) SimpleMock.mock(squareNumberv2, methodMockResultMap);
        Assert.assertEquals(1, mockSquareNumber.getSquare());
    }

    @Test
    public void mockSquareOfNumberByInjectingConstructorAndReturns2(){
        SquareNumberv2 squareNumberv2 = new SquareNumberv2();
        Map<String, Object> methodMockResultMap = new HashMap();
        methodMockResultMap.put("getSquare", 2);

        SquareNumberv2 mockSquareNumber = (SquareNumberv2) SimpleMock.mock(squareNumberv2, methodMockResultMap);
        Assert.assertEquals(1, mockSquareNumber.getSquare());
    }
}
