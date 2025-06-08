package com.google.android.gms.internal.ads;

public final class zzfiw {
    public final String a;
    public final String b;

    public zzfiw(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static zzfiw zza(String s, String s1) {
        zzfjv.zza(s, "Name is null or empty");
        zzfjv.zza(s1, "Version is null or empty");
        return new zzfiw(s, s1);
    }

    public final String zzb() {
        return this.a;
    }

    public final String zzc() {
        return this.b;
    }
}

