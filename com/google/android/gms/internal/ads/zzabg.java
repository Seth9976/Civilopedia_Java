package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzabg implements zzbk {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    static {
        zzabg.CREATOR = new i(1);
    }

    public zzabg(int v, String s, String s1, int v1, int v2, int v3, int v4, byte[] arr_b) {
        this.zza = v;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = arr_b;
    }

    public zzabg(Parcel parcel0) {
        this.zza = parcel0.readInt();
        this.zzb = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzd = parcel0.readInt();
        this.zze = parcel0.readInt();
        this.zzf = parcel0.readInt();
        this.zzg = parcel0.readInt();
        this.zzh = (byte[])zzeg.zzG(parcel0.createByteArray());
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
            return zzabg.class == class0 && this.zza == ((zzabg)object0).zza && this.zzb.equals(((zzabg)object0).zzb) && this.zzc.equals(((zzabg)object0).zzc) && this.zzd == ((zzabg)object0).zzd && this.zze == ((zzabg)object0).zze && this.zzf == ((zzabg)object0).zzf && this.zzg == ((zzabg)object0).zzg && Arrays.equals(this.zzh, ((zzabg)object0).zzh);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzh) + ((((f.b(f.b((this.zza + 0x20F) * 0x1F, 0x1F, this.zzb), 0x1F, this.zzc) + this.zzd) * 0x1F + this.zze) * 0x1F + this.zzf) * 0x1F + this.zzg) * 0x1F;
    }

    @Override
    public final String toString() {
        return f.j("Picture: mimeType=", this.zzb, ", description=", this.zzc);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.zza);
        parcel0.writeString(this.zzb);
        parcel0.writeString(this.zzc);
        parcel0.writeInt(this.zzd);
        parcel0.writeInt(this.zze);
        parcel0.writeInt(this.zzf);
        parcel0.writeInt(this.zzg);
        parcel0.writeByteArray(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbf0) {
        zzbf0.zza(this.zzh, this.zza);
    }

    public static zzabg zzb(zzdy zzdy0) {
        int v = zzdy0.zze();
        String s = zzdy0.zzx(zzdy0.zze(), zzfoi.zza);
        String s1 = zzdy0.zzx(zzdy0.zze(), zzfoi.zzc);
        int v1 = zzdy0.zze();
        int v2 = zzdy0.zze();
        int v3 = zzdy0.zze();
        int v4 = zzdy0.zze();
        int v5 = zzdy0.zze();
        byte[] arr_b = new byte[v5];
        zzdy0.zzB(arr_b, 0, v5);
        return new zzabg(v, s, s1, v1, v2, v3, v4, arr_b);
    }
}

