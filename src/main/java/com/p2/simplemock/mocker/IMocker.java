package com.p2.simplemock.mocker;

import java.util.Map;

/**
 * Created by I335831 on 4/18/2018.
 */
public interface IMocker {

    Object mock(Class<?> klass, Map<String, Object> methodMockResultMap) throws Exception;
}
