package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabs extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final zzacb[] i;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;

    static {
        zzabs.CREATOR = new i(7);
    }

    public zzabs(Parcel parcel0) {
        super("CTOC");
        this.zza = parcel0.readString();
        this.zzb = parcel0.readByte() != 0;
        this.zzc = parcel0.readByte() != 0;
        this.zzd = (String[])zzeg.zzG(parcel0.createStringArray());
        int v1 = parcel0.readInt();
        this.i = new zzacb[v1];
        for(int v = 0; v < v1; ++v) {
            this.i[v] = (zzacb)parcel0.readParcelable(zzacb.class.getClassLoader());
        }
    }

    public zzabs(String s, boolean z, boolean z1, String[] arr_s, zzacb[] arr_zzacb) {
        super("CTOC");
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = arr_s;
        this.i = arr_zzacb;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzabs.class == class0 && this.zzb == ((zzabs)object0).zzb && this.zzc == ((zzabs)object0).zzc && zzeg.zzS(this.zza, ((zzabs)object0).zza) && Arrays.equals(this.zzd, ((zzabs)object0).zzd) && Arrays.equals(this.i, ((zzabs)object0).i);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F;
        return this.zza == null ? v : v + this.zza.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeByte(((byte)this.zzb));
        parcel0.writeByte(((byte)this.zzc));
        parcel0.writeStringArray(this.zzd);
        zzacb[] arr_zzacb = this.i;
        parcel0.writeInt(arr_zzacb.length);
        for(int v1 = 0; v1 < arr_zzacb.length; ++v1) {
            parcel0.writeParcelable(arr_zzacb[v1], 0);
        }
    }
}

