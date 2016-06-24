package com.example.administrator.mylznews.Activity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.example.administrator.mylznews.Fragment.FindFragment;
import com.example.administrator.mylznews.Fragment.MeFragment;
import com.example.administrator.mylznews.Fragment.NewsFragment;
import com.example.administrator.mylznews.Activity.BaseActivity;
import com.example.administrator.mylznews.R;


/**
 * 应用的主页
 */
public class HomeActivity extends BaseActivity {

    private RadioGroup mRadioGroup;

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    private Fragment[] fragments = {new NewsFragment()
            , new FindFragment()
            , new MeFragment()};


    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.activity_home_radiogroup);
    }

    @Override
    protected void initData() {
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        for (int i = 0; i < fragments.length; i++) {
            mFragmentTransaction.add(R.id.activity_home_framelayout, fragments[i], "" + i);
            mFragmentTransaction.hide(fragments[i]);
        }
        mFragmentTransaction.show(fragments[0]);
        mFragmentTransaction.commit();

        //设置默认被选中的RadioButton
        mRadioGroup.check(R.id.activity_home_rb_news);

    }

    @Override
    protected void inttEvents() {

        mRadioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            mFragmentTransaction = mFragmentManager.beginTransaction();
            int index = 0;

            switch (checkedId) {
                case R.id.activity_home_rb_news:
                    index = 0;
                    break;
                case R.id.activity_home_rb_find:
                    index = 1;
                    break;
                case R.id.activity_home_rb_me:
                    index = 2;
                    break;
            }
            for (int i = 0; i < fragments.length; i++) {
                if (i == index) {
                    mFragmentTransaction.show(fragments[i]);
                } else {
                    mFragmentTransaction.hide(fragments[i]);
                }
            }
            mFragmentTransaction.commit();
        }
    };


}
