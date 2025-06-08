package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class zzeii implements zzefd {
    public abstract zzfvl a(zzfcd arg1, Bundle arg2);

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        String s = zzfbl0.zzw.optString("pubid", "");
        zzfcd zzfcd0 = zzfbx0.zza.zza;
        zzfcb zzfcb0 = new zzfcb();
        zzfcb0.zzp(zzfcd0);
        zzfcb0.zzs(s);
        Bundle bundle0 = zzfcd0.zzd.zzm;
        Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
        Bundle bundle2 = bundle1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle3 = bundle2 == null ? new Bundle() : new Bundle(bundle2);
        bundle3.putInt("gw", 1);
        String s1 = zzfbl0.zzw.optString("mad_hac", null);
        if(s1 != null) {
            bundle3.putString("mad_hac", s1);
        }
        String s2 = zzfbl0.zzw.optString("adJson", null);
        if(s2 != null) {
            bundle3.putString("_ad", s2);
        }
        bundle3.putBoolean("_noRefresh", true);
        Iterator iterator0 = zzfbl0.zzE.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s3 = (String)object0;
            String s4 = zzfbl0.zzE.optString(s3, null);
            if(s3 != null) {
                bundle3.putString(s3, s4);
            }
        }
        bundle1.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        zzfcb0.zzE(new zzl(zzfcd0.zzd.zza, zzfcd0.zzd.zzb, bundle3, zzfcd0.zzd.zzd, zzfcd0.zzd.zze, zzfcd0.zzd.zzf, zzfcd0.zzd.zzg, zzfcd0.zzd.zzh, zzfcd0.zzd.zzi, zzfcd0.zzd.zzj, zzfcd0.zzd.zzk, zzfcd0.zzd.zzl, bundle1, zzfcd0.zzd.zzn, zzfcd0.zzd.zzo, zzfcd0.zzd.zzp, zzfcd0.zzd.zzq, zzfcd0.zzd.zzr, zzfcd0.zzd.zzs, zzfcd0.zzd.zzt, zzfcd0.zzd.zzu, zzfcd0.zzd.zzv, zzfcd0.zzd.zzw, zzfcd0.zzd.zzx));
        zzfcd zzfcd1 = zzfcb0.zzG();
        Bundle bundle4 = new Bundle();
        Bundle bundle5 = new Bundle();
        bundle5.putStringArrayList("nofill_urls", new ArrayList(zzfbx0.zzb.zzb.zza));
        bundle5.putInt("refresh_interval", zzfbx0.zzb.zzb.zzc);
        bundle5.putString("gws_query_id", zzfbx0.zzb.zzb.zzb);
        bundle4.putBundle("parent_common_config", bundle5);
        Bundle bundle6 = new Bundle();
        bundle6.putString("initial_ad_unit_id", zzfbx0.zza.zza.zzf);
        bundle6.putString("allocation_id", zzfbl0.zzx);
        bundle6.putStringArrayList("click_urls", new ArrayList(zzfbl0.zzc));
        bundle6.putStringArrayList("imp_urls", new ArrayList(zzfbl0.zzd));
        bundle6.putStringArrayList("manual_tracking_urls", new ArrayList(zzfbl0.zzq));
        bundle6.putStringArrayList("fill_urls", new ArrayList(zzfbl0.zzn));
        bundle6.putStringArrayList("video_start_urls", new ArrayList(zzfbl0.zzh));
        bundle6.putStringArrayList("video_reward_urls", new ArrayList(zzfbl0.zzi));
        bundle6.putStringArrayList("video_complete_urls", new ArrayList(zzfbl0.zzj));
        bundle6.putString("transaction_id", zzfbl0.zzk);
        bundle6.putString("valid_from_timestamp", zzfbl0.zzl);
        bundle6.putBoolean("is_closable_area_disabled", zzfbl0.zzQ);
        if(zzfbl0.zzm != null) {
            Bundle bundle7 = new Bundle();
            bundle7.putInt("rb_amount", zzfbl0.zzm.zzb);
            bundle7.putString("rb_type", zzfbl0.zzm.zza);
            bundle6.putParcelableArray("rewards", new Bundle[]{bundle7});
        }
        bundle4.putBundle("parent_ad_config", bundle6);
        return this.a(zzfcd1, bundle4);
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return !TextUtils.isEmpty(zzfbl0.zzw.optString("pubid", ""));
    }
}

