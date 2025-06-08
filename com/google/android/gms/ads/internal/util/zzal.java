package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzdzb;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzal implements DialogInterface.OnClickListener {
    public final zzas zza;
    public final AtomicInteger zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzal(zzas zzas0, AtomicInteger atomicInteger0, int v, int v1, int v2) {
        this.zza = zzas0;
        this.zzb = atomicInteger0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        zzas zzas0 = this.zza;
        AtomicInteger atomicInteger0 = this.zzb;
        int v1 = this.zzd;
        int v2 = this.zze;
        zzas0.getClass();
        if(atomicInteger0.get() != this.zzc) {
            int v3 = atomicInteger0.get();
            zzdzb zzdzb0 = zzas0.b;
            if(v3 == v1) {
                zzdzb0.zzj(zzdyx.zzb);
            }
            else if(atomicInteger0.get() == v2) {
                zzdzb0.zzj(zzdyx.zzc);
            }
            else {
                zzdzb0.zzj(zzdyx.zza);
            }
        }
        zzas0.zzr();
    }
}

