package com.p2.simplemock.mocker.interfacemock;

import com.p2.simplemock.exception.SimpleMockException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class InterfaceTypeMockInvocationHandler implements InvocationHandler {

    private Map<String, Object> mockMethodResultMap;

    public InterfaceTypeMockInvocationHandler(Map<String, Object> mockMethodResultMap) {
        this.mockMethodResultMap = mockMethodResultMap;
    }

    @Override
    public Object invoke(Object proxyObj, Method method, Object[] objects) throws Throwable {
        if(mockMethodResultMap.get(method.getName()) != null){
            return mockMethodResultMap.get(method.getName());
        } else {
            throw new SimpleMockException("TADA ...Mocked Method name in improper");
        }
    }
}
