package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import i3.e;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbrp implements zzbrf, zzbrh {
    public final zzcli i;

    public zzbrp(Context context0, zzcfo zzcfo0, zzaoc zzaoc0, zza zza0) throws zzclt {
        zzcli zzcli0 = zzclu.zza(context0, zzcmx.zza(), "", false, false, null, null, zzcfo0, null, null, null, zzbdm.zza(), null, null);
        this.i = zzcli0;
        ((View)zzcli0).setWillNotDraw(true);
    }

    public static final void a(Runnable runnable0) {
        if(zzcfb.zzt()) {
            runnable0.run();
            return;
        }
        zzs.zza.post(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final void zza(String s) {
        zzbrp.a(new zzbrk(this, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final void zzb(String s, String s1) {
        zzbre.zzc(this, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final void zzc() {
        this.i.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String s, Map map0) {
        zzbre.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrd
    public final void zze(String s, JSONObject jSONObject0) {
        zzbre.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(String s) {
        zzbrp.a(new zzbrl(this, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(String s) {
        zzbrp.a(new zzbrn(this, s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final void zzh(String s) {
        zzbrp.a(new zzbrm(this, e.f("<!DOCTYPE html><html><head><script src=\"", s, "\"></script></head><body></body></html>")));
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzi() {
        return this.i.zzaB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final zzbso zzj() {
        return new zzbso(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrh
    public final void zzk(zzbrv zzbrv0) {
        this.i.zzP().zzF(new zzbri(zzbrv0, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzl(String s, JSONObject jSONObject0) {
        zzbre.zzd(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String s, zzbom zzbom0) {
        W1 w10 = new W1(this, zzbom0);
        this.i.zzaf(s, w10);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsn
    public final void zzr(String s, zzbom zzbom0) {
        zzbrj zzbrj0 = new zzbrj(zzbom0);
        this.i.zzax(s, zzbrj0);
    }
}

