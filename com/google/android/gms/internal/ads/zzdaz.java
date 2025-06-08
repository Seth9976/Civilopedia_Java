package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

public final class zzdaz {
    public final zzfgf a;
    public final zzcfo b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final zzgqo g;
    public final String h;
    public final zzetj i;

    public zzdaz(zzfgf zzfgf0, zzcfo zzcfo0, ApplicationInfo applicationInfo0, String s, List list0, PackageInfo packageInfo0, zzgqo zzgqo0, zzg zzg0, String s1, zzetj zzetj0) {
        this.a = zzfgf0;
        this.b = zzcfo0;
        this.c = applicationInfo0;
        this.d = s;
        this.e = list0;
        this.f = packageInfo0;
        this.g = zzgqo0;
        this.h = s1;
        this.i = zzetj0;
    }

    public final zzfvl zzb() {
        Bundle bundle0 = new Bundle();
        return zzffp.zzc(this.i.zza(bundle0), zzffz.zza, this.a).zza();
    }

    public final zzfvl zzc() {
        zzfvl zzfvl0 = this.zzb();
        zzfvl[] arr_zzfvl = {zzfvl0, ((zzfvl)this.g.zzb())};
        return this.a.zza(zzffz.zzb, arr_zzfvl).zza(new zzday(this, zzfvl0)).zza();
    }
}

