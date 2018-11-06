package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class TestBote {
    @Test
    public void crearUnBote() {
        Bote bote = new Bote();
        Assert.assertNotNull(bote);;
    }
    
}
