package com.arunscodes.JunitWorkspace;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class TestJunit {
    @Test
    public void testAdd(){
        String str = "Junit is fine.";
        assertEquals("Junit is not fine.",str);
    }
}
