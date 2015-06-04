package com.test.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {
  private ViewPager pager;

  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    pager = ((ViewPager) view.findViewById(R.id.pager));

    doSomething();
  }
  
  private void doSomething() {
    MyAdapter adapter = new MyAdapter(getChildFragmentManager());
    pager.setAdapter(adapter);
    adapter.notifyDataSetChanged();
  }

  private static class MyAdapter extends FragmentStatePagerAdapter {
    public MyAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int i) {
      return new ChildFragment();
    }

    @Override
    public int getCount() {
      return 1;
    }
  }
}
