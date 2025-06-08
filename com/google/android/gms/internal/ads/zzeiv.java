package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeiv implements zzfuj {
    public final zzfgf a;
    public final zzdbv b;
    public final zzfie c;
    public final zzfii d;
    public final zzfvm e;
    public final ScheduledExecutorService f;
    public final zzcya g;
    public final zzeiq h;
    public final zzefi i;
    public final Context j;
    public final zzfhs k;

    public zzeiv(Context context0, zzfgf zzfgf0, zzeiq zzeiq0, zzdbv zzdbv0, zzfie zzfie0, zzfii zzfii0, zzcya zzcya0, zzfvm zzfvm0, ScheduledExecutorService scheduledExecutorService0, zzefi zzefi0, zzfhs zzfhs0) {
        this.j = context0;
        this.a = zzfgf0;
        this.h = zzeiq0;
        this.b = zzdbv0;
        this.c = zzfie0;
        this.d = zzfii0;
        this.g = zzcya0;
        this.e = zzfvm0;
        this.f = scheduledExecutorService0;
        this.i = zzefi0;
        this.k = zzfhs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) throws Exception {
        zzcya zzcya0;
        String s;
        int v = ((zzfbx)object0).zzb.zzb.zze;
        if(v == 0) {
            s = "No ad config.";
        }
        else if(v < 200 || v >= 300) {
            s = v < 300 || v >= 400 ? "Received error HTTP response code: " + v : "No location header to follow redirect or too many redirects.";
        }
        else if(!((Boolean)zzay.zzc().zzb(zzbhz.zzew)).booleanValue()) {
            s = "No fill.";
        }
        else {
            s = "No ad config.";
        }
        zzfbo zzfbo0 = ((zzfbx)object0).zzb.zzb;
        zzfbn zzfbn0 = zzfbo0.zzi;
        if(zzfbn0 != null) {
            s = zzfbn0.zza();
        }
        zzefi zzefi0 = this.i;
        zzefi0.zzg(zzfbo0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgX)).booleanValue()) {
            int v1 = ((zzfbx)object0).zzb.zzb.zze;
            if(v1 != 0 && (v1 < 200 || v1 >= 300)) {
                return zzfvc.zzh(new zzeit(3, s));
            }
        }
        zzfvl zzfvl0 = zzfvc.zzh(new zzeit(3, s));
        zzfgf zzfgf0 = this.a;
        zzffk zzffk0 = zzffp.zzc(zzfvl0, zzffz.zzl, zzfgf0).zza();
        Iterator iterator0 = ((zzfbx)object0).zzb.zza.iterator();
    alab1:
        while(true) {
            boolean z = iterator0.hasNext();
            zzcya0 = this.g;
            if(!z) {
                break;
            }
            Object object1 = iterator0.next();
            zzfbl zzfbl0 = (zzfbl)object1;
            zzefi0.zzd(zzfbl0);
            for(Object object2: zzfbl0.zza) {
                zzefd zzefd0 = zzcya0.zza(zzfbl0.zzb, ((String)object2));
                if(zzefd0 != null && zzefd0.zzb(((zzfbx)object0), zzfbl0)) {
                    continue alab1;
                }
                if(false) {
                    break;
                }
            }
            zzefi0.zze(zzfbl0, 0L, zzfdc.zzd(1, null, null));
        }
        zzctk zzctk0 = new zzctk(((zzfbx)object0), this.d, this.c);
        this.b.zzj(zzctk0, this.e);
        int v2 = 0;
        for(Object object3: ((zzfbx)object0).zzb.zza) {
            zzfbl zzfbl1 = (zzfbl)object3;
            for(Object object4: zzfbl1.zza) {
                String s1 = (String)object4;
                zzefd zzefd1 = zzcya0.zza(zzfbl1.zzb, s1);
                if(zzefd1 != null && zzefd1.zzb(((zzfbx)object0), zzfbl1)) {
                    zzffw zzffw0 = zzfgf0.zzb(zzffz.zzm, zzffk0).zzh("render-config-" + v2 + "-" + s1);
                    zzeiu zzeiu0 = new zzeiu(this, zzfbl1, ((zzfbx)object0), zzefd1);
                    zzffk0 = zzffw0.zzc(Throwable.class, zzeiu0).zza();
                    break;
                }
                if(false) {
                    break;
                }
            }
            ++v2;
        }
        return zzffk0;
    }
}

