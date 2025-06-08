package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.Executor;

public final class zzdqy {
    public final Executor a;
    public final zzcun b;
    public final zzdjb c;

    public zzdqy(Executor executor0, zzcun zzcun0, zzdjb zzdjb0) {
        this.a = executor0;
        this.c = zzdjb0;
        this.b = zzcun0;
    }

    public final void zza(zzcli zzcli0) {
        if(zzcli0 == null) {
            return;
        }
        View view0 = zzcli0.zzH();
        this.c.zza(view0);
        zzdqu zzdqu0 = new zzdqu(zzcli0);
        this.c.zzj(zzdqu0, this.a);
        zzdqv zzdqv0 = new zzdqv(zzcli0);
        this.c.zzj(zzdqv0, this.a);
        this.c.zzj(this.b, this.a);
        this.b.zzf(zzcli0);
        zzcli0.zzaf("/trackActiveViewUnit", new zzdqw(this));
        zzcli0.zzaf("/untrackActiveViewUnit", new zzdqx(this));
    }
}

