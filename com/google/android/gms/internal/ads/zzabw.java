package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import i3.e;
import java.util.Arrays;

public final class zzabw extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    static {
        zzabw.CREATOR = new i(9);
    }

    public zzabw(Parcel parcel0) {
        super("GEOB");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = (byte[])zzeg.zzG(parcel0.createByteArray());
    }

    public zzabw(String s, String s1, String s2, byte[] arr_b) {
        super("GEOB");
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzabw.class == class0 && zzeg.zzS(this.zza, ((zzabw)object0).zza) && zzeg.zzS(this.zzb, ((zzabw)object0).zzb) && zzeg.zzS(this.zzc, ((zzabw)object0).zzc) && Arrays.equals(this.zzd, ((zzabw)object0).zzd);
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
        return Arrays.hashCode(this.zzd) + (((v1 + 0x20F) * 0x1F + v2) * 0x1F + v) * 0x1F;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.zzf);
        stringBuilder0.append(": mimeType=");
        stringBuilder0.append(this.zza);
        stringBuilder0.append(", filename=");
        stringBuilder0.append(this.zzb);
        return e.h(stringBuilder0, ", description=", this.zzc);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }
}

