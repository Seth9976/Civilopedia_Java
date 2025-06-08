package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.errorprone.annotations.InlineMe;

@KeepForSdk
@Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public final long m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;

    static {
        MethodInvocation.CREATOR = new zan();
    }

    @KeepForSdk
    @InlineMe(replacement = "this(methodKey, resultStatusCode, connectionResultStatusCode, startTimeMillis, endTimeMillis, callingModuleId, callingEntryPoint, serviceId, -1)")
    @Deprecated
    public MethodInvocation(int v, int v1, int v2, long v3, long v4, String s, String s1, int v5) {
        this(v, v1, v2, v3, v4, s, s1, v5, -1);
    }

    @Constructor
    public MethodInvocation(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) long v3, @Param(id = 5) long v4, @Param(id = 6) String s, @Param(id = 7) String s1, @Param(id = 8) int v5, @Param(id = 9) int v6) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = v3;
        this.m = v4;
        this.n = s;
        this.o = s1;
        this.p = v5;
        this.q = v6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeInt(parcel0, 2, this.j);
        SafeParcelWriter.writeInt(parcel0, 3, this.k);
        SafeParcelWriter.writeLong(parcel0, 4, this.l);
        SafeParcelWriter.writeLong(parcel0, 5, this.m);
        SafeParcelWriter.writeString(parcel0, 6, this.n, false);
        SafeParcelWriter.writeString(parcel0, 7, this.o, false);
        SafeParcelWriter.writeInt(parcel0, 8, this.p);
        SafeParcelWriter.writeInt(parcel0, 9, this.q);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

