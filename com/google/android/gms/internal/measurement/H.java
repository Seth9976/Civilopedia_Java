package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class h extends u {
    public final int m;
    public final String n;
    public final String o;
    public final zzee p;
    public final Object q;

    public h(zzee zzee0, Activity activity0, String s, String s1) {
        this.m = 2;
        this.p = zzee0;
        this.q = activity0;
        this.n = s;
        this.o = s1;
        super(zzee0, true);
    }

    public h(zzee zzee0, String s, String s1, Object object0, int v) {
        this.m = v;
        this.p = zzee0;
        this.n = s;
        this.o = s1;
        this.q = object0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        switch(this.m) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.p.h)).clearConditionalUserProperty(this.n, this.o, ((Bundle)this.q));
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.p.h)).getConditionalUserProperties(this.n, this.o, ((zzbz)this.q));
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.p.h)).setCurrentScreen(ObjectWrapper.wrap(((Activity)this.q)), this.n, this.o, this.i);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public void b() {
        if(this.m != 1) {
            return;
        }
        ((zzbz)this.q).zzd(null);
    }
}

