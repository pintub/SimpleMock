package com.p2.simplemock.proxytest.interfaceproxy;

/**
 * Created by I335831 on 4/18/2018.
 */
public interface IRobot {

    String Name();

    String Name(String title);

    void Talk();

    void Talk(String stuff);

    void Talk(int stuff);

    void Talk(String stuff, int more_stuff);

    void Talk(int stuff, int more_stuff);

    void Talk(int stuff, String more_stuff);
}
