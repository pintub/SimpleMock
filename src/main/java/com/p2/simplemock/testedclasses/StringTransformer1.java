package com.p2.simplemock.testedclasses;

/**
 * Created by I335831 on 4/18/2018.
 */
public class StringTransformer1 {

    private final StringTransformer2 transformer2;

    public StringTransformer1(StringTransformer2 transformer2){
        this.transformer2 = transformer2;
    }

    public String getString(String str){
        String str1 = transformer2.getString(str);
        return str1.substring(0, str1.length() - 1);
    }

}
