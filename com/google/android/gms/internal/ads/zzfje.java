package com.google.android.gms.internal.ads;

import F0.g;
import android.content.Context;
import android.content.IntentFilter;
import android.webkit.WebView;

public final class zzfje {
    public Context a;
    public g b;
    public boolean c;
    public boolean d;
    public zzfjj e;
    public static final zzfje f;

    static {
        zzfje.f = new zzfje();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(zzfje zzfje0, boolean z) {
        if(zzfje0.d != z) {
            zzfje0.d = z;
            if(zzfje0.c) {
                zzfje0.b();
                if(zzfje0.e != null) {
                    if(zzfje0.zzf()) {
                        zzfkf.zzd().zzi();
                        return;
                    }
                    zzfkf.zzd().zzh();
                }
            }
        }
    }

    public final void b() {
        boolean z = this.d;
        for(Object object0: zzfjc.zza().zzc()) {
            zzfjp zzfjp0 = ((zzfir)object0).zzg();
            if(zzfjp0.zzk()) {
                WebView webView0 = zzfjp0.zza();
                zzfji.zza().getClass();
                zzfji.a(webView0, "setState", new Object[]{(z ? "backgrounded" : "foregrounded")});
            }
        }
    }

    public static zzfje zza() {
        return zzfje.f;
    }

    public final void zzc(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public final void zzd() {
        this.b = new g(this, 5);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        intentFilter0.addAction("android.intent.action.SCREEN_ON");
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        this.a.registerReceiver(this.b, intentFilter0);
        this.c = true;
        this.b();
    }

    public final void zze() {
        Context context0 = this.a;
        if(context0 != null) {
            g g0 = this.b;
            if(g0 != null) {
                context0.unregisterReceiver(g0);
                this.b = null;
            }
        }
        this.c = false;
        this.d = false;
        this.e = null;
    }

    public final boolean zzf() {
        return !this.d;
    }

    public final void zzg(zzfjj zzfjj0) {
        this.e = zzfjj0;
    }
}

