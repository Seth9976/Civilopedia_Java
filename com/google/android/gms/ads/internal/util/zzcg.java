package com.google.android.gms.ads.internal.util;

import F0.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import java.util.WeakHashMap;

public final class zzcg {
    public final g a;
    public final WeakHashMap b;
    public boolean c;
    public boolean d;
    public Context e;

    public zzcg() {
        this.c = false;
        this.b = new WeakHashMap();
        this.a = new g(this, 0);
    }

    public final void zzb(Context context0) {
        synchronized(this) {
            if(this.c) {
                return;
            }
            Context context1 = context0.getApplicationContext();
            this.e = context1;
            if(context1 == null) {
                this.e = context0;
            }
            zzbhz.zzc(this.e);
            this.d = ((Boolean)zzay.zzc().zzb(zzbhz.zzcS)).booleanValue();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            this.e.registerReceiver(this.a, intentFilter0);
            this.c = true;
        }
    }

    public final void zzc(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        synchronized(this) {
            if(this.d) {
                this.b.put(broadcastReceiver0, intentFilter0);
                return;
            }
            context0.registerReceiver(broadcastReceiver0, intentFilter0);
        }
    }

    public final void zzd(Context context0, BroadcastReceiver broadcastReceiver0) {
        synchronized(this) {
            if(this.d) {
                this.b.remove(broadcastReceiver0);
                return;
            }
            context0.unregisterReceiver(broadcastReceiver0);
        }
    }
}

