package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzcbo implements RewardItem {
    public final zzcbb i;

    public zzcbo(zzcbb zzcbb0) {
        this.i = zzcbb0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcbb zzcbb0 = this.i;
        if(zzcbb0 != null) {
            try {
                return zzcbb0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Could not forward getAmount to RewardItem", remoteException0);
            }
        }
        return 0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcbb zzcbb0 = this.i;
        if(zzcbb0 != null) {
            try {
                return zzcbb0.zzf();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Could not forward getType to RewardItem", remoteException0);
            }
        }
        return null;
    }
}

