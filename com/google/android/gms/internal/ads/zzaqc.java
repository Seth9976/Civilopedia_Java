package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzaqc extends zzaqn {
    public zzaqc(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1) {
        super(zzapc0, "sQRnRw5AtmLjG4zPuRRzbU9KCNWkvhkIESw7dU0UKjciZOTbDwuGbxSLRs8Rwqdx", "QTFg2pa0CDlg9dgYpioKGLNjWwgLSvJpA082RZAjjog=", zzali0, v, 73);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        zzali zzali0;
        try {
            int v = 1;
            zzali0 = this.d;
            if(((Boolean)this.e.invoke(null, new Object[]{this.a.zzb()})).booleanValue()) {
                v = 2;
            }
            zzali0.zzad(v);
        }
        catch(InvocationTargetException unused_ex) {
            zzali0.zzad(3);
        }
    }
}

