package com.google.android.gms.internal.ads;

import p.b;

public final class zzdpd implements zzdcn {
    public final zzdnh i;
    public final zzdnm j;

    public zzdpd(zzdnh zzdnh0, zzdnm zzdnm0) {
        this.i = zzdnh0;
        this.j = zzdnm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzdnh zzdnh0 = this.i;
        if(zzdnh0.zzu() == null) {
            return;
        }
        zzcli zzcli0 = zzdnh0.zzq();
        zzcli zzcli1 = zzdnh0.zzr();
        if(zzcli0 == null) {
            zzcli0 = zzcli1 == null ? null : zzcli1;
        }
        if(this.j.zzd() && zzcli0 != null) {
            zzcli0.zzd("onSdkImpression", new b());  // 初始化器: Lp/k;-><init>()V
        }
    }
}

