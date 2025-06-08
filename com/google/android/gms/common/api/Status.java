package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_CANCELED;
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERNAL_ERROR;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERRUPTED;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_SUCCESS;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_SUCCESS_CACHE;
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_TIMEOUT;
    public final int i;
    public final String j;
    public final PendingIntent k;
    public final ConnectionResult l;
    @ShowFirstParty
    public static final Status zza;

    static {
        Status.RESULT_SUCCESS_CACHE = new Status(-1);
        Status.RESULT_SUCCESS = new Status(0);
        Status.RESULT_INTERRUPTED = new Status(14);
        Status.RESULT_INTERNAL_ERROR = new Status(8);
        Status.RESULT_TIMEOUT = new Status(15);
        Status.RESULT_CANCELED = new Status(16);
        Status.zza = new Status(17);
        Status.RESULT_DEAD_CLIENT = new Status(18);
        Status.CREATOR = new zzb();
    }

    public Status(int v) {
        this(v, null);
    }

    public Status(int v, String s) {
        this(v, s, null);
    }

    public Status(int v, String s, PendingIntent pendingIntent0) {
        this(v, s, pendingIntent0, null);
    }

    public Status(int v, String s, PendingIntent pendingIntent0, ConnectionResult connectionResult0) {
        this.i = v;
        this.j = s;
        this.k = pendingIntent0;
        this.l = connectionResult0;
    }

    public Status(ConnectionResult connectionResult0, String s) {
        this(connectionResult0, s, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(ConnectionResult connectionResult0, String s, int v) {
        this(v, s, connectionResult0.getResolution(), connectionResult0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Status ? this.i == ((Status)object0).i && Objects.equal(this.j, ((Status)object0).j) && Objects.equal(this.k, ((Status)object0).k) && Objects.equal(this.l, ((Status)object0).l) : false;
    }

    public ConnectionResult getConnectionResult() {
        return this.l;
    }

    public PendingIntent getResolution() {
        return this.k;
    }

    @Override  // com.google.android.gms.common.api.Result
    @CanIgnoreReturnValue
    public Status getStatus() {
        return this;
    }

    @ResultIgnorabilityUnspecified
    public int getStatusCode() {
        return this.i;
    }

    public String getStatusMessage() {
        return this.j;
    }

    public boolean hasResolution() {
        return this.k != null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.i, this.j, this.k, this.l});
    }

    public boolean isCanceled() {
        return this.i == 16;
    }

    public boolean isInterrupted() {
        return this.i == 14;
    }

    @CheckReturnValue
    public boolean isSuccess() {
        return this.i <= 0;
    }

    public void startResolutionForResult(Activity activity0, int v) throws IntentSender.SendIntentException {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.k);
        activity0.startIntentSenderForResult(this.k.getIntentSender(), v, null, 0, 0, 0);
    }

    public void startResolutionForResult(b b0) {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.k);
        b0.a(new IntentSenderRequest(this.k.getIntentSender()));
    }

    @Override
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("statusCode", this.zza());
        objects$ToStringHelper0.add("resolution", this.k);
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getStatusCode());
        SafeParcelWriter.writeString(parcel0, 2, this.getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.k, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getConnectionResult(), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final String zza() {
        return this.j == null ? CommonStatusCodes.getStatusCodeString(this.i) : this.j;
    }
}

