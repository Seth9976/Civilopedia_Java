package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

public final class zzdvq implements zza, zzdbx, zzdcn, zzdgk {
    public final Context i;
    public final zzfcs j;
    public final zzdwh k;
    public final zzfbx l;
    public final zzfbl m;
    public final zzees n;
    public Boolean o;
    public final boolean p;

    public zzdvq(Context context0, zzfcs zzfcs0, zzdwh zzdwh0, zzfbx zzfbx0, zzfbl zzfbl0, zzees zzees0) {
        this.i = context0;
        this.j = zzfcs0;
        this.k = zzdwh0;
        this.l = zzfbx0;
        this.m = zzfbl0;
        this.n = zzees0;
        this.p = ((Boolean)zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();
    }

    public final zzdwg a(String s) {
        zzdwg zzdwg0 = this.k.zza();
        zzfbx zzfbx0 = this.l;
        zzdwg0.zze(zzfbx0.zzb.zzb);
        zzfbl zzfbl0 = this.m;
        zzdwg0.zzd(zzfbl0);
        zzdwg0.zzb("action", s);
        boolean z = false;
        if(!zzfbl0.zzu.isEmpty()) {
            zzdwg0.zzb("ancn", ((String)zzfbl0.zzu.get(0)));
        }
        if(zzfbl0.zzak) {
            zzdwg0.zzb("device_connectivity", (zzt.zzo().zzv(this.i) ? "online" : "offline"));
            zzdwg0.zzb("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzdwg0.zzb("offline_ad", "1");
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            if(zzf.zzd(zzfbx0.zza.zza) != 1) {
                z = true;
            }
            zzdwg0.zzb("scar", String.valueOf(z));
            if(z) {
                zzdwg0.zzc("ragent", zzfbx0.zza.zza.zzd.zzp);
                zzdwg0.zzc("rtype", zzf.zza(zzf.zzb(zzfbx0.zza.zza.zzd)));
            }
        }
        return zzdwg0;
    }

    public final void b(zzdwg zzdwg0) {
        if(this.m.zzak) {
            String s = zzdwg0.zzf();
            zzeeu zzeeu0 = new zzeeu(zzt.zzA().currentTimeMillis(), this.l.zzb.zzb.zzb, s, 2);
            this.n.zzd(zzeeu0);
            return;
        }
        zzdwg0.zzg();
    }

    public final boolean c() {
        if(this.o == null) {
            synchronized(this) {
                if(this.o == null) {
                    boolean z = false;
                    String s = (String)zzay.zzc().zzb(zzbhz.zzbm);
                    String s1 = zzs.zzo(this.i);
                    if(s != null && s1 != null) {
                        try {
                            z = Pattern.matches(s, s1);
                        }
                        catch(RuntimeException runtimeException0) {
                            zzt.zzo().zzt(runtimeException0, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.o = Boolean.valueOf(z);
                }
            }
        }
        return this.o.booleanValue();
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!this.m.zzak) {
            return;
        }
        this.b(this.a("click"));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zza(zze zze0) {
        if(!this.p) {
            return;
        }
        zzdwg zzdwg0 = this.a("ifts");
        zzdwg0.zzb("reason", "adapter");
        int v = zze0.zza;
        String s = zze0.zzb;
        if(zze0.zzc.equals("com.google.android.gms.ads") && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            v = zze0.zzd.zza;
            s = zze0.zzd.zzb;
        }
        if(v >= 0) {
            zzdwg0.zzb("arec", String.valueOf(v));
        }
        String s1 = this.j.zza(s);
        if(s1 != null) {
            zzdwg0.zzb("areec", s1);
        }
        zzdwg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        if(!this.p) {
            return;
        }
        zzdwg zzdwg0 = this.a("ifts");
        zzdwg0.zzb("reason", "blocked");
        zzdwg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
        if(!this.c()) {
            return;
        }
        this.a("adapter_shown").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        if(!this.c()) {
            return;
        }
        this.a("adapter_impression").zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlf0) {
        if(!this.p) {
            return;
        }
        zzdwg zzdwg0 = this.a("ifts");
        zzdwg0.zzb("reason", "exception");
        if(!TextUtils.isEmpty(zzdlf0.getMessage())) {
            zzdwg0.zzb("msg", zzdlf0.getMessage());
        }
        zzdwg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if(!this.c() && !this.m.zzak) {
            return;
        }
        this.b(this.a("impression"));
    }
}

