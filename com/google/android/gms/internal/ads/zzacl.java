package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzacl extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzacl.CREATOR = new i(14);
    }

    public zzacl(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzacl(String s, String s1, String s2) {
        super(s);
        this.zza = s1;
        this.zzb = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzacl.class == class0 && this.zzf.equals(((zzacl)object0).zzf) && zzeg.zzS(this.zza, ((zzacl)object0).zza) && zzeg.zzS(this.zzb, ((zzacl)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = f.b(0x20F, 0x1F, this.zzf);
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return f.i(this.zzf, ": url=", this.zzb);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }
}

