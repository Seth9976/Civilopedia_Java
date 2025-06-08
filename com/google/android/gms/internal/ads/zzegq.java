package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;

public final class zzegq implements zzfuj {
    public final zzegs zza;
    public final Uri zzb;
    public final zzfbx zzc;
    public final zzfbl zzd;

    public zzegq(zzegs zzegs0, Uri uri0, zzfbx zzfbx0, zzfbl zzfbl0) {
        this.zza = zzegs0;
        this.zzb = uri0;
        this.zzc = zzfbx0;
        this.zzd = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzegs zzegs0 = this.zza;
        Uri uri0 = this.zzb;
        zzfbx zzfbx0 = this.zzc;
        zzfbl zzfbl0 = this.zzd;
        zzegs0.getClass();
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW");
            if(!intent0.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle0 = new Bundle();
                bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
                intent0.putExtras(bundle0);
            }
            intent0.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent0.putExtras(new Bundle());
            intent0.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent0.setData(uri0);
            zzc zzc0 = new zzc(intent0, null);
            zzcga zzcga0 = new zzcga();
            zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, null);
            zzdkd zzdkd0 = new zzdkd(new zzegr(zzcga0), null);
            zzdka zzdka0 = zzegs0.b.zze(zzcym0, zzdkd0);
            zzcga0.zzd(new AdOverlayInfoParcel(zzc0, null, zzdka0.zza(), null, new zzcfo(0, 0, false, false, false), null, null));
            zzegs0.d.zza();
            return zzfvc.zzi(zzdka0.zzg());
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Error in CustomTabsAdRenderer", throwable0);
            throw throwable0;
        }
    }
}

