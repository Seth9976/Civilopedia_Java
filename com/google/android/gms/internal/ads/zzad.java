package com.google.android.gms.internal.ads;

import A.f;
import i3.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzad {
    public int a;
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public static final zzl zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbl zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzv zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzo zzy;
    public final int zzz;

    static {
        new zzad(new zzab());
        zzad.zza = zzz.zza;
    }

    public zzad(zzab zzab0) {
        this.zzb = zzab0.a;
        this.zzc = zzab0.b;
        this.zzd = zzeg.zzO(zzab0.c);
        this.zze = zzab0.d;
        int v = 0;
        this.zzf = 0;
        int v1 = zzab0.e;
        this.zzg = v1;
        int v2 = zzab0.f;
        this.zzh = v2;
        if(v2 != -1) {
            v1 = v2;
        }
        this.zzi = v1;
        this.zzj = zzab0.g;
        this.zzk = zzab0.h;
        this.zzl = zzab0.i;
        this.zzm = zzab0.j;
        this.zzn = zzab0.k;
        this.zzo = zzab0.l == null ? Collections.emptyList() : zzab0.l;
        zzv zzv0 = zzab0.m;
        this.zzp = zzv0;
        this.zzq = zzab0.n;
        this.zzr = zzab0.o;
        this.zzs = zzab0.p;
        this.zzt = zzab0.q;
        this.zzu = zzab0.r == -1 ? 0 : zzab0.r;
        this.zzv = zzab0.s == -1.0f ? 1.0f : zzab0.s;
        this.zzw = zzab0.t;
        this.zzx = zzab0.u;
        this.zzy = zzab0.v;
        this.zzz = zzab0.w;
        this.zzA = zzab0.x;
        this.zzB = zzab0.y;
        this.zzC = zzab0.z == -1 ? 0 : zzab0.z;
        int v3 = zzab0.A;
        if(v3 != -1) {
            v = v3;
        }
        this.zzD = v;
        this.zzE = zzab0.B;
        int v4 = zzab0.C;
        if(v4 == 0 && zzv0 != null) {
            this.zzF = 1;
            return;
        }
        this.zzF = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzad.class == class0) {
                zzad zzad0 = (zzad)object0;
                return this.a == 0 || (zzad0.a == 0 || this.a == zzad0.a) ? this.zze == zzad0.zze && this.zzg == zzad0.zzg && this.zzh == zzad0.zzh && this.zzn == zzad0.zzn && this.zzq == zzad0.zzq && this.zzr == zzad0.zzr && this.zzs == zzad0.zzs && this.zzu == zzad0.zzu && this.zzx == zzad0.zzx && this.zzz == zzad0.zzz && this.zzA == zzad0.zzA && this.zzB == zzad0.zzB && this.zzC == zzad0.zzC && this.zzD == zzad0.zzD && this.zzE == zzad0.zzE && this.zzF == zzad0.zzF && Float.compare(this.zzt, zzad0.zzt) == 0 && Float.compare(this.zzv, zzad0.zzv) == 0 && zzeg.zzS(this.zzb, zzad0.zzb) && zzeg.zzS(this.zzc, zzad0.zzc) && zzeg.zzS(this.zzj, zzad0.zzj) && zzeg.zzS(this.zzl, zzad0.zzl) && zzeg.zzS(this.zzm, zzad0.zzm) && zzeg.zzS(this.zzd, zzad0.zzd) && Arrays.equals(this.zzw, zzad0.zzw) && zzeg.zzS(this.zzk, zzad0.zzk) && zzeg.zzS(this.zzy, zzad0.zzy) && zzeg.zzS(this.zzp, zzad0.zzp) && this.zzd(zzad0) : false;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = 0;
            int v2 = (((((((this.zzb == null ? 0 : this.zzb.hashCode()) + 0x20F) * 0x1F + (this.zzc == null ? 0 : this.zzc.hashCode())) * 0x1F + (this.zzd == null ? 0 : this.zzd.hashCode())) * 0x1F + this.zze) * 961 + this.zzg) * 0x1F + this.zzh) * 0x1F;
            int v3 = this.zzj == null ? 0 : this.zzj.hashCode();
            int v4 = this.zzk == null ? 0 : this.zzk.hashCode();
            int v5 = this.zzl == null ? 0 : this.zzl.hashCode();
            String s = this.zzm;
            if(s != null) {
                v1 = s.hashCode();
            }
            v = ((((((((Float.floatToIntBits(this.zzv) + ((Float.floatToIntBits(this.zzt) + ((((((((v2 + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1) * 0x1F + this.zzn) * 0x1F + ((int)this.zzq)) * 0x1F + this.zzr) * 0x1F + this.zzs) * 0x1F) * 0x1F + this.zzu) * 0x1F) * 0x1F + this.zzx) * 0x1F + this.zzz) * 0x1F + this.zzA) * 0x1F + this.zzB) * 0x1F + this.zzC) * 0x1F + this.zzD) * 0x1F + this.zzE) * 0x1F + this.zzF;
            this.a = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = e.j("Format(", this.zzb, ", ", this.zzc, ", ");
        f.t(stringBuilder0, this.zzl, ", ", this.zzm, ", ");
        f.s(stringBuilder0, this.zzj, ", ", this.zzi, ", ");
        f.s(stringBuilder0, this.zzd, ", [", this.zzr, ", ");
        stringBuilder0.append(this.zzs);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzt);
        stringBuilder0.append("], [");
        stringBuilder0.append(this.zzz);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzA);
        stringBuilder0.append("])");
        return stringBuilder0.toString();
    }

    public final int zza() {
        int v = this.zzr;
        if(v != -1) {
            return this.zzs == -1 ? -1 : v * this.zzs;
        }
        return -1;
    }

    public final zzab zzb() {
        return new zzab(this);
    }

    public final zzad zzc(int v) {
        zzab zzab0 = new zzab(this);
        zzab0.zzA(v);
        return new zzad(zzab0);
    }

    public final boolean zzd(zzad zzad0) {
        if(this.zzo.size() == zzad0.zzo.size()) {
            for(int v = 0; v < this.zzo.size(); ++v) {
                if(!Arrays.equals(((byte[])this.zzo.get(v)), ((byte[])zzad0.zzo.get(v)))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

