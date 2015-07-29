package GradingSystem;

import static org.junit.Assert.*;
import org.junit.*;


public class TestBonusStudentAverage {
	private BonusStudent bonusstudent;

	@Before
	public void Setup(){
		bonusstudent = new BonusStudent("jack","r03943089",90,90,90,90,90,5);
	}
	@Test
	public void test() {
		double result = bonusstudent.Average();
		assertEquals(95, result, 0.01);		
	}
	
	@After
	public void setDown(){
		bonusstudent = null;
	}
}
