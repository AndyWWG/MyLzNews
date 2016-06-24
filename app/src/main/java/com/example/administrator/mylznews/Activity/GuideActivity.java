package com.example.administrator.mylznews.Activity;

import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.mylznews.R;
import com.example.administrator.mylznews.Utils.Contants;
import com.example.administrator.mylznews.Utils.JumpManager;
import com.example.administrator.mylznews.adapter.ViewPagerCommonAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 引导页
 */
public class GuideActivity extends BaseActivity {
    private ViewPager mViewpager;
    private Button mButton;

    private List<View> imageViews;

    private int[] imageResId = {R.drawable.layer_list_guide_vp_1
            , R.drawable.layer_list_guide_vp_2
            , R.drawable.layer_list_guide_vp_3
            , R.drawable.layer_list_guide_vp_4};


    @Override
    protected int getLayout() {
        return R.layout.activity_guide;
    }

    @Override
    protected void initView() {
        mViewpager = (ViewPager) findViewById(R.id.activity_guide_viewpager);
        mButton = (Button) findViewById(R.id.activity_guide_btn);

    }

    @Override
    protected void initData() {
        imageViews = new ArrayList<>();
        getImageViewsData();
        ViewPagerCommonAdapter adapter = new ViewPagerCommonAdapter(imageViews);
        mViewpager.setAdapter(adapter);

    }

    @Override
    protected void inttEvents() {
        mViewpager.setOnPageChangeListener(pageChangeListener);

        mButton.setOnClickListener(onClickListener);

    }

    private void getImageViewsData() {
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        for (int i = 0; i < imageResId.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setLayoutParams(lp);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setImageResource(imageResId[i]);
            imageViews.add(iv);
        }

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO 跳转到主页面，同时在ShardPreferences中保存已经看过引导页的记录
            SharedPreferences sp = getSharedPreferences(Contants.PERFENCE_FIRST_USED, MODE_PRIVATE);
            boolean b = sp.getBoolean(Contants.PERFENCE_FLAG_USED, true);

            if (b) {

                SharedPreferences.Editor editor = sp.edit();
                editor.putBoolean(Contants.PERFENCE_FLAG_USED, false);
                editor.commit();
                JumpManager.jumpToHome(GuideActivity.this);
                finish();
            }

        }
    };
    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if (position == imageViews.size() - 1) {
                mButton.setVisibility(View.VISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}