package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;

@Class(creator = "LargeParcelTeleporterCreator")
@Reserved({1})
public final class zzbzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ParcelFileDescriptor i;
    public Parcelable j;
    public boolean k;

    static {
        zzbzt.CREATOR = new zzbzu();
    }

    @Constructor
    public zzbzt(@Param(id = 2) ParcelFileDescriptor parcelFileDescriptor0) {
        this.i = parcelFileDescriptor0;
        this.j = null;
        this.k = true;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        byte[] arr_b;
        ParcelFileDescriptor.AutoCloseOutputStream parcelFileDescriptor$AutoCloseOutputStream0;
        if(this.i == null) {
            Parcel parcel1 = Parcel.obtain();
            try {
                this.j.writeToParcel(parcel1, 0);
                arr_b = parcel1.marshall();
            }
            finally {
                parcel1.recycle();
            }
            ParcelFileDescriptor parcelFileDescriptor0 = null;
            try {
                ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
                parcelFileDescriptor$AutoCloseOutputStream0 = null;
                parcelFileDescriptor$AutoCloseOutputStream0 = new ParcelFileDescriptor.AutoCloseOutputStream(arr_parcelFileDescriptor[1]);
                zzbzs zzbzs0 = new zzbzs(parcelFileDescriptor$AutoCloseOutputStream0, arr_b);
                zzcfv.zza.execute(zzbzs0);
                parcelFileDescriptor0 = arr_parcelFileDescriptor[0];
            }
            catch(IOException iOException0) {
                zzcfi.zzh("Error transporting the ad response", iOException0);
                zzt.zzo().zzt(iOException0, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly(parcelFileDescriptor$AutoCloseOutputStream0);
            }
            this.i = parcelFileDescriptor0;
        }
        int v2 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.i, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v2);
    }

    public final SafeParcelable zza(Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b;
        int v1;
        if(this.k) {
            if(this.i == null) {
                zzcfi.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream0 = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.i));
            try {
                v1 = dataInputStream0.readInt();
                arr_b = new byte[v1];
                dataInputStream0.readFully(arr_b, 0, v1);
            }
            catch(IOException iOException0) {
                zzcfi.zzh("Could not read from parcel file descriptor", iOException0);
                return null;
            }
            finally {
                IOUtils.closeQuietly(dataInputStream0);
            }
            Parcel parcel0 = Parcel.obtain();
            try {
                parcel0.unmarshall(arr_b, 0, v1);
                parcel0.setDataPosition(0);
                this.j = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
            }
            finally {
                parcel0.recycle();
            }
            this.k = false;
            return (SafeParcelable)this.j;
        }
        return (SafeParcelable)this.j;
    }
}

