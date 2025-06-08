package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzflf {
    public final Context a;
    public final Looper b;

    public zzflf(Context context0, Looper looper0) {
        this.a = context0;
        this.b = looper0;
    }

    public final void zza(String s) {
        zzflt zzflt0 = zzflv.zza();
        zzflt0.zza("com.spears.civilopedia");
        zzflt0.zzc(2);
        zzflq zzflq0 = zzflr.zza();
        zzflq0.zza(s);
        zzflq0.zzb(2);
        zzflt0.zzb(zzflq0);
        zzflv zzflv0 = (zzflv)zzflt0.zzal();
        t6 t60 = new t6(this.a, this.b, zzflv0);
        synchronized(t60.k) {
            if(!t60.l) {
                t60.l = true;
                t60.i.checkAvailabilityAndConnect();
            }
        }
    }
}

