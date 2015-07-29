package GradingSystem;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.Test;

@RunWith(value = Parameterized.class)
public class TestGeneralStudentWithParam {
	
	@Parameterized.Parameters
	public static Collection<Object[]> getParameters(){
		return Arrays.asList(
				new Object[][]{
						{"hubert","r03943087",90,90,90,90,90,90}, 
						{"hubert","r03943087",80,80,80,80,80,80},
						{"hubert","r03943087",70,70,70,70,70,70}	
				});
	}
	
	private String string1;
	private String string2;
	private double expected;
	private double para1;
	private double para2;
	private double para3;
	private double para4;
	private double para5;
		
	public TestGeneralStudentWithParam(String string1, String string2, double expected, double para1, double para2, double para3, double para4, double para5){
		this.string1 = string1;
		this.string2 = string2;
		this.expected = expected;
		this.para1 = para1;
		this.para2 = para2;
		this.para3 = para3;
		this.para4 = para4;
		this.para5 = para5;
	}
		
	
	@Test
	public void test() {
		GeneralStudent generalstudent = new GeneralStudent("hubert","r03943087",para1,para2,para3,para4,para5);
		double result = generalstudent.Average();
		assertEquals(expected, result, 0.01);
	}

}
