package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class Wrappers {
    public PackageManagerWrapper a;
    public static final Wrappers b;

    static {
        Wrappers.b = new Wrappers();
    }

    public Wrappers() {
        this.a = null;
    }

    @KeepForSdk
    public static PackageManagerWrapper packageManager(Context context0) {
        return Wrappers.b.zza(context0);
    }

    public final PackageManagerWrapper zza(Context context0) {
        synchronized(this) {
            if(this.a == null) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                this.a = new PackageManagerWrapper(context0);
            }
            return this.a;
        }
    }
}

