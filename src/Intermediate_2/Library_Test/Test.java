package Intermediate_2.Library_Test;


import Intermediate_2.Library.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by dmclark on 25/07/17.
 */
public class Test {

    Library_I l;

    @Before
    public void setUp() throws Exception {
        l = new Library();

    }

    @After
    public void end() {
        l = null;
    }

    @org.junit.Test
    public void test_1() {
        assertTrue(l.add_Books("bobs", "String1"));
        assertTrue(l.add_Books("bob", "String1"));
        assertTrue(l.add_Books("bo", "String1"));
        assertTrue(l.add_Books("b", "123456789"));
        assertTrue(l.add_Books("~", "String1"));
        assertTrue(l.add_Books("b~", "String1"));
        assertTrue(l.add_Books("bo~", "String1"));

        assertTrue(l.add_Maps("Mbobs", "String1"));
        assertTrue(l.add_Maps("Mbob", "String1"));
        assertTrue(l.add_Maps("Mbo", "String1"));

        assertTrue(l.add_Newspapers("Mbobs2", "String1"));
        assertTrue(l.add_Newspapers("Mbob2", "String1"));
        assertTrue(l.add_Newspapers("Mbo2", "String1"));
    }

    @org.junit.Test
    public void test_2() {
        assertTrue(l.add_Books("bobs", "String1"));
        assertTrue(l.add_Books("bob", "String1"));
        assertTrue(l.add_Newspapers("Mbobs2", "String1"));
        assertTrue(l.add_Newspapers("Mbob2", "String1"));
        assertTrue(l.add_Maps("Mbob", "String1"));
        assertTrue(l.add_Maps("Mbo", "String1"));
        int temp = l.get_ID("bob");
        assertTrue(l.Update_Books("bob", "qwertyu", "test_2"));
        assertEquals(temp, l.get_ID("qwertyu"));


    }

    @org.junit.Test
    public void test_3() {
        assertTrue(l.add_Books("bobs", "String1"));
        assertTrue(l.add_Books("bob", "String1"));
        assertTrue(l.add_Newspapers("Mbobs2", "String1"));
        assertTrue(l.add_Newspapers("Mbob2", "String1"));
        assertTrue(l.add_Maps("Mbob", "String1"));
        assertTrue(l.add_Maps("Mbo", "String1"));
        assertTrue(l.Register_person("q"));
        assertTrue(l.Register_person("qw"));
        assertTrue(l.Register_person("qe"));
        assertTrue(l.Register_person("qr"));

        assertTrue(l.Check_out_item(l.get_ID("Mbobs2"), "qw"));
        assertTrue(l.Check_out_item(l.get_ID("Mbob"), "qe"));
        assertTrue(l.Check_out_item(l.get_ID("bob"), "q"));


        assertTrue(l.all_Item_toString_2().contains("bob"));
        assertTrue(l.all_Item_toString_2().contains("Mbob"));
        assertTrue(l.all_Item_toString_2().contains("Mbobs2"));

        assertFalse(l.all_Item_toString_2().contains("Mbob2"));

        assertTrue(l.Check_in_item(l.get_ID("Mbobs2")));

        assertFalse(l.all_Item_toString_2().contains("Mbobs2"));
        l.to_File();
    }

    @org.junit.Test
    public void test_4() {
        l.from_File();
        System.out.println(l);
        assertFalse(l.all_Item_toString_2().contains("Mbobs2"));
        assertTrue(l.all_Item_toString_2().contains("bob"));


    }


}
