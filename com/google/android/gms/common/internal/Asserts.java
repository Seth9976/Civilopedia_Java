package com.google.android.gms.common.internal;

import A.f;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@KeepForSdk
public final class Asserts {
    @KeepForSdk
    public static void checkMainThread(String s) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", f.k("checkMainThread: current thread ", "Thread[dexdec-sb-st-6,5,dexdec-sb-grp]", " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(s);
    }

    @KeepForSdk
    public static void checkNotMainThread(String s) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", f.k("checkNotMainThread: current thread ", "Thread[dexdec-sb-st-1,5,dexdec-sb-grp]", " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(s);
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static void checkNotNull(@Nullable Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    @EnsuresNonNull({"#1"})
    public static void checkNotNull(@Nullable Object object0, Object object1) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.valueOf(object1));
        }
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object object0) {
        if(object0 != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(@Nullable Object object0, Object object1) {
        if(object0 != null) {
            throw new IllegalArgumentException(String.valueOf(object1));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkState(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }
}

