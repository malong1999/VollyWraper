package com.maxiaobu.volleykit;

import com.android.volley.VolleyError;

/**
 * 2015/12/17 0017 JSON 数据请求接口
 */
public interface RequestJsonListener<T> {

    /**
     * 成功
     */
    public void requestSuccess(T result);

    public void requestError(VolleyError e, String error);

    public void noInternet(VolleyError e, String error);
}
