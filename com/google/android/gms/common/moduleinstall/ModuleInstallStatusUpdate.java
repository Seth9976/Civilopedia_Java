package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Class(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN;

    }

    public static class ProgressInfo {
        public final long a;
        public final long b;

        public ProgressInfo(long v, long v1) {
            Preconditions.checkNotZero(v1);
            this.a = v;
            this.b = v1;
        }

        public long getBytesDownloaded() {
            return this.a;
        }

        public long getTotalBytesToDownload() {
            return this.b;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final int j;
    public final Long k;
    public final Long l;
    public final int m;
    public final ProgressInfo n;

    static {
        ModuleInstallStatusUpdate.CREATOR = new zae();
    }

    @KeepForSdk
    @Constructor
    public ModuleInstallStatusUpdate(@Param(id = 1) int v, @Param(id = 2) @InstallState int v1, @Param(id = 3) Long long0, @Param(id = 4) Long long1, @Param(id = 5) int v2) {
        this.i = v;
        this.j = v1;
        this.k = long0;
        this.l = long1;
        this.m = v2;
        this.n = long0 == null || long1 == null || ((long)long1) == 0L ? null : new ProgressInfo(((long)long0), ((long)long1));
    }

    public int getErrorCode() {
        return this.m;
    }

    @InstallState
    public int getInstallState() {
        return this.j;
    }

    public ProgressInfo getProgressInfo() {
        return this.n;
    }

    public int getSessionId() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getSessionId());
        SafeParcelWriter.writeInt(parcel0, 2, this.getInstallState());
        SafeParcelWriter.writeLongObject(parcel0, 3, this.k, false);
        SafeParcelWriter.writeLongObject(parcel0, 4, this.l, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.getErrorCode());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

