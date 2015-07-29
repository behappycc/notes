package GradingSystem;

public abstract class Student implements StudentBehavior{
	  private String name;
	  private String number;
	  private double hw1, hw2, hw3;
	  private double termproject;
	  private double finalexam;

	  public Student() {
		  setName("");
	  }

	  public Student(String n) {
		  setName(n);
	  }
	  
	  public void setName(String n) {
		  name = n;
	  }

	  public String getName() {
		  return name;
	  }
	  
	  public void setNumber(String n){
		  number = n;
	  }
	  
	  public String getNumber(){
		  return number;
	  }
	  
	  public void setHW1(double n){
		if(n<=100)  
			hw1 = n;
		else
		  	System.out.println("error!");
	  }
	  
	  public double getHW1(){
		  return hw1;
	  }
	  
	  public void setHW2(double n){
		  if(n<=100)  
				hw2 = n;
			else
			  	System.out.println("erro!");
	  }
	  
	  public double getHW2(){
		  return hw2;
	  }
	  
	  public void setHW3(double n){
		  if(n<=100)  
				hw3 = n;
			else
			  	System.out.println("error!");
	  }
	  
	  public double getHW3(){
		  return hw3;
	  }
	  
	  public void setTermProject(double n){
		  if(n<=100)  
				termproject = n;
			else
			  	System.out.println("error!");
	  }
	  
	  public double getTermProject(){
		  return termproject;
	  }

	  public void setFinalExam(double n){
		  if(n<=100)  
				finalexam = n;
			else
			  	System.out.println("error!");
	  }
	  
	  double getFinalExam(){
		  return finalexam;
	  }
	  
	  public void displaymessage(){
		  System.out.println(" Welcome software testing grading system!! ");
	  }	 
	   
}
