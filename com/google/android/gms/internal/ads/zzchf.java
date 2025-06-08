package com.google.android.gms.internal.ads;

import A.f;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzchf extends FrameLayout implements zzcgw {
    public static final int A;
    public final zzchr i;
    public final FrameLayout j;
    public final View k;
    public final zzbio l;
    public final N2 m;
    public final long n;
    public final zzcgx o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;
    public long u;
    public String v;
    public String[] w;
    public Bitmap x;
    public final ImageView y;
    public boolean z;

    public zzchf(Context context0, zzchr zzchr0, int v, boolean z, zzbio zzbio0, zzchq zzchq0) {
        super(context0);
        this.i = zzchr0;
        this.l = zzbio0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        this.j = frameLayout0;
        this.addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchr0.zzm());
        zzchr0.zzm();
        zzchs zzchs0 = new zzchs(context0, zzchr0.zzp(), zzchr0.zzu(), zzbio0, zzchr0.zzn());
        zzcij zzcij0 = v == 2 ? new zzcij(context0, zzchs0, zzchr0, z, zzchr0.zzQ().zzi(), zzchq0) : new zzcgv(context0, zzchr0, z, zzchr0.zzQ().zzi(), zzchq0, new zzchs(context0, zzchr0.zzp(), zzchr0.zzu(), zzbio0, zzchr0.zzn()));
        this.o = zzcij0;
        View view0 = new View(context0);
        this.k = view0;
        view0.setBackgroundColor(0);
        frameLayout0.addView(zzcij0, new FrameLayout.LayoutParams(-1, -1, 17));
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzD)).booleanValue()) {
            frameLayout0.addView(view0, new FrameLayout.LayoutParams(-1, -1));
            frameLayout0.bringChildToFront(view0);
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzA)).booleanValue()) {
            this.zzm();
        }
        this.y = new ImageView(context0);
        this.n = (long)(((Long)zzay.zzc().zzb(zzbhz.zzF)));
        boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzC)).booleanValue();
        this.s = z1;
        if(zzbio0 != null) {
            zzbio0.zzd("spinner_used", (z1 ? "1" : "0"));
        }
        this.m = new N2(this);
        zzcij0.zzr(this);
    }

    public final void a() {
        zzchr zzchr0 = this.i;
        if(zzchr0.zzk() == null) {
            return;
        }
        if(this.q && !this.r) {
            zzchr0.zzk().getWindow().clearFlags(0x80);
            this.q = false;
        }
    }

    // 检测为 lambda 实现。
    public final void b(String s, String[] arr_s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("event", s);
        String s1 = null;
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s1 == null) {
                s1 = s2;
            }
            else {
                hashMap0.put(s1, s2);
                s1 = null;
            }
        }
        this.i.zzd("onVideoEvent", hashMap0);
    }

    public final void c() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        long v = (long)zzcgx0.zza();
        if(this.t != v && v > 0L) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) {
                this.b("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f), "totalBytes", String.valueOf(zzcgx0.zzh()), "qoeCachedBytes", String.valueOf(zzcgx0.zzf()), "qoeLoadedBytes", String.valueOf(zzcgx0.zzg()), "droppedFrames", String.valueOf(zzcgx0.zzb()), "reportTime", String.valueOf(zzt.zzA().currentTimeMillis())});
            }
            else {
                this.b("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f)});
            }
            this.t = v;
        }
    }

    @Override
    public final void finalize() throws Throwable {
        try {
            this.m.a();
            zzcgx zzcgx0 = this.o;
            if(zzcgx0 != null) {
                zzcgz zzcgz0 = new zzcgz(zzcgx0);
                zzcfv.zze.execute(zzcgz0);
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        N2 n20 = this.m;
        if(z) {
            n20.k = false;
            zzs.zza.removeCallbacks(n20);
            zzs.zza.postDelayed(n20, 0xFAL);
        }
        else {
            n20.a();
            this.u = this.t;
        }
        zzcha zzcha0 = new zzcha(this, z);
        zzs.zza.post(zzcha0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw, android.view.View
    public final void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        boolean z = false;
        N2 n20 = this.m;
        if(v == 0) {
            n20.k = false;
            zzs.zza.removeCallbacks(n20);
            zzs.zza.postDelayed(n20, 0xFAL);
            z = true;
        }
        else {
            n20.a();
            this.u = this.t;
        }
        N2 n21 = new N2(this, z, 0);
        zzs.zza.post(n21);
    }

    public final void zzA(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzz(v);
    }

    public final void zzB(int v) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzD)).booleanValue()) {
            this.j.setBackgroundColor(v);
            this.k.setBackgroundColor(v);
        }
    }

    public final void zzC(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzA(v);
    }

    public final void zzD(String s, String[] arr_s) {
        this.v = s;
        this.w = arr_s;
    }

    public final void zzE(int v, int v1, int v2, int v3) {
        if(zze.zzc()) {
            StringBuilder stringBuilder0 = f.n("Set video bounds to x:", v, ";y:", v1, ";w:");
            stringBuilder0.append(v2);
            stringBuilder0.append(";h:");
            stringBuilder0.append(v3);
            zze.zza(stringBuilder0.toString());
        }
        if(v2 != 0 && v3 != 0) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2, v3);
            frameLayout$LayoutParams0.setMargins(v, v1, 0, 0);
            this.j.setLayoutParams(frameLayout$LayoutParams0);
            this.requestLayout();
        }
    }

    public final void zzF(float f) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.j.zze(f);
        zzcgx0.zzn();
    }

    public final void zzG(float f, float f1) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 != null) {
            zzcgx0.zzu(f, f1);
        }
    }

    public final void zzH() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.j.zzd(false);
        zzcgx0.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zza() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbE)).booleanValue()) {
            this.m.a();
        }
        this.b("ended", new String[0]);
        this.a();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzb(String s, String s1) {
        this.b("error", new String[]{"what", s, "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzc(String s, String s1) {
        this.b("exception", new String[]{"what", "ExoPlayerAdapter exception", "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzd() {
        this.b("pause", new String[0]);
        this.a();
        this.p = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zze() {
        boolean z = false;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbE)).booleanValue()) {
            this.m.k = false;
            zzs.zza.removeCallbacks(this.m);
            zzs.zza.postDelayed(this.m, 0xFAL);
        }
        zzchr zzchr0 = this.i;
        if(zzchr0.zzk() != null && !this.q) {
            if((zzchr0.zzk().getWindow().getAttributes().flags & 0x80) != 0) {
                z = true;
            }
            this.r = z;
            if(!z) {
                zzchr0.zzk().getWindow().addFlags(0x80);
                this.q = true;
            }
        }
        this.p = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzf() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        if(this.u == 0L) {
            this.b("canplaythrough", new String[]{"duration", String.valueOf(((float)zzcgx0.zzc()) / 1000.0f), "videoWidth", String.valueOf(zzcgx0.zze()), "videoHeight", String.valueOf(zzcgx0.zzd())});
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzg() {
        this.k.setVisibility(4);
        zzchb zzchb0 = () -> {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("event", "firstFrameRendered");
            String s1 = null;
            for(int v = 0; v < new String[0].length; ++v) {
                String s2 = new String[0][v];
                if(s1 == null) {
                    s1 = s2;
                }
                else {
                    hashMap0.put(s1, s2);
                    s1 = null;
                }
            }
            this.i.zzd("onVideoEvent", hashMap0);
        };
        zzs.zza.post(zzchb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzh() {
        this.m.k = false;
        zzs.zza.removeCallbacks(this.m);
        zzs.zza.postDelayed(this.m, 0xFAL);
        M2 m20 = new M2(this, 0);
        zzs.zza.post(m20);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzi() {
        if(this.z && this.x != null) {
            ImageView imageView0 = this.y;
            if(imageView0.getParent() == null) {
                imageView0.setImageBitmap(this.x);
                imageView0.invalidate();
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                this.j.addView(imageView0, frameLayout$LayoutParams0);
                this.j.bringChildToFront(imageView0);
            }
        }
        this.m.a();
        this.u = this.t;
        M2 m20 = new M2(this, 1);
        zzs.zza.post(m20);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzj(int v, int v1) {
        if(this.s) {
            int v2 = Math.max(v / ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzE)))), 1);
            int v3 = Math.max(v1 / ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzE)))), 1);
            if(this.x == null || this.x.getWidth() != v2 || this.x.getHeight() != v3) {
                this.x = Bitmap.createBitmap(v2, v3, Bitmap.Config.ARGB_8888);
                this.z = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zzk() {
        if(this.p) {
            ImageView imageView0 = this.y;
            if(imageView0.getParent() != null) {
                this.j.removeView(imageView0);
            }
        }
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 != null && this.x != null) {
            long v = zzt.zzA().elapsedRealtime();
            if(zzcgx0.getBitmap(this.x) != null) {
                this.z = true;
            }
            long v1 = zzt.zzA().elapsedRealtime() - v;
            if(zze.zzc()) {
                zze.zza(("Spinner frame grab took " + v1 + "ms"));
            }
            if(v1 > this.n) {
                zzcfi.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.s = false;
                this.x = null;
                zzbio zzbio0 = this.l;
                if(zzbio0 != null) {
                    zzbio0.zzd("spinner_jank", Long.toString(v1));
                }
            }
        }
    }

    public final void zzm() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        TextView textView0 = new TextView(zzcgx0.getContext());
        textView0.setText("AdMob - " + zzcgx0.zzj());
        textView0.setTextColor(0xFFFF0000);
        textView0.setBackgroundColor(0xFFFFFF00);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2, 17);
        this.j.addView(textView0, frameLayout$LayoutParams0);
        this.j.bringChildToFront(textView0);
    }

    public final void zzn() {
        this.m.a();
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 != null) {
            zzcgx0.zzt();
        }
        this.a();
    }

    public final void zzq() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        if(!TextUtils.isEmpty(this.v)) {
            zzcgx0.zzB(this.v, this.w);
            return;
        }
        this.b("no_src", new String[0]);
    }

    public final void zzr() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.j.zzd(true);
        zzcgx0.zzn();
    }

    public final void zzt() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzo();
    }

    public final void zzu() {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzp();
    }

    public final void zzv(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzq(v);
    }

    public final void zzw(MotionEvent motionEvent0) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.dispatchTouchEvent(motionEvent0);
    }

    public final void zzx(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzw(v);
    }

    public final void zzy(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzx(v);
    }

    public final void zzz(int v) {
        zzcgx zzcgx0 = this.o;
        if(zzcgx0 == null) {
            return;
        }
        zzcgx0.zzy(v);
    }
}

