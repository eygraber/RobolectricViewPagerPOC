package com.test.test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import android.support.v4.app.FragmentActivity;
import static org.robolectric.util.SupportFragmentTestUtil.startFragment;
import static org.robolectric.util.SupportFragmentTestUtil.startVisibleFragment;

@RunWith(RobolectricGradleTestRunner.class)
public class MainFragmentTest {
  private MainFragment subject;

  @Test
  public void test() {
    MainFragment fragment = new MainFragment();
    startFragment(fragment, FragmentActivity.class);
  }

  @Test
  public void test2() {
    MainFragment fragment = new MainFragment();
    startVisibleFragment(fragment);
  }
}
