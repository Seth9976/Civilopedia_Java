package com.google.android.gms.internal.ads;

public abstract class zzgiq implements zzglz {
    public abstract zzgkm a(zzgir arg1);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzaf();
    }

    public abstract zzgiq zzaf();

    @Override  // com.google.android.gms.internal.ads.zzglz
    public final zzglz zzah(zzgma zzgma0) {
        if(!this.zzbh().getClass().isInstance(zzgma0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return this.a(((zzgir)zzgma0));
    }
}

