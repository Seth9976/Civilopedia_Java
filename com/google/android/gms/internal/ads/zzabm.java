package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabm extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    static {
        zzabm.CREATOR = new i(4);
    }

    public zzabm(Parcel parcel0) {
        super("APIC");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readInt();
        this.zzd = (byte[])zzeg.zzG(parcel0.createByteArray());
    }

    public zzabm(String s, String s1, int v, byte[] arr_b) {
        super("APIC");
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzabm.class == class0 && this.zzc == ((zzabm)object0).zzc && zzeg.zzS(this.zza, ((zzabm)object0).zza) && zzeg.zzS(this.zzb, ((zzabm)object0).zzb) && Arrays.equals(this.zzd, ((zzabm)object0).zzd);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.zzc + 0x20F) * 0x1F;
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return Arrays.hashCode(this.zzd) + ((v + v2) * 0x1F + v1) * 0x1F;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeByteArray(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final void zza(zzbf zzbf0) {
        zzbf0.zza(this.zzd, this.zzc);
    }
}

