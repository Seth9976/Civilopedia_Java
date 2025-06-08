package com.google.android.gms.internal.ads;

public final class q6 extends zzfkw {
    public final String a;
    public final boolean b;
    public final boolean c;

    public q6(String s, boolean z, boolean z1) {
        this.a = s;
        this.b = z;
        this.c = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfkw) {
            String s = ((zzfkw)object0).zzb();
            if(this.a.equals(s)) {
                boolean z = ((zzfkw)object0).zzd();
                if(this.b == z) {
                    boolean z1 = ((zzfkw)object0).zzc();
                    return this.c == z1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0x4CF;
        int v2 = this.b ? 0x4CF : 0x4D5;
        if(!this.c) {
            v1 = 0x4D5;
        }
        return ((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AdShield2Options{clientVersion=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", shouldGetAdvertisingId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isGooglePlayServicesAvailable=");
        return u9.g(stringBuilder0, this.c, "}");
    }

    @Override  // com.google.android.gms.internal.ads.zzfkw
    public final String zzb() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzc() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzd() {
        return this.b;
    }
}

