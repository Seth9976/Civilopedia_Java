package com.google.android.gms.common;

import K0.d;
import K0.e;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final d j;
    public final boolean k;
    public final boolean l;

    static {
        zzs.CREATOR = new zzt();
    }

    public zzs(String s, d d0, boolean z, boolean z1) {
        this.i = s;
        this.j = d0;
        this.k = z;
        this.l = z1;
    }

    public zzs(String s, IBinder iBinder0, boolean z, boolean z1) {
        IObjectWrapper iObjectWrapper0;
        this.i = s;
        d d0 = null;
        if(iBinder0 != null) {
            try {
                iObjectWrapper0 = zzz.zzg(iBinder0).zzd();
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", remoteException0);
                this.j = d0;
                this.k = z;
                this.l = z1;
                return;
            }
            byte[] arr_b = iObjectWrapper0 == null ? null : ((byte[])ObjectWrapper.unwrap(iObjectWrapper0));
            if(arr_b == null) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
            else {
                d0 = new e(arr_b);
            }
        }
        this.j = d0;
        this.k = z;
        this.l = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.i, false);
        d d0 = this.j;
        if(d0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            d0 = null;
        }
        SafeParcelWriter.writeIBinder(parcel0, 2, d0, false);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.k);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.l);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

