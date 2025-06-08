package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcun implements zzban {
    public zzcli i;
    public final Executor j;
    public final zzctz k;
    public final Clock l;
    public boolean m;
    public boolean n;
    public final zzcuc o;

    public zzcun(Executor executor0, zzctz zzctz0, Clock clock0) {
        this.m = false;
        this.n = false;
        this.o = new zzcuc();
        this.j = executor0;
        this.k = zzctz0;
        this.l = clock0;
    }

    public final void a() {
        try {
            JSONObject jSONObject0 = this.k.zza(this.o);
            if(this.i != null) {
                zzcum zzcum0 = new zzcum(this, jSONObject0);
                this.j.execute(zzcum0);
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed to call video active view js", jSONException0);
        }
    }

    public final void zza() {
        this.m = false;
    }

    public final void zzb() {
        this.m = true;
        this.a();
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        this.o.zza = this.n ? false : zzbam0.zzj;
        this.o.zzd = this.l.elapsedRealtime();
        this.o.zzf = zzbam0;
        if(this.m) {
            this.a();
        }
    }

    public final void zze(boolean z) {
        this.n = z;
    }

    public final void zzf(zzcli zzcli0) {
        this.i = zzcli0;
    }
}

