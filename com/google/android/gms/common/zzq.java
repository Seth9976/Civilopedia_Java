package com.google.android.gms.common;

import O2.A;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import javax.annotation.Nullable;

@Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final String j;
    public final int k;
    public final int l;

    static {
        zzq.CREATOR = new zzr();
    }

    public zzq(String s, int v, int v1, boolean z) {
        this.i = z;
        this.j = s;
        this.k = A.g0(v) - 1;
        int v2 = 1;
        for(int v3 = 0; v3 < 3; ++v3) {
            int v4 = new int[]{1, 2, 3}[v3];
            if(v4 == 0) {
                throw null;
            }
            if(v4 - 1 == v1) {
                v2 = v4;
                break;
            }
        }
        this.l = v2 - 1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.i);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeInt(parcel0, 4, this.l);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public final String zza() {
        return this.j;
    }

    public final boolean zzb() {
        return this.i;
    }

    public final int zzc() {
        for(int v = 0; v < 3; ++v) {
            int v1 = new int[]{1, 2, 3}[v];
            if(v1 == 0) {
                throw null;
            }
            if(v1 - 1 == this.l) {
                return v1;
            }
        }
        return 1;
    }

    public final int zzd() {
        return A.g0(this.k);
    }
}

