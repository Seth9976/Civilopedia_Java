package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeyo {
    public static void zza(AtomicReference atomicReference0, zzeyn zzeyn0) {
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            return;
        }
        try {
            zzeyn0.zza(object0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
        catch(NullPointerException nullPointerException0) {
            zzcfi.zzk("NullPointerException occurs when invoking a method from a delegating listener.", nullPointerException0);
        }
    }
}

