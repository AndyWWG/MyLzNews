package com.example.administrator.mylznews.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 网络请求工具类
 *
 * @author dpb on 16/1/12.
 * @created 16/1/12.
 */
public class HttpUtil {
    /**
     * Get 请求
     *
     * @param httpUrl 链接地址
     */
    public static Object doGet(String httpUrl) {
        if (httpUrl == null) {
            throw new NullPointerException("get请求url参数不能为空!!!");
        }
        BufferedReader bufferedReader = null;
        try {
            URL url = new URL(httpUrl);
            // 打开一个连接
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            // 设置请求方式
            conn.setRequestMethod("GET");
            // 设置请求超时时长
            conn.setConnectTimeout(8000);
            // 设置读取时间超时
            conn.setReadTimeout(5000);
            // 设置可读
            conn.setDoInput(true);
            // 直接连接
            conn.connect();
            // 获取返回编码
            int responseCode =
                    conn.getResponseCode();
            // 网络请求成功获取数据
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 获取输入字节流
                InputStream inputStream = conn.getInputStream();
                // 转换为字符流
                InputStreamReader reader = new InputStreamReader(inputStream);
                // 转换为缓冲字符流
                bufferedReader = new BufferedReader(reader);
                // 保存获取的结果
                StringBuilder sb = new StringBuilder();
                // 临时变量保存每次读取的结果
                String line = null;
                // 循环读取所有的结果
                while ((line = bufferedReader.readLine()) != null) {
                    // 将读取的结果拼接起来
                    sb.append(line);
                }
                // 关流 在finally中执行
                String result = sb.toString();
                // 添加网络请求成功的日志
                LogUtil.w("tag", "请求成功：" + result);
                // 返回结果
                return result;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        // 添加网络请求失败的日志
        LogUtil.e("tag", "请求失败");
        return null;

    }

    /**
     * Post请求
     *
     * @param httpUrl 请求地址
     * @param params  需要传递的参数
     * @return Object
     * 返回数据
     */
    public static Object doPost(String httpUrl, Map<String, String> params) {
        if (httpUrl == null || params == null) {
            throw new NullPointerException("post请求url或参数不能为空!!!");
        }
        // 参数处理,遍历Map中的数据
        Set<Map.Entry<String, String>> entries = params.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        StringBuilder paramsBuilder = new StringBuilder();
        //paramsBuilder.append(httpUrl);
        while (iterator.hasNext()) {
            // 获取每一条数据，并拼接起来
            Map.Entry<String, String> entry = iterator.next();
            paramsBuilder.append(entry.getKey());
            paramsBuilder.append("=");
            paramsBuilder.append(entry.getValue());
            paramsBuilder.append("&");
        }
        // 去掉最后一个&
        String paramsString = paramsBuilder.toString();
        paramsString = paramsString.substring(0, paramsString.length() - 1);
        BufferedReader bufferedReader = null;
        try {
            // 创建一个URL
            URL url = new URL(httpUrl);
            // 打开一个连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 设置一个连接的属性
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(8000);
            conn.setReadTimeout(5000);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 不使用缓存
            conn.setUseCaches(false);
            conn.connect();
            // 写入数据必须在读取数据之前执行
            OutputStream outputStream = conn.getOutputStream();
            // 传递参数到服务端
            outputStream.write(paramsString.getBytes());

            int responseCode = conn.getResponseCode();
            // 如果返回码为200表示成功
            if (responseCode == HttpURLConnection.HTTP_OK) {

                // 获取输入流
                InputStream inputStream = conn.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);
                bufferedReader = new BufferedReader(reader);
                StringBuilder resultBuilder = new StringBuilder();
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    resultBuilder.append(line);
                }
                String result = resultBuilder.toString();
                // 添加网络请求成功的日志
                LogUtil.w("tag", "请求成功：" + result);
                // 返回结果
                return result;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 判断bufferedReader正常获取了
            if (bufferedReader != null) {
                try {
                    // 关闭流
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // 添加网络请求失败的日志
        LogUtil.e("tag", "请求失败");
        return null;
    }
}
