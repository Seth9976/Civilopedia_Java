package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@Class(creator = "ParcelableGeofenceCreator")
@Reserved({1000})
@VisibleForTesting
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final long j;
    public final short k;
    public final double l;
    public final double m;
    public final float n;
    public final int o;
    public final int p;
    public final int q;

    static {
        zzbe.CREATOR = new zzbf();
    }

    @Constructor
    public zzbe(@Param(id = 1) String s, @Param(id = 7) int v, @Param(id = 3) short v1, @Param(id = 4) double f, @Param(id = 5) double f1, @Param(id = 6) float f2, @Param(id = 2) long v2, @Param(id = 8) int v3, @Param(id = 9) int v4) {
        if(s != null && s.length() <= 100) {
            if(f2 <= 0.0f) {
                throw new IllegalArgumentException("invalid radius: " + f2);
            }
            if(f > 90.0 || f < -90.0) {
                throw new IllegalArgumentException("invalid latitude: " + f);
            }
            if(f1 > 180.0 || f1 < -180.0) {
                throw new IllegalArgumentException("invalid longitude: " + f1);
            }
            if((v & 7) == 0) {
                throw new IllegalArgumentException("No supported transition specified: " + v);
            }
            this.k = v1;
            this.i = s;
            this.l = f;
            this.m = f1;
            this.n = f2;
            this.j = v2;
            this.o = v & 7;
            this.p = v3;
            this.q = v4;
            return;
        }
        String s1 = String.valueOf(s);
        throw new IllegalArgumentException((s1.length() == 0 ? new String("requestId is null or too long: ") : "requestId is null or too long: " + s1));
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof zzbe && this.n == ((zzbe)object0).n && this.l == ((zzbe)object0).l && this.m == ((zzbe)object0).m && this.k == ((zzbe)object0).k;
    }

    @Override  // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.i;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.l);
        long v1 = Double.doubleToLongBits(this.m);
        return ((Float.floatToIntBits(this.n) + ((((int)(v ^ v >>> 0x20)) + 0x1F) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F) * 0x1F + this.k) * 0x1F + this.o;
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        switch(this.k) {
            case -1: {
                return String.format(locale0, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", "INVALID", this.i.replaceAll("\\p{C}", "?"), this.o, this.l, this.m, this.n, ((int)(this.p / 1000)), this.q, this.j);
            }
            case 1: {
                return String.format(locale0, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", "CIRCLE", this.i.replaceAll("\\p{C}", "?"), this.o, this.l, this.m, this.n, ((int)(this.p / 1000)), this.q, this.j);
            }
            default: {
                return String.format(locale0, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", "UNKNOWN", this.i.replaceAll("\\p{C}", "?"), this.o, this.l, this.m, this.n, ((int)(this.p / 1000)), this.q, this.j);
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.i, false);
        SafeParcelWriter.writeLong(parcel0, 2, this.j);
        SafeParcelWriter.writeShort(parcel0, 3, this.k);
        SafeParcelWriter.writeDouble(parcel0, 4, this.l);
        SafeParcelWriter.writeDouble(parcel0, 5, this.m);
        SafeParcelWriter.writeFloat(parcel0, 6, this.n);
        SafeParcelWriter.writeInt(parcel0, 7, this.o);
        SafeParcelWriter.writeInt(parcel0, 8, this.p);
        SafeParcelWriter.writeInt(parcel0, 9, this.q);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

