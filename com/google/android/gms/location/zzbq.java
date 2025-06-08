package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

@Class(creator = "RemoveGeofencingRequestCreator")
@Reserved({1000})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final zzbs i;
    public final PendingIntent j;
    public final String k;

    static {
        zzbq.CREATOR = new zzbr();
    }

    public zzbq(List list0, PendingIntent pendingIntent0, String s) {
        this.i = list0 == null ? zzbs.zzi() : zzbs.zzj(list0);
        this.j = pendingIntent0;
        this.k = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeStringList(parcel0, 1, this.i, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.j, v, false);
        SafeParcelWriter.writeString(parcel0, 3, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzbq zza(List list0) {
        Preconditions.checkNotNull(list0, "geofence can\'t be null.");
        Preconditions.checkArgument(!list0.isEmpty(), "Geofences must contains at least one id.");
        return new zzbq(list0, null, "");
    }

    public static zzbq zzb(PendingIntent pendingIntent0) {
        Preconditions.checkNotNull(pendingIntent0, "PendingIntent can not be null.");
        return new zzbq(null, pendingIntent0, "");
    }
}

