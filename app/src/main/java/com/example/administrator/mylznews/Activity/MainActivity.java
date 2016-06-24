package com.example.administrator.mylznews.Activity;

import android.content.SharedPreferences;
import android.widget.ImageView;

import com.example.administrator.mylznews.R;
import com.example.administrator.mylznews.Utils.Contants;
import com.example.administrator.mylznews.Utils.JumpManager;
import com.example.administrator.mylznews.Utils.LogUtil;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * 项目搭建的步骤：
 * 1.资源文件导入
 * 2.项目名称修改，logo设定
 * 3.各模块分保
 * 4.公有功能代码实现
 * 5.封装Activity及Fragment
 * 6.开始具体的代码编写
 */
public class MainActivity extends BaseActivity {

    private ImageView imageView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        imageView = (ImageView) findViewById(R.id.iv_id);
    }

    /**
     * 判断是否是打开引导页还是进入主页
     */
    @Override
    protected void initData() {
        LogUtil.e("--------","> initData");
        SharedPreferences sp = getSharedPreferences(Contants.PERFENCE_FIRST_USED, MODE_PRIVATE);
        boolean b = sp.getBoolean(Contants.PERFENCE_FLAG_USED, true);
        if (b) {

            JumpManager.jumpToGuide(this);

        } else {

            JumpManager.jumpToHome(this);
        }

        finish();
    }

    @Override
    protected void inttEvents() {

    }
}
