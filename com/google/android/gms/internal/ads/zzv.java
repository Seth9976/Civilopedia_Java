package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzv implements Parcelable, Comparator {
    public static final Parcelable.Creator CREATOR;
    public final zzu[] i;
    public int j;
    public final String zza;
    public final int zzb;

    static {
        zzv.CREATOR = new i(28);
    }

    public zzv(Parcel parcel0) {
        this.zza = parcel0.readString();
        zzu[] arr_zzu = (zzu[])zzeg.zzG(((zzu[])parcel0.createTypedArray(zzu.CREATOR)));
        this.i = arr_zzu;
        this.zzb = arr_zzu.length;
    }

    public zzv(String s, boolean z, zzu[] arr_zzu) {
        this.zza = s;
        if(z) {
            arr_zzu = (zzu[])arr_zzu.clone();
        }
        this.i = arr_zzu;
        this.zzb = arr_zzu.length;
        Arrays.sort(arr_zzu, this);
    }

    public zzv(String s, zzu[] arr_zzu) {
        this(null, true, arr_zzu);
    }

    public zzv(List list0) {
        this(null, false, ((zzu[])list0.toArray(new zzu[0])));
    }

    @Override
    public final int compare(Object object0, Object object1) {
        UUID uUID0 = zzm.zza;
        if(uUID0.equals(((zzu)object0).zza)) {
            return uUID0.equals(((zzu)object1).zza) ? 0 : 1;
        }
        return ((zzu)object0).zza.compareTo(((zzu)object1).zza);
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
            return zzv.class == class0 && zzeg.zzS(this.zza, ((zzv)object0).zza) && Arrays.equals(this.i, ((zzv)object0).i);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.j;
        if(v == 0) {
            v = (this.zza == null ? 0 : this.zza.hashCode()) * 0x1F + Arrays.hashCode(this.i);
            this.j = v;
        }
        return v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeTypedArray(this.i, 0);
    }

    public final zzu zza(int v) {
        return this.i[v];
    }

    // 去混淆评级： 低(20)
    public final zzv zzb(String s) {
        return zzeg.zzS(this.zza, s) ? this : new zzv(s, false, this.i);
    }
}

