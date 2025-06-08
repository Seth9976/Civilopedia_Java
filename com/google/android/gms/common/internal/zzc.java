package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class zzc {
    public Object a;
    public boolean b;
    public final BaseGmsClient c;

    public zzc(BaseGmsClient baseGmsClient0, Object object0) {
        this.c = baseGmsClient0;
        super();
        this.a = object0;
        this.b = false;
    }

    public abstract void a();

    public final void zze() {
        synchronized(this) {
            Object object0 = this.a;
            if(this.b) {
                Log.w("GmsClient", "Callback proxy " + this.toString() + " being reused. This is not safe.");
            }
        }
        if(object0 != null) {
            this.a();
        }
        synchronized(this) {
            this.b = true;
        }
        this.zzg();
    }

    public final void zzf() {
        synchronized(this) {
            this.a = null;
        }
    }

    public final void zzg() {
        this.zzf();
        synchronized(this.c.z) {
            this.c.z.remove(this);
        }
    }
}

