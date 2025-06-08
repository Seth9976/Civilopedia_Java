package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class v0 extends FilterInputStream {
    public final HttpURLConnection i;

    public v0(HttpURLConnection httpURLConnection0) {
        InputStream inputStream0;
        try {
            inputStream0 = httpURLConnection0.getInputStream();
        }
        catch(IOException unused_ex) {
            inputStream0 = httpURLConnection0.getErrorStream();
        }
        super(inputStream0);
        this.i = httpURLConnection0;
    }

    @Override
    public final void close() {
        super.close();
        this.i.disconnect();
    }
}

