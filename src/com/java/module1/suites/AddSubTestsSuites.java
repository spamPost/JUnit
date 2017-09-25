package com.java.module1.suites;

import com.java.module1.categories.AddSubTestsCategories;
import com.java.module1.tests.AddTest;
import com.java.module1.tests.SubTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Categories.IncludeCategory(AddSubTestsCategories.class)
@Suite.SuiteClasses({AddTest.class, SubTest.class})
@RunWith(Categories.class)
public class AddSubTestsSuites {}