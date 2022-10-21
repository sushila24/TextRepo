package testNg;

import org.testng.annotations.Test;

public class Example6 {
@Test
public void testCase8()
{ displayDetails();
	System.out.println("I am tc8 from Ex6");
}
@Test
public void testCase9()
{
	System.out.println("tc9 from Ex6");
}
public void displayDetails()
{
	System.out.println("Display method");
}
}
