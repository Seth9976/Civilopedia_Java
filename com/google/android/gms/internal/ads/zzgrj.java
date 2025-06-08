package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import o.b;
import o.d;

public final class zzgrj extends d {
    public final WeakReference j;

    public zzgrj(zzbix zzbix0, byte[] arr_b) {
        this.j = new WeakReference(zzbix0);
    }

    @Override  // o.d
    public final void onCustomTabsServiceConnected(ComponentName componentName0, b b0) {
        zzbix zzbix0 = (zzbix)this.j.get();
        if(zzbix0 != null) {
            zzbix0.zzc(b0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        zzbix zzbix0 = (zzbix)this.j.get();
        if(zzbix0 != null) {
            zzbix0.zzd();
        }
    }
}

