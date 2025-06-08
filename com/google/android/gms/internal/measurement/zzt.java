package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzt extends zzai {
    public final zzr k;

    public zzt(zzr zzr0) {
        super("internal.logger");
        this.k = zzr0;
        K0 k00 = new K0(this, false, true);
        this.j.put("log", k00);
        J0 j00 = new J0("silent", 0);
        this.j.put("silent", j00);
        ((zzai)this.j.get("silent")).zzr("log", new K0(this, true, true));
        J0 j01 = new J0("unmonitored", 1);
        this.j.put("unmonitored", j01);
        ((zzai)this.j.get("unmonitored")).zzr("log", new K0(this, false, false));
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        return zzap.zzf;
    }
}

