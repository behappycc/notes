package GradingSystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestBonusStudentAverage.class, TestBonusStudentWithParam.class,
		TestFailureStudent.class, TestGeneralStudentAverage.class,
		TestGeneralStudentWithParam.class, TestPassStudent.class })
public class AllTests {

}
