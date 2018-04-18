package com.p2.simplemock.mocker.classmock;

import com.p2.simplemock.mocker.IMocker;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public class ClassTypeMocker implements IMocker {
    @Override
    public Object mock(Class<?> klass, Map<String, Object> methodMockResultMap)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ProxyFactory proxyFactory = getProxyFactory(klass);
        MethodHandler handler = new ClassTypeMockInvocationHandler(methodMockResultMap);

        Object mockObj = proxyFactory.create(new Class<?>[0], new Object[0], handler);

        return mockObj;
    }

    private ProxyFactory getProxyFactory(Class<?> klass) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(klass);

        return proxyFactory;
    }
}
