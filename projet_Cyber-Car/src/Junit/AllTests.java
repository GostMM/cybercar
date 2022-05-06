package Junit;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteDisplayName("test des données sql")
@SuiteClasses({ConnectTest.class,dataFinanceTest.class})
@SelectPackages("Junit")
public class AllTests {

}
