package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcex;

@KeepForSdk
public class QueryInfo {
    public final zzeg a;

    public QueryInfo(zzeg zzeg0) {
        this.a = zzeg0;
    }

    @KeepForSdk
    public static void generate(Context context0, AdFormat adFormat0, AdRequest adRequest0, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zzh.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
            zza zza0 = new zza(context0, adFormat0, adRequest0, queryInfoGenerationCallback0);
            zzcex.zzb.execute(zza0);
            return;
        }
        new zzbym(context0, adFormat0, (adRequest0 == null ? null : adRequest0.zza())).zzb(queryInfoGenerationCallback0);
    }

    @KeepForSdk
    public String getQuery() {
        return this.a.zzb();
    }

    @KeepForSdk
    public Bundle getQueryBundle() {
        return this.a.zza();
    }

    @KeepForSdk
    public String getRequestId() {
        return this.a.zzd();
    }

    public final zzeg zza() {
        return this.a;
    }
}

