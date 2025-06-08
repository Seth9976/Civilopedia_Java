package com.google.android.gms.internal.ads;

public enum zzgoa {
    DOUBLE(zzgob.zzd),
    FLOAT(zzgob.zzc),
    INT64(zzgob.zzb),
    UINT64(zzgob.zzb),
    INT32(zzgob.zza),
    FIXED64(zzgob.zzb),
    FIXED32(zzgob.zza),
    BOOL(zzgob.zze),
    STRING(zzgob.zzf),
    GROUP(zzgob.zzi),
    MESSAGE(zzgob.zzi),
    BYTES(zzgob.zzg),
    UINT32(zzgob.zza),
    ENUM(zzgob.zzh),
    SFIXED32(zzgob.zza),
    SFIXED64(zzgob.zzb),
    SINT32(zzgob.zza),
    SINT64(zzgob.zzb);

    public final zzgob i;

    public zzgoa(zzgob zzgob0) {
        this.i = zzgob0;
    }

    public final zzgob zza() {
        return this.i;
    }
}

