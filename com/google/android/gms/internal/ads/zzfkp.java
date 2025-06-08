package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

@VisibleForTesting
public final class zzfkp {
    public final byte[] a;
    public final byte[] b;
    public static final byte[] c;
    public static final byte[] d;

    static {
        zzfkp.c = new byte[]{61, 0x7A, 18, 35, 1, -102, -93, -99, -98, (byte)0xA0, -29, 67, 106, -73, (byte)0xC0, (byte)0x89, 107, -5, 0x4F, -74, 0x79, -12, -34, 0x5F, -25, -62, 0x3F, 50, 108, (byte)0x8F, -103, 74};
        zzfkp.d = new byte[]{16, 57, 56, -18, 69, 55, -27, -98, (byte)0x8E, -25, -110, -10, 84, 80, 0x4F, -72, 52, 0x6F, -58, -77, 70, (byte)0xD0, -69, -60, 65, 0x5F, -61, 57, -4, -4, (byte)0x8E, (byte)0xC1};
    }

    public zzfkp() {
        this.a = zzfkp.d;
        this.b = zzfkp.c;
    }

    public final boolean zza(File file0) throws GeneralSecurityException {
        X509Certificate[][] arr2_x509Certificate;
        String s = file0.getAbsolutePath();
        try {
            arr2_x509Certificate = zzaih.zza(s);
        }
        catch(zzaie zzaie0) {
            throw new GeneralSecurityException("Package is not signed", zzaie0);
        }
        catch(IOException | RuntimeException iOException0) {
            throw new GeneralSecurityException("Failed to verify signatures", iOException0);
        }
        if(arr2_x509Certificate.length != 1) {
            throw new GeneralSecurityException("APK has more than one signature.");
        }
        X509Certificate x509Certificate0 = arr2_x509Certificate[0][0];
        byte[] arr_b = MessageDigest.getInstance("SHA-256").digest(x509Certificate0.getEncoded());
        return Arrays.equals(this.b, arr_b) || !"user".equals(Build.TYPE) && Arrays.equals(this.a, arr_b);
    }
}

