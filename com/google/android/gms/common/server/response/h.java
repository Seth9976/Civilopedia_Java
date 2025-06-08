package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.math.BigDecimal;

public final class h implements i {
    @Override  // com.google.android.gms.common.server.response.i
    public final Object a(FastParser fastParser0, BufferedReader bufferedReader0) {
        int v = fastParser0.d(bufferedReader0, fastParser0.c);
        return v == 0 ? null : new BigDecimal(new String(fastParser0.c, 0, v));
    }
}

