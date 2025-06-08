package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

public final class zzekd implements zzefd {
    public final zzeff a;
    public final zzefl b;
    public final zzfgf c;
    public final zzfvm d;

    public zzekd(zzfgf zzfgf0, zzfvm zzfvm0, zzeff zzeff0, zzefl zzefl0) {
        this.c = zzfgf0;
        this.d = zzfvm0;
        this.b = zzefl0;
        this.a = zzeff0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        zzefg zzefg0;
        Iterator iterator0 = zzfbl0.zzu.iterator();
        while(true) {
            zzefg0 = null;
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    zzefg0 = this.a.zza(s, zzfbl0.zzw);
                }
                catch(zzfci unused_ex) {
                    continue;
                }
            }
            break;
        }
        if(zzefg0 == null) {
            return zzfvc.zzh(new zzeif("Unable to instantiate mediation adapter class."));
        }
        zzcga zzcga0 = new zzcga();
        v5 v50 = new v5(zzefg0, zzcga0);
        zzefg0.zzc.zza(v50);
        if(zzfbl0.zzN) {
            Bundle bundle0 = zzfbx0.zza.zza.zzd.zzm;
            Class class0 = AdMobAdapter.class;
            Bundle bundle1 = bundle0.getBundle(class0.getName());
            if(bundle1 == null) {
                bundle1 = new Bundle();
                bundle0.putBundle(class0.getName(), bundle1);
            }
            bundle1.putBoolean("render_test_ad_label", true);
        }
        return zzffp.zzd(new zzeka(this, zzfbx0, zzfbl0, zzefg0), this.d, zzffz.zzn, this.c).zzb(zzffz.zzo).zzd(zzcga0).zzb(zzffz.zzp).zze(new zzekb(this, zzfbx0, zzfbl0, zzefg0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return !zzfbl0.zzu.isEmpty();
    }
}

