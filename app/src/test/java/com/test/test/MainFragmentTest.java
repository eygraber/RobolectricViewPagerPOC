package com.test.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
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
