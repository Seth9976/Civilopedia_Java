package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;

public final class zzfcd {
    public final zzff zza;
    public final zzbqs zzb;
    public final zzemh zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbkp zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbz zzn;
    public final zzfbt zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcd zzr;

    public zzfcd(zzfcb zzfcb0) {
        this.zze = zzfcb0.b;
        this.zzf = zzfcb0.c;
        this.zzr = zzfcb0.s;
        zzl zzl0 = zzfcb0.a;
        boolean z = zzl0.zzh || zzfcb0.e;
        int v = zzs.zza(zzl0.zzw);
        this.zzd = new zzl(zzl0.zza, zzl0.zzb, zzl0.zzc, zzl0.zzd, zzl0.zze, zzl0.zzf, zzl0.zzg, z, zzl0.zzi, zzl0.zzj, zzl0.zzk, zzl0.zzl, zzl0.zzm, zzl0.zzn, zzl0.zzo, zzl0.zzp, zzl0.zzq, zzl0.zzr, zzl0.zzs, zzl0.zzt, zzl0.zzu, zzl0.zzv, v, zzfcb0.a.zzx);
        zzff zzff0 = zzfcb0.d;
        zzbkp zzbkp0 = null;
        if(zzff0 == null) {
            zzff0 = zzfcb0.h == null ? null : zzfcb0.h.zzf;
        }
        this.zza = zzff0;
        this.zzg = zzfcb0.f;
        this.zzh = zzfcb0.g;
        if(zzfcb0.f != null) {
            zzbkp0 = zzfcb0.h;
            if(zzbkp0 == null) {
                zzbkp0 = new zzbkp(new Builder().build());
            }
        }
        this.zzi = zzbkp0;
        this.zzj = zzfcb0.i;
        this.zzk = zzfcb0.m;
        this.zzl = zzfcb0.j;
        this.zzm = zzfcb0.k;
        this.zzn = zzfcb0.l;
        this.zzb = zzfcb0.n;
        this.zzo = new zzfbt(zzfcb0.o);
        this.zzp = zzfcb0.p;
        this.zzc = zzfcb0.q;
        this.zzq = zzfcb0.r;
    }

    public final zzbms zza() {
        PublisherAdViewOptions publisherAdViewOptions0 = this.zzm;
        if(publisherAdViewOptions0 == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions0 == null ? this.zzl.zza() : publisherAdViewOptions0.zzb();
    }
}

