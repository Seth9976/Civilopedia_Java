package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;

public final class a extends UnifiedNativeAdMapper {
    @Override  // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view0, Map map0, Map map1) {
        if(view0 instanceof zzg || ((zze)zze.zza.get(view0)) != null) {
            throw null;
        }
    }
}

