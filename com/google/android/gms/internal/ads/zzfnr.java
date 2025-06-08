package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzfnr extends zzfnf {
    public zzfpj i;
    public zzfpj j;
    public zzfnq k;
    public HttpURLConnection l;

    public zzfnr(zzfpj zzfpj0, zzfpj zzfpj1, zzfnq zzfnq0) {
        this.i = zzfpj0;
        this.j = zzfpj1;
        this.k = zzfnq0;
    }

    @Override
    public void close() {
        zzfnr.zzs(this.l);
    }

    public HttpURLConnection zzm() throws IOException {
        ((Integer)this.i.zza()).intValue();
        ((Integer)this.j.zza()).intValue();
        zzfnq zzfnq0 = this.k;
        zzfnq0.getClass();
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)zzfnq0.zza();
        this.l = httpURLConnection0;
        return httpURLConnection0;
    }

    public HttpURLConnection zzn(zzfnq zzfnq0, int v, int v1) throws IOException {
        this.i = new zzfnh(v);
        this.j = new zzfni(v1);
        this.k = zzfnq0;
        return this.zzm();
    }

    public HttpURLConnection zzo(Network network0, URL uRL0, int v, int v1) throws IOException {
        this.i = new zzfnj(v);
        this.j = new zzfnk(v1);
        this.k = new zzfnl(network0, uRL0);
        return this.zzm();
    }

    public URLConnection zzr(URL uRL0, int v) throws IOException {
        this.i = new zzfnm(v);
        this.k = new zzfnn(uRL0);
        return this.zzm();
    }

    public static void zzs(HttpURLConnection httpURLConnection0) {
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
    }
}

