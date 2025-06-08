package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class zzeci implements zzfuj {
    public final zzeco zza;

    public zzeci(zzeco zzeco0) {
        this.zza = zzeco0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
        zzfdb zzfdb0 = new zzfdb(((InputStream)object0), arr_parcelFileDescriptor[1]);
        zzcfv.zza.execute(zzfdb0);
        return zzfvc.zzi(parcelFileDescriptor0);
    }
}

