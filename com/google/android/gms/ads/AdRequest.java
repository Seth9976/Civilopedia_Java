package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
public class AdRequest {
    @VisibleForTesting
    public static class Builder {
        public final zzdq a;

        public Builder() {
            zzdq zzdq0 = new zzdq();
            this.a = zzdq0;
            zzdq0.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addCustomEventExtrasBundle(Class class0, Bundle bundle0) {
            this.a.zzr(class0, bundle0);
            return this;
        }

        public Builder addKeyword(String s) {
            this.a.zzt(s);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class0, Bundle bundle0) {
            zzdq zzdq0 = this.a;
            zzdq0.zzu(class0, bundle0);
            if(class0.equals(AdMobAdapter.class) && bundle0.getBoolean("_emulatorLiveAds")) {
                zzdq0.zzx("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        @KeepForSdk
        @Deprecated
        public Builder setAdInfo(AdInfo adInfo0) {
            this.a.zzy(adInfo0);
            return this;
        }

        @KeepForSdk
        public Builder setAdString(String s) {
            this.a.zzz(s);
            return this;
        }

        public Builder setContentUrl(String s) {
            Preconditions.checkNotNull(s, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(s, "Content URL must be non-empty.");
            Preconditions.checkArgument(s.length() <= 0x200, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[]{0x200, s.length()});
            this.a.zzB(s);
            return this;
        }

        public Builder setHttpTimeoutMillis(int v) {
            this.a.zzD(v);
            return this;
        }

        public Builder setNeighboringContentUrls(List list0) {
            if(list0 == null) {
                zzcfi.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.a.zzF(list0);
            return this;
        }

        public Builder setRequestAgent(String s) {
            this.a.zzH(s);
            return this;
        }

        @Deprecated
        public final Builder zza(String s) {
            this.a.zzw(s);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date0) {
            this.a.zzA(date0);
            return this;
        }

        @Deprecated
        public final Builder zzc(int v) {
            this.a.zzC(v);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.a.zzE(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.a.zzI(z);
            return this;
        }
    }

    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 0x200;
    public final zzdr a;

    public AdRequest(Builder adRequest$Builder0) {
        this.a = new zzdr(adRequest$Builder0.a, null);
    }

    public String getContentUrl() {
        return this.a.zzl();
    }

    public Bundle getCustomEventExtrasBundle(Class class0) {
        return this.a.zzd(class0);
    }

    public Bundle getCustomTargeting() {
        return this.a.zze();
    }

    public Set getKeywords() {
        return this.a.zzr();
    }

    public List getNeighboringContentUrls() {
        return this.a.zzp();
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.a.zzf(class0);
    }

    public boolean isTestDevice(Context context0) {
        return this.a.zzt(context0);
    }

    public zzdr zza() {
        return this.a;
    }
}

