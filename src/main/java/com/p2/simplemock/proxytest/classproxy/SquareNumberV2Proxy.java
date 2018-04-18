package com.p2.simplemock.proxytest.classproxy;

import com.p2.simplemock.testedclasses.SquareNumberv2;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by I335831 on 4/18/2018.
 */
public class SquareNumberV2Proxy {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ProxyFactory factory = new ProxyFactory();
        factory.setSuperclass(SquareNumberv2.class);

        MethodHandler handler = new MethodHandler() {
            @Override
            public Object invoke(Object proxyObj, Method method, Method proceed, Object[] args) throws Throwable {
                return 6;
            }
        };

        SquareNumberv2 squareNumberv2 = (SquareNumberv2) factory.create(new Class<?>[0], new Object[0], handler);
        System.out.println(squareNumberv2.getSquare());
    }
}
