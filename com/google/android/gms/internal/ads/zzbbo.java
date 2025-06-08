package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class zzbbo {
    public final Object a;
    public static MessageDigest b;

    public zzbbo() {
        this.a = new Object();
    }

    public final MessageDigest a() {
        synchronized(this.a) {
            MessageDigest messageDigest0 = zzbbo.b;
            if(messageDigest0 != null) {
                return messageDigest0;
            }
            for(int v1 = 0; v1 < 2; ++v1) {
                try {
                    zzbbo.b = MessageDigest.getInstance("MD5");
                }
                catch(NoSuchAlgorithmException unused_ex) {
                }
            }
            return zzbbo.b;
        }
    }
}

