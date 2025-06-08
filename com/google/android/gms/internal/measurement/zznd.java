package com.google.android.gms.internal.measurement;

public enum zznd {
    DOUBLE(zzne.zzd),
    FLOAT(zzne.zzc),
    INT64(zzne.zzb),
    UINT64(zzne.zzb),
    INT32(zzne.zza),
    FIXED64(zzne.zzb),
    FIXED32(zzne.zza),
    BOOL(zzne.zze),
    STRING(zzne.zzf),
    GROUP(zzne.zzi),
    MESSAGE(zzne.zzi),
    BYTES(zzne.zzg),
    UINT32(zzne.zza),
    ENUM(zzne.zzh),
    SFIXED32(zzne.zza),
    SFIXED64(zzne.zzb),
    SINT32(zzne.zza),
    SINT64(zzne.zzb);

    public final zzne i;

    public zznd(zzne zzne0) {
        this.i = zzne0;
    }

    public final zzne zza() {
        return this.i;
    }
}

