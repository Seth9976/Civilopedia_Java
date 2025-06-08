package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

public final class zzbdi {
    public zzbcx a;
    public boolean b;
    public final Object c;

    public zzbdi(Context context0) {
        this.c = new Object();
    }

    public static void a(zzbdi zzbdi0) {
        synchronized(zzbdi0.c) {
            zzbcx zzbcx0 = zzbdi0.a;
            if(zzbcx0 == null) {
                return;
            }
            zzbcx0.disconnect();
            zzbdi0.a = null;
            Binder.flushPendingCommands();
        }
    }
}

