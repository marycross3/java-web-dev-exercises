package org.launchcode.java.demos.lsn6inheritance.Tests;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
