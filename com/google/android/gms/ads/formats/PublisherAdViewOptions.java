package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbms;

@Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @Deprecated
    public static final class Builder {
        public ShouldDelayBannerRenderingListener a;

        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
            this.a = shouldDelayBannerRenderingListener0;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public final boolean i;
    public final zzbz j;
    public final IBinder k;

    static {
        PublisherAdViewOptions.CREATOR = new zzf();
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder0, IBinder iBinder1) {
        this.i = z;
        this.j = iBinder0 == null ? null : zzby.zzd(iBinder0);
        this.k = iBinder1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.i);
        SafeParcelWriter.writeIBinder(parcel0, 2, (this.j == null ? null : this.j.asBinder()), false);
        SafeParcelWriter.writeIBinder(parcel0, 3, this.k, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzbz zza() {
        return this.j;
    }

    public final zzbms zzb() {
        return this.k == null ? null : zzbmr.zzc(this.k);
    }

    public final boolean zzc() {
        return this.i;
    }
}

