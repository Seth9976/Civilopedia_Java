package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesg implements zzetg {
    public final zzfvm a;
    public final ScheduledExecutorService b;
    public final zzele c;
    public final Context d;
    public final zzfcd e;
    public final zzela f;
    public final zzduc g;
    public final String h;

    public zzesg(zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, String s, zzele zzele0, Context context0, zzfcd zzfcd0, zzela zzela0, zzduc zzduc0) {
        this.a = zzfvm0;
        this.b = scheduledExecutorService0;
        this.h = s;
        this.c = zzele0;
        this.d = context0;
        this.e = zzfcd0;
        this.f = zzela0;
        this.g = zzduc0;
    }

    public final zzfut a(String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        zzese zzese0 = new zzese(this, s, list0, bundle0, z, z1);
        zzfvm zzfvm0 = this.a;
        zzfut zzfut0 = zzfut.zzv(zzfvc.zzl(zzese0, zzfvm0));
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
            zzfut0 = (zzfut)zzfvc.zzo(zzfut0, ((long)(((Long)zzay.zzc().zzb(zzbhz.zzbl)))), TimeUnit.MILLISECONDS, this.b);
        }
        zzesf zzesf0 = new zzesf(s);
        return (zzfut)zzfvc.zzf(zzfut0, Throwable.class, zzesf0, zzfvm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzl(() -> {
            zzfcd zzfcd0;
            String s = ((Boolean)zzay.zzc().zzb(zzbhz.zzim)).booleanValue() ? this.e.zzf.toLowerCase(Locale.ROOT) : this.e.zzf;
            Map map0 = this.c.zza(this.h, s);
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = ((zzfrm)map0).zzg().iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                Bundle bundle0 = null;
                zzfcd0 = this.e;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                String s1 = (String)((Map.Entry)object0).getKey();
                Object object1 = ((Map.Entry)object0).getValue();
                Bundle bundle1 = zzfcd0.zzd.zzm;
                if(bundle1 != null) {
                    bundle0 = bundle1.getBundle(s1);
                }
                arrayList0.add(this.a(s1, ((List)object1), bundle0, true, true));
            }
            for(Object object2: ((zzfrm)this.c.zzb()).zzg()) {
                zzeli zzeli0 = (zzeli)((Map.Entry)object2).getValue();
                Bundle bundle2 = zzfcd0.zzd.zzm;
                Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(zzeli0.zza);
                arrayList0.add(this.a(zzeli0.zza, Collections.singletonList(zzeli0.zzd), bundle3, zzeli0.zzb, zzeli0.zzc));
            }
            return zzfvc.zzc(arrayList0).zza(new zzesd(arrayList0), this.a);
        }, this.a);
    }
}

