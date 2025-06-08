package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@Class(creator = "LocationRequestInternalCreator")
@Reserved({1000, 2, 3, 4})
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final LocationRequest i;
    public final List j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public boolean q;
    public String r;
    public long s;
    public static final List t;

    static {
        zzba.t = Collections.emptyList();
        zzba.CREATOR = new zzbb();
    }

    public zzba(LocationRequest locationRequest0, List list0, String s, boolean z, boolean z1, boolean z2, String s1, boolean z3, boolean z4, String s2, long v) {
        this.i = locationRequest0;
        this.j = list0;
        this.k = s;
        this.l = z;
        this.m = z1;
        this.n = z2;
        this.o = s1;
        this.p = z3;
        this.q = z4;
        this.r = s2;
        this.s = v;
    }

    // 去混淆评级： 中等(60)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzba && Objects.equal(this.i, ((zzba)object0).i) && Objects.equal(this.j, ((zzba)object0).j) && Objects.equal(this.k, ((zzba)object0).k) && this.l == ((zzba)object0).l && this.m == ((zzba)object0).m && this.n == ((zzba)object0).n && Objects.equal(this.o, ((zzba)object0).o) && this.p == ((zzba)object0).p && this.q == ((zzba)object0).q && Objects.equal(this.r, ((zzba)object0).r);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.i);
        String s = this.k;
        if(s != null) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(s);
        }
        String s1 = this.o;
        if(s1 != null) {
            stringBuilder0.append(" moduleId=");
            stringBuilder0.append(s1);
        }
        if(this.r != null) {
            stringBuilder0.append(" contextAttributionTag=");
            stringBuilder0.append(this.r);
        }
        stringBuilder0.append(" hideAppOps=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(" clients=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(" forceCoarseLocation=");
        stringBuilder0.append(this.m);
        if(this.n) {
            stringBuilder0.append(" exemptFromBackgroundThrottle");
        }
        if(this.p) {
            stringBuilder0.append(" locationSettingsIgnored");
        }
        if(this.q) {
            stringBuilder0.append(" inaccurateLocationsDelayed");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.i, v, false);
        SafeParcelWriter.writeTypedList(parcel0, 5, this.j, false);
        SafeParcelWriter.writeString(parcel0, 6, this.k, false);
        SafeParcelWriter.writeBoolean(parcel0, 7, this.l);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.m);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.n);
        SafeParcelWriter.writeString(parcel0, 10, this.o, false);
        SafeParcelWriter.writeBoolean(parcel0, 11, this.p);
        SafeParcelWriter.writeBoolean(parcel0, 12, this.q);
        SafeParcelWriter.writeString(parcel0, 13, this.r, false);
        SafeParcelWriter.writeLong(parcel0, 14, this.s);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static zzba zza(String s, LocationRequest locationRequest0) {
        return new zzba(locationRequest0, zzba.t, null, false, false, false, null, false, false, null, 0x7FFFFFFFFFFFFFFFL);
    }

    public final zzba zzb(long v) {
        LocationRequest locationRequest0 = this.i;
        if(locationRequest0.getMaxWaitTime() > locationRequest0.getInterval()) {
            throw new IllegalArgumentException("could not set max age when location batching is requested, interval=" + locationRequest0.getInterval() + "maxWaitTime=" + locationRequest0.getMaxWaitTime());
        }
        this.s = 10000L;
        return this;
    }

    public final zzba zzc(String s) {
        this.r = s;
        return this;
    }

    public final zzba zzd(boolean z) {
        this.q = true;
        return this;
    }
}

