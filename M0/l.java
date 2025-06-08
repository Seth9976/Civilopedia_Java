package m0;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import java.util.concurrent.Callable;

public final class l implements Callable {
    public final b a;
    public final int b;
    public final String c;
    public final String d;
    public final Bundle e;

    public l(b b0, int v, String s, String s1, d d0, Bundle bundle0) {
        this.a = b0;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = bundle0;
    }

    @Override
    public final Object call() {
        zzan zzan0;
        try {
            synchronized(this.a.a) {
                zzan0 = this.a.h;
            }
            return zzan0 == null ? zze.zzn(y.k, 0x77) : zzan0.zzg(this.b, "com.spears.civilopedia", this.c, this.d, null, this.e);
        }
        catch(DeadObjectException deadObjectException0) {
        }
        catch(Exception exception0) {
            goto label_9;
        }
        String s = w.a(deadObjectException0);
        return zze.zzo(y.k, 5, s);
    label_9:
        String s1 = w.a(exception0);
        return zze.zzo(y.i, 5, s1);
    }
}

