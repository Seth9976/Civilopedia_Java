package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfkt implements Continuation {
    public final zzaku zza;
    public final int zzb;

    public zzfkt(zzaku zzaku0, int v) {
        this.zza = zzaku0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        zzaku zzaku0 = this.zza;
        int v = this.zzb;
        if(task0.isSuccessful()) {
            zzfmv zzfmv0 = ((zzfmw)task0.getResult()).zza(((zzaky)zzaku0.zzal()).zzaw());
            zzfmv0.zza(v);
            zzfmv0.zzc();
            return true;
        }
        return false;
    }
}

