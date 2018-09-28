package ar.edu.untref.dyasc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProgramTest {

    @Test
    public void testIntegratioOneHorizontalElement() {
        String[] options = { "-o=hd", "1" };
        String result = Program.main(options);
        assertEquals("fibo<1>: 0", result);
    }

    @Test
    public void testIntegrationThreeVerticalElements() {
        String[] options = { "-o=vi", "3" };
        String result = Program.main(options);
        assertEquals("fibo<3>:\n1\n1\n0", result);
    }

    @Test
    public void testIntegrationBadOption() {
        String[] options = { "-g=fe", "3" };
        String result = Program.main(options);
        assertEquals("Opciones no válidas.", result);
    }

    @Test
    public void testIntegrationModeList() {
        String[] options = { "-m=l", "3" };
        String result = Program.main(options);
        assertEquals("fibo<3>: 0 1 1", result);
    }

}
