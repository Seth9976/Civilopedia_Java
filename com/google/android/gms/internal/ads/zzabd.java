package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabd implements zzbk {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;

    static {
        zzab zzab0 = new zzab();
        zzab0.zzS("application/id3");
        zzab0.zzY();
        zzab zzab1 = new zzab();
        zzab1.zzS("application/x-scte35");
        zzab1.zzY();
        zzabd.CREATOR = new i(0);
    }

    public zzabd(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readLong();
        this.zzd = parcel0.readLong();
        this.zze = (byte[])zzeg.zzG(parcel0.createByteArray());
    }

    public zzabd(String s, String s1, long v, long v1, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = arr_b;
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
            return zzabd.class == class0 && this.zzc == ((zzabd)object0).zzc && this.zzd == ((zzabd)object0).zzd && zzeg.zzS(this.zza, ((zzabd)object0).zza) && zzeg.zzS(this.zzb, ((zzabd)object0).zzb) && Arrays.equals(this.zze, ((zzabd)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = 0;
            int v2 = this.zza == null ? 0 : this.zza.hashCode();
            String s = this.zzb;
            if(s != null) {
                v1 = s.hashCode();
            }
            int v3 = Arrays.hashCode(this.zze);
            v = ((((v2 + 0x20F) * 0x1F + v1) * 0x1F + ((int)(this.zzc ^ this.zzc >>> 0x20))) * 0x1F + ((int)(this.zzd >>> 0x20 ^ this.zzd))) * 0x1F + v3;
            this.i = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeLong(this.zzc);
        parcel0.writeLong(this.zzd);
        parcel0.writeByteArray(this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbf0) {
    }
}

