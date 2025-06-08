package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabq extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final zzacb[] i;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;

    static {
        zzabq.CREATOR = new i(6);
    }

    public zzabq(Parcel parcel0) {
        super("CHAP");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readInt();
        this.zzc = parcel0.readInt();
        this.zzd = parcel0.readLong();
        this.zze = parcel0.readLong();
        int v = parcel0.readInt();
        this.i = new zzacb[v];
        for(int v1 = 0; v1 < v; ++v1) {
            this.i[v1] = (zzacb)parcel0.readParcelable(zzacb.class.getClassLoader());
        }
    }

    public zzabq(String s, int v, int v1, long v2, long v3, zzacb[] arr_zzacb) {
        super("CHAP");
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.i = arr_zzacb;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
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
            return zzabq.class == class0 && this.zzb == ((zzabq)object0).zzb && this.zzc == ((zzabq)object0).zzc && this.zzd == ((zzabq)object0).zzd && this.zze == ((zzabq)object0).zze && zzeg.zzS(this.zza, ((zzabq)object0).zza) && Arrays.equals(this.i, ((zzabq)object0).i);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + ((int)this.zzd)) * 0x1F + ((int)this.zze)) * 0x1F;
        return this.zza == null ? v : v + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeLong(this.zze);
        zzacb[] arr_zzacb = this.i;
        parcel0.writeInt(arr_zzacb.length);
        for(int v1 = 0; v1 < arr_zzacb.length; ++v1) {
            parcel0.writeParcelable(arr_zzacb[v1], 0);
        }
    }
}

