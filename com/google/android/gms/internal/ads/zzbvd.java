package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzbvd implements NativeMediationAdRequest {
    public final Date a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Location e;
    public final int f;
    public final zzbkp g;
    public final ArrayList h;
    public final boolean i;
    public final HashMap j;

    public zzbvd(Date date0, int v, Set set0, Location location0, boolean z, int v1, zzbkp zzbkp0, List list0, boolean z1, int v2, String s) {
        this.a = date0;
        this.b = v;
        this.c = set0;
        this.e = location0;
        this.d = z;
        this.f = v1;
        this.g = zzbkp0;
        this.i = z1;
        this.h = new ArrayList();
        this.j = new HashMap();
        if(list0 != null) {
            for(Object object0: list0) {
                String s1 = (String)object0;
                if(s1.startsWith("custom:")) {
                    String[] arr_s = s1.split(":", 3);
                    if(arr_s.length != 3) {
                        continue;
                    }
                    if("true".equals(arr_s[2])) {
                        this.j.put(arr_s[1], Boolean.TRUE);
                    }
                    else {
                        if(!"false".equals(arr_s[2])) {
                            continue;
                        }
                        this.j.put(arr_s[1], Boolean.FALSE);
                    }
                }
                else {
                    this.h.add(s1);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzed.zzf().zza();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.c;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        Builder nativeAdOptions$Builder0 = new Builder();
        zzbkp zzbkp0 = this.g;
        if(zzbkp0 == null) {
            return nativeAdOptions$Builder0.build();
        }
        switch(zzbkp0.zza) {
            case 2: {
                nativeAdOptions$Builder0.setAdChoicesPlacement(zzbkp0.zze);
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbkp0.zzb);
                nativeAdOptions$Builder0.setImageOrientation(zzbkp0.zzc);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbkp0.zzd);
                return nativeAdOptions$Builder0.build();
            }
            case 3: {
                break;
            }
            case 4: {
                nativeAdOptions$Builder0.setRequestCustomMuteThisAd(zzbkp0.zzg);
                nativeAdOptions$Builder0.setMediaAspectRatio(zzbkp0.zzh);
                break;
            }
            default: {
                nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbkp0.zzb);
                nativeAdOptions$Builder0.setImageOrientation(zzbkp0.zzc);
                nativeAdOptions$Builder0.setRequestMultipleImages(zzbkp0.zzd);
                return nativeAdOptions$Builder0.build();
            }
        }
        zzff zzff0 = zzbkp0.zzf;
        if(zzff0 != null) {
            nativeAdOptions$Builder0.setVideoOptions(new VideoOptions(zzff0));
        }
        nativeAdOptions$Builder0.setAdChoicesPlacement(zzbkp0.zze);
        nativeAdOptions$Builder0.setReturnUrlsForImageAssets(zzbkp0.zzb);
        nativeAdOptions$Builder0.setImageOrientation(zzbkp0.zzc);
        nativeAdOptions$Builder0.setRequestMultipleImages(zzbkp0.zzd);
        return nativeAdOptions$Builder0.build();
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbkp.zza(this.g);
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzed.zzf().zzv();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.i;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.d;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.h.contains("6");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.j;
    }

    @Override  // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.h.contains("3");
    }
}

