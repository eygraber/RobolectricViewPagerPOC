package com.test.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainFragmentTest {
  private MainFragment subject;

  @Before
  public void setUp() throws Exception {
    subject = new MainFragment();
  }

  @Test
  public void test() {
    FragmentManagerHelper.startVisibleFragmentAndAddToBackStack(subject);
  }
}