package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

public final class e3 extends zzek implements zzfn {
    public final R2 e;
    public final int f;
    public final int g;
    public final String h;
    public final zzfm i;
    public zzev j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public final HashSet t;
    public static final Pattern u;
    public static final AtomicReference v;

    static {
        e3.u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        e3.v = new AtomicReference();
    }

    public e3(String s, zzckv zzckv0, int v, int v1, int v2) {
        super(true);
        this.e = new R2(this);
        this.t = new HashSet();
        zzcw.zzc(s);
        this.h = s;
        this.i = new zzfm();
        this.f = v;
        this.g = v1;
        this.s = v2;
        if(zzckv0 != null) {
            this.zzf(zzckv0);
        }
    }

    public final void d() {
        HttpURLConnection httpURLConnection0 = this.k;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzcfi.zzh("Unexpected error while disconnecting", exception0);
            }
            this.k = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        try {
            int v2 = 0;
            if(this.q != this.o) {
                AtomicReference atomicReference0 = e3.v;
                byte[] arr_b1 = (byte[])atomicReference0.getAndSet(null);
                if(arr_b1 == null) {
                    arr_b1 = new byte[0x1000];
                }
                while(true) {
                    long v3 = this.q;
                    long v4 = this.o;
                    if(v3 == v4) {
                        break;
                    }
                    int v5 = this.l.read(arr_b1, 0, ((int)Math.min(v4 - v3, arr_b1.length)));
                    if(Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if(v5 == -1) {
                        throw new EOFException();
                    }
                    this.q += (long)v5;
                    this.zzg(v5);
                }
                atomicReference0.set(arr_b1);
            }
            if(v1 != 0) {
                long v6 = this.p;
                if(v6 != -1L) {
                    long v7 = v6 - this.r;
                    if(v7 == 0L) {
                        return -1;
                    }
                    v1 = (int)Math.min(v1, v7);
                }
                v2 = this.l.read(arr_b, v, v1);
                if(v2 == -1) {
                    if(this.p != -1L) {
                        throw new EOFException();
                    }
                    return -1;
                }
                this.r += (long)v2;
                this.zzg(v2);
            }
            return v2;
        }
        catch(IOException iOException0) {
        }
        throw new zzfj(iOException0, this.j, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) {
        long v7;
        long v5;
        long v3;
        HttpURLConnection httpURLConnection0;
        try {
            this.j = zzev0;
            this.r = 0L;
            this.q = 0L;
            URL uRL0 = new URL(zzev0.zza.toString());
            long v = zzev0.zzf;
            long v1 = zzev0.zzg;
            boolean z = zzev0.zzb(1);
            int v2 = 0;
        alab1:
            while(true) {
                if(v2 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + (v2 + 1));
                }
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                if(httpURLConnection0 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)httpURLConnection0).setSSLSocketFactory(this.e);
                }
                httpURLConnection0.setConnectTimeout(this.f);
                httpURLConnection0.setReadTimeout(this.g);
                Iterator iterator0 = this.i.zza().entrySet().iterator();
                while(true) {
                    v3 = -1L;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(v != 0L) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + v + "-" : "bytes=" + v + "-" + (v + v1 - 1L)));
                }
                else if(v1 != -1L) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + 0L + "-" : "bytes=" + 0L + "-" + (v1 - 1L)));
                }
                httpURLConnection0.setRequestProperty("User-Agent", this.h);
                if(!z) {
                    httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection0.setInstanceFollowRedirects(false);
                httpURLConnection0.setDoOutput(false);
                httpURLConnection0.connect();
                switch(httpURLConnection0.getResponseCode()) {
                    case 300: 
                    case 301: 
                    case 302: 
                    case 303: 
                    case 307: 
                    case 308: {
                        String s = httpURLConnection0.getHeaderField("Location");
                        httpURLConnection0.disconnect();
                        if(s == null) {
                            throw new ProtocolException("Null location redirect");
                        }
                        URL uRL1 = new URL(uRL0, s);
                        String s1 = uRL1.getProtocol();
                        if(!"https".equals(s1) && !"http".equals(s1)) {
                            throw new ProtocolException("Unsupported protocol redirect: " + s1);
                        }
                        uRL0 = uRL1;
                        ++v2;
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            this.k = httpURLConnection0;
        }
        catch(IOException iOException0) {
            throw new zzfj("Unable to connect to " + zzev0.zza.toString(), iOException0, zzev0, 2000, 1);
        }
        try {
            int v4 = httpURLConnection0.getResponseCode();
            this.n = v4;
        }
        catch(IOException iOException1) {
            this.d();
            throw new zzfj("Unable to connect to " + zzev0.zza.toString(), iOException1, zzev0, 2000, 1);
        }
        if(v4 >= 200 && v4 <= 299) {
            if(v4 == 200) {
                v5 = zzev0.zzf;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            this.o = v5;
            if(zzev0.zzb(1)) {
                this.p = zzev0.zzg;
            }
            else {
                long v6 = zzev0.zzg;
                if(v6 == -1L) {
                    HttpURLConnection httpURLConnection1 = this.k;
                    String s2 = httpURLConnection1.getHeaderField("Content-Length");
                    if(TextUtils.isEmpty(s2)) {
                        v7 = -1L;
                    }
                    else {
                        try {
                            v7 = Long.parseLong(s2);
                        }
                        catch(NumberFormatException unused_ex) {
                            zzcfi.zzg(("Unexpected Content-Length [" + s2 + "]"));
                            v7 = -1L;
                        }
                    }
                    String s3 = httpURLConnection1.getHeaderField("Content-Range");
                    if(!TextUtils.isEmpty(s3)) {
                        Matcher matcher0 = e3.u.matcher(s3);
                        if(matcher0.find()) {
                            try {
                                long v8 = Long.parseLong(matcher0.group(2)) - Long.parseLong(matcher0.group(1)) + 1L;
                                if(v7 < 0L) {
                                    v7 = v8;
                                }
                                else if(v7 != v8) {
                                    zzcfi.zzj(("Inconsistent headers [" + s2 + "] [" + s3 + "]"));
                                    v7 = Math.max(v7, v8);
                                }
                            }
                            catch(NumberFormatException unused_ex) {
                                zzcfi.zzg(("Unexpected Content-Range [" + s3 + "]"));
                            }
                        }
                    }
                    if(v7 != -1L) {
                        v3 = v7 - this.o;
                    }
                    this.p = v3;
                }
                else {
                    this.p = v6;
                }
            }
            try {
                this.l = this.k.getInputStream();
            }
            catch(IOException iOException2) {
                this.d();
                throw new zzfj(iOException2, zzev0, 2000, 1);
            }
            this.m = true;
            this.c(zzev0);
            return this.p;
        }
        Map map0 = this.k.getHeaderFields();
        this.d();
        zzfl zzfl0 = new zzfl(this.n, null, null, map0, zzev0, zzeg.zzf);
        if(this.n == 0x1A0) {
            zzfl0.initCause(new zzer(2008));
        }
        throw zzfl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.k == null ? null : Uri.parse(this.k.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        HashSet hashSet0;
        try {
            hashSet0 = this.t;
            if(this.l != null) {
                HttpURLConnection httpURLConnection0 = this.k;
                long v1 = this.p == -1L ? this.p : this.p - this.r;
                if(zzeg.zza == 19 || zzeg.zza == 20) {
                    try {
                        InputStream inputStream0 = httpURLConnection0.getInputStream();
                        if(v1 != -1L) {
                            if(v1 > 0x800L) {
                            label_11:
                                String s = inputStream0.getClass().getName();
                                if(s.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || s.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method method0 = inputStream0.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                                    method0.setAccessible(true);
                                    method0.invoke(inputStream0, null);
                                }
                            }
                        }
                        else if(inputStream0.read() != -1) {
                            goto label_11;
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
                try {
                    this.l.close();
                }
                catch(IOException iOException0) {
                    throw new zzfj(iOException0, this.j, 2000, 3);
                }
            }
        }
        finally {
            this.l = null;
            this.d();
            if(this.m) {
                this.m = false;
                this.a();
            }
            hashSet0.clear();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return this.k == null ? null : this.k.getHeaderFields();
    }
}

