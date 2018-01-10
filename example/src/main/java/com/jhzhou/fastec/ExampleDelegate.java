package com.jhzhou.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.jhzhou.jh.delegates.AppDelegate;
import com.jhzhou.jh.net.RestClient;
import com.jhzhou.jh.net.callback.IError;
import com.jhzhou.jh.net.callback.IFailure;
import com.jhzhou.jh.net.callback.ISuccess;

/**
 * Created by jhzhou on 1/10/18.
 */

public class ExampleDelegate extends AppDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://news.baidu.com")
                .params("", "")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(), response, Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
                .get();
    }
}
