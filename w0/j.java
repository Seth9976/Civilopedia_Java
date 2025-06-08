package w0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.zb;
import f2.J;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.concurrent.Executor;
import l.L0;
import o2.C;
import p0.k;
import p0.t;
import p0.u;
import q.e;
import q0.i;
import q0.l;
import q0.n;
import r0.f;
import r0.g;
import x0.c;
import x0.d;
import x0.h;
import y0.b;
import z0.a;

public final class j {
    public final Context a;
    public final f b;
    public final d c;
    public final w0.d d;
    public final Executor e;
    public final b f;
    public final a g;
    public final a h;
    public final c i;

    public j(Context context0, f f0, d d0, w0.d d1, Executor executor0, b b0, a a0, a a1, c c0) {
        this.a = context0;
        this.b = f0;
        this.c = d0;
        this.d = d1;
        this.e = executor0;
        this.f = b0;
        this.g = a0;
        this.h = a1;
        this.i = c0;
    }

    public final void a(i i0, int v) {
        String s13;
        L0 l00;
        String s9;
        Integer integer1;
        r0.a a0;
        h h1;
        g g0 = this.b.a(i0.a);
        long v1 = 0L;
        while(true) {
            w0.h h0 = new w0.h(this, i0, 0);
            h1 = (h)this.f;
            if(!((Boolean)h1.f(h0)).booleanValue()) {
                break;
            }
            Iterable iterable0 = (Iterable)h1.f(new w0.h(this, i0, 1));
            if(!iterable0.iterator().hasNext()) {
                return;
            }
            byte[] arr_b = i0.b;
            if(g0 == null) {
                C.f("Uploader", "Unknown backend for %s, deleting event batch for it...", i0);
                a0 = new r0.a(3, -1L);
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    arrayList0.add(((x0.b)object0).c);
                }
                if(arr_b != null) {
                    Objects.requireNonNull(this.i);
                    t0.a a1 = (t0.a)h1.f(new J(this.i, 6));
                    C1.d d0 = new C1.d();  // 初始化器: Ljava/lang/Object;-><init>()V
                    d0.n = new HashMap();
                    d0.l = this.g.d();
                    d0.m = this.h.d();
                    d0.i = "GDT_CLIENT_METRICS";
                    n0.b b0 = new n0.b("proto");
                    a1.getClass();
                    n.a.getClass();
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    try {
                        n.a.i(a1, byteArrayOutputStream0);
                    }
                    catch(IOException unused_ex) {
                    }
                    d0.k = new l(b0, byteArrayOutputStream0.toByteArray());
                    arrayList0.add(((o0.b)g0).a(d0.o()));
                }
                o0.b b1 = (o0.b)g0;
                HashMap hashMap0 = new HashMap();
                for(Object object1: arrayList0) {
                    q0.h h2 = (q0.h)object1;
                    String s = h2.a;
                    if(hashMap0.containsKey(s)) {
                        ((List)hashMap0.get(s)).add(h2);
                    }
                    else {
                        ArrayList arrayList1 = new ArrayList();
                        arrayList1.add(h2);
                        hashMap0.put(s, arrayList1);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: hashMap0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object2;
                    q0.h h3 = (q0.h)((List)map$Entry0.getValue()).get(0);
                    long v2 = b1.f.d();
                    long v3 = b1.e.d();
                    Integer integer0 = h3.b("sdk-version");
                    String s1 = h3.a("model");
                    String s2 = h3.a("hardware");
                    String s3 = h3.a("device");
                    String s4 = h3.a("product");
                    String s5 = h3.a("os-uild");
                    String s6 = h3.a("manufacturer");
                    String s7 = h3.a("fingerprint");
                    String s8 = h3.a("country");
                    p0.j j0 = new p0.j(new p0.h(integer0, s1, s2, s3, s4, s5, s6, s7, h3.a("locale"), s8, h3.a("mcc_mnc"), h3.a("application_build")));
                    try {
                        integer1 = Integer.parseInt(((String)map$Entry0.getKey()));
                        s9 = null;
                    }
                    catch(NumberFormatException unused_ex) {
                        s9 = (String)map$Entry0.getKey();
                        integer1 = null;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object3: ((List)map$Entry0.getValue())) {
                        q0.h h4 = (q0.h)object3;
                        n0.b b2 = h4.c.a;
                        boolean z = b2.equals(new n0.b("proto"));
                        byte[] arr_b1 = h4.c.b;
                        if(z) {
                            l00 = new L0();
                            l00.m = arr_b1;
                        }
                        else if(b2.equals(new n0.b("json"))) {
                            String s10 = new String(arr_b1, Charset.forName("UTF-8"));
                            L0 l01 = new L0();
                            l01.n = s10;
                            l00 = l01;
                        }
                        else {
                            goto label_108;
                        }
                        l00.j = h4.d;
                        l00.l = h4.e;
                        String s11 = (String)h4.f.get("tz-offset");
                        l00.o = (long)(s11 == null ? 0L : ((long)Long.valueOf(s11)));
                        int v4 = h4.b("net-type");
                        u u0 = (u)u.i.get(v4);
                        int v5 = h4.b("mobile-subtype");
                        l00.p = new p0.n(u0, ((t)t.i.get(v5)));
                        Integer integer2 = h4.b;
                        if(integer2 != null) {
                            l00.k = integer2;
                        }
                        String s12 = ((Long)l00.j) == null ? " eventTimeMs" : "";
                        if(((Long)l00.l) == null) {
                            s12 = s12 + " eventUptimeMs";
                        }
                        if(((Long)l00.o) == null) {
                            s12 = e.b(s12, " timezoneOffsetSeconds");
                        }
                        if(s12.isEmpty()) {
                            arrayList3.add(new k(((long)(((Long)l00.j))), ((Integer)l00.k), ((long)(((Long)l00.l))), ((byte[])l00.m), ((String)l00.n), ((long)(((Long)l00.o))), ((p0.n)l00.p)));
                        }
                        else {
                            throw new IllegalStateException("Missing required properties:" + s12);
                        label_108:
                            if(Log.isLoggable("TRuntime.CctTransportBackend", 5)) {
                                Log.w("TRuntime.CctTransportBackend", "Received event of unsupported encoding " + b2 + ". Skipping...");
                            }
                        }
                    }
                    arrayList2.add(new p0.l(v2, v3, j0, integer1, s9, arrayList3));
                }
                p0.i i1 = new p0.i(arrayList2);
                URL uRL0 = b1.d;
                if(arr_b == null) {
                    s13 = null;
                }
                else {
                    try {
                        o0.a a2 = o0.a.a(arr_b);
                        s13 = a2.b == null ? null : a2.b;
                        String s14 = a2.a;
                        if(s14 != null) {
                            uRL0 = o0.b.b(s14);
                        }
                    }
                    catch(IllegalArgumentException unused_ex) {
                        a0 = new r0.a(3, -1L);
                        goto label_154;
                    }
                }
                try {
                    B1.a a3 = new B1.a(uRL0, i1, s13, 26);
                    J j1 = new J(b1, 1);
                    for(int v6 = 5; true; --v6) {
                        zb zb0 = j1.d(a3);
                        URL uRL1 = (URL)zb0.c;
                        if(uRL1 == null) {
                            a3 = null;
                        }
                        else {
                            C.f("CctTransportBackend", "Following redirect to: %s", uRL1);
                            a3 = new B1.a(uRL1, ((p0.i)a3.l), ((String)a3.j), 26);
                        }
                        if(a3 == null || v6 - 1 < 1) {
                            int v7 = zb0.a;
                            if(v7 == 200) {
                                a0 = new r0.a(1, zb0.b);
                            }
                            else if(v7 >= 500 || v7 == 404) {
                                a0 = new r0.a(2, -1L);
                            }
                            else if(v7 == 400) {
                                a0 = new r0.a(4, -1L);
                            }
                            else {
                                a0 = new r0.a(3, -1L);
                            }
                            break;
                        }
                    }
                }
                catch(IOException iOException0) {
                    C.i("CctTransportBackend", "Could not make request to the backend", iOException0);
                    a0 = new r0.a(2, -1L);
                }
            }
        label_154:
            int v8 = a0.a;
            if(v8 == 2) {
                h1.f(new w0.i(this, iterable0, i0, v1));
                this.d.a(i0, v + 1, true);
                return;
            }
            h1.f(new D1.b(5, this, iterable0));
            if(v8 == 1) {
                v1 = Math.max(v1, a0.b);
                if(arr_b == null) {
                    continue;
                }
                h1.f(new J(this, 8));
            }
            else if(v8 == 4) {
                HashMap hashMap1 = new HashMap();
                for(Object object4: iterable0) {
                    String s15 = ((x0.b)object4).c.a;
                    if(hashMap1.containsKey(s15)) {
                        hashMap1.put(s15, ((int)(((int)(((Integer)hashMap1.get(s15)))) + 1)));
                    }
                    else {
                        hashMap1.put(s15, 1);
                    }
                }
                h1.f(new D1.b(6, this, hashMap1));
            }
        }
        h1.f(new u1.a(v1, this, i0));
    }
}

