package com.example.administrator.mylznews.Utils;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 */
public class JokeHttpUtils {

    /**
     * 获取看笑话的json数据
     */
    public static void getJosnData(AsyncTaskUtils.RequestCallback callback,final String url){
        AsyncTaskUtils.Request request = new AsyncTaskUtils.Request() {
            @Override
            public Object request() {
                return HttpUtil.doGet(url);
            }
        };
        AsyncTaskUtils task = new AsyncTaskUtils(request,callback);
        task.execute();
    }
}
