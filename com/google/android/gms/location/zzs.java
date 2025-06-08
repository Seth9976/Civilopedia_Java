package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@ShowFirstParty
@Class(creator = "DeviceOrientationRequestCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final long j;
    public final float k;
    public final long l;
    public final int m;

    static {
        zzs.CREATOR = new zzt();
    }

    public zzs() {
        this(true, 50L, 0.0f, 0x7FFFFFFFFFFFFFFFL, 0x7FFFFFFF);
    }

    public zzs(boolean z, long v, float f, long v1, int v2) {
        this.i = z;
        this.j = v;
        this.k = f;
        this.l = v1;
        this.m = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzs ? this.i == ((zzs)object0).i && this.j == ((zzs)object0).j && Float.compare(this.k, ((zzs)object0).k) == 0 && this.l == ((zzs)object0).l && this.m == ((zzs)object0).m : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.i), this.j, this.k, this.l, this.m});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(" mMinimumSamplingPeriodMs=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(" mSmallestAngleChangeRadians=");
        stringBuilder0.append(this.k);
        long v = this.l;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            long v1 = SystemClock.elapsedRealtime();
            stringBuilder0.append(" expireIn=");
            stringBuilder0.append(v - v1);
            stringBuilder0.append("ms");
        }
        int v2 = this.m;
        if(v2 != 0x7FFFFFFF) {
            stringBuilder0.append(" num=");
            stringBuilder0.append(v2);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.i);
        SafeParcelWriter.writeLong(parcel0, 2, this.j);
        SafeParcelWriter.writeFloat(parcel0, 3, this.k);
        SafeParcelWriter.writeLong(parcel0, 4, this.l);
        SafeParcelWriter.writeInt(parcel0, 5, this.m);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

