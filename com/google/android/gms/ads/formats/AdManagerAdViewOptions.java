package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbms;

@Class(creator = "AdManagerAdViewOptionsCreator")
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final class Builder {
        public boolean a;
        public ShouldDelayBannerRenderingListener b;

        public Builder() {
            this.a = false;
        }

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        public Builder setManualImpressionsEnabled(boolean z) {
            this.a = z;
            return this;
        }

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
            this.b = shouldDelayBannerRenderingListener0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final IBinder j;

    static {
        AdManagerAdViewOptions.CREATOR = new zzc();
    }

    public AdManagerAdViewOptions(Builder adManagerAdViewOptions$Builder0) {
        this.i = adManagerAdViewOptions$Builder0.a;
        this.j = adManagerAdViewOptions$Builder0.b == null ? null : new zzfd(adManagerAdViewOptions$Builder0.b);
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder0) {
        this.i = z;
        this.j = iBinder0;
    }

    public boolean getManualImpressionsEnabled() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel0, 2, this.j, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzbms zza() {
        return this.j == null ? null : zzbmr.zzc(this.j);
    }
}

