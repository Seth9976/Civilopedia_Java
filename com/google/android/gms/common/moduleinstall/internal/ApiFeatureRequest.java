package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

@KeepForSdk
@Class(creator = "ApiFeatureRequestCreator")
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List i;
    public final boolean j;
    public final String k;
    public final String l;
    public static final zab m;

    static {
        ApiFeatureRequest.CREATOR = new zac();
        ApiFeatureRequest.m = zab.zaa;
    }

    @Constructor
    public ApiFeatureRequest(@Param(id = 1) List list0, @Param(id = 2) boolean z, @Param(id = 3) String s, @Param(id = 4) String s1) {
        Preconditions.checkNotNull(list0);
        this.i = list0;
        this.j = z;
        this.k = s;
        this.l = s1;
    }

    public static ApiFeatureRequest a(boolean z, List list0) {
        TreeSet treeSet0 = new TreeSet(ApiFeatureRequest.m);
        for(Object object0: list0) {
            Collections.addAll(treeSet0, ((OptionalModuleApi)object0).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet0), z, null, null);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof ApiFeatureRequest ? this.j == ((ApiFeatureRequest)object0).j && Objects.equal(this.i, ((ApiFeatureRequest)object0).i) && Objects.equal(this.k, ((ApiFeatureRequest)object0).k) && Objects.equal(this.l, ((ApiFeatureRequest)object0).l) : false;
    }

    @KeepForSdk
    public static ApiFeatureRequest fromModuleInstallRequest(ModuleInstallRequest moduleInstallRequest0) {
        return ApiFeatureRequest.a(true, moduleInstallRequest0.getApis());
    }

    @KeepForSdk
    public List getApiFeatures() {
        return this.i;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.j), this.i, this.k, this.l});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, this.getApiFeatures(), false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.j);
        SafeParcelWriter.writeString(parcel0, 3, this.k, false);
        SafeParcelWriter.writeString(parcel0, 4, this.l, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

