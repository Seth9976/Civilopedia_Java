package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzcce implements zzccj {
    public final zzgol a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final ArrayList d;
    public final Context e;
    public boolean f;
    public final zzccg g;
    public final Object h;
    public final HashSet i;
    public boolean j;
    public boolean k;
    public static final List l;
    public static final int zzb;

    static {
        zzcce.l = Collections.synchronizedList(new ArrayList());
    }

    public zzcce(Context context0, zzcfo zzcfo0, zzccg zzccg0, String s, zzccf zzccf0, byte[] arr_b) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.h = new Object();
        this.i = new HashSet();
        this.j = false;
        this.k = false;
        Preconditions.checkNotNull(zzccg0, "SafeBrowsing config is not present.");
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.e = context0;
        this.b = new LinkedHashMap();
        this.g = zzccg0;
        for(Object object0: zzccg0.zze) {
            this.i.add(((String)object0).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie");
        zzgol zzgol0 = zzgpq.zza();
        zzgol0.zzn(9);
        zzgol0.zzj(s);
        zzgol0.zzh(s);
        zzgom zzgom0 = zzgon.zza();
        String s1 = this.g.zza;
        if(s1 != null) {
            zzgom0.zza(s1);
        }
        zzgol0.zzg(((zzgon)zzgom0.zzal()));
        zzgpl zzgpl0 = zzgpm.zza();
        zzgpl0.zzc(Wrappers.packageManager(this.e).isCallerInstantApp());
        String s2 = zzcfo0.zza;
        if(s2 != null) {
            zzgpl0.zza(s2);
        }
        long v = (long)GoogleApiAvailabilityLight.getInstance().getApkVersion(this.e);
        if(v > 0L) {
            zzgpl0.zzb(v);
        }
        zzgol0.zzf(((zzgpm)zzgpl0.zzal()));
        this.a = zzgol0;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final zzccg zza() {
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzd(String s, Map map0, int v) {
        synchronized(this.h) {
            if(v == 3) {
                this.k = true;
            }
            if(this.b.containsKey(s)) {
                if(v == 3) {
                    ((zzgpj)this.b.get(s)).zze(4);
                }
                return;
            }
            zzgpj zzgpj0 = zzgpk.zzc();
            int v2 = zzgpi.zza(v);
            if(v2 != 0) {
                zzgpj0.zze(v2);
            }
            zzgpj0.zzb(this.b.size());
            zzgpj0.zzd(s);
            zzgou zzgou0 = zzgox.zza();
            if(!this.i.isEmpty() && map0 != null) {
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    String s1 = map$Entry0.getKey() == null ? "" : ((String)map$Entry0.getKey());
                    String s2 = map$Entry0.getValue() == null ? "" : ((String)map$Entry0.getValue());
                    if(this.i.contains(s1.toLowerCase(Locale.ENGLISH))) {
                        zzgos zzgos0 = zzgot.zza();
                        zzgos0.zza(zzgji.zzx(s1));
                        zzgos0.zzb(zzgji.zzx(s2));
                        zzgou0.zza(((zzgot)zzgos0.zzal()));
                    }
                }
            }
            zzgpj0.zzc(((zzgox)zzgou0.zzal()));
            this.b.put(s, zzgpj0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zze() {
        synchronized(this.h) {
            this.b.keySet();
            zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(Collections.emptyMap()), new zzccb(this), zzcfv.zzf);
            zzfvl zzfvl1 = zzfvc.zzo(zzfvl0, 10L, TimeUnit.SECONDS, zzcfv.zzd);
            zzfvc.zzr(zzfvl0, new E9(zzfvl1, 12), zzcfv.zzf);
            zzcce.l.add(zzfvl1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzg(View view0) {
        Bitmap bitmap2;
        boolean z;
        Bitmap bitmap0 = null;
        if(!this.g.zzc) {
            return;
        }
        if(this.j) {
            return;
        }
        if(view0 != null) {
            try {
                z = view0.isDrawingCacheEnabled();
                view0.setDrawingCacheEnabled(true);
                Bitmap bitmap1 = view0.getDrawingCache();
                bitmap2 = bitmap1 == null ? null : Bitmap.createBitmap(bitmap1);
            }
            catch(RuntimeException runtimeException0) {
                bitmap2 = null;
                goto label_20;
            }
            try {
                view0.setDrawingCacheEnabled(z);
                goto label_21;
            }
            catch(RuntimeException runtimeException0) {
            }
        label_20:
            zzcfi.zzh("Fail to capture the web view", runtimeException0);
        label_21:
            if(bitmap2 == null) {
                try {
                    int v = view0.getWidth();
                    int v1 = view0.getHeight();
                    if(v == 0 || v1 == 0) {
                        zzcfi.zzj("Width or height of view is zero");
                    }
                    else {
                        Bitmap bitmap3 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                        Canvas canvas0 = new Canvas(bitmap3);
                        view0.layout(0, 0, v, v1);
                        view0.draw(canvas0);
                        bitmap0 = bitmap3;
                    }
                    goto label_37;
                }
                catch(RuntimeException runtimeException1) {
                }
                zzcfi.zzh("Fail to capture the webview", runtimeException1);
            }
            else {
                bitmap0 = bitmap2;
            }
        }
    label_37:
        if(bitmap0 == null) {
            zzcci.zza("Failed to capture the webview bitmap.");
            return;
        }
        this.j = true;
        zzs.zzf(new zzccc(this, bitmap0));
    }

    @Override  // com.google.android.gms.internal.ads.zzccj
    public final void zzh(String s) {
        synchronized(this.h) {
            if(s == null) {
                this.a.zzd();
            }
            else {
                this.a.zze(s);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzccj
    public final boolean zzi() {
        return this.g.zzc && !this.j;
    }
}

