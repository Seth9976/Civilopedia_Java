package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class n extends u {
    public final int m;
    public final zzbz n;
    public final zzee o;

    public n(zzee zzee0, zzbz zzbz0, int v) {
        this.m = v;
        this.o = zzee0;
        this.n = zzbz0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        switch(this.m) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).getGmpAppId(this.n);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).getCachedAppInstanceId(this.n);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).generateEventId(this.n);
                return;
            }
            case 3: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).getCurrentScreenName(this.n);
                return;
            }
            case 4: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).getCurrentScreenClass(this.n);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.o.h)).getAppInstanceId(this.n);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void b() {
        switch(this.m) {
            case 0: {
                this.n.zzd(null);
                return;
            }
            case 1: {
                this.n.zzd(null);
                return;
            }
            case 2: {
                this.n.zzd(null);
                return;
            }
            case 3: {
                this.n.zzd(null);
                return;
            }
            case 4: {
                this.n.zzd(null);
                return;
            }
            default: {
                this.n.zzd(null);
            }
        }
    }
}

