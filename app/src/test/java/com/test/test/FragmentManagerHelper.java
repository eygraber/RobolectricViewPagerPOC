package com.test.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import org.robolectric.Robolectric;

public class FragmentManagerHelper {
  public static void startVisibleFragmentAndAddToBackStack(Fragment fragment) {
    buildSupportFragmentManager(FragmentUtilActivity.class)
        .beginTransaction().add(R.id.fragment, fragment, null).addToBackStack(null).commit();
  }

  private static android.support.v4.app.FragmentManager buildSupportFragmentManager(
      Class<? extends FragmentActivity> fragmentActivityClass) {
    FragmentActivity activity = Robolectric.setupActivity(fragmentActivityClass);
    return activity.getSupportFragmentManager();
  }
}