package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcfb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzp {
    public static final zzp zza;

    static {
        zzp.zza = new zzp();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final zzl zza(Context context0, zzdr zzdr0) {
        zzc zzc0;
        Date date0 = zzdr0.zzo();
        long v = date0 == null ? -1L : date0.getTime();
        String s = zzdr0.zzl();
        int v1 = zzdr0.zza();
        Set set0 = zzdr0.zzr();
        List list0 = set0.isEmpty() ? null : Collections.unmodifiableList(new ArrayList(set0));
        boolean z = zzdr0.zzt(context0);
        Bundle bundle0 = zzdr0.zzf(AdMobAdapter.class);
        AdInfo adInfo0 = zzdr0.zzi();
        if(adInfo0 == null) {
            zzc0 = null;
        }
        else {
            QueryInfo queryInfo0 = adInfo0.getQueryInfo();
            zzc0 = new zzc(zzdr0.zzi().getAdString(), (queryInfo0 == null ? "" : queryInfo0.zza().c));
        }
        SearchAdRequest searchAdRequest0 = zzdr0.zzj();
        zzfb zzfb0 = searchAdRequest0 == null ? null : new zzfb(searchAdRequest0);
        String s1 = context0.getApplicationContext() == null ? null : zzcfb.zzp(Thread.currentThread().getStackTrace(), "com.spears.civilopedia");
        RequestConfiguration requestConfiguration0 = zzed.zzf().zzc();
        Object object0 = Collections.max(Arrays.asList(new String[]{0, ""}), zzo.zza);
        List list1 = zzdr0.zzp();
        return new zzl(8, v, bundle0, v1, list0, z, Math.max(zzdr0.zzc(), requestConfiguration0.getTagForChildDirectedTreatment()), false, zzdr0.zzm(), zzfb0, null, s, zzdr0.zzg(), zzdr0.zze(), Collections.unmodifiableList(new ArrayList(zzdr0.zzq())), zzdr0.zzn(), s1, zzdr0.zzs(), zzc0, Math.max(-1, requestConfiguration0.getTagForUnderAgeOfConsent()), ((String)object0), list1, zzdr0.zzb(), zzdr0.zzk());
    }
}

