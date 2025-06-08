package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzetp implements zzetf {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzetp(String s, int v, int v1, int v2, boolean z, int v3) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = z;
        this.zzf = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        boolean z = TextUtils.isEmpty(this.zza);
        boolean z1 = true;
        zzfco.zzg(((Bundle)object0), "carrier", this.zza, !z);
        Integer integer0 = this.zzb;
        if(this.zzb == -2) {
            z1 = false;
        }
        zzfco.zzf(((Bundle)object0), "cnt", integer0, z1);
        ((Bundle)object0).putInt("gnt", this.zzc);
        ((Bundle)object0).putInt("pt", this.zzd);
        Bundle bundle0 = zzfco.zza(((Bundle)object0), "device");
        ((Bundle)object0).putBundle("device", bundle0);
        Bundle bundle1 = zzfco.zza(bundle0, "network");
        bundle0.putBundle("network", bundle1);
        bundle1.putInt("active_network_state", this.zzf);
        bundle1.putBoolean("active_network_metered", this.zze);
    }
}

