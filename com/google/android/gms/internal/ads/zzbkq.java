package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbkq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        zzff zzff0 = null;
        int v1 = 0;
        boolean z = false;
        int v2 = 0;
        boolean z1 = false;
        int v3 = 0;
        boolean z2 = false;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v5)) {
                case 1: {
                    v1 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 2: {
                    z = SafeParcelReader.readBoolean(parcel0, v5);
                    break;
                }
                case 3: {
                    v2 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 4: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v5);
                    break;
                }
                case 5: {
                    v3 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                case 6: {
                    zzff0 = (zzff)SafeParcelReader.createParcelable(parcel0, v5, zzff.CREATOR);
                    break;
                }
                case 7: {
                    z2 = SafeParcelReader.readBoolean(parcel0, v5);
                    break;
                }
                case 8: {
                    v4 = SafeParcelReader.readInt(parcel0, v5);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v5);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzbkp(v1, z, v2, z1, v3, zzff0, z2, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzbkp[v];
    }
}

