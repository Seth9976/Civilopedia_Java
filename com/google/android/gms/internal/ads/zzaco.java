package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzaco implements zzbk {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    static {
        zzaco.CREATOR = new i(15);
    }

    public zzaco(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = (byte[])zzeg.zzG(parcel0.createByteArray());
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readInt();
    }

    public zzaco(String s, byte[] arr_b, int v, int v1) {
        this.zza = s;
        this.zzb = arr_b;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzaco.class == class0 && this.zza.equals(((zzaco)object0).zza) && Arrays.equals(this.zzb, ((zzaco)object0).zzb) && this.zzc == ((zzaco)object0).zzc && this.zzd == ((zzaco)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.zzb) + f.b(0x20F, 0x1F, this.zza)) * 0x1F + this.zzc) * 0x1F + this.zzd;
    }

    @Override
    public final String toString() {
        return "mdta: key=" + this.zza;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeInt(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbf0) {
    }
}

