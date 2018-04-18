package com.p2.simplemock.testedclasses;

/**
 * Created by I335831 on 4/18/2018.
 */
public class SquareNumber implements ISquareNumber{

    @Override
    public int getSquare(int number){
        return number * number;
    }
}
