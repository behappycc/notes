package GradingSystem;

import static org.junit.Assert.*;

import org.junit.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(value = Parameterized.class)
public class TestBonusStudentWithParam {

	
	@Parameterized.Parameters
	public static Collection<Object[]> getParameters(){
		return Arrays.asList(
				new Object[][]{
						{"hubert","r03943087",95,90,90,90,90,90,5},
						{"hubert","r03943087",85,80,80,80,80,80,5},
						{"hubert","r03943087",75,70,70,70,70,70,5}	
				});
	}
	

	private double expected;
	private String string1;
	private String string2;
	private double para1;
	private double para2;
	private double para3;
	private double para4;
	private double para5;
	private double para6;
		
	public TestBonusStudentWithParam(String string1, String string2, double expected, double para1, double para2, double para3, double para4, double para5, double para6){
		this.expected = expected;
		this.string1 = string1;
		this.string2 = string2;
		this.para1 = para1;
		this.para2 = para2;
		this.para3 = para3;
		this.para4 = para4;
		this.para5 = para5;
		this.para6 = para6;
	}
		
	
	@Test
	public void test() {
		BonusStudent bonusstudent = new BonusStudent("hubert","r03943087",para1,para2,para3,para4,para5,para6);
		double result = bonusstudent.Average();
		assertEquals(expected, result, 0.01);
	}

}
