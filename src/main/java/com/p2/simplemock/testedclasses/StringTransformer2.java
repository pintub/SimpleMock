package com.p2.simplemock.testedclasses;

/**
 * Created by I335831 on 4/18/2018.
 */
public class StringTransformer2 {

    public String getString(String str){
        return str.substring(0, str.length() - 1);
    }
}
