package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        int v1 = 1000;
        long v2 = 0L;
        zzbo[] arr_zzbo = null;
        int v3 = 1;
        int v4 = 1;
        while(parcel0.dataPosition() < v) {
            int v5 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v5)) {
                case 1: {
                    v3 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 2: {
                    v4 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readLong(parcel0, v5);
                    break;
                }
                case 4: {
                    v1 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 5: {
                    arr_zzbo = (zzbo[])SafeParcelReader.createTypedArray(parcel0, v5, zzbo.CREATOR);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v5);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        LocationAvailability locationAvailability0 = new LocationAvailability();  // 初始化器: Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V
        locationAvailability0.l = v1;
        locationAvailability0.i = v3;
        locationAvailability0.j = v4;
        locationAvailability0.k = v2;
        locationAvailability0.m = arr_zzbo;
        return locationAvailability0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationAvailability[v];
    }
}

