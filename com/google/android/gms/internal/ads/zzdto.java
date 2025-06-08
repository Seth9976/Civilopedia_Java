package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzb;
import java.util.concurrent.Executor;

public final class zzdto {
    public final zzdbr a;
    public final zzdje b;
    public final zzdda c;
    public final zzddn d;
    public final zzddz e;
    public final zzdgm f;
    public final Executor g;
    public final zzdjb h;
    public final zzcud i;
    public final zzb j;
    public final zzccj k;
    public final zzaoc l;
    public final zzdgd m;
    public final zzees n;
    public final zzfii o;
    public final zzdwh p;
    public final zzfgp q;

    public zzdto(zzdbr zzdbr0, zzdda zzdda0, zzddn zzddn0, zzddz zzddz0, zzdgm zzdgm0, Executor executor0, zzdjb zzdjb0, zzcud zzcud0, zzb zzb0, zzccj zzccj0, zzaoc zzaoc0, zzdgd zzdgd0, zzees zzees0, zzfii zzfii0, zzdwh zzdwh0, zzfgp zzfgp0, zzdje zzdje0) {
        this.a = zzdbr0;
        this.c = zzdda0;
        this.d = zzddn0;
        this.e = zzddz0;
        this.f = zzdgm0;
        this.g = executor0;
        this.h = zzdjb0;
        this.i = zzcud0;
        this.j = zzb0;
        this.k = zzccj0;
        this.l = zzaoc0;
        this.m = zzdgd0;
        this.n = zzees0;
        this.o = zzfii0;
        this.p = zzdwh0;
        this.q = zzfgp0;
        this.b = zzdje0;
    }

    public final void zzi(zzcli zzcli0, boolean z, zzbop zzbop0) {
        zzcmv zzcmv0 = zzcli0.zzP();
        new zzdtf(this);
        new zzdtg(this);
        new zzdth(this);
        new E9(this, 20);
        zzcmv0.zzL(null, this.d, this.e, null, null, z, zzbop0, this.j, null, this.k, this.n, this.o, this.p, this.q, null, this.b);
        zzcli0.setOnTouchListener(new zzdti(this));
        zzcli0.setOnClickListener(new zzdtj(this));
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcf)).booleanValue()) {
            zzany zzany0 = this.l.zzc();
            if(zzany0 != null) {
                zzany0.zzn(((View)zzcli0));
            }
        }
        this.h.zzj(zzcli0, this.g);
        zzdtk zzdtk0 = new zzdtk(zzcli0);
        this.h.zzj(zzdtk0, this.g);
        this.h.zza(((View)zzcli0));
        zzcli0.zzaf("/trackActiveViewUnit", new zzdtl(this, zzcli0));
        this.i.zzi(zzcli0);
    }

    public static final zzfvl zzj(zzcli zzcli0, String s, String s1) {
        zzfvl zzfvl0 = new zzcga();
        zzcli0.zzP().zzz(new zzdtm(((zzcga)zzfvl0)));
        zzcli0.zzad(s, s1, null);
        return zzfvl0;
    }
}

