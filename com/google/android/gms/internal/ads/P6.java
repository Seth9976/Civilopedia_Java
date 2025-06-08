package com.google.android.gms.internal.ads;

public final class p6 extends zzfkv {
    public String a;
    public boolean b;
    public boolean c;
    public byte d;

    @Override  // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zza(String s) {
        if(s == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.a = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zzb(boolean z) {
        this.c = true;
        this.d = (byte)(this.d | 2);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkv
    public final zzfkv zzc(boolean z) {
        this.b = z;
        this.d = (byte)(this.d | 1);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfkv
    public final zzfkw zzd() {
        if(this.d == 3) {
            String s = this.a;
            if(s != null) {
                return new q6(s, this.b, this.c);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" clientVersion");
        }
        if((this.d & 1) == 0) {
            stringBuilder0.append(" shouldGetAdvertisingId");
        }
        if((this.d & 2) == 0) {
            stringBuilder0.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }
}

