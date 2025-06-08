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
@Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;

    static {
        RootTelemetryConfiguration.CREATOR = new zzaj();
    }

    @Constructor
    public RootTelemetryConfiguration(@Param(id = 1) int v, @Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Param(id = 4) int v1, @Param(id = 5) int v2) {
        this.i = v;
        this.j = z;
        this.k = z1;
        this.l = v1;
        this.m = v2;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.l;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.m;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.j;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.k;
    }

    @KeepForSdk
    public int getVersion() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getVersion());
        SafeParcelWriter.writeBoolean(parcel0, 2, this.getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel0, 4, this.getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel0, 5, this.getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

