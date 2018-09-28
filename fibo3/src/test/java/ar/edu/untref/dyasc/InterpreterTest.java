package ar.edu.untref.dyasc;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class InterpreterTest {

    @Test
    public void testInterpreterWithCorrectOptions() {
        String[] options = { "-o=hi" };
        Interpreter interpreter = new Interpreter(options);
        assertFalse(interpreter.hasOptionError());
    }

    @Test
    public void testInterpreterWithIncorrectOptions() {
        String[] options = { "-1=is" };
        Interpreter interpreter = new Interpreter(options);
        assertTrue(interpreter.hasOptionError());
    }

    @Test
    public void testInterpreterValuesHD() {
        String[] options = { "-o=hd" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("h", values.get("orientation"));
        assertEquals("d", values.get("direction"));
    }

    @Test
    public void testInterpreterValuesHI() {
        String[] options = { "-o=hi" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("h", values.get("orientation"));
        assertEquals("i", values.get("direction"));
    }

    @Test
    public void testInterpreterValuesVD() {
        String[] options = { "-o=vd" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("v", values.get("orientation"));
        assertEquals("d", values.get("direction"));
    }

    @Test
    public void testInterpreterValuesVI() {
        String[] options = { "-o=vi" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("v", values.get("orientation"));
        assertEquals("i", values.get("direction"));
    }

    @Test
    public void testInterpreterValuesModeL() {
        String[] options = { "-m=l" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("l", values.get("mode"));
    }

    @Test
    public void testInterpreterValuesModeS() {
        String[] options = { "-m=s" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("s", values.get("mode"));
    }

    @Test
    public void testInterpreterValuesNumber() {
        String[] options = { "5" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("5", values.get("number"));
    }

}
