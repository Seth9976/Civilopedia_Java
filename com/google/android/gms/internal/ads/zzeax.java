package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzaz;

public final class zzeax extends zzbzq {
    public final zzeay i;

    public zzeax(zzeay zzeay0) {
        this.i = zzeay0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbzr
    public final void zze(zzaz zzaz0) {
        zzay zzay0 = new zzay(zzaz0.zza, zzaz0.zzb);
        this.i.i.zze(zzay0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbzr
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) {
        ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
        this.i.i.zzd(parcelFileDescriptor$AutoCloseInputStream0);
    }
}

