package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzayn implements zzays {
    public final int a;
    public final int b;
    public final String c;
    public final zzayr d;
    public final zzayy e;
    public zzayl f;
    public HttpURLConnection g;
    public InputStream h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public static final Pattern n;
    public static final AtomicReference o;

    static {
        zzayn.n = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        zzayn.o = new AtomicReference();
    }

    public zzayn(String s, zzazj zzazj0, zzayy zzayy0, int v, int v1, boolean z, zzayr zzayr0) {
        zzayz.zzb(s);
        this.c = s;
        this.e = zzayy0;
        this.d = new zzayr();
        this.a = v;
        this.b = v1;
    }

    public final void a() {
        HttpURLConnection httpURLConnection0 = this.g;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", exception0);
            }
            this.g = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] arr_b, int v, int v1) throws zzayp {
        try {
            zzayy zzayy0 = this.e;
            int v2 = 0;
            if(this.l != this.j) {
                AtomicReference atomicReference0 = zzayn.o;
                byte[] arr_b1 = (byte[])atomicReference0.getAndSet(null);
                if(arr_b1 == null) {
                    arr_b1 = new byte[0x1000];
                }
                while(true) {
                    long v3 = this.l;
                    long v4 = this.j;
                    if(v3 == v4) {
                        break;
                    }
                    int v5 = this.h.read(arr_b1, 0, ((int)Math.min(v4 - v3, arr_b1.length)));
                    if(Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if(v5 == -1) {
                        throw new EOFException();
                    }
                    this.l += (long)v5;
                    if(zzayy0 != null) {
                        zzayy0.zzj(this, v5);
                    }
                }
                atomicReference0.set(arr_b1);
            }
            if(v1 != 0) {
                long v6 = this.k;
                if(v6 != -1L) {
                    long v7 = v6 - this.m;
                    if(v7 == 0L) {
                        return -1;
                    }
                    v1 = (int)Math.min(v1, v7);
                }
                v2 = this.h.read(arr_b, v, v1);
                if(v2 == -1) {
                    if(this.k != -1L) {
                        throw new EOFException();
                    }
                    return -1;
                }
                this.m += (long)v2;
                if(zzayy0 != null) {
                    zzayy0.zzj(this, v2);
                }
            }
            return v2;
        }
        catch(IOException iOException0) {
        }
        throw new zzayp(iOException0, this.f, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzayl0) throws zzayp {
        zzayy zzayy0;
        long v7;
        long v5;
        int v4;
        long v3;
        HttpURLConnection httpURLConnection0;
        try {
            this.f = zzayl0;
            this.m = 0L;
            this.l = 0L;
            URL uRL0 = new URL(zzayl0.zza.toString());
            long v = zzayl0.zzc;
            long v1 = zzayl0.zzd;
            int v2 = 0;
        alab1:
            while(true) {
                if(v2 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + (v2 + 1));
                }
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setConnectTimeout(this.a);
                httpURLConnection0.setReadTimeout(this.b);
                Iterator iterator0 = this.d.zza().entrySet().iterator();
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
                httpURLConnection0.setRequestProperty("User-Agent", this.c);
                httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
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
            this.g = httpURLConnection0;
            goto label_45;
        }
        catch(IOException iOException0) {
        }
        throw new zzayp("Unable to connect to " + zzayl0.zza.toString(), iOException0, zzayl0, 1);
        try {
        label_45:
            v4 = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException1) {
            this.a();
            throw new zzayp("Unable to connect to " + zzayl0.zza.toString(), iOException1, zzayl0, 1);
        }
        if(v4 >= 200 && v4 <= 299) {
            this.g.getContentType();
            if(v4 == 200) {
                v5 = zzayl0.zzc;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            this.j = v5;
            long v6 = zzayl0.zzd;
            if(v6 == -1L) {
                HttpURLConnection httpURLConnection1 = this.g;
                String s2 = httpURLConnection1.getHeaderField("Content-Length");
                if(TextUtils.isEmpty(s2)) {
                    v7 = -1L;
                }
                else {
                    try {
                        v7 = Long.parseLong(s2);
                    }
                    catch(NumberFormatException unused_ex) {
                        Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + s2 + "]");
                        v7 = -1L;
                    }
                }
                String s3 = httpURLConnection1.getHeaderField("Content-Range");
                if(!TextUtils.isEmpty(s3)) {
                    Matcher matcher0 = zzayn.n.matcher(s3);
                    if(matcher0.find()) {
                        try {
                            long v8 = Long.parseLong(matcher0.group(2)) - Long.parseLong(matcher0.group(1)) + 1L;
                            if(v7 < 0L) {
                                v7 = v8;
                            }
                            else if(v7 != v8) {
                                Log.w("DefaultHttpDataSource", "Inconsistent headers [" + s2 + "] [" + s3 + "]");
                                v7 = Math.max(v7, v8);
                            }
                        }
                        catch(NumberFormatException unused_ex) {
                            Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + s3 + "]");
                        }
                    }
                }
                if(v7 != -1L) {
                    v3 = v7 - this.j;
                }
                this.k = v3;
            }
            else {
                this.k = v6;
            }
            try {
                this.h = this.g.getInputStream();
                this.i = true;
                zzayy0 = this.e;
            }
            catch(IOException iOException2) {
                this.a();
                throw new zzayp(iOException2, zzayl0, 1);
            }
            if(zzayy0 != null) {
                zzayy0.zzk(this, zzayl0);
            }
            return this.k;
        }
        Map map0 = this.g.getHeaderFields();
        this.a();
        zzayq zzayq0 = new zzayq(v4, map0, zzayl0);
        if(v4 == 0x1A0) {
            zzayq0.initCause(new zzayk(0));
        }
        throw zzayq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.g == null ? null : Uri.parse(this.g.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws zzayp {
        try {
            if(this.h != null) {
                try {
                    this.h.close();
                }
                catch(IOException iOException0) {
                    throw new zzayp(iOException0, this.f, 3);
                }
            }
        }
        finally {
            this.h = null;
            this.a();
            if(this.i) {
                this.i = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzays
    public final Map zze() {
        return this.g == null ? null : this.g.getHeaderFields();
    }
}

