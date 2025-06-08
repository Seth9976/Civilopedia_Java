package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;

public final class zzell extends zzbn {
    public final Context i;
    public final zzcnf j;
    public final zzfcb k;
    public final zzdnq l;
    public zzbf m;

    public zzell(zzcnf zzcnf0, Context context0, String s) {
        zzfcb zzfcb0 = new zzfcb();
        this.k = zzfcb0;
        this.l = new zzdnq();
        this.j = zzcnf0;
        zzfcb0.zzs(s);
        this.i = context0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() {
        zzdns zzdns0 = this.l.zzg();
        ArrayList arrayList0 = zzdns0.zzi();
        zzfcb zzfcb0 = this.k;
        zzfcb0.zzB(arrayList0);
        zzfcb0.zzC(zzdns0.zzh());
        if(zzfcb0.zzg() == null) {
            zzfcb0.zzr(zzq.zzc());
        }
        return new zzelm(this.i, this.j, this.k, zzdns0, this.m);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzblz zzblz0) {
        this.l.zza(zzblz0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbmc zzbmc0) {
        this.l.zzb(zzbmc0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String s, zzbmi zzbmi0, zzbmf zzbmf0) {
        this.l.zzc(s, zzbmi0, zzbmf0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbrb zzbrb0) {
        this.l.zzd(zzbrb0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbmm zzbmm0, zzq zzq0) {
        this.l.zze(zzbmm0);
        this.k.zzr(zzq0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbmp zzbmp0) {
        this.l.zzf(zzbmp0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbf0) {
        this.m = zzbf0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.k.zzq(adManagerAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbqs zzbqs0) {
        this.k.zzv(zzbqs0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbkp zzbkp0) {
        this.k.zzA(zzbkp0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions0) {
        this.k.zzD(publisherAdViewOptions0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcd0) {
        this.k.zzQ(zzcd0);
    }
}

