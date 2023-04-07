package exercises.technology.Tests;

import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    private int ram;

    @Test
    public void laptopInheritsCompConstructor(){
        Laptop personal = new Laptop(8, 5,true,3.2);
        personal.increaseRam(8);
        assertEquals(16,personal.getRam(),0.001);
    }


    @Test
    public void smartPhoneInheritsCompConstructor(){
        SmartPhone iphone11 = new SmartPhone(64, 64,false,22);
        iphone11.increaseRam(8);
        assertEquals(72,iphone11.getRam(),.001);
    }


    @Test public void Abstract(){
        SmartPhone iphone12 = new SmartPhone(64,64,false,29);
        //iphone12.get
    }

}
