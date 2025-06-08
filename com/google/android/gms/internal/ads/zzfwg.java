package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import jeb.synthetic.TWR;

public final class zzfwg {
    public final ByteArrayInputStream a;

    public zzfwg(ByteArrayInputStream byteArrayInputStream0) {
        this.a = byteArrayInputStream0;
    }

    public final zzgfw zza() throws IOException {
        zzgfw zzgfw0;
        ByteArrayInputStream byteArrayInputStream0;
        try {
            byteArrayInputStream0 = this.a;
            zzgfw0 = zzgfw.zzf(byteArrayInputStream0, zzgkc.zza());
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(byteArrayInputStream0, throwable0);
            throw throwable0;
        }
        byteArrayInputStream0.close();
        return zzgfw0;
    }

    public static zzfwg zzb(byte[] arr_b) {
        return new zzfwg(new ByteArrayInputStream(arr_b));
    }
}

