package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import i3.e;

public final class zzabk implements zzbk {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    static {
        zzabk.CREATOR = new i(3);
    }

    public zzabk(int v, String s, String s1, String s2, boolean z, int v1) {
        zzcw.zzd(v1 == -1 || v1 > 0);
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        this.zzf = v1;
    }

    public zzabk(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readString();
        this.zze = zzeg.zzY(parcel0);
        this.zzf = parcel0.readInt();
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
            return zzabk.class == class0 && this.zza == ((zzabk)object0).zza && zzeg.zzS(this.zzb, ((zzabk)object0).zzb) && zzeg.zzS(this.zzc, ((zzabk)object0).zzc) && zzeg.zzS(this.zzd, ((zzabk)object0).zzd) && this.zze == ((zzabk)object0).zze && this.zzf == ((zzabk)object0).zzf;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.zza + 0x20F) * 0x1F;
        int v1 = 0;
        int v2 = this.zzb == null ? 0 : this.zzb.hashCode();
        int v3 = this.zzc == null ? 0 : this.zzc.hashCode();
        String s = this.zzd;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.zze) * 0x1F + this.zzf;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = e.j("IcyHeaders: name=\"", this.zzc, "\", genre=\"", this.zzb, "\", bitrate=");
        stringBuilder0.append(this.zza);
        stringBuilder0.append(", metadataInterval=");
        stringBuilder0.append(this.zzf);
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeString(this.zzd);
        zzeg.zzR(parcel0, this.zze);
        parcel0.writeInt(this.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbf0) {
        String s = this.zzc;
        if(s != null) {
            zzbf0.zzq(s);
        }
        String s1 = this.zzb;
        if(s1 != null) {
            zzbf0.zzj(s1);
        }
    }
}

