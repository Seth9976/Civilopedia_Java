package com.google.android.gms.internal.ads;

import A.f;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class zzfd extends zzek implements zzfn {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final zzfm i;
    public final zzfm j;
    public zzev k;
    public HttpURLConnection l;
    public InputStream m;
    public boolean n;
    public int o;
    public long p;
    public long q;

    @Deprecated
    public zzfd() {
        this(null, 8000, 8000, false, null);
    }

    public zzfd(String s, int v, int v1, boolean z, zzfm zzfm0) {
        super(true);
        this.h = s;
        this.f = v;
        this.g = v1;
        this.e = z;
        this.i = zzfm0;
        this.j = new zzfm();
    }

    public final HttpURLConnection d(URL uRL0, long v, long v1, boolean z, boolean z1, Map map0) {
        String s;
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setConnectTimeout(this.f);
        httpURLConnection0.setReadTimeout(this.g);
        HashMap hashMap0 = new HashMap();
        hashMap0.putAll(this.i.zza());
        hashMap0.putAll(this.j.zza());
        hashMap0.putAll(map0);
        for(Object object0: hashMap0.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(v != 0L) {
        label_17:
            StringBuilder stringBuilder0 = new StringBuilder("bytes=");
            stringBuilder0.append(v);
            stringBuilder0.append("-");
            if(v1 != -1L) {
                stringBuilder0.append(v + v1 - 1L);
            }
            s = stringBuilder0.toString();
        }
        else if(v1 == -1L) {
            s = null;
        }
        else {
            v = 0L;
            goto label_17;
        }
        if(s != null) {
            httpURLConnection0.setRequestProperty("Range", s);
        }
        String s1 = this.h;
        if(s1 != null) {
            httpURLConnection0.setRequestProperty("User-Agent", s1);
        }
        httpURLConnection0.setRequestProperty("Accept-Encoding", (z ? "gzip" : "identity"));
        httpURLConnection0.setInstanceFollowRedirects(z1);
        httpURLConnection0.setDoOutput(false);
        httpURLConnection0.setRequestMethod("GET");
        httpURLConnection0.connect();
        return httpURLConnection0;
    }

    public final URL e(URL uRL0, String s, zzev zzev0) {
        URL uRL1;
        if(s == null) {
            throw new zzfj("Null location redirect", zzev0, 2001, 1);
        }
        try {
            uRL1 = new URL(uRL0, s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new zzfj(malformedURLException0, zzev0, 2001, 1);
        }
        String s1 = uRL1.getProtocol();
        if(!"https".equals(s1) && !"http".equals(s1)) {
            throw new zzfj("Unsupported protocol redirect: " + s1, zzev0, 2001, 1);
        }
        if(!this.e && !s1.equals(uRL0.getProtocol())) {
            throw new zzfj(f.k("Disallowed cross-protocol redirect (", uRL0.getProtocol(), " to ", s1, ")"), zzev0, 2001, 1);
        }
        return uRL1;
    }

    public final void f() {
        HttpURLConnection httpURLConnection0 = this.l;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", exception0);
            }
            this.l = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzfj {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.p;
            if(v2 == -1L) {
            label_7:
                int v4 = this.m.read(arr_b, v, v1);
                if(v4 != -1) {
                    this.q += (long)v4;
                    this.zzg(v4);
                    return v4;
                }
            }
            else {
                long v3 = v2 - this.q;
                if(v3 != 0L) {
                    v1 = (int)Math.min(v1, v3);
                    goto label_7;
                }
            }
            return -1;
        }
        catch(IOException iOException0) {
        }
        throw zzfj.zza(iOException0, this.k, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzfj {
        byte[] arr_b;
        String s2;
        long v5;
        String s1;
        long v4;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        this.k = zzev0;
        this.q = 0L;
        this.p = 0L;
        this.b(zzev0);
        try {
            URL uRL0 = new URL(zzev0.zza.toString());
            long v = zzev0.zzf;
            long v1 = zzev0.zzg;
            boolean z = zzev0.zzb(1);
            if(this.e) {
                URL uRL1 = uRL0;
                int v2 = 0;
            alab1:
                while(true) {
                    if(v2 > 20) {
                        throw new zzfj(new NoRouteToHostException("Too many redirects: " + (v2 + 1)), zzev0, 2001, 1);
                    }
                    httpURLConnection0 = this.d(uRL1, v, v1, z, false, zzev0.zzd);
                    int v3 = httpURLConnection0.getResponseCode();
                    String s = httpURLConnection0.getHeaderField("Location");
                    switch(v3) {
                        case 300: 
                        case 301: 
                        case 302: 
                        case 303: 
                        case 307: 
                        case 308: {
                            httpURLConnection0.disconnect();
                            uRL1 = this.e(uRL1, s, zzev0);
                            ++v2;
                            break;
                        }
                        default: {
                            break alab1;
                        }
                    }
                }
                httpURLConnection1 = httpURLConnection0;
            }
            else {
                httpURLConnection1 = this.d(uRL0, v, v1, z, true, zzev0.zzd);
            }
            v4 = -1L;
            this.l = httpURLConnection1;
            this.o = httpURLConnection1.getResponseCode();
            s1 = httpURLConnection1.getResponseMessage();
        }
        catch(IOException iOException0) {
            this.f();
            throw zzfj.zza(iOException0, zzev0, 1);
        }
        if(this.o >= 200 && this.o <= 299) {
            httpURLConnection1.getContentType();
            if(this.o == 200) {
                v5 = zzev0.zzf;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            boolean z1 = "gzip".equalsIgnoreCase(httpURLConnection1.getHeaderField("Content-Encoding"));
            if(z1) {
                this.p = zzev0.zzg;
            }
            else {
                long v6 = zzev0.zzg;
                if(v6 == -1L) {
                    long v7 = zzfo.zza(httpURLConnection1.getHeaderField("Content-Length"), httpURLConnection1.getHeaderField("Content-Range"));
                    if(v7 != -1L) {
                        v4 = v7 - v5;
                    }
                    this.p = v4;
                }
                else {
                    this.p = v6;
                }
            }
            try {
                this.m = httpURLConnection1.getInputStream();
                if(z1) {
                    this.m = new GZIPInputStream(this.m);
                }
            }
            catch(IOException iOException1) {
                this.f();
                throw new zzfj(iOException1, zzev0, 2000, 1);
            }
            this.n = true;
            this.c(zzev0);
            if(v5 == 0L) {
                return this.p;
            }
            else {
                try {
                    while(v5 > 0L) {
                        int v8 = this.m.read(new byte[0x1000], 0, ((int)Math.min(v5, 0x1000L)));
                        if(Thread.currentThread().isInterrupted()) {
                            throw new zzfj(new InterruptedIOException(), zzev0, 2000, 1);
                        }
                        if(v8 == -1) {
                            throw new zzfj(zzev0, 2008, 1);
                        }
                        v5 -= (long)v8;
                        this.zzg(v8);
                    }
                    return this.p;
                }
                catch(IOException iOException2) {
                }
            }
            this.f();
            throw iOException2 instanceof zzfj ? ((zzfj)iOException2) : new zzfj(iOException2, zzev0, 2000, 1);
        }
        Map map0 = httpURLConnection1.getHeaderFields();
        if(this.o == 0x1A0) {
            long v9 = zzfo.zzb(httpURLConnection1.getHeaderField("Content-Range"));
            s2 = s1;
            if(zzev0.zzf == v9) {
                this.n = true;
                this.c(zzev0);
                return zzev0.zzg == -1L ? 0L : zzev0.zzg;
            }
        }
        else {
            s2 = s1;
        }
        InputStream inputStream0 = httpURLConnection1.getErrorStream();
        try {
            arr_b = inputStream0 == null ? zzeg.zzf : zzeg.zzaa(inputStream0);
        }
        catch(IOException unused_ex) {
            arr_b = zzeg.zzf;
        }
        this.f();
        zzer zzer0 = this.o == 0x1A0 ? new zzer(2008) : null;
        throw new zzfl(this.o, s2, zzer0, map0, zzev0, arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.l == null ? null : Uri.parse(this.l.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfj {
        try {
            InputStream inputStream0 = this.m;
            if(inputStream0 != null) {
                long v1 = this.p == -1L ? -1L : this.p - this.q;
                HttpURLConnection httpURLConnection0 = this.l;
                if(httpURLConnection0 != null && zzeg.zza <= 20) {
                    try {
                        InputStream inputStream1 = httpURLConnection0.getInputStream();
                        if(v1 != -1L) {
                            if(v1 > 0x800L) {
                            label_11:
                                String s = inputStream1.getClass().getName();
                                if("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(s) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(s)) {
                                    Class class0 = inputStream1.getClass().getSuperclass();
                                    if(class0 == null) {
                                        throw null;
                                    }
                                    Method method0 = class0.getDeclaredMethod("unexpectedEndOfInput", null);
                                    method0.setAccessible(true);
                                    method0.invoke(inputStream1, null);
                                }
                            }
                        }
                        else if(inputStream1.read() != -1) {
                            goto label_11;
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzfj(iOException0, this.k, 2000, 3);
                }
            }
        }
        finally {
            this.m = null;
            this.f();
            if(this.n) {
                this.n = false;
                this.a();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        HttpURLConnection httpURLConnection0 = this.l;
        return httpURLConnection0 == null ? zzfrm.zzd() : new S5(httpURLConnection0.getHeaderFields());
    }
}

