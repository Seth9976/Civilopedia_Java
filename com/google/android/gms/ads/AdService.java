package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfi;

@KeepForSdk
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override  // android.app.IntentService
    public final void onHandleIntent(Intent intent0) {
        try {
            zzaw.zza().zzl(this, new zzbtx()).zze(intent0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzg(("RemoteException calling handleNotificationIntent: " + remoteException0.toString()));
        }
    }
}

