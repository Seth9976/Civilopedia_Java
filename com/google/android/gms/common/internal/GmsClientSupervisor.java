package com.google.android.gms.common.internal;

import P0.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClientSupervisor {
    public static final Object a = null;
    public static i b = null;
    public static HandlerThread c = null;
    public static Executor d = null;
    public static boolean e = false;

    static {
        GmsClientSupervisor.a = new Object();
    }

    public abstract void a(zzo arg1, ServiceConnection arg2);

    public abstract boolean b(zzo arg1, ServiceConnection arg2, String arg3, Executor arg4);

    @KeepForSdk
    public boolean bindService(ComponentName componentName0, ServiceConnection serviceConnection0, String s) {
        return this.b(new zzo(componentName0, 0x1081), serviceConnection0, s, null);
    }

    @KeepForSdk
    public boolean bindService(ComponentName componentName0, ServiceConnection serviceConnection0, String s, Executor executor0) {
        return this.b(new zzo(componentName0, 0x1081), serviceConnection0, s, executor0);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public boolean bindService(String s, ServiceConnection serviceConnection0, String s1) {
        return this.b(new zzo(s, 0x1081, false), serviceConnection0, s1, null);
    }

    @KeepForSdk
    public static int getDefaultBindFlags() [...] // Inlined contents

    @KeepForSdk
    public static GmsClientSupervisor getInstance(Context context0) {
        synchronized(GmsClientSupervisor.a) {
            if(GmsClientSupervisor.b == null) {
                GmsClientSupervisor.b = new i(context0.getApplicationContext(), (GmsClientSupervisor.e ? GmsClientSupervisor.getOrStartHandlerThread().getLooper() : context0.getMainLooper()), GmsClientSupervisor.d);
            }
            return GmsClientSupervisor.b;
        }
    }

    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized(GmsClientSupervisor.a) {
            HandlerThread handlerThread0 = GmsClientSupervisor.c;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", 9);
            GmsClientSupervisor.c = handlerThread1;
            handlerThread1.start();
            return GmsClientSupervisor.c;
        }
    }

    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int v) {
        synchronized(GmsClientSupervisor.a) {
            HandlerThread handlerThread0 = GmsClientSupervisor.c;
            if(handlerThread0 != null) {
                return handlerThread0;
            }
            HandlerThread handlerThread1 = new HandlerThread("GoogleApiHandler", v);
            GmsClientSupervisor.c = handlerThread1;
            handlerThread1.start();
            return GmsClientSupervisor.c;
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(Executor executor0) {
        synchronized(GmsClientSupervisor.a) {
            i i0 = GmsClientSupervisor.b;
            if(i0 != null) {
                i0.c(executor0);
            }
            GmsClientSupervisor.d = executor0;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized(GmsClientSupervisor.a) {
            i i0 = GmsClientSupervisor.b;
            if(i0 != null && !GmsClientSupervisor.e) {
                i0.d(GmsClientSupervisor.getOrStartHandlerThread().getLooper());
            }
            GmsClientSupervisor.e = true;
        }
    }

    @KeepForSdk
    public void unbindService(ComponentName componentName0, ServiceConnection serviceConnection0, String s) {
        this.a(new zzo(componentName0, 0x1081), serviceConnection0);
    }

    @KeepForSdk
    public void unbindService(String s, ServiceConnection serviceConnection0, String s1) {
        this.a(new zzo(s, 0x1081, false), serviceConnection0);
    }

    public final void zzb(String s, String s1, int v, ServiceConnection serviceConnection0, String s2, boolean z) {
        this.a(new zzo(s, s1, 0x1081, z), serviceConnection0);
    }
}

