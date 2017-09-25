package com.java.module1.suites;

import com.java.module1.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({AddTest.class, DivTest.class, MultTest.class, SubTest.class, SqrtTest.class})
@RunWith(Suite.class)
public class AllTestSuites {}