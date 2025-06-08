package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@KeepForSdk
@Class(creator = "GetServiceRequestCreator")
@Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final int k;
    public String l;
    public IBinder m;
    public Scope[] n;
    public Bundle o;
    public Account p;
    public Feature[] q;
    public Feature[] r;
    public final boolean s;
    public final int t;
    public boolean u;
    public final String v;
    public static final Scope[] w;
    public static final Feature[] x;

    static {
        GetServiceRequest.CREATOR = new zzn();
        GetServiceRequest.w = new Scope[0];
        GetServiceRequest.x = new Feature[0];
    }

    public GetServiceRequest(int v, int v1, int v2, String s, IBinder iBinder0, Scope[] arr_scope, Bundle bundle0, Account account0, Feature[] arr_feature, Feature[] arr_feature1, boolean z, int v3, boolean z1, String s1) {
        if(arr_scope == null) {
            arr_scope = GetServiceRequest.w;
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Feature[] arr_feature2 = GetServiceRequest.x;
        if(arr_feature == null) {
            arr_feature = arr_feature2;
        }
        if(arr_feature1 == null) {
            arr_feature1 = arr_feature2;
        }
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = "com.google.android.gms".equals(s) ? "com.google.android.gms" : s;
        if(v < 2) {
            this.p = iBinder0 == null ? null : AccountAccessor.getAccountBinderSafe(Stub.asInterface(iBinder0));
        }
        else {
            this.m = iBinder0;
            this.p = account0;
        }
        this.n = arr_scope;
        this.o = bundle0;
        this.q = arr_feature;
        this.r = arr_feature1;
        this.s = z;
        this.t = v3;
        this.u = z1;
        this.v = s1;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.o;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        zzn.a(this, parcel0, v);
    }

    public final String zza() {
        return this.v;
    }
}

