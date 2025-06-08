package com.google.android.gms.internal.ads;

public abstract class zzgqm {
    public abstract void zza(String arg1);

    public static zzgqm zzb(Class class0) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgqh(class0.getSimpleName()) : new zzgqj(class0.getSimpleName());
    }
}

