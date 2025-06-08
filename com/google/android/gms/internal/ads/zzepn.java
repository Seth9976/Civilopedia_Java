package com.google.android.gms.internal.ads;

public final class zzepn implements zzetg {
    public final zzeyh a;

    public zzepn(zzeyh zzeyh0) {
        this.a = zzeyh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 15;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzepm zzepm0 = null;
        if(this.a != null && this.a.zza() != null && !this.a.zza().isEmpty()) {
            zzepm0 = new zzepm(this);
        }
        return zzfvc.zzi(zzepm0);
    }
}

