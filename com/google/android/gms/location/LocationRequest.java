package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "LocationRequestCreator")
@Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    public int i;
    public long j;
    public long k;
    public boolean l;
    public long m;
    public int n;
    public float o;
    public long p;
    public boolean q;

    static {
        LocationRequest.CREATOR = new zzbf();
    }

    @Deprecated
    public LocationRequest() {
        this.i = 102;
        this.j = 3600000L;
        this.k = 600000L;
        this.l = false;
        this.m = 0x7FFFFFFFFFFFFFFFL;
        this.n = 0x7FFFFFFF;
        this.o = 0.0f;
        this.p = 0L;
        this.q = false;
    }

    public static void a(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("invalid interval: " + v);
        }
    }

    public static LocationRequest create() {
        LocationRequest locationRequest0 = new LocationRequest();
        locationRequest0.setWaitForAccurateLocation(true);
        return locationRequest0;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof LocationRequest && this.i == ((LocationRequest)object0).i && this.j == ((LocationRequest)object0).j && this.k == ((LocationRequest)object0).k && this.l == ((LocationRequest)object0).l && this.m == ((LocationRequest)object0).m && this.n == ((LocationRequest)object0).n && this.o == ((LocationRequest)object0).o && this.getMaxWaitTime() == ((LocationRequest)object0).getMaxWaitTime() && this.q == ((LocationRequest)object0).q;
    }

    public long getExpirationTime() {
        return this.m;
    }

    public long getFastestInterval() {
        return this.k;
    }

    public long getInterval() {
        return this.j;
    }

    public long getMaxWaitTime() {
        return this.p >= this.j ? this.p : this.j;
    }

    public int getNumUpdates() {
        return this.n;
    }

    public int getPriority() {
        return this.i;
    }

    public float getSmallestDisplacement() {
        return this.o;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j, this.o, this.p});
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.l;
    }

    public boolean isWaitForAccurateLocation() {
        return this.q;
    }

    public LocationRequest setExpirationDuration(long v) {
        long v1 = SystemClock.elapsedRealtime();
        long v2 = v > 0x7FFFFFFFFFFFFFFFL - v1 ? 0x7FFFFFFFFFFFFFFFL : v + v1;
        this.m = v2;
        if(v2 < 0L) {
            this.m = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long v) {
        this.m = v;
        if(v < 0L) {
            this.m = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long v) {
        LocationRequest.a(v);
        this.l = true;
        this.k = v;
        return this;
    }

    public LocationRequest setInterval(long v) {
        LocationRequest.a(v);
        this.j = v;
        if(!this.l) {
            this.k = (long)(((double)v) / 6.0);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long v) {
        LocationRequest.a(v);
        this.p = v;
        return this;
    }

    public LocationRequest setNumUpdates(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + v);
        }
        this.n = v;
        return this;
    }

    public LocationRequest setPriority(int v) {
        if(v != 100 && v != 102 && v != 104 && v != 105) {
            throw new IllegalArgumentException("invalid quality: " + v);
        }
        this.i = v;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
        this.o = f;
        return this;
    }

    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.q = z;
        return this;
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Request[");
        switch(this.i) {
            case 100: {
                s = "PRIORITY_HIGH_ACCURACY";
                break;
            }
            case 102: {
                s = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            }
            case 104: {
                s = "PRIORITY_LOW_POWER";
                break;
            }
            case 105: {
                s = "PRIORITY_NO_POWER";
                break;
            }
            default: {
                s = "???";
            }
        }
        stringBuilder0.append(s);
        if(this.i != 105) {
            stringBuilder0.append(" requested=");
            stringBuilder0.append(this.j);
            stringBuilder0.append("ms");
        }
        stringBuilder0.append(" fastest=");
        stringBuilder0.append(this.k);
        stringBuilder0.append("ms");
        if(this.p > this.j) {
            stringBuilder0.append(" maxWait=");
            stringBuilder0.append(this.p);
            stringBuilder0.append("ms");
        }
        if(this.o > 0.0f) {
            stringBuilder0.append(" smallestDisplacement=");
            stringBuilder0.append(this.o);
            stringBuilder0.append("m");
        }
        long v = this.m;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            long v1 = SystemClock.elapsedRealtime();
            stringBuilder0.append(" expireIn=");
            stringBuilder0.append(v - v1);
            stringBuilder0.append("ms");
        }
        if(this.n != 0x7FFFFFFF) {
            stringBuilder0.append(" num=");
            stringBuilder0.append(this.n);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeLong(parcel0, 2, this.j);
        SafeParcelWriter.writeLong(parcel0, 3, this.k);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.l);
        SafeParcelWriter.writeLong(parcel0, 5, this.m);
        SafeParcelWriter.writeInt(parcel0, 6, this.n);
        SafeParcelWriter.writeFloat(parcel0, 7, this.o);
        SafeParcelWriter.writeLong(parcel0, 8, this.p);
        SafeParcelWriter.writeBoolean(parcel0, 9, this.q);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

