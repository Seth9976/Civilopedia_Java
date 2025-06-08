package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbx extends zzbbo {
    public MessageDigest c;
    public final int d;
    public final int e;

    public zzbbx(int v) {
        this.d = (v & 7) <= 0 ? v >> 3 : (v >> 3) + 1;
        this.e = v;
    }

    public final byte[] zzb(String s) {
        synchronized(this.a) {
            MessageDigest messageDigest0 = this.a();
            this.c = messageDigest0;
            if(messageDigest0 == null) {
                return new byte[0];
            }
            messageDigest0.reset();
            this.c.update(s.getBytes(Charset.forName("UTF-8")));
            byte[] arr_b = this.c.digest();
            int v2 = arr_b.length;
            int v3 = this.d;
            if(v2 > v3) {
                v2 = v3;
            }
            byte[] arr_b1 = new byte[v2];
            System.arraycopy(arr_b, 0, arr_b1, 0, v2);
            if((this.e & 7) > 0) {
                long v4 = 0L;
                for(int v1 = 0; v1 < v2; ++v1) {
                    if(v1 > 0) {
                        v4 <<= 8;
                    }
                    v4 += (long)(arr_b1[v1] & 0xFF);
                }
                long v5 = v4 >>> 8 - (this.e & 7);
                int v6 = this.d;
                while(true) {
                    --v6;
                    if(v6 < 0) {
                        break;
                    }
                    arr_b1[v6] = (byte)(((int)(0xFFL & v5)));
                    v5 >>>= 8;
                }
            }
            return arr_b1;
        }
    }
}

