package com.google.android.gms.internal.ads;

public abstract class zzacb implements zzbk {
    public final String zzf;

    public zzacb(String s) {
        this.zzf = s;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public void zza(zzbf zzbf0) {
    }
}

