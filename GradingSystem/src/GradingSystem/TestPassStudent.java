package GradingSystem;

import static org.junit.Assert.*;

import org.junit.*;


public class TestPassStudent {
	private BonusStudent b1;
	private BonusStudent b2;
	private GeneralStudent g1;
	private GeneralStudent g2;
	private GeneralStudent g3;
	
	@Before
	public void Setup(){
		b1 = new BonusStudent("hubert1","r03943087",90,90,90,90,90,5);
		b2 = new BonusStudent("hubert2","b0985122",80,80,80,80,80,4);
		g1 = new GeneralStudent("hubert3","b0985123",70,70,70,70,70);
		g2 = new GeneralStudent("hubert4","b0985124",50,50,50,50,50);
		g3 = new GeneralStudent("hubert5","b0985125",30,30,30,30,30);		
	}

	@Test
	public void test(){
		Analysis analysis = new Analysis(b1.Average(), b2.Average(), g1.Average(), g2.Average(), g3.Average());
		int result = analysis.statisticsPasses();		
		assertEquals(3, result);

	}
	
	@After
	public void setDown(){
		b1 = null;
		b2 = null;
		g1 = null;
		g2 = null;
		g3 = null;
	}
}
