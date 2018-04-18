package com.p2.simplemock.mocker.interfacemock;

import com.p2.simplemock.mocker.IMocker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class InterfaceTypeMocker implements IMocker {

    @Override
    public Object mock(Class<?> klass, Map<String, Object> methodMockResultMap){

        InvocationHandler handler = new InterfaceTypeMockInvocationHandler(methodMockResultMap);
        Object mockObject = Proxy.newProxyInstance(
                klass.getClassLoader(), new Class[]{klass}, handler);

        return mockObject;
    }


}
