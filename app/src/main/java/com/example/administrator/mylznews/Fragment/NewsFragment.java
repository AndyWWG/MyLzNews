package com.example.administrator.mylznews.Fragment;


import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.mylznews.Domain.NewsBean;
import com.example.administrator.mylznews.Domain.NewsBean.MyDataBean.ListBean.DataBean;
import com.example.administrator.mylznews.R;
import com.example.administrator.mylznews.Utils.AsyncTaskUtils;
import com.example.administrator.mylznews.Utils.Contants;
import com.example.administrator.mylznews.Utils.ImageLoader;
import com.example.administrator.mylznews.Utils.JokeHttpUtils;
import com.example.administrator.mylznews.Utils.LogUtil;
import com.example.administrator.mylznews.adapter.CommonAdapter;
import com.example.administrator.mylznews.adapter.MyTabFragmentStatePagerAdapter;
import com.example.administrator.mylznews.adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends BaseFragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private List<String> titles;

    private ListView listView;

    private List<DataBean> list;

    private BaseAdapter adapter;

    private ImageLoader loader;


    /**
     * 获取对应的布局文件
     *
     * @return
     */
    @Override
    protected int getLayout() {
        return R.layout.fragment_news;
    }


    /**
     * 初始化布局
     */
    @Override
    protected void initView() {
        LogUtil.e("--------", "----> initView ");
        viewPager = (ViewPager) root.findViewById(R.id.viewpager_item_news);
        tabLayout = (TabLayout) root.findViewById(R.id.tablelayout_news);
        listView = (ListView) root.findViewById(R.id.listview_item_news);

    }


    /**
     * 初始化数据
     */
    @Override
    protected void initData() {

        titles = new ArrayList<>();
        titles.add(Contants.TAB_TITLE_HEADLINE);
        titles.add(Contants.TAB_TITLE_JIANGSU);
        titles.add(Contants.TAB_TITLE_SPOT);
        titles.add(Contants.TAB_TITLE_JIANGSU_TV);
        titles.add(Contants.TAB_TITLE_LIZI_COMMENT);
        titles.add(Contants.TAB_TITLE_ORIGINALITY);
        titles.add(Contants.TAB_TITLE_IMAGE_LIST);
        titles.add(Contants.TAB_TITLE_RECREATION);
        titles.add(Contants.TAB_TITLE_FEATURES);
        titles.add(Contants.TAB_TITLE_LIZI_PAI);
        titles.add(Contants.TAB_TITLE_HOME);


        loader = new ImageLoader(getActivity());
        // 获取数据源
        list = new ArrayList<>();
        // 设置适配器
        adapter = new CommonAdapter<DataBean>(R.layout.item_news, list, getActivity()) {
            @Override
            public void setContent(ViewHolder vh, DataBean item) {
                TextView title = (TextView) vh.getViews(R.id.txt_01_news);
                TextView subTitle = (TextView) vh.getViews(R.id.txt_02_news);
                ImageView photo = (ImageView) vh.getViews(R.id.img_news);
                title.setText(item.getTitle());
                subTitle.setText(item.getSubTitle());
                if (!TextUtils.isEmpty(item.getPhoto())) {
                    photo.setVisibility(View.VISIBLE);
                    loader.DisplayImage(item.getPhoto(), photo);
                } else {
                    photo.setVisibility(View.GONE);
                }
            }

        };
        // 设置适配器
        listView.setAdapter(adapter);
        // 获取网络数据
        JokeHttpUtils.getJosnData(callback, Contants.URL_NEWS_HEAD);
    }


    /**
     * 初始化事件
     */
    @Override
    protected void initEvents() {

        // 选择适配器
        MyTabFragmentStatePagerAdapter adapter = new MyTabFragmentStatePagerAdapter(getFragmentManager(), titles);
        viewPager.setAdapter(adapter);
        // TabLayout和ViewPager关联
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.argb(255, 0, 0, 0), Color.argb(255, 255, 0, 0));


        listView.setOnScrollListener(new AbsListView.OnScrollListener() {

            private boolean isButtom = false;

            /**
             * 滑动状态改变的回调方法
             * @param view
             * @param scrollState
             */
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                // 判断是否处于 滑动到手机底部同时松手的状态
                if (scrollState == SCROLL_STATE_IDLE && isButtom) {
                    // 加载更多的数据
                    // 1.获取到加载更多数据的链接
//                    String url = Contants.URL_NEWS_HEAD+"?size="+Contants.PAGE_SIZE+"&page="+list.size()/Contants.PAGE_SIZE;
                    JokeHttpUtils.getJosnData(callback, Contants.URL_NEWS_HEAD);
                }
            }

            /**
             * 滑动的回调方法
             * @param view
             * @param firstVisibleItem
             * @param visibleItemCount
             * @param totalItemCount
             */
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (firstVisibleItem + visibleItemCount >= totalItemCount) {
                    isButtom = true;
                } else {
                    isButtom = false;
                }

            }
        });
    }

    private AsyncTaskUtils.RequestCallback callback = new AsyncTaskUtils.RequestCallback() {
        @Override
        public void succes(Object o) {
            // TODO 获取到JSON数据，然后解析，显示在ListView中
            // LogUtil.e("--------","---->"+o.toString());
            List<DataBean> list = new ArrayList<>();
            NewsBean newsBean = NewsBean.MyDataBean.ListBean.objectFromData(o.toString());
            // 解析json数据
            List<NewsBean.MyDataBean.ListBean> listData = newsBean.getData().getList();

            for (int i = 0; i < listData.size(); i++) {
                DataBean dataBean = listData.get(i).getData();
                list.add(dataBean);
            }
            // 更新数据源
            list.addAll(list);
            // 通知适配器更新
            adapter.notifyDataSetChanged();

        }

        @Override
        public void error(String msg) {

        }
    };

}
