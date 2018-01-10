package com.jhzhou.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

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

    }

    private void testRestClient() {
        RestClient.builder()
                .url("")
                .params("", "")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

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
                }).build();
    }
}
