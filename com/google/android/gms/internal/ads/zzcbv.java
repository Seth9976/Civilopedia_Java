package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzcbv extends zzcba {
    public final String i;
    public final int j;

    public zzcbv(RewardItem rewardItem0) {
        this((rewardItem0 == null ? "" : rewardItem0.getType()), (rewardItem0 == null ? 1 : rewardItem0.getAmount()));
    }

    public zzcbv(String s, int v) {
        this.i = s;
        this.j = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbb
    public final int zze() throws RemoteException {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbb
    public final String zzf() throws RemoteException {
        return this.i;
    }
}

