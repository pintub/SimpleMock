package com.p2.simplemock.mocker;

import com.p2.simplemock.bean.ClassType;
import com.p2.simplemock.mocker.classmock.ClassTypeMocker;
import com.p2.simplemock.mocker.interfacemock.InterfaceTypeMocker;

/**
 * Created by I335831 on 4/18/2018.
 */
public class MockerFactory {

    public static IMocker createMock(ClassType classType){
        IMocker mocker = null;

        switch (classType) {
            case INTERFACE :
                mocker = new InterfaceTypeMocker();
                break;
            case CLASS:
                mocker = new ClassTypeMocker();
                break;
            default:
                break;
        }

        return mocker;
    }
}
