package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.location.zzaw;
import com.google.android.gms.location.zzax;

@Class(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final zzj j;
    public final zzax k;
    public final zzai l;

    static {
        zzl.CREATOR = new zzm();
    }

    public zzl(int v, zzj zzj0, IBinder iBinder0, IBinder iBinder1) {
        this.i = v;
        this.j = zzj0;
        zzai zzai0 = null;
        this.k = iBinder0 == null ? null : zzaw.zzb(iBinder0);
        if(iBinder1 != null) {
            IInterface iInterface0 = iBinder1.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzai0 = iInterface0 instanceof zzai ? ((zzai)iInterface0) : new zzag(iBinder1);
        }
        this.l = zzai0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.j, v, false);
        IBinder iBinder0 = null;
        SafeParcelWriter.writeIBinder(parcel0, 3, (this.k == null ? null : this.k.asBinder()), false);
        zzai zzai0 = this.l;
        if(zzai0 != null) {
            iBinder0 = zzai0.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel0, 4, iBinder0, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

