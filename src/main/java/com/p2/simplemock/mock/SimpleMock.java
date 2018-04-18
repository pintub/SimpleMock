package com.p2.simplemock.mock;

import com.p2.simplemock.bean.ClassType;
import com.p2.simplemock.exception.SimpleMockException;
import com.p2.simplemock.mocker.KlassObjectFactory;
import com.p2.simplemock.mocker.IMocker;
import com.p2.simplemock.mocker.MockerFactory;

import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class SimpleMock {

    public static Object mock(Object realObject, Map<String, Object> methodMockResultMap){

        Object mockObject = null;

                ClassType klassType = getClassType(realObject);
        IMocker mocker = MockerFactory.createMock(klassType);
        Class klass = KlassObjectFactory.classObject(klassType, realObject);

        try {
            mockObject = mocker.mock(klass, methodMockResultMap);
        } catch (Exception e) {
            throw new SimpleMockException("TADAAA ....SimpleMock Mocking failed");
        }
        return mockObject;
    }

    private static ClassType getClassType(Object realObject) {
        return realObject.getClass().getInterfaces().length > 0 ? ClassType.INTERFACE : ClassType.CLASS;
    }
}
