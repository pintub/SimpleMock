package com.p2.simplemock.mocker;

import com.p2.simplemock.bean.ClassType;

/**
 * Created by I335831 on 4/18/2018.
 */
public class KlassObjectFactory {

    public static Class classObject (ClassType classType, Object realObject){
        Class klass = null;

        switch (classType) {
            case INTERFACE :
                klass = realObject.getClass().getInterfaces()[0];
                break;
            case CLASS:
                klass = realObject.getClass();
                break;
            default:
                break;
        }

        return klass;
    }
}
