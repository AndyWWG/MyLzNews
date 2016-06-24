package com.example.administrator.mylznews.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * created dpb on 16/5/5.
 * <p/>
 * e_mail  dengpbs@163.com.
 * ViewPager的适配器
 */
public class ViewPagerCommonAdapter extends PagerAdapter {

    private List<View> list;

    public ViewPagerCommonAdapter(List<View> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = list.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }
}
