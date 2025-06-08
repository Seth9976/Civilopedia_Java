package Y;

import android.util.Log;
import com.google.android.gms.internal.ads.R8;
import com.google.android.gms.internal.ads.zzfyu;
import com.google.android.gms.internal.ads.zzgan;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class m implements R8 {
    public final int i;
    public final int j;
    public static m k;

    public m(int v) {
        this.i = 4;
        super();
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + v);
        }
        this.j = v;
    }

    public m(int v, int v1) {
        this.i = v1;
        this.j = v;
        super();
    }

    public void a(String s, String s1, Throwable[] arr_throwable) {
        if(this.j <= 3) {
            if(arr_throwable.length >= 1) {
                Log.d(s, s1, arr_throwable[0]);
                return;
            }
            Log.d(s, s1);
        }
    }

    public void b(String s, String s1, Throwable[] arr_throwable) {
        if(this.j <= 6) {
            if(arr_throwable.length >= 1) {
                Log.e(s, s1, arr_throwable[0]);
                return;
            }
            Log.e(s, s1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.R8
    public byte[] c(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        if(arr_b.length != this.j) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + arr_b.length);
        }
        return new zzfyu(arr_b, false).zzb(arr_b1, arr_b2, arr_b3);
    }

    public static m d() {
        synchronized(m.class) {
            if(m.k == null) {
                m.k = new m(3, 0);
            }
            return m.k;
        }
    }

    public void e(String s, String s1, Throwable[] arr_throwable) {
        if(this.j <= 4) {
            if(arr_throwable.length >= 1) {
                Log.i(s, s1, arr_throwable[0]);
                return;
            }
            Log.i(s, s1);
        }
    }

    public static String f(String s) [...] // Potential decryptor

    public void g(String s, String s1, Throwable[] arr_throwable) {
        if(this.j <= 5) {
            if(arr_throwable.length >= 1) {
                Log.w(s, s1, arr_throwable[0]);
                return;
            }
            Log.w(s, s1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.R8
    public int zza() {
        if(this.i != 3) {
            return this.j;
        }
        switch(this.j) {
            case 2: {
                return 10;
            }
            case 5: {
                return 11;
            }
            case 22: {
                return 0x40000000;
            }
            case 23: {
                return 15;
            }
            case 29: {
                return 12;
            }
            case 42: {
                return 16;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.R8
    public byte[] zzb() {
        switch(this.j) {
            case 16: {
                return zzgan.zzd;
            }
            case 0x20: {
                return zzgan.zze;
            }
            default: {
                throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
            }
        }
    }
}

