package x;

import B.a;
import B.c;
import B.j;
import B.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;
import l.L;
import m0.B;
import o2.G;
import p.f;
import p.k;
import w.b;

public abstract class d {
    public static final G a;
    public static final f b;

    static {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            d.a = new i(8);  // 初始化器: Lo2/G;-><init>(I)V
        }
        else if(v >= 28) {
            d.a = new h();  // 初始化器: Lx/g;-><init>()V
        }
        else if(v >= 26) {
            d.a = new g();
        }
        else if(v >= 24) {
            Method method0 = x.f.e;
            if(method0 == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            d.a = method0 == null ? new e(8) : new x.f(8);  // 初始化器: Lo2/G;-><init>(I)V / 初始化器: Lo2/G;-><init>(I)V
        }
        else {
            d.a = new e(8);  // 初始化器: Lo2/G;-><init>(I)V
        }
        d.b = new f(16);
    }

    public static Typeface a(Context context0, b b0, Resources resources0, int v, int v1, L l0) {
        Object object0;
        Typeface typeface2;
        Typeface typeface1;
        Typeface typeface0;
        if(b0 instanceof w.e) {
            String s = ((w.e)b0).d;
            typeface0 = null;
            if(s == null || s.isEmpty()) {
                typeface1 = null;
            }
            else {
                typeface1 = Typeface.create(s, 0);
                if(typeface1 == null || typeface1.equals(Typeface.create(Typeface.DEFAULT, 0))) {
                    typeface1 = null;
                }
            }
            if(typeface1 != null) {
                new Handler(Looper.getMainLooper()).post(new B(l0, typeface1, 4, false));
                return typeface1;
            }
            int v2 = ((w.e)b0).b;
            Handler handler0 = new Handler(Looper.getMainLooper());
            k.d d0 = new k.d(13, false);
            d0.j = l0;
            B.f f0 = ((w.e)b0).a;
            c c0 = new c(0, d0, handler0);
            if(((w.e)b0).c == 0) {
                String s1 = ((String)f0.m) + "-" + v1;
                typeface2 = (Typeface)j.a.get(s1);
                if(typeface2 != null) {
                    handler0.post(new a(0, d0, typeface2));
                    typeface0 = typeface2;
                }
                else if(v2 == -1) {
                    B.i i0 = j.a(s1, context0, f0, v1);
                    c0.D(i0);
                    typeface0 = i0.a;
                }
                else {
                    B.g g0 = new B.g(s1, context0, f0, v1, 0);
                    try {
                        Future future0 = j.b.submit(g0);
                        try {
                            object0 = future0.get(((long)v2), TimeUnit.MILLISECONDS);
                        }
                        catch(ExecutionException executionException0) {
                            throw new RuntimeException(executionException0);
                        }
                        catch(InterruptedException interruptedException0) {
                            throw interruptedException0;
                        }
                        catch(TimeoutException unused_ex) {
                            throw new InterruptedException("timeout");
                        }
                        c0.D(((B.i)object0));
                        typeface0 = ((B.i)object0).a;
                    }
                    catch(InterruptedException unused_ex) {
                        B.b b1 = new B.b(((k.d)c0.j), -3);
                        ((Handler)c0.k).post(b1);
                    }
                }
            }
            else {
                String s2 = ((String)f0.m) + "-" + v1;
                typeface2 = (Typeface)j.a.get(s2);
                if(typeface2 == null) {
                    B.h h0 = new B.h(c0, 0);
                    Object object1 = j.c;
                    __monitor_enter(object1);
                    int v3 = FIN.finallyOpen$NT();
                    k k0 = j.d;
                    ArrayList arrayList0 = (ArrayList)k0.getOrDefault(s2, null);
                    if(arrayList0 == null) {
                        ArrayList arrayList1 = new ArrayList();
                        arrayList1.add(h0);
                        k0.put(s2, arrayList1);
                        FIN.finallyCodeBegin$NT(v3);
                        __monitor_exit(object1);
                        FIN.finallyCodeEnd$NT(v3);
                        B.g g1 = new B.g(s2, context0, f0, v1, 1);
                        B.h h1 = new B.h(s2, 1);
                        Handler handler1 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                        o o0 = new o(0);
                        o0.j = g1;
                        o0.k = h1;
                        o0.l = handler1;
                        j.b.execute(o0);
                    }
                    else {
                        arrayList0.add(h0);
                        FIN.finallyExec$NT(v3);
                    }
                }
                else {
                    handler0.post(new a(0, d0, typeface2));
                    typeface0 = typeface2;
                }
            }
        }
        else {
            typeface0 = d.a.f(context0, ((w.c)b0), resources0, v1);
            if(typeface0 == null) {
                l0.a();
            }
            else {
                new Handler(Looper.getMainLooper()).post(new B(l0, typeface0, 4, false));
            }
        }
        if(typeface0 != null) {
            String s3 = d.b(resources0, v, v1);
            d.b.put(s3, typeface0);
        }
        return typeface0;
    }

    public static String b(Resources resources0, int v, int v1) {
        return resources0.getResourcePackageName(v) + "-" + v + "-" + v1;
    }
}

