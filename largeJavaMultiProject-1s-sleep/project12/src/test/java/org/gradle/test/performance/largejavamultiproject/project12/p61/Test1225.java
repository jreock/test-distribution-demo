package org.gradle.test.performance.largejavamultiproject.project12.p61;

import org.gradle.test.performance.largejavamultiproject.project12.p60.Production1216;
import org.gradle.test.performance.largejavamultiproject.project3.p16.Production325;
import org.gradle.test.performance.largejavamultiproject.project7.p36.Production725;
import org.gradle.test.performance.largejavamultiproject.project11.p56.Production1125;
import org.gradle.test.performance.largejavamultiproject.project0.p1.Production25;
import org.gradle.test.performance.largejavamultiproject.project4.p21.Production425;
import org.gradle.test.performance.largejavamultiproject.project8.p41.Production825;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1225 {  
    Production1225 objectUnderTest = new Production1225();     

    @Test
    public void testProperty0() throws Exception {
        Production1216 value = new Production1216();
        objectUnderTest.setProperty0(value);
        assertEquals(value, objectUnderTest.getProperty0());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty1() throws Exception {
        Production1220 value = new Production1220();
        objectUnderTest.setProperty1(value);
        assertEquals(value, objectUnderTest.getProperty1());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty2() throws Exception {
        Production1224 value = new Production1224();
        objectUnderTest.setProperty2(value);
        assertEquals(value, objectUnderTest.getProperty2());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty3() throws Exception {
        Production325 value = new Production325();
        objectUnderTest.setProperty3(value);
        assertEquals(value, objectUnderTest.getProperty3());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty4() throws Exception {
        Production725 value = new Production725();
        objectUnderTest.setProperty4(value);
        assertEquals(value, objectUnderTest.getProperty4());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty5() throws Exception {
        Production1125 value = new Production1125();
        objectUnderTest.setProperty5(value);
        assertEquals(value, objectUnderTest.getProperty5());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty6() throws Exception {
        Production25 value = new Production25();
        objectUnderTest.setProperty6(value);
        assertEquals(value, objectUnderTest.getProperty6());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty7() throws Exception {
        Production425 value = new Production425();
        objectUnderTest.setProperty7(value);
        assertEquals(value, objectUnderTest.getProperty7());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty8() throws Exception {
        Production825 value = new Production825();
        objectUnderTest.setProperty8(value);
        assertEquals(value, objectUnderTest.getProperty8());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty9() throws Exception {
        String value = "value";
        objectUnderTest.setProperty9(value);
        assertEquals(value, objectUnderTest.getProperty9());
        TimeUnit.SECONDS.sleep(1);
    }

}