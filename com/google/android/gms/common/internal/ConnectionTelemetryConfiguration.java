package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final RootTelemetryConfiguration i;
    public final boolean j;
    public final boolean k;
    public final int[] l;
    public final int m;
    public final int[] n;

    static {
        ConnectionTelemetryConfiguration.CREATOR = new zzm();
    }

    @Constructor
    public ConnectionTelemetryConfiguration(@Param(id = 1) RootTelemetryConfiguration rootTelemetryConfiguration0, @Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Param(id = 4) int[] arr_v, @Param(id = 5) int v, @Param(id = 6) int[] arr_v1) {
        this.i = rootTelemetryConfiguration0;
        this.j = z;
        this.k = z1;
        this.l = arr_v;
        this.m = v;
        this.n = arr_v1;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.m;
    }

    @KeepForSdk
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.l;
    }

    @KeepForSdk
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.n;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.j;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.k;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.i, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeIntArray(parcel0, 4, this.getMethodInvocationMethodKeyAllowlist(), false);
        SafeParcelWriter.writeInt(parcel0, 5, this.getMaxMethodInvocationsLogged());
        SafeParcelWriter.writeIntArray(parcel0, 6, this.getMethodInvocationMethodKeyDisallowlist(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final RootTelemetryConfiguration zza() {
        return this.i;
    }
}

