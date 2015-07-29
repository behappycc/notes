package GradingSystem;

public class BonusStudent extends Student{
	private double score;
	private double bonus;
	
	public BonusStudent(){
		setName("");
		setNumber("");
		setHW1(0);
		setHW2(0);
		setHW3(0);
		setTermProject(0);
		setFinalExam(0);
		setBonus(0);
	}
	
	public BonusStudent(String n1, String n2, double h1, double h2, double h3, double t, double f, double b){
		setName(n1);
		setNumber(n2);
		setHW1(h1);
		setHW2(h2);
		setHW3(h3);
		setTermProject(t);
		setFinalExam(f);
		setBonus(b);
	}

	public void setBonus(double b){
		if(b>5){
			System.out.println(" 學生: " + getName() + " 學號: " + getNumber() + " Bonus <= 5 ");
		     System.exit(-1);
		}
		else
			bonus = b;
	}
	
	public double getBonus(){
		return bonus;
	}
	
	public double getScore(){
		return score;
	}

	
	public String toString() {
		return " 學生: " + getName() + " 學號: " + getNumber() + " 學期成績: " + Average(); 		
	  }
	
	public double Average(){
		score = (getHW1() + getHW2() + getHW3() + getTermProject() + getFinalExam())/5 + bonus;
		return score;
	}
	
	
}
