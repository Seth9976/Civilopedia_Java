package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

public final class zzqb {
    public final zzqf zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    public final Surface zzd;
    public final MediaCrypto zze;

    public zzqb(zzqf zzqf0, MediaFormat mediaFormat0, zzad zzad0, Surface surface0) {
        this.zza = zzqf0;
        this.zzb = mediaFormat0;
        this.zzc = zzad0;
        this.zzd = surface0;
        this.zze = null;
    }

    public static zzqb zza(zzqf zzqf0, MediaFormat mediaFormat0, zzad zzad0, MediaCrypto mediaCrypto0) {
        return new zzqb(zzqf0, mediaFormat0, zzad0, null);
    }

    public static zzqb zzb(zzqf zzqf0, MediaFormat mediaFormat0, zzad zzad0, Surface surface0, MediaCrypto mediaCrypto0) {
        return new zzqb(zzqf0, mediaFormat0, zzad0, surface0);
    }
}

