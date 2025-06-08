package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

public final class d implements i {
    @Override  // com.google.android.gms.common.server.response.i
    public final Object a(FastParser fastParser0, BufferedReader bufferedReader0) {
        int v = fastParser0.d(bufferedReader0, fastParser0.c);
        return v == 0 ? 0.0 : Double.parseDouble(new String(fastParser0.c, 0, v));
    }
}

