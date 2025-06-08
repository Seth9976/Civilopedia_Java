package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

public final class e implements i {
    @Override  // com.google.android.gms.common.server.response.i
    public final Object a(FastParser fastParser0, BufferedReader bufferedReader0) {
        return Boolean.valueOf(fastParser0.m(bufferedReader0, false));
    }
}

