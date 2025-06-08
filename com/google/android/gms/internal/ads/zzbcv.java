package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.io.InputStream;

@Class(creator = "CacheEntryParcelCreator")
@Reserved({1})
public final class zzbcv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ParcelFileDescriptor i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final boolean m;

    static {
        zzbcv.CREATOR = new zzbcw();
    }

    public zzbcv() {
        this(null, false, false, 0L, false);
    }

    @Constructor
    public zzbcv(@Param(id = 2) ParcelFileDescriptor parcelFileDescriptor0, @Param(id = 3) boolean z, @Param(id = 4) boolean z1, @Param(id = 5) long v, @Param(id = 6) boolean z2) {
        this.i = parcelFileDescriptor0;
        this.j = z;
        this.k = z1;
        this.l = v;
        this.m = z2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        synchronized(this) {
        }
        SafeParcelWriter.writeParcelable(parcel0, 2, this.i, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzd());
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzf());
        SafeParcelWriter.writeLong(parcel0, 5, this.zza());
        SafeParcelWriter.writeBoolean(parcel0, 6, this.zzg());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final long zza() {
        synchronized(this) {
        }
        return this.l;
    }

    public final InputStream zzc() {
        synchronized(this) {
            if(this.i == null) {
                return null;
            }
            InputStream inputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(this.i);
            this.i = null;
            return inputStream0;
        }
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.j;
    }

    public final boolean zze() {
        synchronized(this) {
        }
        return this.i != null;
    }

    public final boolean zzf() {
        synchronized(this) {
        }
        return this.k;
    }

    public final boolean zzg() {
        synchronized(this) {
        }
        return this.m;
    }
}

