package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Class(creator = "ModuleAvailabilityResponseCreator")
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    @Retention(RetentionPolicy.CLASS)
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;

    }

    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final int j;

    static {
        ModuleAvailabilityResponse.CREATOR = new zaa();
    }

    @KeepForSdk
    @Constructor
    public ModuleAvailabilityResponse(@Param(id = 1) boolean z, @Param(id = 2) int v) {
        this.i = z;
        this.j = v;
    }

    public boolean areModulesAvailable() {
        return this.i;
    }

    @AvailabilityStatus
    public int getAvailabilityStatus() {
        return this.j;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.areModulesAvailable());
        SafeParcelWriter.writeInt(parcel0, 2, this.getAvailabilityStatus());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

