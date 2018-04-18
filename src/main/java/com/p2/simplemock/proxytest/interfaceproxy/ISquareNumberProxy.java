package com.p2.simplemock.proxytest.interfaceproxy;

import com.p2.simplemock.mock.SimpleMock;
import com.p2.simplemock.testedclasses.ISquareNumber;
import com.p2.simplemock.testedclasses.SquareNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class ISquareNumberProxy {

    public static void main(String args[]) {

        ISquareNumber squareNumber = new SquareNumber();

        Map<String, Object> methodNameMockResultMap = new HashMap<>();
        methodNameMockResultMap.put("getSquare", 5);

        //Object mockObj = InterfaceTypeMocker.mock(ISquareNumber.class, methodNameMockResultMap);
        Object mockObj = SimpleMock.mock(squareNumber, methodNameMockResultMap);

        System.out.println(((ISquareNumber)mockObj).getSquare(5));
    }
}
