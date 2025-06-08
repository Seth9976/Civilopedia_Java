package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class zzfnx implements OnCompleteListener {
    public final x6 zza;

    public zzfnx(x6 x60) {
        this.zza = x60;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        x6 x60 = this.zza;
        if(task0.isCanceled()) {
            x60.cancel(false);
            return;
        }
        if(task0.isSuccessful()) {
            x60.zzd(task0.getResult());
            return;
        }
        Exception exception0 = task0.getException();
        if(exception0 == null) {
            throw new IllegalStateException();
        }
        x60.zze(exception0);
    }
}

