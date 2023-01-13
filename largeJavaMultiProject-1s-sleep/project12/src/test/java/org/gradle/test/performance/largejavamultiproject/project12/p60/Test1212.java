package org.gradle.test.performance.largejavamultiproject.project12.p60;

import org.gradle.test.performance.largejavamultiproject.project3.p15.Production312;
import org.gradle.test.performance.largejavamultiproject.project7.p35.Production712;
import org.gradle.test.performance.largejavamultiproject.project11.p55.Production1112;
import org.gradle.test.performance.largejavamultiproject.project0.p0.Production12;
import org.gradle.test.performance.largejavamultiproject.project4.p20.Production412;
import org.gradle.test.performance.largejavamultiproject.project8.p40.Production812;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1212 {  
    Production1212 objectUnderTest = new Production1212();     

    @Test
    public void testProperty0() throws Exception {
        Production1203 value = new Production1203();
        objectUnderTest.setProperty0(value);
        assertEquals(value, objectUnderTest.getProperty0());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty1() throws Exception {
        Production1207 value = new Production1207();
        objectUnderTest.setProperty1(value);
        assertEquals(value, objectUnderTest.getProperty1());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty2() throws Exception {
        Production1211 value = new Production1211();
        objectUnderTest.setProperty2(value);
        assertEquals(value, objectUnderTest.getProperty2());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty3() throws Exception {
        Production312 value = new Production312();
        objectUnderTest.setProperty3(value);
        assertEquals(value, objectUnderTest.getProperty3());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty4() throws Exception {
        Production712 value = new Production712();
        objectUnderTest.setProperty4(value);
        assertEquals(value, objectUnderTest.getProperty4());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty5() throws Exception {
        Production1112 value = new Production1112();
        objectUnderTest.setProperty5(value);
        assertEquals(value, objectUnderTest.getProperty5());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty6() throws Exception {
        Production12 value = new Production12();
        objectUnderTest.setProperty6(value);
        assertEquals(value, objectUnderTest.getProperty6());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty7() throws Exception {
        Production412 value = new Production412();
        objectUnderTest.setProperty7(value);
        assertEquals(value, objectUnderTest.getProperty7());
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void testProperty8() throws Exception {
        Production812 value = new Production812();
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