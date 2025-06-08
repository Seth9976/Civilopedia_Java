package com.google.android.gms.internal.ads;

import A.f;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbc {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final zzbbr e;
    public final zzbbz f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o;
    public String p;
    public String q;

    public zzbbc(int v, int v1, int v2, int v3, int v4, int v5, int v6, boolean z) {
        this.g = new Object();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.o = "";
        this.p = "";
        this.q = "";
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = new zzbbr(v3);
        this.f = new zzbbz(v4, v5, v6);
    }

    public final void a(String s, boolean z, float f, float f1, float f2, float f3) {
        if(s != null && s.length() >= this.c) {
            Object object0 = this.g;
            synchronized(object0) {
                this.h.add(s);
                this.k += s.length();
                if(z) {
                    this.i.add(s);
                    zzbbn zzbbn0 = new zzbbn(f, f1, f2, f3, this.i.size() - 1);
                    this.j.add(zzbbn0);
                }
            }
        }
    }

    public static final String b(ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            stringBuilder0.append(((String)arrayList0.get(v1)));
            stringBuilder0.append(' ');
            ++v1;
            if(stringBuilder0.length() > 100) {
                break;
            }
        }
        stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
        String s = stringBuilder0.toString();
        return s.length() >= 100 ? s.substring(0, 100) : s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzbbc)) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        String s = ((zzbbc)object0).o;
        return s != null && s.equals(this.o);
    }

    @Override
    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override
    public final String toString() {
        int v = this.l;
        int v1 = this.n;
        int v2 = this.k;
        String s = zzbbc.b(this.h);
        String s1 = zzbbc.b(this.i);
        String s2 = this.o;
        String s3 = this.p;
        String s4 = this.q;
        StringBuilder stringBuilder0 = f.n("ActivityContent fetchId: ", v, " score:", v1, " total_length:");
        f.r(stringBuilder0, v2, "\n text: ", s, "\n viewableText");
        f.t(stringBuilder0, s1, "\n signture: ", s2, "\n viewableSignture: ");
        stringBuilder0.append(s3);
        stringBuilder0.append("\n viewableSignatureForVertical: ");
        stringBuilder0.append(s4);
        return stringBuilder0.toString();
    }

    public final int zzb() {
        return this.n;
    }

    public final String zzd() {
        return this.o;
    }

    public final String zze() {
        return this.p;
    }

    public final String zzf() {
        return this.q;
    }

    public final void zzg() {
        synchronized(this.g) {
            --this.m;
        }
    }

    public final void zzh() {
        synchronized(this.g) {
            ++this.m;
        }
    }

    public final void zzi() {
        synchronized(this.g) {
            this.n += -100;
        }
    }

    public final void zzj(int v) {
        this.l = v;
    }

    public final void zzk(String s, boolean z, float f, float f1, float f2, float f3) {
        this.a(s, z, f, f1, f2, f3);
    }

    public final void zzl(String s, boolean z, float f, float f1, float f2, float f3) {
        this.a(s, z, f, f1, f2, f3);
        synchronized(this.g) {
            if(this.m < 0) {
                zzcfi.zze("ActivityContent: negative number of WebViews.");
            }
            this.zzm();
        }
    }

    public final void zzm() {
        synchronized(this.g) {
            int v1 = this.d ? this.b : this.l * this.b + this.k * this.a;
            if(v1 > this.n) {
                this.n = v1;
                if(!zzt.zzo().zzh().zzM()) {
                    this.o = this.e.zza(this.h);
                    this.p = this.e.zza(this.i);
                }
                if(!zzt.zzo().zzh().zzN()) {
                    this.q = this.f.zza(this.i, this.j);
                }
            }
        }
    }

    public final void zzn() {
        synchronized(this.g) {
            int v = this.d ? this.b : this.l * this.b + this.k * this.a;
            if(v > this.n) {
                this.n = v;
            }
        }
    }

    public final boolean zzo() {
        synchronized(this.g) {
        }
        return this.m == 0;
    }
}

