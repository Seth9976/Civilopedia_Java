package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;

public final class zzecw implements zza, zzdbx, zzdcn, zzdgk {
    public final Context i;
    public final zzfcs j;
    public final zzfbx k;
    public final zzfbl l;
    public final zzees m;
    public Boolean n;
    public final boolean o;
    public final zzfgp p;
    public final String q;

    public zzecw(Context context0, zzfcs zzfcs0, zzfbx zzfbx0, zzfbl zzfbl0, zzees zzees0, zzfgp zzfgp0, String s) {
        this.i = context0;
        this.j = zzfcs0;
        this.k = zzfbx0;
        this.l = zzfbl0;
        this.m = zzees0;
        this.o = ((Boolean)zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();
        this.p = zzfgp0;
        this.q = s;
    }

    public final zzfgo a(String s) {
        zzfgo zzfgo0 = zzfgo.zzb(s);
        zzfgo0.zzh(this.k, null);
        zzfbl zzfbl0 = this.l;
        zzfgo0.zzf(zzfbl0);
        zzfgo0.zza("request_id", this.q);
        if(!zzfbl0.zzu.isEmpty()) {
            zzfgo0.zza("ancn", ((String)zzfbl0.zzu.get(0)));
        }
        if(zzfbl0.zzak) {
            zzfgo0.zza("device_connectivity", (zzt.zzo().zzv(this.i) ? "online" : "offline"));
            zzfgo0.zza("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzfgo0.zza("offline_ad", "1");
        }
        return zzfgo0;
    }

    public final void b(zzfgo zzfgo0) {
        zzfgp zzfgp0 = this.p;
        if(this.l.zzak) {
            String s = zzfgp0.zza(zzfgo0);
            zzeeu zzeeu0 = new zzeeu(zzt.zzA().currentTimeMillis(), this.k.zzb.zzb.zzb, s, 2);
            this.m.zzd(zzeeu0);
            return;
        }
        zzfgp0.zzb(zzfgo0);
    }

    public final boolean c() {
        if(this.n == null) {
            synchronized(this) {
                if(this.n == null) {
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
                    this.n = Boolean.valueOf(z);
                }
            }
        }
        return this.n.booleanValue();
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!this.l.zzak) {
            return;
        }
        this.b(this.a("click"));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zza(zze zze0) {
        if(!this.o) {
            return;
        }
        int v = zze0.zza;
        String s = zze0.zzb;
        if(zze0.zzc.equals("com.google.android.gms.ads") && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            v = zze0.zzd.zza;
            s = zze0.zzd.zzb;
        }
        String s1 = this.j.zza(s);
        zzfgo zzfgo0 = this.a("ifts");
        zzfgo0.zza("reason", "adapter");
        if(v >= 0) {
            zzfgo0.zza("arec", String.valueOf(v));
        }
        if(s1 != null) {
            zzfgo0.zza("areec", s1);
        }
        this.p.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        if(!this.o) {
            return;
        }
        zzfgo zzfgo0 = this.a("ifts");
        zzfgo0.zza("reason", "blocked");
        this.p.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
        if(!this.c()) {
            return;
        }
        zzfgo zzfgo0 = this.a("adapter_shown");
        this.p.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        if(!this.c()) {
            return;
        }
        zzfgo zzfgo0 = this.a("adapter_impression");
        this.p.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlf0) {
        if(!this.o) {
            return;
        }
        zzfgo zzfgo0 = this.a("ifts");
        zzfgo0.zza("reason", "exception");
        if(!TextUtils.isEmpty(zzdlf0.getMessage())) {
            zzfgo0.zza("msg", zzdlf0.getMessage());
        }
        this.p.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if(!this.c() && !this.l.zzak) {
            return;
        }
        this.b(this.a("impression"));
    }
}

