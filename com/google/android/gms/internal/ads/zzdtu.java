package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzdtu implements zzdco {
    public final zzcli i;

    public zzdtu(zzcli zzcli0) {
        this.i = zzcli0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context0) {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.destroy();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context0) {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.onPause();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context0) {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.onResume();
        }
    }
}

