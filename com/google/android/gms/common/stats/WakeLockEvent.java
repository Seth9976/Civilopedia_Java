package com.google.android.gms.common.stats;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import java.util.ArrayList;

@KeepForSdk
@Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final long j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final int o;
    public final ArrayList p;
    public final String q;
    public final long r;
    public final int s;
    public final String t;
    public final float u;
    public final long v;
    public final boolean w;

    static {
        WakeLockEvent.CREATOR = new zza();
    }

    public WakeLockEvent(int v, long v1, int v2, String s, int v3, ArrayList arrayList0, String s1, long v4, int v5, String s2, String s3, float f, long v6, String s4, boolean z) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = s;
        this.m = s2;
        this.n = s4;
        this.o = v3;
        this.p = arrayList0;
        this.q = s1;
        this.r = v4;
        this.s = v5;
        this.t = s3;
        this.u = f;
        this.v = v6;
        this.w = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeLong(parcel0, 2, this.j);
        SafeParcelWriter.writeString(parcel0, 4, this.l, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.o);
        SafeParcelWriter.writeStringList(parcel0, 6, this.p, false);
        SafeParcelWriter.writeLong(parcel0, 8, this.r);
        SafeParcelWriter.writeString(parcel0, 10, this.m, false);
        SafeParcelWriter.writeInt(parcel0, 11, this.k);
        SafeParcelWriter.writeString(parcel0, 12, this.q, false);
        SafeParcelWriter.writeString(parcel0, 13, this.t, false);
        SafeParcelWriter.writeInt(parcel0, 14, this.s);
        SafeParcelWriter.writeFloat(parcel0, 15, this.u);
        SafeParcelWriter.writeLong(parcel0, 16, this.v);
        SafeParcelWriter.writeString(parcel0, 17, this.n, false);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.w);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.k;
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.j;
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        String s = "";
        String s1 = this.p == null ? "" : TextUtils.join(",", this.p);
        StringBuilder stringBuilder0 = new StringBuilder("\t");
        stringBuilder0.append(this.l);
        stringBuilder0.append("\t");
        f.r(stringBuilder0, this.o, "\t", s1, "\t");
        stringBuilder0.append(this.s);
        stringBuilder0.append("\t");
        stringBuilder0.append((this.m == null ? "" : this.m));
        stringBuilder0.append("\t");
        stringBuilder0.append((this.t == null ? "" : this.t));
        stringBuilder0.append("\t");
        stringBuilder0.append(this.u);
        stringBuilder0.append("\t");
        String s2 = this.n;
        if(s2 != null) {
            s = s2;
        }
        stringBuilder0.append(s);
        stringBuilder0.append("\t");
        stringBuilder0.append(this.w);
        return stringBuilder0.toString();
    }
}

