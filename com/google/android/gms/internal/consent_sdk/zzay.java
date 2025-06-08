package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import d1.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m1.a;

public final class zzay {
    public final Application a;
    public final zzbi b;
    public final zzbc c;
    public final zzcl d;
    public Dialog e;
    public zzbg f;
    public final AtomicBoolean g;
    public final AtomicReference h;
    public final AtomicReference i;
    public final AtomicReference j;

    public zzay(Application application0, zzac zzac0, zzbi zzbi0, zzam zzam0, zzbc zzbc0, zzcl zzcl0) {
        this.g = new AtomicBoolean();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.a = application0;
        this.b = zzbi0;
        this.c = zzbc0;
        this.d = zzcl0;
    }

    public final void a() {
        Dialog dialog0 = this.e;
        if(dialog0 != null) {
            dialog0.dismiss();
            this.e = null;
        }
        this.b.zza(null);
        d d0 = (d)this.j.getAndSet(null);
        if(d0 != null) {
            d0.j.a.unregisterActivityLifecycleCallbacks(d0);
        }
    }

    public final void show(Activity activity0, a a0) {
        zzcd.zza();
        if(!this.g.compareAndSet(false, true)) {
            new zzj(3, "ConsentForm#show can only be invoked once.").zza();
            a0.a();
            return;
        }
        d d0 = new d(this, activity0);
        this.a.registerActivityLifecycleCallbacks(d0);
        this.j.set(d0);
        this.b.zza(activity0);
        Dialog dialog0 = new Dialog(activity0, 0x1030010);
        dialog0.setContentView(this.f);
        dialog0.setCancelable(false);
        Window window0 = dialog0.getWindow();
        if(window0 == null) {
            new zzj(3, "Activity with null windows is passed in.").zza();
            a0.a();
            return;
        }
        window0.setLayout(-1, -1);
        window0.setBackgroundDrawable(new ColorDrawable(0));
        this.i.set(a0);
        dialog0.show();
        this.e = dialog0;
        this.f.zzb("UMP_messagePresented", "");
    }
}

