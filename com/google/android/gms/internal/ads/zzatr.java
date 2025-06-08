package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

public final class zzatr implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public final UUID j;
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;

    static {
        zzatr.CREATOR = new i(21);
    }

    public zzatr(Parcel parcel0) {
        this.j = new UUID(parcel0.readLong(), parcel0.readLong());
        this.zza = parcel0.readString();
        this.zzb = parcel0.createByteArray();
        this.zzc = parcel0.readByte() != 0;
    }

    public zzatr(UUID uUID0, String s, byte[] arr_b, boolean z) {
        uUID0.getClass();
        this.j = uUID0;
        this.zza = s;
        arr_b.getClass();
        this.zzb = arr_b;
        this.zzc = false;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzatr)) {
            return false;
        }
        return object0 == this ? true : this.zza.equals(((zzatr)object0).zza) && zzazo.zzo(this.j, ((zzatr)object0).j) && Arrays.equals(this.zzb, ((zzatr)object0).zzb);
    }

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzb) + f.b(this.j.hashCode() * 0x1F, 0x1F, this.zza);
            this.i = v1;
            return v1;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.j.getMostSignificantBits());
        parcel0.writeLong(this.j.getLeastSignificantBits());
        parcel0.writeString(this.zza);
        parcel0.writeByteArray(this.zzb);
        parcel0.writeByte(((byte)this.zzc));
    }
}

