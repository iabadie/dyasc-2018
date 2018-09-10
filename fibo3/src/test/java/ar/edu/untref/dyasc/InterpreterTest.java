package ar.edu.untref.dyasc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class InterpreterTest {

    @Test
    void testInterpreterWithCorrectOptions() {
        String[] options = { "-o=hi" };
        Interpreter interpreter = new Interpreter(options);
        assertFalse(interpreter.hasOptionError());
    }

    @Test
    void testInterpreterWithIncorrectOptions() {
        String[] options = { "-1=is" };
        Interpreter interpreter = new Interpreter(options);
        assertTrue(interpreter.hasOptionError());
    }

    @Test
    void testInterpreterValuesHD() {
        String[] options = { "-o=hd" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("h", values.get("orientation"));
        assertEquals("d", values.get("direction"));
    }

    @Test
    void testInterpreterValuesHI() {
        String[] options = { "-o=hi" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("h", values.get("orientation"));
        assertEquals("i", values.get("direction"));
    }

    @Test
    void testInterpreterValuesVD() {
        String[] options = { "-o=vd" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("v", values.get("orientation"));
        assertEquals("d", values.get("direction"));
    }

    @Test
    void testInterpreterValuesVI() {
        String[] options = { "-o=vi" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("v", values.get("orientation"));
        assertEquals("i", values.get("direction"));
    }

    @Test
    void testInterpreterValuesModeL() {
        String[] options = { "-m=l" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("l", values.get("mode"));
    }

    @Test
    void testInterpreterValuesModeS() {
        String[] options = { "-m=s" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("s", values.get("mode"));
    }

    @Test
    void testInterpreterValuesNumber() {
        String[] options = { "5" };
        Interpreter interpreter = new Interpreter(options);
        HashMap<String,String> values = interpreter.getValuesMap(); 
        assertEquals("5", values.get("number"));
    }

}
