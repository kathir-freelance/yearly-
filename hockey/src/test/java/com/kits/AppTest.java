package com.kits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithTrue1()
    {
	A ob;
	int res=new A().get();
	assertTrue( res==89);
    }
	@Test
    public void shouldAnswerWithTrue2()
    {
	assertTrue(true);
    }
}
