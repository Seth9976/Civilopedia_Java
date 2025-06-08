package com.google.android.gms.ads.internal.offline.buffering;

import Y.f;
import Y.i;
import Y.k;
import Y.l;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzbxl;

@KeepForSdk
public class OfflinePingSender extends Worker {
    public final zzbxl o;

    public OfflinePingSender(Context context0, WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.o = zzaw.zza().zzl(context0, new zzbtx());
    }

    @Override  // androidx.work.Worker
    public final l doWork() {
        try {
            this.o.zzf();
            return new k(f.c);
        }
        catch(RemoteException unused_ex) {
            return new i();
        }
    }
}

