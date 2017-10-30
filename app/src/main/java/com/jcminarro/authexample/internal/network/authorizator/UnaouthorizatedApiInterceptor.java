package com.jcminarro.authexample.internal.network.authorizator;

import android.support.annotation.NonNull;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Interceptor;
import okhttp3.Response;

public class UnaouthorizatedApiInterceptor implements Interceptor {

    @Inject
    public UnaouthorizatedApiInterceptor() { }

    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        return chain.proceed(chain.request());
    }
}
