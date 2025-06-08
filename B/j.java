package B;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.f;
import p.k;
import x.d;

public abstract class j {
    public static final f a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final k d;

    static {
        j.a = new f(16);
        n n0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), n0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        j.b = threadPoolExecutor0;
        j.c = new Object();
        j.d = new k();
    }

    public static i a(String s, Context context0, B.f f0, int v) {
        B.k k0;
        f f1 = j.a;
        Typeface typeface0 = (Typeface)f1.get(s);
        if(typeface0 != null) {
            return new i(typeface0);
        }
        try {
            k0 = e.a(context0, f0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return new i(-1);
        }
        int v1 = 1;
        l[] arr_l = (l[])k0.j;
        switch(k0.i) {
            case 0: {
                if(arr_l != null && arr_l.length != 0) {
                    v1 = 0;
                    for(int v2 = 0; v2 < arr_l.length; ++v2) {
                        int v3 = arr_l[v2].e;
                        if(v3 != 0) {
                            if(v3 >= 0) {
                                v1 = v3;
                                break;
                            }
                            v1 = -3;
                            break;
                        }
                    }
                }
                break;
            }
            case 1: {
                v1 = -2;
                break;
            }
            default: {
                v1 = -3;
            }
        }
        if(v1 != 0) {
            return new i(v1);
        }
        Typeface typeface1 = d.a.g(context0, arr_l, v);
        if(typeface1 != null) {
            f1.put(s, typeface1);
            return new i(typeface1);
        }
        return new i(-3);
    }
}

