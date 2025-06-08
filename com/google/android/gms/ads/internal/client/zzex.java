package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzex extends zzda {
    public final OnAdMetadataChangedListener i;

    public zzex(OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        this.i = onAdMetadataChangedListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener0 = this.i;
        if(onAdMetadataChangedListener0 != null) {
            onAdMetadataChangedListener0.onAdMetadataChanged();
        }
    }
}

