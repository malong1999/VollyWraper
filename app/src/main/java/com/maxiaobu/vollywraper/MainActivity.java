package com.maxiaobu.vollywraper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.maxiaobu.volleykit.NodataFragment;
import com.maxiaobu.volleykit.RequestJsonListener;
import com.maxiaobu.volleykit.RequestListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        //192.168.1.121:8080
        //123.56.195.32:8080
        App.getRequestInstance().get(this, "http://192.168.1.182:8080/efithealth/maccount.do?memid=M000455", new RequestListener() {
            @Override
            public void requestSuccess(String json) {
                Toast.makeText(MainActivity.this, json, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void requestError(VolleyError e, String error) {
                Toast.makeText(MainActivity.this, error, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void noInternet(VolleyError e, String error) {
                Toast.makeText(MainActivity.this, error, Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getRequestInstance().getRequestManager().cancelAll(this);
    }

}
