package testNg;

import org.testng.annotations.Test;

public class testcase2 {
@Test
public void tc1()
{
	System.out.println("hi1");
}
@Test
public void tc2()
{
	System.out.println("hi2");
}
@Test
public void tc3()
{
	System.out.println("hi3");
}
@Test
public void tc4()
{
	System.out.println("hi4");
}

}
/**
TestNg class can have multiple @Test ()
in such cases all the methods will executes in alphabetic order of names of methods
*/