package com.p2.simplemock.simplejunit;

import com.p2.simpletest.runner.SimpleTestRunner;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by I335831 on 4/18/2018.
 */
public class SimpleJUnitRunner {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        SimpleTestRunner testRunner = new SimpleTestRunner();
        testRunner.setPackageToBeScanned("com.p2.simplemock.simplejunit");

        testRunner.runTest();

        System.out.println(testRunner.getTestRunnerReport());
    }
}
