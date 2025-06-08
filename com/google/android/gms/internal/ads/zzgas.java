package com.google.android.gms.internal.ads;

import i3.e;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class zzgas {
    public final Class a;
    public final Map b;
    public final Class c;

    public zzgas(Class class0, zzgat[] arr_zzgat) {
        this.a = class0;
        HashMap hashMap0 = new HashMap();
        for(int v = 0; v <= 0; ++v) {
            zzgat zzgat0 = arr_zzgat[v];
            boolean z = hashMap0.containsKey(zzgat0.a);
            Class class1 = zzgat0.a;
            if(z) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + class1.getCanonicalName());
            }
            hashMap0.put(class1, zzgat0);
        }
        this.c = arr_zzgat[0].a;
        this.b = Collections.unmodifiableMap(hashMap0);
    }

    public zzgar zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgma zzb(zzgji arg1) throws zzglc;

    public abstract String zzc();

    public abstract void zzd(zzgma arg1) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.c;
    }

    public final Class zzj() {
        return this.a;
    }

    public final Object zzk(zzgma zzgma0, Class class0) throws GeneralSecurityException {
        zzgat zzgat0 = (zzgat)this.b.get(class0);
        if(zzgat0 == null) {
            throw new IllegalArgumentException(e.f("Requested primitive class ", class0.getCanonicalName(), " not supported."));
        }
        return zzgat0.zza(zzgma0);
    }

    public final Set zzl() {
        return this.b.keySet();
    }
}

