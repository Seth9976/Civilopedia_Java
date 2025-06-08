package com.google.android.gms.internal.play_billing;

public enum zzju {
    DOUBLE(zzjv.zzd),
    FLOAT(zzjv.zzc),
    INT64(zzjv.zzb),
    UINT64(zzjv.zzb),
    INT32(zzjv.zza),
    FIXED64(zzjv.zzb),
    FIXED32(zzjv.zza),
    BOOL(zzjv.zze),
    STRING(zzjv.zzf),
    GROUP(zzjv.zzi),
    MESSAGE(zzjv.zzi),
    BYTES(zzjv.zzg),
    UINT32(zzjv.zza),
    ENUM(zzjv.zzh),
    SFIXED32(zzjv.zza),
    SFIXED64(zzjv.zzb),
    SINT32(zzjv.zza),
    SINT64(zzjv.zzb);

    public final zzjv i;

    public zzju(zzjv zzjv0) {
        this.i = zzjv0;
    }

    public final zzjv zza() {
        return this.i;
    }
}

