package com.example.administrator.mylznews.Utils;

import android.app.Activity;
import android.content.Intent;

import com.example.administrator.mylznews.Activity.GuideActivity;
import com.example.administrator.mylznews.Activity.HomeActivity;

/**
 * created dpb on 16/4/13.
 * <p/>
 * e_mail  dengpbs@163.com.
 * 页面跳转管理
 */
public class JumpManager {

    /**
     * 跳转到主页面
     *
     * @param activity
     */
    public static void jumpToHome(Activity activity) {
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);

    }

    /**
     * 跳转到引导页面
     *
     * @param activity
     */
    public static void jumpToGuide(Activity activity) {
        Intent intent = new Intent(activity, GuideActivity.class);
        activity.startActivity(intent);
    }
    public static void jumpToCover(Activity activity)
    {

    }
}
