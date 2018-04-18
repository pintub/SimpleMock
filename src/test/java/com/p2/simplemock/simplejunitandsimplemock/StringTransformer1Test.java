package com.p2.simplemock.simplejunitandsimplemock;

import com.p2.simplemock.mock.SimpleMock;
import com.p2.simplemock.testedclasses.StringTransformer1;
import com.p2.simplemock.testedclasses.StringTransformer2;
import com.p2.simpletest.Test;
import com.p2.simpletest.assertion.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class StringTransformer1Test {

    @Test
    public void stringTransformer1TestStringByMockingANdRetunsPint(){


        Map<String, Object> methodMockResultMap = new HashMap<>();
        methodMockResultMap.put("getString", "Pintu");

        StringTransformer2 realStringTransformer2 = new StringTransformer2();
        StringTransformer2 mockStringTransformer2 =
                (StringTransformer2)SimpleMock.mock(realStringTransformer2, methodMockResultMap);

        StringTransformer1 stringTransformer1 = new StringTransformer1(mockStringTransformer2);

        Assert.assertEquals("Pint", stringTransformer1.getString("TADAAAA"));

    }
}
