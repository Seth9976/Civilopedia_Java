package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzawm extends zzawk {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzawm.CREATOR = new i(25);
    }

    public zzawm(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzawm(String s, String s1, String s2) {
        super(s);
        this.zza = null;
        this.zzb = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzawm.class == class0 && this.zze.equals(((zzawm)object0).zze) && zzazo.zzo(this.zza, ((zzawm)object0).zza) && zzazo.zzo(this.zzb, ((zzawm)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = f.b(0x20F, 0x1F, this.zze);
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zze);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }
}

