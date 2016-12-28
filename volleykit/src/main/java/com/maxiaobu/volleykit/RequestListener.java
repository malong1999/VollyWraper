package com.maxiaobu.volleykit;

import com.android.volley.VolleyError;

/**
 * Created by maxiaobu on 2015/12/17.
 * 请求监听   string
 */
public interface RequestListener  {

    /** 成功 */
    public void requestSuccess(String json);

    public void requestError(VolleyError e,String error);
    public void noInternet(VolleyError e, String error);
}
