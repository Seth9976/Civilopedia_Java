package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.location.zzaz;
import com.google.android.gms.location.zzbd;

@Class(creator = "LocationRequestUpdateDataCreator")
@Reserved({1000})
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final zzba j;
    public final zzbd k;
    public final PendingIntent l;
    public final com.google.android.gms.location.zzba m;
    public final zzai n;

    static {
        zzbc.CREATOR = new com.google.android.gms.internal.location.zzbd();
    }

    public zzbc(int v, zzba zzba0, IBinder iBinder0, PendingIntent pendingIntent0, IBinder iBinder1, IBinder iBinder2) {
        this.i = v;
        this.j = zzba0;
        zzai zzai0 = null;
        this.k = iBinder0 == null ? null : com.google.android.gms.location.zzbc.zzb(iBinder0);
        this.l = pendingIntent0;
        this.m = iBinder1 == null ? null : zzaz.zzb(iBinder1);
        if(iBinder2 != null) {
            IInterface iInterface0 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzai0 = iInterface0 instanceof zzai ? ((zzai)iInterface0) : new zzag(iBinder2);
        }
        this.n = zzai0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.j, v, false);
        IBinder iBinder0 = null;
        SafeParcelWriter.writeIBinder(parcel0, 3, (this.k == null ? null : this.k.asBinder()), false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.l, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 5, (this.m == null ? null : this.m.asBinder()), false);
        zzai zzai0 = this.n;
        if(zzai0 != null) {
            iBinder0 = zzai0.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel0, 6, iBinder0, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzbc zza(zzbd zzbd0, zzai zzai0) {
        if(zzai0 == null) {
            zzai0 = null;
        }
        return new zzbc(2, null, ((IBinder)zzbd0), null, null, ((IBinder)zzai0));
    }

    public static zzbc zzb(zzba zzba0, PendingIntent pendingIntent0, zzai zzai0) {
        return new zzbc(1, zzba0, null, pendingIntent0, null, ((IBinder)zzai0));
    }

    public static zzbc zzc(com.google.android.gms.location.zzba zzba0, zzai zzai0) {
        if(zzai0 == null) {
            zzai0 = null;
        }
        return new zzbc(2, null, null, null, ((IBinder)zzba0), ((IBinder)zzai0));
    }
}

