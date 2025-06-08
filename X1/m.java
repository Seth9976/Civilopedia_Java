package x1;

import B.c;
import B.f;
import C1.d;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import f0.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import l.L0;
import z1.I;
import z1.J;
import z1.L;
import z1.N;
import z1.d0;
import z1.r0;

public final class m {
    public final Context a;
    public final q b;
    public final L0 c;
    public final c d;
    public static final HashMap e;
    public static final String f;

    static {
        HashMap hashMap0 = new HashMap();
        m.e = hashMap0;
        hashMap0.put("armeabi", 5);
        hashMap0.put("armeabi-v7a", 6);
        hashMap0.put("arm64-v8a", 9);
        hashMap0.put("x86", 0);
        hashMap0.put("x86_64", 1);
        m.f = "Crashlytics Android SDK/18.2.12";
    }

    public m(Context context0, q q0, L0 l00, c c0) {
        this.a = context0;
        this.b = q0;
        this.c = l00;
        this.d = c0;
    }

    public final r0 a() {
        L0 l00 = this.c;
        String s = (String)l00.m;
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        return new r0(Arrays.asList(new d0[]{new I(0L, s, ((String)l00.k), 0L)}));
    }

    public final N b(int v) {
        Float float0;
        boolean z1;
        boolean z;
        Double double0;
        int v1;
        Context context0;
        try {
            context0 = this.a;
            v1 = 2;
            double0 = null;
            z = false;
            Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if(intent0 == null) {
                float0 = null;
                z1 = false;
            }
            else {
                int v2 = intent0.getIntExtra("status", -1);
                if(v2 == -1) {
                    z1 = false;
                }
                else if(v2 == 2 || v2 == 5) {
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                try {
                    int v3 = intent0.getIntExtra("level", -1);
                    int v4 = intent0.getIntExtra("scale", -1);
                    float0 = v3 == -1 || v4 == -1 ? null : ((float)(((float)v3) / ((float)v4)));
                    goto label_30;
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_28;
                }
                float0 = null;
            }
            goto label_30;
        }
        catch(IllegalStateException illegalStateException0) {
            z1 = false;
        }
    label_28:
        Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", illegalStateException0);
        float0 = null;
    label_30:
        if(float0 != null) {
            double0 = float0.doubleValue();
        }
        if(!z1 || float0 == null) {
            v1 = 1;
        }
        else if(((double)(((float)float0))) >= 0.99) {
            v1 = 3;
        }
        if(!e.h() && ((SensorManager)context0.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long v5 = e.f();
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        ((ActivityManager)context0.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo0);
        long v6 = v5 - activityManager$MemoryInfo0.availMem;
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v7 = (long)statFs0.getBlockSize();
        long v8 = ((long)statFs0.getBlockCount()) * v7 - v7 * ((long)statFs0.getAvailableBlocks());
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d0.i = double0;
        d0.j = v1;
        d0.k = Boolean.valueOf(z);
        d0.l = v;
        d0.m = v6;
        d0.n = v8;
        return d0.p();
    }

    public static J c(g g0, int v) {
        int v2;
        String s = (String)g0.k;
        int v1 = 0;
        StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])g0.l;
        if(arr_stackTraceElement == null) {
            arr_stackTraceElement = new StackTraceElement[0];
        }
        g g1 = (g)g0.m;
        if(v >= 8) {
            for(g g2 = g1; g2 != null; g2 = (g)g2.m) {
                ++v1;
            }
            v2 = v1;
        }
        else {
            v2 = 0;
        }
        if(s == null) {
            throw new NullPointerException("Null type");
        }
        r0 r00 = new r0(m.d(arr_stackTraceElement, 4));
        J j0 = g1 == null || v2 != 0 ? null : m.c(g1, v + 1);
        return new J(s, ((String)g0.j), r00, j0, v2);
    }

    public static r0 d(StackTraceElement[] arr_stackTraceElement, int v) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            f f0 = new f(13);
            f0.n = v;
            long v2 = 0L;
            long v3 = stackTraceElement0.isNativeMethod() ? Math.max(stackTraceElement0.getLineNumber(), 0L) : 0L;
            String s = stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName();
            String s1 = stackTraceElement0.getFileName();
            if(!stackTraceElement0.isNativeMethod() && stackTraceElement0.getLineNumber() > 0) {
                v2 = (long)stackTraceElement0.getLineNumber();
            }
            f0.l = v3;
            if(s == null) {
                throw new NullPointerException("Null symbol");
            }
            f0.j = s;
            f0.k = s1;
            f0.m = v2;
            arrayList0.add(f0.d());
        }
        return new r0(arrayList0);
    }

    public static L e(Thread thread0, StackTraceElement[] arr_stackTraceElement, int v) {
        String s = thread0.getName();
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        return new L(s, v, new r0(m.d(arr_stackTraceElement, v)));
    }
}

