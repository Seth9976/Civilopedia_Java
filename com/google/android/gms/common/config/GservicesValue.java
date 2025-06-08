package com.google.android.gms.common.config;

import N0.a;
import android.os.Binder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
public abstract class GservicesValue {
    public final Object a;
    public Object b;
    public static final Object c;

    static {
        GservicesValue.c = new Object();
    }

    public GservicesValue(Object object0, String s) {
        this.b = null;
        this.a = object0;
    }

    public abstract Object a();

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public final Object get() {
        Object object0 = this.b;
        if(object0 != null) {
            return object0;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            try {
                this.a();
                throw null;
            }
            catch(SecurityException unused_ex) {
                long v = Binder.clearCallingIdentity();
                try {
                    this.a();
                    throw null;
                }
                catch(Throwable throwable1) {
                    Binder.restoreCallingIdentity(v);
                    throw throwable1;
                }
            }
        }
        catch(Throwable throwable0) {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            throw throwable0;
        }
    }

    @KeepForSdk
    @InlineMe(replacement = "this.get()")
    @Deprecated
    public final Object getBinderSafe() {
        return this.get();
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public static boolean isInitialized() {
        synchronized(GservicesValue.c) {
        }
        return false;
    }

    @KeepForSdk
    public void override(Object object0) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.b = object0;
        synchronized(GservicesValue.c) {
        }
    }

    @KeepForSdk
    public void resetOverride() {
        this.b = null;
    }

    @KeepForSdk
    public static GservicesValue value(String s, Float float0) {
        return new a(3, float0, s);
    }

    @KeepForSdk
    public static GservicesValue value(String s, Integer integer0) {
        return new a(2, integer0, s);
    }

    @KeepForSdk
    public static GservicesValue value(String s, Long long0) {
        return new a(1, long0, s);
    }

    @KeepForSdk
    public static GservicesValue value(String s, String s1) {
        return new a(4, s1, s);
    }

    @KeepForSdk
    public static GservicesValue value(String s, boolean z) {
        return new a(0, Boolean.valueOf(z), s);
    }
}

