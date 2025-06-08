package com.google.android.gms.internal.ads;

import C1.d;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzml implements zzkh {
    public final zzcx i;
    public final zzcf j;
    public final zzch k;
    public final d l;
    public final SparseArray m;
    public zzdm n;
    public zzcb o;
    public zzdg p;
    public boolean q;

    public zzml(zzcx zzcx0) {
        zzcx0.getClass();
        this.i = zzcx0;
        this.n = new zzdm(zzeg.zzD(), zzcx0, zzkr.zza);
        zzcf zzcf0 = new zzcf();
        this.j = zzcf0;
        this.k = new zzch();
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d0.i = zzcf0;
        d0.j = zzfrj.zzo();
        d0.k = zzfrm.zzd();
        this.l = d0;
        this.m = new SparseArray();
    }

    public final zzki a() {
        return this.d(((zzsa)this.l.l));
    }

    public final zzki b(zzci zzci0, int v, zzsa zzsa0) {
        boolean z = true;
        zzsa zzsa1 = zzci0.zzo() ? null : zzsa0;
        long v1 = this.i.zza();
        if(!zzci0.equals(this.o.zzn()) || v != this.o.zzf()) {
            z = false;
        }
        long v2 = 0L;
        if(zzsa1 == null || !zzsa1.zzb()) {
            if(z) {
                v2 = this.o.zzk();
            }
            else if(!zzci0.zzo()) {
                zzci0.zze(v, this.k, 0L);
                v2 = zzeg.zzz(0L);
            }
        }
        else if(z && this.o.zzd() == zzsa1.zzb && this.o.zze() == zzsa1.zzc) {
            v2 = this.o.zzl();
        }
        zzsa zzsa2 = (zzsa)this.l.l;
        return new zzki(v1, zzci0, v, zzsa1, v2, this.o.zzn(), this.o.zzf(), zzsa2, this.o.zzl(), this.o.zzm());
    }

    public final void c(zzki zzki0, int v, zzdj zzdj0) {
        this.m.put(v, zzki0);
        zzdm zzdm0 = this.n;
        zzdm0.zzd(v, zzdj0);
        zzdm0.zzc();
    }

    public final zzki d(zzsa zzsa0) {
        this.o.getClass();
        zzci zzci0 = zzsa0 == null ? null : ((zzci)((zzfrm)this.l.k).get(zzsa0));
        if(zzsa0 != null && zzci0 != null) {
            return this.b(zzci0, zzci0.zzn(zzsa0.zza, this.j).zzd, zzsa0);
        }
        int v = this.o.zzf();
        zzci zzci1 = this.o.zzn();
        if(v >= zzci1.zzc()) {
            zzci1 = zzci.zza;
        }
        return this.b(zzci1, v, null);
    }

    public final zzki e(int v, zzsa zzsa0) {
        zzcb zzcb0 = this.o;
        zzcb0.getClass();
        if(zzsa0 != null) {
            return ((zzci)((zzfrm)this.l.k).get(zzsa0)) == null ? this.b(zzci.zza, v, zzsa0) : this.d(zzsa0);
        }
        zzci zzci0 = zzcb0.zzn();
        if(v >= zzci0.zzc()) {
            zzci0 = zzci.zza;
        }
        return this.b(zzci0, v, null);
    }

    public final zzki f() {
        return this.d(((zzsa)this.l.n));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzA(String s) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F4, new zzmj(zzki0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzB(zzgl zzgl0) {
        zzki zzki0 = this.d(((zzsa)this.l.m));
        this.c(zzki0, 0x3F5, new zzlz(zzki0, zzgl0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzC(zzgl zzgl0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 1007, new zzlo(zzki0, zzgl0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzD(zzad zzad0, zzgm zzgm0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 1009, new zzly(zzki0, zzad0, zzgm0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzE(long v) {
        zzki zzki0 = this.f();
        this.c(zzki0, 1010, new zzmb(zzki0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzF(Exception exception0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F6, new zzkw(zzki0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzG(int v, long v1, long v2) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F3, new zzko(zzki0, v, v1, v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzH(int v, long v1) {
        zzki zzki0 = this.d(((zzsa)this.l.m));
        this.c(zzki0, 0x3FA, new zzlj(zzki0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzI(Object object0, long v) {
        zzki zzki0 = this.f();
        this.c(zzki0, 26, new zzmf(zzki0, object0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzJ(Exception exception0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 1030, new zzku(zzki0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzK(String s, long v, long v1) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F8, new zzlf(zzki0, s, v1, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzL(String s) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3FB, new zzkn(zzki0, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzM(zzgl zzgl0) {
        zzki zzki0 = this.d(((zzsa)this.l.m));
        this.c(zzki0, 1020, new zzme(zzki0, zzgl0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzN(zzgl zzgl0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F7, new zzlk(zzki0, zzgl0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzO(long v, int v1) {
        zzki zzki0 = this.d(((zzsa)this.l.m));
        this.c(zzki0, 0x3FD, new zzkx(zzki0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzP(zzad zzad0, zzgm zzgm0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F9, new zzkm(zzki0, zzad0, zzgm0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzQ() {
        zzdg zzdg0 = this.p;
        zzcw.zzb(zzdg0);
        zzdg0.zzg(() -> {
            zzki zzki0 = this.a();
            this.c(zzki0, 0x404, new zzlh(zzki0));
            this.n.zze();
        });
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzR(zzkk zzkk0) {
        this.n.zzf(zzkk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzS(zzcb zzcb0, Looper looper0) {
        zzcw.zzf(this.o == null || ((zzfrj)this.l.j).isEmpty());
        zzcb0.getClass();
        this.o = zzcb0;
        this.p = this.i.zzb(looper0, null);
        this.n = this.n.zza(looper0, new zzle(this, zzcb0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzT(List list0, zzsa zzsa0) {
        zzcb zzcb0 = this.o;
        zzcb0.getClass();
        d d0 = this.l;
        d0.getClass();
        d0.j = zzfrj.zzm(list0);
        if(!list0.isEmpty()) {
            d0.m = (zzsa)list0.get(0);
            zzsa0.getClass();
            d0.n = zzsa0;
        }
        if(((zzsa)d0.l) == null) {
            d0.l = d.I(zzcb0, ((zzfrj)d0.j), ((zzsa)d0.m), ((zzcf)d0.i));
        }
        d0.K(zzcb0.zzn());
    }

    @Override  // com.google.android.gms.internal.ads.zzvt
    public final void zzY(int v, long v1, long v2) {
        Object object1;
        Object object0;
        zzsa zzsa0;
        d d0 = this.l;
        if(((zzfrj)d0.j).isEmpty()) {
            zzsa0 = null;
        }
        else {
            zzfrj zzfrj0 = (zzfrj)d0.j;
            if(zzfrj0 instanceof List) {
                if(zzfrj0.isEmpty()) {
                    throw new NoSuchElementException();
                }
                object0 = zzfrj0.get(zzfrj0.size() - 1);
            }
            else {
                Iterator iterator0 = zzfrj0.iterator();
                do {
                    object1 = iterator0.next();
                }
                while(iterator0.hasNext());
                object0 = object1;
            }
            zzsa0 = (zzsa)object0;
        }
        zzki zzki0 = this.d(zzsa0);
        this.c(zzki0, 1006, new zzkv(zzki0, v, v1, v2));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbx zzbx0) {
        zzki zzki0 = this.a();
        this.c(zzki0, 13, new zzkz(zzki0, zzbx0));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public final void zzaf(int v, zzsa zzsa0, zzrw zzrw0) {
        zzki zzki0 = this.e(v, zzsa0);
        this.c(zzki0, 1004, new zzkt(zzki0, zzrw0));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public final void zzag(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        zzki zzki0 = this.e(v, zzsa0);
        this.c(zzki0, 1002, new zzll(zzki0, zzrr0, zzrw0));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public final void zzah(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        zzki zzki0 = this.e(v, zzsa0);
        this.c(zzki0, 1001, new zzlv(zzki0, zzrr0, zzrw0));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public final void zzai(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        zzki zzki0 = this.e(v, zzsa0);
        this.c(zzki0, 1003, new zzlg(zzki0, zzrr0, zzrw0, iOException0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzsk
    public final void zzaj(int v, zzsa zzsa0, zzrr zzrr0, zzrw zzrw0) {
        zzki zzki0 = this.e(v, zzsa0);
        this.c(zzki0, 1000, new zzlq(zzki0, zzrr0, zzrw0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzb(zzr zzr0) {
        zzki zzki0 = this.a();
        this.c(zzki0, 29, new zzla(zzki0, zzr0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzc(int v, boolean z) {
        zzki zzki0 = this.a();
        this.c(zzki0, 30, new zzld(zzki0, v, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzd(boolean z) {
        zzki zzki0 = this.a();
        this.c(zzki0, 3, new zzmi(zzki0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zze(boolean z) {
        zzki zzki0 = this.a();
        this.c(zzki0, 7, new zzlr(zzki0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzf(zzbb zzbb0, int v) {
        zzki zzki0 = this.a();
        this.c(zzki0, 1, new zzlu(zzki0, zzbb0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzg(zzbh zzbh0) {
        zzki zzki0 = this.a();
        this.c(zzki0, 14, new zzlx(zzki0, zzbh0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzh(boolean z, int v) {
        zzki zzki0 = this.a();
        this.c(zzki0, 5, new zzlp(zzki0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzi(zzbt zzbt0) {
        zzki zzki0 = this.a();
        this.c(zzki0, 12, new zzkq(zzki0, zzbt0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzj(int v) {
        zzki zzki0 = this.a();
        this.c(zzki0, 4, new zzlt(zzki0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzk(int v) {
        zzki zzki0 = this.a();
        this.c(zzki0, 6, new zzmh(zzki0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzl(zzbr zzbr0) {
        zzki zzki0;
        if(zzbr0 instanceof zzgt) {
            zzbi zzbi0 = ((zzgt)zzbr0).zzj;
            zzki0 = zzbi0 == null ? this.a() : this.d(new zzsa(zzbi0));
        }
        else {
            zzki0 = this.a();
        }
        this.c(zzki0, 10, new zzlm(zzki0, zzbr0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzm(zzbr zzbr0) {
        zzki zzki0;
        if(zzbr0 instanceof zzgt) {
            zzbi zzbi0 = ((zzgt)zzbr0).zzj;
            zzki0 = zzbi0 == null ? this.a() : this.d(new zzsa(zzbi0));
        }
        else {
            zzki0 = this.a();
        }
        this.c(zzki0, 10, new zzlw(zzki0, zzbr0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzn(boolean z, int v) {
        zzki zzki0 = this.a();
        this.c(zzki0, -1, new zzkl(zzki0, z, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzo(zzca zzca0, zzca zzca1, int v) {
        if(v == 1) {
            this.q = false;
            v = 1;
        }
        zzcb zzcb0 = this.o;
        zzcb0.getClass();
        this.l.l = d.I(zzcb0, ((zzfrj)this.l.j), ((zzsa)this.l.m), ((zzcf)this.l.i));
        zzki zzki0 = this.a();
        this.c(zzki0, 11, new zzky(zzki0, v, zzca0, zzca1));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzp() {
        zzki zzki0 = this.a();
        this.c(zzki0, -1, new zzks(zzki0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzq(boolean z) {
        zzki zzki0 = this.f();
        this.c(zzki0, 23, new zzls(zzki0, z));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzr(int v, int v1) {
        zzki zzki0 = this.f();
        this.c(zzki0, 24, new zzmg(zzki0, v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzs(zzci zzci0, int v) {
        zzcb zzcb0 = this.o;
        zzcb0.getClass();
        this.l.l = d.I(zzcb0, ((zzfrj)this.l.j), ((zzsa)this.l.m), ((zzcf)this.l.i));
        zzci zzci1 = zzcb0.zzn();
        this.l.K(zzci1);
        zzki zzki0 = this.a();
        this.c(zzki0, 0, new zzli(zzki0, v));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzt(zzct zzct0) {
        zzki zzki0 = this.a();
        this.c(zzki0, 2, new zzlb(zzki0, zzct0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzu(zzcv zzcv0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 25, new zzmd(zzki0, zzcv0));
    }

    @Override  // com.google.android.gms.internal.ads.zzby
    public final void zzv(float f) {
        zzki zzki0 = this.f();
        this.c(zzki0, 22, new zzkp(zzki0, f));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzw(zzkk zzkk0) {
        this.n.zzb(zzkk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzx() {
        if(!this.q) {
            zzki zzki0 = this.a();
            this.q = true;
            this.c(zzki0, -1, new zzmc(zzki0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzy(Exception exception0) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x405, new zzlc(zzki0, exception0));
    }

    @Override  // com.google.android.gms.internal.ads.zzkh
    public final void zzz(String s, long v, long v1) {
        zzki zzki0 = this.f();
        this.c(zzki0, 0x3F0, new zzln(zzki0, s, v1, v));
    }
}

