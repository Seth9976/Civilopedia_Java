package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public class zzabi implements zzbk {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzabi.CREATOR = new i(2);
    }

    public zzabi(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzabi(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zza.equals(((zzabi)object0).zza) && this.zzb.equals(((zzabi)object0).zzb);
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode() + f.b(0x20F, 0x1F, this.zza);
    }

    @Override
    public final String toString() {
        return f.j("VC: ", this.zza, "=", this.zzb);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbf0) {
        switch(this.zza) {
            case "ALBUM": {
                zzbf0.zzd(this.zzb);
                return;
            }
            case "ALBUMARTIST": {
                zzbf0.zzc(this.zzb);
                return;
            }
            case "ARTIST": {
                zzbf0.zze(this.zzb);
                return;
            }
            case "DESCRIPTION": {
                zzbf0.zzi(this.zzb);
                return;
            }
            case "TITLE": {
                zzbf0.zzr(this.zzb);
            }
        }
    }
}

