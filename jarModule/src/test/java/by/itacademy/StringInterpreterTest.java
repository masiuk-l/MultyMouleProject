package by.itacademy;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringInterpreterTest extends TestCase {
    @Test
    public void testInterpret() throws Exception {
        Assert.assertEquals("Telephone number", StringInterpreter.interpret("2345678"));
        Assert.assertEquals("email", StringInterpreter.interpret("asdf@bb.io"));
        Assert.assertEquals("Surname", StringInterpreter.interpret("Adfgthjuk"));
        Assert.assertEquals("Unknown data", StringInterpreter.interpret("zdsdhjhggh"));
    }


}