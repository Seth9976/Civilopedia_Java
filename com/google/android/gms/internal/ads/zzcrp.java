package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzcrp extends zzcl {
    public final Context i;
    public final zzcfo j;
    public final zzduc k;
    public final zzeff l;
    public final zzele m;
    public final zzdyj n;
    public final zzcdn o;
    public final zzduh p;
    public final zzdzb q;
    public final zzbki r;
    public final zzfhu s;
    public final zzfcw t;
    public boolean u;

    public zzcrp(Context context0, zzcfo zzcfo0, zzduc zzduc0, zzeff zzeff0, zzele zzele0, zzdyj zzdyj0, zzcdn zzcdn0, zzduh zzduh0, zzdzb zzdzb0, zzbki zzbki0, zzfhu zzfhu0, zzfcw zzfcw0) {
        this.i = context0;
        this.j = zzcfo0;
        this.k = zzduc0;
        this.l = zzeff0;
        this.m = zzele0;
        this.n = zzdyj0;
        this.o = zzcdn0;
        this.p = zzduh0;
        this.q = zzdzb0;
        this.r = zzbki0;
        this.s = zzfhu0;
        this.t = zzfcw0;
        this.u = false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() {
        synchronized(this) {
            return zzt.zzr().zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.j.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return this.n.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String s) {
        this.m.zzf(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.n.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() {
        synchronized(this) {
            if(this.u) {
                zzcfi.zzj("Mobile ads is initialized already.");
                return;
            }
            zzbhz.zzc(this.i);
            zzt.zzo().zzr(this.i, this.j);
            zzt.zzc().zzi(this.i);
            this.u = true;
            this.n.zzr();
            this.m.zzd();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzdb)).booleanValue()) {
                this.p.zzc();
            }
            this.q.zzf();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                zzcrl zzcrl0 = new zzcrl(this);
                zzcfv.zza.execute(zzcrl0);
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzio)).booleanValue()) {
                zzcrk zzcrk0 = new zzcrk(this);
                zzcfv.zza.execute(zzcrk0);
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzco)).booleanValue()) {
                zzcrm zzcrm0 = new zzcrm(this);
                zzcfv.zza.execute(zzcrm0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String s, IObjectWrapper iObjectWrapper0) {
        zzcrn zzcrn0;
        zzbhz.zzc(this.i);
        String s1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzdd)).booleanValue() ? zzs.zzo(this.i) : "";
        int v = 1;
        String s2 = TextUtils.isEmpty(s1) ? s : s1;
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzda)).booleanValue();
        boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzaK)).booleanValue();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaK)).booleanValue()) {
            zzcrn0 = new zzcrn(this, ((Runnable)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
        else {
            zzcrn0 = null;
            v = z | z1;
        }
        if(v != 0) {
            zzt.zza().zza(this.i, this.j, s2, zzcrn0, this.s);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcy0) throws RemoteException {
        this.q.zzg(zzcy0, zzdza.zzb);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper0, String s) {
        if(iObjectWrapper0 == null) {
            zzcfi.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        if(context0 == null) {
            zzcfi.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzas zzas0 = new zzas(context0);
        zzas0.zzn(s);
        zzas0.zzo(this.j.zza);
        zzas0.zzr();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbua0) throws RemoteException {
        this.t.zze(zzbua0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) {
        synchronized(this) {
            zzt.zzr().zzc(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f) {
        synchronized(this) {
            zzt.zzr().zzd(f);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String s) {
        synchronized(this) {
            zzbhz.zzc(this.i);
            if(!TextUtils.isEmpty(s) && ((Boolean)zzay.zzc().zzb(zzbhz.zzda)).booleanValue()) {
                zzt.zza().zza(this.i, this.j, s, null, this.s);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqn0) throws RemoteException {
        this.n.zzs(zzbqn0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzez0) throws RemoteException {
        this.o.zzq(this.i, zzez0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() {
        synchronized(this) {
            return zzt.zzr().zze();
        }
    }
}

