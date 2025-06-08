package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h3 extends zzek implements zzfn {
    public final int e;
    public final int f;
    public final String g;
    public final zzfm h;
    public zzev i;
    public HttpURLConnection j;
    public final ArrayDeque k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final long t;
    public final long u;
    public static final Pattern v;

    static {
        h3.v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    }

    public h3(String s, zzckv zzckv0, int v, int v1, long v2, long v3) {
        super(true);
        zzcw.zzc(s);
        this.g = s;
        this.h = new zzfm();
        this.e = v;
        this.f = v1;
        this.k = new ArrayDeque();
        this.t = v2;
        this.u = v3;
        if(zzckv0 != null) {
            this.zzf(zzckv0);
        }
    }

    public final HttpURLConnection d(int v, long v1, long v2) {
        HttpURLConnection httpURLConnection0;
        String s = this.i.zza.toString();
        try {
            httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
            httpURLConnection0.setConnectTimeout(this.e);
            httpURLConnection0.setReadTimeout(this.f);
            for(Object object0: this.h.zza().entrySet()) {
                httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpURLConnection0.setRequestProperty("Range", "bytes=" + v1 + "-" + v2);
            httpURLConnection0.setRequestProperty("User-Agent", this.g);
            httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.connect();
            this.k.add(httpURLConnection0);
        }
        catch(IOException iOException0) {
            throw new zzfj("Unable to connect to " + s, iOException0, this.i, 2000, v);
        }
        String s1 = this.i.zza.toString();
        try {
            int v3 = httpURLConnection0.getResponseCode();
            this.n = v3;
        }
        catch(IOException iOException1) {
            this.e();
            throw new zzfj("Unable to connect to " + s1, iOException1, this.i, 2000, v);
        }
        if(v3 >= 200 && v3 <= 299) {
            try {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                if(this.l != null) {
                    inputStream0 = new SequenceInputStream(this.l, inputStream0);
                }
                this.l = inputStream0;
                return httpURLConnection0;
            }
            catch(IOException iOException2) {
            }
            this.e();
            throw new zzfj(iOException2, this.i, 2000, v);
        }
        httpURLConnection0.getHeaderFields();
        this.e();
        throw new g3("Response code: " + this.n, this.i, 2000, v);  // 初始化器: Lcom/google/android/gms/internal/ads/zzfj;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzev;II)V
    }

    public final void e() {
        while(true) {
            ArrayDeque arrayDeque0 = this.k;
            if(arrayDeque0.isEmpty()) {
                break;
            }
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)arrayDeque0.remove();
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzcfi.zzh("Unexpected error while disconnecting", exception0);
            }
        }
        this.j = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.p;
            if(this.o - v2 == 0L) {
                return -1;
            }
            long v3 = this.u;
            long v4 = this.s;
            if(this.q + v2 + ((long)v1) + v3 > v4 + 1L) {
                long v5 = this.r;
                if(v4 < v5) {
                    long v6 = Math.min(v5, Math.max(this.t + (v4 + 1L) - v3 - 1L, -1L + (v4 + 1L + ((long)v1))));
                    this.d(2, v4 + 1L, v6);
                    this.s = v6;
                    v4 = v6;
                }
            }
            int v7 = this.l.read(arr_b, v, ((int)Math.min(v1, v4 + 1L - this.q - this.p)));
            if(v7 == -1) {
                throw new EOFException();
            }
            this.p += (long)v7;
            this.zzg(v7);
            return v7;
        }
        catch(IOException iOException0) {
        }
        throw new zzfj(iOException0, this.i, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) {
        long v2;
        long v1;
        long v;
        this.i = zzev0;
        this.p = 0L;
        this.q = zzev0.zzf;
        HttpURLConnection httpURLConnection0 = this.d(1, zzev0.zzf, (zzev0.zzg == -1L ? this.t : Math.min(this.t, zzev0.zzg)) + zzev0.zzf - 1L);
        this.j = httpURLConnection0;
        String s = httpURLConnection0.getHeaderField("Content-Range");
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = h3.v.matcher(s);
            if(matcher0.find()) {
                try {
                    Long.parseLong(matcher0.group(1));
                    v = Long.parseLong(matcher0.group(2));
                    v1 = Long.parseLong(matcher0.group(3));
                    v2 = zzev0.zzg;
                }
                catch(NumberFormatException unused_ex) {
                    zzcfi.zzg(("Unexpected Content-Range [" + s + "]"));
                    throw new g3("Invalid content range: " + s, zzev0, 2000, 1);  // 初始化器: Lcom/google/android/gms/internal/ads/zzfj;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzev;II)V
                }
                if(v2 == -1L) {
                    this.o = v1 - this.q;
                    this.r = v1 - 1L;
                }
                else {
                    this.o = v2;
                    this.r = Math.max(v, this.q + v2 - 1L);
                }
                this.s = v;
                this.m = true;
                this.c(zzev0);
                return this.o;
            }
        }
        throw new g3("Invalid content range: " + s, zzev0, 2000, 1);  // 初始化器: Lcom/google/android/gms/internal/ads/zzfj;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzev;II)V
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.j == null ? null : Uri.parse(this.j.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        try {
            InputStream inputStream0 = this.l;
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzfj(iOException0, this.i, 2000, 3);
                }
            }
        }
        finally {
            this.l = null;
            this.e();
            if(this.m) {
                this.m = false;
                this.a();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return this.j == null ? null : this.j.getHeaderFields();
    }
}

