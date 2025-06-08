package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Message;

public final class zzdh implements Handler.Callback {
    public final zzdm zza;

    public zzdh(zzdm zzdm0) {
        this.zza = zzdm0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        zzdm.zzg(this.zza, message0);
        return true;
    }
}

