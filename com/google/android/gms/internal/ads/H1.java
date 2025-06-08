package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import o2.G;
import s1.a;
import s1.d;
import s1.j;

public final class h1 implements zzghk {
    public int a;
    public final int b;
    public final Serializable c;
    public final Object d;
    public Object e;
    public final Object f;

    // 去混淆评级： 中等(56)
    public h1(zzgfo zzgfo0) {
        this.c = "";
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ");
    }

    public h1(Class class0, Class[] arr_class) {
        HashSet hashSet0 = new HashSet();
        this.c = hashSet0;
        this.d = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet0.add(class0);
        for(int v = 0; v < arr_class.length; ++v) {
            G.c(arr_class[v], "Null interface");
        }
        Collections.addAll(((HashSet)this.c), arr_class);
    }

    public h1(long[] arr_v, int[] arr_v1, int v, long[] arr_v2, int[] arr_v3) {
        boolean z = false;
        zzayz.zzc(arr_v1.length == arr_v2.length);
        zzayz.zzc(arr_v.length == arr_v2.length);
        if(arr_v3.length == arr_v2.length) {
            z = true;
        }
        zzayz.zzc(z);
        this.c = arr_v;
        this.e = arr_v1;
        this.b = v;
        this.d = arr_v2;
        this.f = arr_v3;
        this.a = arr_v.length;
    }

    public void a(j j0) {
        if(((HashSet)this.c).contains(j0.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet)this.d).add(j0);
    }

    public a b() {
        if(((d)this.e) == null) {
            throw new IllegalStateException("Missing required property: factory.");
        }
        return new a(new HashSet(((HashSet)this.c)), new HashSet(((HashSet)this.d)), this.a, this.b, ((d)this.e), ((HashSet)this.f));
    }

    @Override  // com.google.android.gms.internal.ads.zzghk
    public int zza() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzghk
    public zzgap zzb(byte[] arr_b) {
        int v = this.a;
        if(arr_b.length != v) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        String s = (String)this.c;
        Class class0 = zzfwf.class;
        if(s.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            zzgcp zzgcp0 = zzgcq.zzc();
            zzgcp0.zzaj(((zzgcq)this.d));
            zzgcp0.zza(zzgji.zzw(arr_b, 0, v));
            return new zzgap(((zzfwf)zzfxk.zzg(s, ((zzgcq)zzgcp0.zzal()), class0)));
        }
        if(s.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, this.b);
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, this.b, v);
            zzgbx zzgbx0 = zzgby.zzc();
            zzgbs zzgbs0 = (zzgbs)this.e;
            zzgbx0.zzaj(zzgbs0.zzf());
            zzgbx0.zza(zzgji.zzv(arr_b1));
            zzgby zzgby0 = (zzgby)zzgbx0.zzal();
            zzgel zzgel0 = zzgem.zzc();
            zzgel0.zzaj(zzgbs0.zzg());
            zzgel0.zza(zzgji.zzv(arr_b2));
            zzgem zzgem0 = (zzgem)zzgel0.zzal();
            zzgbr zzgbr0 = zzgbs.zzc();
            zzgbr0.zzc(zzgbs0.zza());
            zzgbr0.zza(zzgby0);
            zzgbr0.zzb(zzgem0);
            return new zzgap(((zzfwf)zzfxk.zzg(s, ((zzgbs)zzgbr0.zzal()), class0)));
        }
        if(!s.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        zzgdb zzgdb0 = zzgdc.zzc();
        zzgdb0.zzaj(((zzgdc)this.f));
        zzgdb0.zza(zzgji.zzw(arr_b, 0, v));
        return new zzgap(((zzfwl)zzfxk.zzg(s, ((zzgdc)zzgdb0.zzal()), zzfwl.class)));
    }
}

