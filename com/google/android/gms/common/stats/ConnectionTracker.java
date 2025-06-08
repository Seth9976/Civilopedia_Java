package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@KeepForSdk
public class ConnectionTracker {
    public static final Object a;
    public static volatile ConnectionTracker b;
    public final ConcurrentHashMap zza;

    static {
        ConnectionTracker.a = new Object();
    }

    public ConnectionTracker() {
        this.zza = new ConcurrentHashMap();
    }

    public final boolean a(Context context0, String s, Intent intent0, ServiceConnection serviceConnection0, int v, Executor executor0) {
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 != null) {
            String s1 = componentName0.getPackageName();
            "com.google.android.gms".equals(s1);
            try {
                if((Wrappers.packageManager(context0).getApplicationInfo(s1, 0).flags & 0x200000) != 0) {
                    goto label_5;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            goto label_7;
        label_5:
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
    label_7:
        if(!(serviceConnection0 instanceof zzt)) {
            ServiceConnection serviceConnection1 = (ServiceConnection)this.zza.putIfAbsent(serviceConnection0, serviceConnection0);
            if(serviceConnection1 != null && serviceConnection0 != serviceConnection1) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection0, s, intent0.getAction()));
            }
            if(executor0 == null) {
                executor0 = null;
            }
            try {
                if(!(executor0 == null ? context0.bindService(intent0, serviceConnection0, v) : context0.bindService(intent0, v, executor0, serviceConnection0))) {
                    goto label_18;
                }
                return true;
            }
            catch(Throwable throwable0) {
                this.zza.remove(serviceConnection0, serviceConnection0);
                throw throwable0;
            }
        label_18:
            this.zza.remove(serviceConnection0, serviceConnection0);
            return false;
        }
        if(executor0 == null) {
            executor0 = null;
        }
        return executor0 == null ? context0.bindService(intent0, serviceConnection0, v) : context0.bindService(intent0, v, executor0, serviceConnection0);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public boolean bindService(Context context0, Intent intent0, ServiceConnection serviceConnection0, int v) {
        return this.a(context0, context0.getClass().getName(), intent0, serviceConnection0, v, null);
    }

    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if(ConnectionTracker.b == null) {
            Object object0 = ConnectionTracker.a;
            synchronized(object0) {
                if(ConnectionTracker.b == null) {
                    ConnectionTracker.b = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker0 = ConnectionTracker.b;
        Preconditions.checkNotNull(connectionTracker0);
        return connectionTracker0;
    }

    @KeepForSdk
    public void unbindService(Context context0, ServiceConnection serviceConnection0) {
        if(!(serviceConnection0 instanceof zzt) && this.zza.containsKey(serviceConnection0)) {
            try {
                ServiceConnection serviceConnection1 = (ServiceConnection)this.zza.get(serviceConnection0);
                try {
                    context0.unbindService(serviceConnection1);
                }
                catch(IllegalArgumentException | IllegalStateException | NoSuchElementException unused_ex) {
                }
            }
            finally {
                this.zza.remove(serviceConnection0);
            }
            return;
        }
        try {
            context0.unbindService(serviceConnection0);
        }
        catch(IllegalArgumentException | IllegalStateException | NoSuchElementException unused_ex) {
        }
    }

    @KeepForSdk
    public void unbindServiceSafe(Context context0, ServiceConnection serviceConnection0) {
        try {
            this.unbindService(context0, serviceConnection0);
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean zza(Context context0, String s, Intent intent0, ServiceConnection serviceConnection0, int v, @Nullable Executor executor0) {
        return this.a(context0, s, intent0, serviceConnection0, 0x1081, executor0);
    }
}

