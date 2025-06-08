package com.google.android.gms.internal.measurement;

import A.f;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbz extends zzce {
    public final AtomicReference i;
    public boolean j;

    public zzbz() {
        this.i = new AtomicReference();
    }

    public final Bundle zzb(long v) {
        synchronized(this.i) {
            if(!this.j) {
                try {
                    this.i.wait(v);
                }
                catch(InterruptedException unused_ex) {
                    return null;
                }
            }
        }
        return (Bundle)this.i.get();
    }

    public final String zzc(long v) {
        return (String)zzbz.zze(this.zzb(v), String.class);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle0) {
        synchronized(this.i) {
            try {
                this.i.set(bundle0);
                this.j = true;
            }
            catch(Throwable throwable0) {
                this.i.notify();
                throw throwable0;
            }
        }
        this.i.notify();
    }

    public static final Object zze(Bundle bundle0, Class class0) {
        if(bundle0 != null) {
            Object object0 = bundle0.get("r");
            if(object0 != null) {
                try {
                    return class0.cast(object0);
                }
                catch(ClassCastException classCastException0) {
                    Log.w("AM", f.j("Unexpected object type. Expected, Received: ", class0.getCanonicalName(), ", ", object0.getClass().getCanonicalName()), classCastException0);
                    throw classCastException0;
                }
            }
        }
        return null;
    }
}

