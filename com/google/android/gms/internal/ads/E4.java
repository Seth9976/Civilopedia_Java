package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

public final class e4 extends zzcvv {
    public final Context i;
    public final View j;
    public final zzcli k;
    public final zzfbm l;
    public final zzcxv m;
    public final zzdns n;
    public final zzdji o;
    public final zzgqo p;
    public final Executor q;
    public zzq r;

    public e4(zzcxw zzcxw0, Context context0, zzfbm zzfbm0, View view0, zzcli zzcli0, zzcxv zzcxv0, zzdns zzdns0, zzdji zzdji0, zzgqo zzgqo0, Executor executor0) {
        super(zzcxw0);
        this.i = context0;
        this.j = view0;
        this.k = zzcli0;
        this.l = zzfbm0;
        this.m = zzcxv0;
        this.n = zzdns0;
        this.o = zzdji0;
        this.p = zzgqo0;
        this.q = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        zzcvx zzcvx0 = new zzcvx(this);
        this.q.execute(zzcvx0);
        super.zzW();
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final int zza() {
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !this.b.zzai || ((Boolean)zzay.zzc().zzb(zzbhz.zzgC)).booleanValue() ? this.a.zzb.zzb.zzc : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final View zzc() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzdk zzd() {
        try {
            return this.m.zza();
        }
        catch(zzfci unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zze() {
        zzq zzq0 = this.r;
        if(zzq0 != null) {
            return zzfch.zzc(zzq0);
        }
        zzfbl zzfbl0 = this.b;
        if(zzfbl0.zzad) {
            for(Object object0: zzfbl0.zza) {
                if(((String)object0) != null && ((String)object0).contains("FirstParty")) {
                    return zzfch.zzb(zzfbl0.zzs, this.l);
                }
                if(false) {
                    break;
                }
            }
            return new zzfbm(this.j.getWidth(), this.j.getHeight(), false);
        }
        return zzfch.zzb(zzfbl0.zzs, this.l);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final zzfbm zzf() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final void zzg() {
        this.o.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcvv
    public final void zzh(ViewGroup viewGroup0, zzq zzq0) {
        if(viewGroup0 != null) {
            zzcli zzcli0 = this.k;
            if(zzcli0 != null) {
                zzcli0.zzai(zzcmx.zzc(zzq0));
                viewGroup0.setMinimumHeight(zzq0.zzc);
                viewGroup0.setMinimumWidth(zzq0.zzf);
                this.r = zzq0;
            }
        }
    }
}

