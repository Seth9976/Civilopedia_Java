package com.google.android.gms.location;

import A.f;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import g1.r;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@Class(creator = "ActivityTransitionRequestCreator")
@Reserved({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Comparator IS_SAME_TRANSITION;
    public final List i;
    public final String j;
    public final List k;
    public String l;

    static {
        ActivityTransitionRequest.CREATOR = new zzo();
        ActivityTransitionRequest.IS_SAME_TRANSITION = new r(0);
    }

    public ActivityTransitionRequest(List list0) {
        this(list0, null, null, null);
    }

    @Constructor
    public ActivityTransitionRequest(@Param(id = 1) List list0, @Param(id = 2) String s, @Param(id = 3) List list1, @Param(id = 4) String s1) {
        Preconditions.checkNotNull(list0, "transitions can\'t be null");
        Preconditions.checkArgument(list0.size() > 0, "transitions can\'t be empty.");
        Preconditions.checkNotNull(list0);
        TreeSet treeSet0 = new TreeSet(ActivityTransitionRequest.IS_SAME_TRANSITION);
        for(Object object0: list0) {
            Preconditions.checkArgument(treeSet0.add(((ActivityTransition)object0)), String.format("Found duplicated transition: %s.", ((ActivityTransition)object0)));
        }
        this.i = Collections.unmodifiableList(list0);
        this.j = s;
        this.k = list1 == null ? Collections.emptyList() : Collections.unmodifiableList(list1);
        this.l = s1;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && Objects.equal(this.i, ((ActivityTransitionRequest)object0).i) && Objects.equal(this.j, ((ActivityTransitionRequest)object0).j) && Objects.equal(this.l, ((ActivityTransitionRequest)object0).l) && Objects.equal(this.k, ((ActivityTransitionRequest)object0).k);
    }

    @Override
    public int hashCode() {
        int v = this.i.hashCode();
        int v1 = 0;
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.k == null ? 0 : this.k.hashCode();
        String s = this.l;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    public void serializeToIntentExtra(Intent intent0) {
        Preconditions.checkNotNull(intent0);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent0, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.i);
        String s1 = String.valueOf(this.k);
        String s2 = this.l;
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 0x4F + String.valueOf(this.j).length() + s1.length() + String.valueOf(s2).length());
        f.t(stringBuilder0, "ActivityTransitionRequest [mTransitions=", s, ", mTag=\'", this.j);
        f.t(stringBuilder0, "\', mClients=", s1, ", mAttributionTag=", s2);
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Preconditions.checkNotNull(parcel0);
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, this.i, false);
        SafeParcelWriter.writeString(parcel0, 2, this.j, false);
        SafeParcelWriter.writeTypedList(parcel0, 3, this.k, false);
        SafeParcelWriter.writeString(parcel0, 4, this.l, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final ActivityTransitionRequest zza(String s) {
        this.l = s;
        return this;
    }
}

