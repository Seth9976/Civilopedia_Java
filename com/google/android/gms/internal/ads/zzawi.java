package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzawi extends zzawk {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;

    static {
        zzawi.CREATOR = new i(24);
    }

    public zzawi(Parcel parcel0) {
        super("COMM");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
    }

    public zzawi(String s, String s1, String s2) {
        super("COMM");
        this.zza = "und";
        this.zzb = s1;
        this.zzc = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzawi.class == class0 && zzazo.zzo(this.zzb, ((zzawi)object0).zzb) && zzazo.zzo(this.zza, ((zzawi)object0).zza) && zzazo.zzo(this.zzc, ((zzawi)object0).zzc);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        String s = this.zzc;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 + 0x20F) * 0x1F + v2) * 0x1F + v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zze);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzc);
    }
}

