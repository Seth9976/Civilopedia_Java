package com.google.android.gms.internal.ads;

import N.s;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzagj implements zzaga {
    public final zzahb a;
    public final s b;
    public final s c;
    public final s d;
    public long e;
    public final boolean[] f;
    public String g;
    public zzzy h;
    public Z i;
    public boolean j;
    public long k;
    public boolean l;
    public final zzdy m;

    public zzagj(zzahb zzahb0, boolean z, boolean z1) {
        this.a = zzahb0;
        this.f = new boolean[3];
        this.b = new s(7);
        this.c = new s(8);
        this.d = new s(6);
        this.k = 0x8000000000000001L;
        this.m = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdy0) {
        byte[] arr_b2;
        int v21;
        int v20;
        boolean z3;
        long v14;
        int v12;
        int v11;
        byte[] arr_b1;
        int v10;
        int v9;
        s s2;
        s s1;
        s s0;
        zzcw.zzb(this.h);
        int v = zzdy0.zzc();
        int v1 = zzdy0.zzd();
        byte[] arr_b = zzdy0.zzH();
        this.e += (long)zzdy0.zza();
        zzzw.zzb(this.h, zzdy0, zzdy0.zza());
        while(true) {
            int v2 = zzzo.zza(arr_b, v, v1, this.f);
            s0 = this.d;
            s1 = this.c;
            s2 = this.b;
            if(v2 == v1) {
                break;
            }
            int v3 = arr_b[v2 + 3] & 0x1F;
            int v4 = v2 - v;
            if(v4 > 0) {
                if(!this.j) {
                    s2.e(arr_b, v, v2);
                    s1.e(arr_b, v, v2);
                }
                s0.e(arr_b, v, v2);
            }
            int v5 = v1 - v2;
            long v6 = this.e - ((long)v5);
            int v7 = v4 >= 0 ? 0 : -v4;
            long v8 = this.k;
            if(this.j) {
            label_68:
                v12 = v5;
                v10 = v1;
                arr_b1 = arr_b;
                v9 = v2 + 3;
                v11 = v3;
            }
            else {
                s2.h(v7);
                s1.h(v7);
                if(this.j) {
                label_53:
                    v12 = v5;
                    v10 = v1;
                    arr_b1 = arr_b;
                    v9 = v2 + 3;
                    v11 = v3;
                    if(s2.d) {
                        zzzn zzzn1 = zzzo.zzd(((byte[])s2.f), 4, s2.e);
                        this.i.b.append(zzzn1.zzd, zzzn1);
                        s2.f();
                    }
                    else if(s1.d) {
                        zzzm zzzm1 = zzzo.zzc(((byte[])s1.f), 4, s1.e);
                        this.i.c.append(zzzm1.zza, zzzm1);
                        s1.f();
                    }
                }
                else {
                    if(!s2.d || !s1.d) {
                        goto label_68;
                    }
                    else {
                        ArrayList arrayList0 = new ArrayList();
                        v9 = v2 + 3;
                        arrayList0.add(Arrays.copyOf(((byte[])s2.f), s2.e));
                        arrayList0.add(Arrays.copyOf(((byte[])s1.f), s1.e));
                        v10 = v1;
                        zzzn zzzn0 = zzzo.zzd(((byte[])s2.f), 4, s2.e);
                        arr_b1 = arr_b;
                        zzzm zzzm0 = zzzo.zzc(((byte[])s1.f), 4, s1.e);
                        v11 = v3;
                        zzzy zzzy0 = this.h;
                        zzab zzab0 = new zzab();
                        v12 = v5;
                        zzab0.zzH(this.g);
                        zzab0.zzS("video/avc");
                        zzab0.zzx(zzcy.zza(zzzn0.zza, zzzn0.zzb, zzzn0.zzc));
                        zzab0.zzX(zzzn0.zze);
                        zzab0.zzF(zzzn0.zzf);
                        zzab0.zzP(zzzn0.zzg);
                        zzab0.zzI(arrayList0);
                        zzzy0.zzk(zzab0.zzY());
                        this.j = true;
                        this.i.b.append(zzzn0.zzd, zzzn0);
                        this.i.c.append(zzzm0.zza, zzzm0);
                        s2.f();
                        s1.f();
                        goto label_73;
                    }
                    goto label_53;
                }
            }
        label_73:
            if(s0.h(v7)) {
                int v13 = zzzo.zzb(((byte[])s0.f), s0.e);
                this.m.zzD(((byte[])s0.f), v13);
                this.m.zzF(4);
                this.a.zza(v8, this.m);
            }
            Z z0 = this.i;
            boolean z1 = this.j;
            boolean z2 = this.l;
            if(z0.d == 9) {
                if(!z1 || !z0.g) {
                    v14 = v6;
                }
                else {
                    long v15 = z0.e;
                    int v16 = v12 + ((int)(v6 - v15));
                    long v17 = z0.i;
                    if(v17 != 0x8000000000000001L) {
                        v14 = v6;
                        z0.a.zzs(v17, ((int)z0.j), ((int)(v15 - z0.h)), v16, null);
                    }
                }
                z0.h = z0.e;
                z0.i = z0.f;
                z0.j = false;
                z3 = true;
                z0.g = true;
            }
            else {
                v14 = v6;
                z3 = true;
            }
            boolean z4 = z0.j;
            if(z0.d != 5 && (!z2 || z0.d != 1)) {
                z3 = false;
            }
            int v18 = z3 | z4;
            z0.j = v18;
            if(v18 != 0) {
                this.l = false;
            }
            long v19 = this.k;
            if(this.j) {
                v20 = v11;
            }
            else {
                v20 = v11;
                s2.g(v20);
                s1.g(v20);
            }
            s0.g(v20);
            this.i.d = v20;
            this.i.f = v19;
            this.i.e = v14;
            v = v9;
            v1 = v10;
            arr_b = arr_b1;
        }
        if(this.j) {
            v21 = v1;
            arr_b2 = arr_b;
        }
        else {
            v21 = v1;
            arr_b2 = arr_b;
            s2.e(arr_b2, v, v21);
            s1.e(arr_b2, v, v21);
        }
        s0.e(arr_b2, v, v21);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyu0, zzahm zzahm0) {
        zzahm0.zzc();
        this.g = zzahm0.zzb();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 2);
        this.h = zzzy0;
        this.i = new Z(zzzy0);
        this.a.zzb(zzyu0, zzahm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long v, int v1) {
        if(v != 0x8000000000000001L) {
            this.k = v;
        }
        this.l |= (v1 & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.e = 0L;
        this.l = false;
        this.k = 0x8000000000000001L;
        zzzo.zze(this.f);
        this.b.f();
        this.c.f();
        this.d.f();
        Z z0 = this.i;
        if(z0 != null) {
            z0.g = false;
        }
    }
}

