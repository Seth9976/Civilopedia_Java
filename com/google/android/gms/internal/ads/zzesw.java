package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzesw implements zzetf {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    public zzesw(boolean z, boolean z1, String s, boolean z2, int v, int v1, int v2) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = v;
        this.zzf = v1;
        this.zzg = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        ((Bundle)object0).putString("js", this.zzc);
        ((Bundle)object0).putBoolean("is_nonagon", true);
        ((Bundle)object0).putString("extra_caps", ((String)zzay.zzc().zzb(zzbhz.zzcL)));
        ((Bundle)object0).putInt("target_api", this.zze);
        ((Bundle)object0).putInt("dv", this.zzf);
        ((Bundle)object0).putInt("lv", this.zzg);
        Bundle bundle0 = zzfco.zza(((Bundle)object0), "sdk_env");
        bundle0.putBoolean("mf", ((Boolean)zzbjp.zza.zze()).booleanValue());
        bundle0.putBoolean("instant_app", this.zza);
        bundle0.putBoolean("lite", this.zzb);
        bundle0.putBoolean("is_privileged_process", this.zzd);
        ((Bundle)object0).putBundle("sdk_env", bundle0);
        Bundle bundle1 = zzfco.zza(bundle0, "build_meta");
        bundle1.putString("cl", "458339781");
        bundle1.putString("rapid_rc", "dev");
        bundle1.putString("rapid_rollup", "HEAD");
        bundle0.putBundle("build_meta", bundle1);
    }
}

