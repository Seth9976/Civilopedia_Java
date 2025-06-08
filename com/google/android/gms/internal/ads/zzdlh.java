package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import p.b;

public final class zzdlh implements zzo, zzddh {
    public final Context i;
    public final zzcli j;
    public final zzfbl k;
    public final zzcfo l;
    public final zzbdw m;
    public IObjectWrapper n;

    public zzdlh(Context context0, zzcli zzcli0, zzfbl zzfbl0, zzcfo zzcfo0, zzbdw zzbdw0) {
        this.i = context0;
        this.j = zzcli0;
        this.k = zzfbl0;
        this.l = zzcfo0;
        this.m = zzbdw0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if(this.n != null) {
            zzcli zzcli0 = this.j;
            if(zzcli0 != null) {
                zzcli0.zzd("onSdkImpression", new b());  // 初始化器: Lp/k;-><init>()V
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        this.n = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzbxr zzbxr0;
        zzbxq zzbxq0;
        if(this.m == zzbdw.zzh || this.m == zzbdw.zzd || this.m == zzbdw.zzk) {
            zzfbl zzfbl0 = this.k;
            if(zzfbl0.zzU) {
                zzcli zzcli0 = this.j;
                if(zzcli0 != null && zzt.zzh().zze(this.i)) {
                    String s = this.l.zzb + "." + this.l.zzc;
                    String s1 = zzfbl0.zzW.zza();
                    if(zzfbl0.zzW.zzb() == 1) {
                        zzbxq0 = zzbxq.zzc;
                        zzbxr0 = zzbxr.zzb;
                    }
                    else {
                        zzbxr0 = zzfbl0.zzZ == 2 ? zzbxr.zzd : zzbxr.zza;
                        zzbxq0 = zzbxq.zza;
                    }
                    IObjectWrapper iObjectWrapper0 = zzt.zzh().zza(s, zzcli0.zzI(), "", "javascript", s1, zzbxr0, zzbxq0, zzfbl0.zzan);
                    this.n = iObjectWrapper0;
                    if(iObjectWrapper0 != null) {
                        zzt.zzh().zzc(this.n, ((View)zzcli0));
                        zzcli0.zzar(this.n);
                        zzt.zzh().zzd(this.n);
                        zzcli0.zzd("onSdkLoaded", new b());  // 初始化器: Lp/k;-><init>()V
                    }
                }
            }
        }
    }
}

