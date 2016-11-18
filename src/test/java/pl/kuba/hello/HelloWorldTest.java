package pl.kuba.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jbentyn on 2016-11-17.
 */
public class HelloWorldTest {

    @Test
    public void add() throws Exception {
        HelloWorld hello = new HelloWorld();
        assertEquals("2+2",4,hello.add(2,2) );
    }

}