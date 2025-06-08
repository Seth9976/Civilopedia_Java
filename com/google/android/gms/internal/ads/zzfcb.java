package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public final class zzfcb {
    public zzl a;
    public zzq b;
    public String c;
    public zzff d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public zzbkp h;
    public zzw i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    public zzbz l;
    public int m;
    public zzbqs n;
    public final zzfbr o;
    public boolean p;
    public zzemh q;
    public boolean r;
    public zzcd s;

    public zzfcb() {
        this.m = 1;
        this.o = new zzfbr();
        this.p = false;
        this.r = false;
    }

    public final zzfcb zzA(zzbkp zzbkp0) {
        this.h = zzbkp0;
        return this;
    }

    public final zzfcb zzB(ArrayList arrayList0) {
        this.f = arrayList0;
        return this;
    }

    public final zzfcb zzC(ArrayList arrayList0) {
        this.g = arrayList0;
        return this;
    }

    public final zzfcb zzD(PublisherAdViewOptions publisherAdViewOptions0) {
        this.k = publisherAdViewOptions0;
        if(publisherAdViewOptions0 != null) {
            this.e = publisherAdViewOptions0.zzc();
            this.l = publisherAdViewOptions0.zza();
        }
        return this;
    }

    public final zzfcb zzE(zzl zzl0) {
        this.a = zzl0;
        return this;
    }

    public final zzfcb zzF(zzff zzff0) {
        this.d = zzff0;
        return this;
    }

    public final zzfcd zzG() {
        Preconditions.checkNotNull(this.c, "ad unit must not be null");
        Preconditions.checkNotNull(this.b, "ad size must not be null");
        Preconditions.checkNotNull(this.a, "ad request must not be null");
        return new zzfcd(this);
    }

    public final String zzI() {
        return this.c;
    }

    public final boolean zzO() {
        return this.p;
    }

    public final zzfcb zzQ(zzcd zzcd0) {
        this.s = zzcd0;
        return this;
    }

    public final zzl zze() {
        return this.a;
    }

    public final zzq zzg() {
        return this.b;
    }

    public final zzfbr zzo() {
        return this.o;
    }

    public final zzfcb zzp(zzfcd zzfcd0) {
        this.o.zza(zzfcd0.zzo.zza);
        this.a = zzfcd0.zzd;
        this.b = zzfcd0.zze;
        this.s = zzfcd0.zzr;
        this.c = zzfcd0.zzf;
        this.d = zzfcd0.zza;
        this.f = zzfcd0.zzg;
        this.g = zzfcd0.zzh;
        this.h = zzfcd0.zzi;
        this.i = zzfcd0.zzj;
        this.zzq(zzfcd0.zzl);
        this.zzD(zzfcd0.zzm);
        this.p = zzfcd0.zzp;
        this.q = zzfcd0.zzc;
        this.r = zzfcd0.zzq;
        return this;
    }

    public final zzfcb zzq(AdManagerAdViewOptions adManagerAdViewOptions0) {
        this.j = adManagerAdViewOptions0;
        if(adManagerAdViewOptions0 != null) {
            this.e = adManagerAdViewOptions0.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfcb zzr(zzq zzq0) {
        this.b = zzq0;
        return this;
    }

    public final zzfcb zzs(String s) {
        this.c = s;
        return this;
    }

    public final zzfcb zzt(zzw zzw0) {
        this.i = zzw0;
        return this;
    }

    public final zzfcb zzu(zzemh zzemh0) {
        this.q = zzemh0;
        return this;
    }

    public final zzfcb zzv(zzbqs zzbqs0) {
        this.n = zzbqs0;
        this.d = new zzff(false, true, false);
        return this;
    }

    public final zzfcb zzw(boolean z) {
        this.p = z;
        return this;
    }

    public final zzfcb zzx(boolean z) {
        this.r = true;
        return this;
    }

    public final zzfcb zzy(boolean z) {
        this.e = z;
        return this;
    }

    public final zzfcb zzz(int v) {
        this.m = v;
        return this;
    }
}

