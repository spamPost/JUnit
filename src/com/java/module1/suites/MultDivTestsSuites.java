package com.java.module1.suites;

import com.java.module1.categories.MultDivTestsCategories;
import com.java.module1.tests.DivTest;
import com.java.module1.tests.MultTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Categories.IncludeCategory(MultDivTestsCategories.class)
@Suite.SuiteClasses({MultTest.class, DivTest.class})
@RunWith(Categories.class)
public class MultDivTestsSuites {}