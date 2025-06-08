package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

public final class zzef extends zzct {
    public final String i;
    public final String j;

    public zzef(String s, String s1) {
        this.i = s;
        this.j = s1;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcu
    public final String zze() throws RemoteException {
        return this.i;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcu
    public final String zzf() throws RemoteException {
        return this.j;
    }
}

