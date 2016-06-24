package com.example.administrator.mylznews.Utils;

import android.os.AsyncTask;

/**
 * created dpb on 16/6/3.
 * <p/>
 * e_mail  dengpbs@163.com.
 * 异步任务的工具
 */
public class AsyncTaskUtils extends AsyncTask<Void,Integer,Object>{

    private Request request;
    private RequestCallback callback;

    public AsyncTaskUtils(Request request, RequestCallback callback) {
        if(request == null || callback == null)
        {
            throw new NullPointerException("Request 和 RequestCallback都必须实例化，不能为空!!!");
        }
        this.request = request;
        this.callback = callback;
    }

    /**
     * 子线程中执行的方法
     * @param params
     * @return
     */
    @Override
    protected Object doInBackground(Void... params) {
        // TODO 执行抽象方法
        return request.request();
    }

    /**
     * doInBackground方法执行完成之后回调的主线程中的方法
     * @param o
     */
    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        if(o == null)
        {
            callback.error("网络操作异常！！！");
        }else{
            callback.succes(o);
        }

    }

    public interface Request{
        public Object request();
    }

    public interface RequestCallback{
        public void succes(Object o);
        public void error(String msg);
    }
}
