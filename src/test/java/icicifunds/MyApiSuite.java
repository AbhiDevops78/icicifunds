package icicifunds;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import icicifunds.tests.MyGetApiTest;
import icicifunds.tests.MyPutApiTest;
import icicifunds.tests.MyPostApiTest;

@RunWith(Suite.class)
@SuiteClasses({MyGetApiTest.class, MyPostApiTest.class, MyPutApiTest.class})
public class MyApiSuite {

}
