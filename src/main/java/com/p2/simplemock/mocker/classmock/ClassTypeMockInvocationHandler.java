package com.p2.simplemock.mocker.classmock;

import com.p2.simplemock.exception.SimpleMockException;
import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class ClassTypeMockInvocationHandler implements MethodHandler{

    private Map<String, Object> mockMethodResultMap;

    public ClassTypeMockInvocationHandler(Map<String, Object> mockMethodResultMap) {
        this.mockMethodResultMap = mockMethodResultMap;
    }
    @Override
    public Object invoke(Object proxyObj, Method method, Method method1, Object[] objects) throws Throwable {
        if(mockMethodResultMap.get(method.getName()) != null){
            return mockMethodResultMap.get(method.getName());
        } else {
            throw new SimpleMockException("TADA ...Mocked Method name in improper");
        }
    }
}
