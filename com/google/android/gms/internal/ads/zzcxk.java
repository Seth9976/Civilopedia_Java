package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import p.b;

public final class zzcxk implements zzdcn, zzddh {
    public final Context i;
    public final zzcli j;
    public final zzfbl k;
    public final zzcfo l;
    public IObjectWrapper m;
    public boolean n;

    public zzcxk(Context context0, zzcli zzcli0, zzfbl zzfbl0, zzcfo zzcfo0) {
        this.i = context0;
        this.j = zzcli0;
        this.k = zzfbl0;
        this.l = zzcfo0;
    }

    public final void a() {
        zzbxr zzbxr0;
        zzbxq zzbxq0;
        __monitor_enter(this);
        if(!this.k.zzU) {
            __monitor_exit(this);
            return;
        }
        if(this.j == null) {
            __monitor_exit(this);
            return;
        }
        try {
            if(zzt.zzh().zze(this.i)) {
                String s = this.l.zzb + "." + this.l.zzc;
                String s1 = this.k.zzW.zza();
                if(this.k.zzW.zzb() == 1) {
                    zzbxq0 = zzbxq.zzc;
                    zzbxr0 = zzbxr.zzb;
                }
                else {
                    zzbxq0 = zzbxq.zza;
                    zzbxr0 = this.k.zzf == 1 ? zzbxr.zzc : zzbxr.zza;
                }
                IObjectWrapper iObjectWrapper0 = zzt.zzh().zza(s, this.j.zzI(), "", "javascript", s1, zzbxr0, zzbxq0, this.k.zzan);
                this.m = iObjectWrapper0;
                zzcli zzcli0 = this.j;
                if(iObjectWrapper0 != null) {
                    zzt.zzh().zzc(this.m, ((View)zzcli0));
                    this.j.zzar(this.m);
                    zzt.zzh().zzd(this.m);
                    this.n = true;
                    b b0 = new b();  // 初始化器: Lp/k;-><init>()V
                    this.j.zzd("onSdkLoaded", b0);
                    goto label_30;
                }
                goto label_32;
            }
            goto label_34;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
    label_30:
        __monitor_exit(this);
        return;
    label_32:
        __monitor_exit(this);
        return;
    label_34:
        __monitor_exit(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        synchronized(this) {
            if(!this.n) {
                this.a();
            }
            if(this.k.zzU && this.m != null) {
                zzcli zzcli0 = this.j;
                if(zzcli0 != null) {
                    zzcli0.zzd("onSdkImpression", new b());  // 初始化器: Lp/k;-><init>()V
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        synchronized(this) {
            if(this.n) {
                return;
            }
            this.a();
        }
    }
}

