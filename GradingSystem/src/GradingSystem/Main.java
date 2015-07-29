package GradingSystem;

public class Main {
	public static void main(String[] args) {
			
		BonusStudent s1 = new BonusStudent("hubert","r03943087",90,90,90,90,100,5);
		GeneralStudent s2 = new GeneralStudent("kobe","b0985122",60,90,50,80,80);
		GeneralStudent s3 = new GeneralStudent("james","b0985122",50,100,100,20,80);
		GeneralStudent s4 = new GeneralStudent("alice","b0985122",55,33,44,60,80);
		BonusStudent s5 = new BonusStudent("alex","b0985122",66,50,33,20,10,4);
		s1.displaymessage();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		Analysis analysis = new Analysis(s1.getScore(), s2.getScore(), s3.getScore(), s4.getScore(), s5.getScore());
		analysis.MaxScore();
		analysis.MinScore();
		analysis.statisticsPasses();
		analysis.statisticsFailure();
		analysis.displaymessage();		
	}
}
