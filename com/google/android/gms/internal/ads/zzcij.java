package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzcij extends zzcgx implements TextureView.SurfaceTextureListener, zzchh {
    public float A;
    public final zzchr k;
    public final zzchs l;
    public final zzchq m;
    public zzcgw n;
    public Surface o;
    public zzchi p;
    public String q;
    public String[] r;
    public boolean s;
    public int t;
    public zzchp u;
    public final boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public zzcij(Context context0, zzchs zzchs0, zzchr zzchr0, boolean z, boolean z1, zzchq zzchq0) {
        super(context0);
        this.t = 1;
        this.k = zzchr0;
        this.l = zzchs0;
        this.v = z;
        this.m = zzchq0;
        this.setSurfaceTextureListener(this);
        zzchs0.zza(this);
    }

    public static String a(String s, Exception exception0) {
        return s + "/" + exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
    }

    public final void b() {
        if(this.w) {
            return;
        }
        this.w = true;
        zzcid zzcid0 = new zzcid(this);
        zzs.zza.post(zzcid0);
        this.zzn();
        this.l.zzb();
        if(this.x) {
            this.zzp();
        }
    }

    public final void c(boolean z) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null && !z) {
            return;
        }
        if(this.q != null && this.o != null) {
            if(z) {
                if(this.g()) {
                    zzchi0.zzQ();
                    this.d();
                    goto label_11;
                }
                zzcfi.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
        label_11:
            zzchq zzchq0 = this.m;
            zzchr zzchr0 = this.k;
            if(this.q.startsWith("cache:")) {
                zzcju zzcju0 = zzchr0.zzr(this.q);
                if(zzcju0 instanceof zzckd) {
                    zzchi zzchi1 = ((zzckd)zzcju0).zzj();
                    this.p = zzchi1;
                    if(!zzchi1.zzR()) {
                        zzcfi.zzj("Precached video player has been released.");
                        return;
                    }
                }
                else {
                    if(zzcju0 instanceof zzcka) {
                        String s = zzt.zzp().zzc(zzchr0.getContext(), zzchr0.zzp().zza);
                        ByteBuffer byteBuffer0 = ((zzcka)zzcju0).zzl();
                        boolean z1 = ((zzcka)zzcju0).zzm();
                        String s1 = ((zzcka)zzcju0).zzi();
                        if(s1 == null) {
                            zzcfi.zzj("Stream cache URL is null.");
                            return;
                        }
                        zzckv zzckv0 = zzchq0.zzm ? new zzckv(zzchr0.getContext(), zzchq0, zzchr0) : new zzciz(zzchr0.getContext(), zzchq0, zzchr0);
                        this.p = zzckv0;
                        zzckv0.zzD(new Uri[]{Uri.parse(s1)}, s, byteBuffer0, z1);
                        goto label_52;
                    }
                    zzcfi.zzj(("Stream cache miss: " + this.q));
                    return;
                }
            }
            else {
                zzckv zzckv1 = zzchq0.zzm ? new zzckv(zzchr0.getContext(), zzchq0, zzchr0) : new zzciz(zzchr0.getContext(), zzchq0, zzchr0);
                this.p = zzckv1;
                String s2 = zzt.zzp().zzc(zzchr0.getContext(), zzchr0.zzp().zza);
                Uri[] arr_uri = new Uri[this.r.length];
                for(int v = 0; true; ++v) {
                    String[] arr_s = this.r;
                    if(v >= arr_s.length) {
                        break;
                    }
                    arr_uri[v] = Uri.parse(arr_s[v]);
                }
                this.p.zzC(arr_uri, s2);
            }
        label_52:
            this.p.zzI(this);
            this.e(this.o, false);
            if(this.p.zzR()) {
                int v1 = this.p.zzt();
                this.t = v1;
                if(v1 == 3) {
                    this.b();
                }
            }
        }
    }

    public final void d() {
        if(this.p != null) {
            this.e(null, true);
            zzchi zzchi0 = this.p;
            if(zzchi0 != null) {
                zzchi0.zzI(null);
                this.p.zzE();
                this.p = null;
            }
            this.t = 1;
            this.s = false;
            this.w = false;
            this.x = false;
        }
    }

    public final void e(Surface surface0, boolean z) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            try {
                zzchi0.zzO(surface0, z);
            }
            catch(IOException iOException0) {
                zzcfi.zzk("", iOException0);
            }
            return;
        }
        zzcfi.zzj("Trying to set surface before player is initialized.");
    }

    public final boolean f() {
        return this.g() && this.t != 1;
    }

    // 去混淆评级： 低(20)
    public final boolean g() {
        return this.p != null && this.p.zzR() && !this.s;
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        float f = this.A;
        if(f != 0.0f && this.u == null) {
            float f1 = ((float)v2) / ((float)v3);
            if(f > f1) {
                v3 = (int)(((float)v2) / f);
            }
            if(f < f1) {
                v2 = (int)(((float)v3) * f);
            }
        }
        this.setMeasuredDimension(v2, v3);
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzc(v2, v3);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        if(this.v) {
            zzchp zzchp0 = new zzchp(this.getContext());
            this.u = zzchp0;
            zzchp0.zzd(surfaceTexture0, v, v1);
            this.u.start();
            SurfaceTexture surfaceTexture1 = this.u.zzb();
            if(surfaceTexture1 == null) {
                this.u.zze();
                this.u = null;
            }
            else {
                surfaceTexture0 = surfaceTexture1;
            }
        }
        Surface surface0 = new Surface(surfaceTexture0);
        this.o = surface0;
        if(this.p == null) {
            this.c(false);
        }
        else {
            this.e(surface0, true);
            if(!this.m.zza) {
                zzchi zzchi0 = this.p;
                if(zzchi0 != null) {
                    zzchi0.zzM(true);
                }
            }
        }
        int v2 = this.y;
        float f = 1.0f;
        if(v2 == 0) {
        label_32:
            if(v1 > 0) {
                f = ((float)v) / ((float)v1);
            }
            if(this.A != f) {
                this.A = f;
                this.requestLayout();
            }
        }
        else {
            int v3 = this.z;
            if(v3 == 0) {
                goto label_32;
            }
            else {
                if(v3 > 0) {
                    f = ((float)v2) / ((float)v3);
                }
                if(this.A != f) {
                    this.A = f;
                    this.requestLayout();
                }
            }
        }
        zzcie zzcie0 = new zzcie(this);
        zzs.zza.post(zzcie0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        this.zzo();
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zze();
            this.u = null;
        }
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzM(false);
            Surface surface0 = this.o;
            if(surface0 != null) {
                surface0.release();
            }
            this.o = null;
            this.e(null, true);
        }
        zzcih zzcih0 = new zzcih(this);
        zzs.zza.post(zzcih0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzc(v, v1);
        }
        zzcig zzcig0 = new zzcig(this, v, v1);
        zzs.zza.post(zzcig0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        this.l.zzf(this);
        this.i.zza(surfaceTexture0, this.n);
    }

    @Override  // android.view.View
    public final void onWindowVisibilityChanged(int v) {
        zze.zza(("AdExoPlayerView3 window visibility changed to " + v));
        zzcif zzcif0 = new zzcif(this, v);
        zzs.zza.post(zzcif0);
        super.onWindowVisibilityChanged(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzA(int v) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzN(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzB(String s, String[] arr_s) {
        if(s == null) {
            return;
        }
        this.r = arr_s == null ? new String[]{s} : ((String[])Arrays.copyOf(arr_s, arr_s.length));
        boolean z = this.m.zzn && this.q != null && !s.equals(this.q) && this.t == 4;
        this.q = s;
        this.c(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzC(int v, int v1) {
        this.y = v;
        this.z = v1;
        float f = v1 <= 0 ? 1.0f : ((float)v) / ((float)v1);
        if(this.A != f) {
            this.A = f;
            this.requestLayout();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zza() {
        return this.f() ? ((int)this.p.zzy()) : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzb() {
        return this.p == null ? -1 : this.p.zzr();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzc() {
        return this.f() ? ((int)this.p.zzz()) : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzd() {
        return this.z;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zze() {
        return this.y;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzf() {
        return this.p == null ? -1L : this.p.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzg() {
        return this.p == null ? -1L : this.p.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzh() {
        return this.p == null ? -1L : this.p.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzi(boolean z, long v) {
        if(this.k != null) {
            zzchw zzchw0 = new zzchw(this, z, v);
            zzcfv.zze.execute(zzchw0);
        }
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final String zzj() {
        return this.v ? "ExoPlayer/3 spherical" : "ExoPlayer/3";
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzk(String s, Exception exception0) {
        String s1 = zzcij.a(s, exception0);
        zzcfi.zzj(("ExoPlayerAdapter error: " + s1));
        this.s = true;
        if(this.m.zza) {
            zzchi zzchi0 = this.p;
            if(zzchi0 != null) {
                zzchi0.zzM(false);
            }
        }
        zzchz zzchz0 = new zzchz(this, s1);
        zzs.zza.post(zzchz0);
        zzt.zzo().zzs(exception0, "AdExoPlayerView.onError");
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzl(String s, Exception exception0) {
        String s1 = zzcij.a("onLoadException", exception0);
        zzcfi.zzj(("ExoPlayerAdapter exception: " + s1));
        zzt.zzo().zzs(exception0, "AdExoPlayerView.onException");
        zzchy zzchy0 = new zzchy(this, s1);
        zzs.zza.post(zzchy0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzm(int v) {
        if(this.t != v) {
            this.t = v;
            switch(v) {
                case 3: {
                    this.b();
                    break;
                }
                case 4: {
                    if(this.m.zza) {
                        zzchi zzchi0 = this.p;
                        if(zzchi0 != null) {
                            zzchi0.zzM(false);
                        }
                    }
                    this.l.zze();
                    this.j.zzc();
                    zzchx zzchx0 = new zzchx(this);
                    zzs.zza.post(zzchx0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzn() {
        if(this.m.zzm) {
            zzcib zzcib0 = new zzcib(this);
            zzs.zza.post(zzcib0);
            return;
        }
        float f = this.j.zza();
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            try {
                zzchi0.zzP(f, false);
            }
            catch(IOException iOException0) {
                zzcfi.zzk("", iOException0);
            }
            return;
        }
        zzcfi.zzj("Trying to set volume before player is initialized.");
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzo() {
        if(this.f()) {
            if(this.m.zza) {
                zzchi zzchi0 = this.p;
                if(zzchi0 != null) {
                    zzchi0.zzM(false);
                }
            }
            this.p.zzL(false);
            this.l.zze();
            this.j.zzc();
            zzcic zzcic0 = new zzcic(this);
            zzs.zza.post(zzcic0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzp() {
        if(this.f()) {
            if(this.m.zza) {
                zzchi zzchi0 = this.p;
                if(zzchi0 != null) {
                    zzchi0.zzM(true);
                }
            }
            this.p.zzL(true);
            this.l.zzc();
            this.j.zzb();
            this.i.zzb();
            zzcii zzcii0 = new zzcii(this);
            zzs.zza.post(zzcii0);
            return;
        }
        this.x = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzq(int v) {
        if(this.f()) {
            this.p.zzF(((long)v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzr(zzcgw zzcgw0) {
        this.n = zzcgw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzs(String s) {
        if(s != null) {
            this.zzB(s, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzt() {
        if(this.g()) {
            this.p.zzQ();
            this.d();
        }
        this.l.zze();
        this.j.zzc();
        this.l.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzu(float f, float f1) {
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzf(f, f1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchh
    public final void zzv() {
        zzcia zzcia0 = new zzcia(this);
        zzs.zza.post(zzcia0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzw(int v) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzG(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzx(int v) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzH(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzy(int v) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzJ(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzz(int v) {
        zzchi zzchi0 = this.p;
        if(zzchi0 != null) {
            zzchi0.zzK(v);
        }
    }
}

