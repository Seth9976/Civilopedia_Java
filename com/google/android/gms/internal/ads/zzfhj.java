package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzfhj implements zzfhh {
    public final Context a;
    public long b;
    public long c;
    public boolean d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public final int l;
    public int m;
    public int n;

    public zzfhj(Context context0, int v) {
        this.b = 0L;
        this.c = -1L;
        this.d = false;
        this.m = 2;
        this.n = 2;
        this.e = 0;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = false;
        this.k = false;
        this.a = context0;
        this.l = v;
    }

    public final zzfhj zzA(int v) {
        synchronized(this) {
            this.m = v;
        }
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zza(zze zze0) {
        this.zzo(zze0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzb(zzfbw zzfbw0) {
        this.zzp(zzfbw0);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzc(String s) {
        this.zzq(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzd(String s) {
        this.zzr(s);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zze(boolean z) {
        this.zzs(z);
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzf() {
        this.zzt();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzg() {
        this.zzu();
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final boolean zzh() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhl zzj() {
        synchronized(this) {
            if(this.j) {
                return null;
            }
            this.j = true;
            if(!this.k) {
                this.zzt();
            }
            if(this.c < 0L) {
                this.zzu();
            }
            return new zzfhl(this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfhh
    public final zzfhh zzk(int v) {
        this.zzA(v);
        return this;
    }

    public final zzfhj zzo(zze zze0) {
        synchronized(this) {
            IBinder iBinder0 = zze0.zze;
            if(iBinder0 == null) {
                return this;
            }
            String s = ((zzdbm)iBinder0).zzj();
            if(!TextUtils.isEmpty(s)) {
                this.f = s;
            }
            String s1 = ((zzdbm)iBinder0).zzh();
            if(!TextUtils.isEmpty(s1)) {
                this.g = s1;
            }
            return this;
        }
    }

    public final zzfhj zzp(zzfbw zzfbw0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(zzfbw0.zzb.zzb)) {
                this.f = zzfbw0.zzb.zzb;
            }
            for(Object object0: zzfbw0.zza) {
                zzfbl zzfbl0 = (zzfbl)object0;
                if(!TextUtils.isEmpty(zzfbl0.zzac)) {
                    this.g = zzfbl0.zzac;
                    break;
                }
                if(false) {
                    break;
                }
            }
            return this;
        }
    }

    public final zzfhj zzq(String s) {
        synchronized(this) {
            this.h = s;
        }
        return this;
    }

    public final zzfhj zzr(String s) {
        synchronized(this) {
            this.i = s;
        }
        return this;
    }

    public final zzfhj zzs(boolean z) {
        synchronized(this) {
            this.d = z;
        }
        return this;
    }

    public final zzfhj zzt() {
        synchronized(this) {
            this.e = zzt.zzq().zzl(this.a);
            Resources resources0 = this.a.getResources();
            int v1 = 2;
            if(resources0 != null) {
                Configuration configuration0 = resources0.getConfiguration();
                if(configuration0 != null) {
                    v1 = configuration0.orientation == 2 ? 4 : 3;
                }
            }
            this.n = v1;
            this.b = zzt.zzA().elapsedRealtime();
            this.k = true;
            return this;
        }
    }

    public final zzfhj zzu() {
        synchronized(this) {
            this.c = zzt.zzA().elapsedRealtime();
            return this;
        }
    }
}

