package com.test.test;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.LinearLayout;

public class FragmentUtilActivity extends FragmentActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    LinearLayout view = new LinearLayout(this);
    view.setId(R.id.fragment);

    setContentView(view);
  }
}
