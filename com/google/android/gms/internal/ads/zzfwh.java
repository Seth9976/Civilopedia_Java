package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import jeb.synthetic.TWR;

public final class zzfwh {
    public final OutputStream a;

    public zzfwh(OutputStream outputStream0) {
        this.a = outputStream0;
    }

    public final void zza(zzgfw zzgfw0) throws IOException {
        OutputStream outputStream0;
        try {
            outputStream0 = this.a;
            zzgfw0.zzav(outputStream0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(outputStream0, throwable0);
            throw throwable0;
        }
        outputStream0.close();
    }

    public static zzfwh zzb(OutputStream outputStream0) {
        return new zzfwh(outputStream0);
    }
}

