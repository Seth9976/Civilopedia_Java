package m0;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

public abstract class w {
    static {
    }

    public static String a(Exception exception0) {
        if(exception0 == null) {
            return null;
        }
        try {
            String s = exception0.getClass().getSimpleName() + ":" + zzbf.zzb(exception0.getMessage());
            return s.length() > 40 ? s.substring(0, 40) : s;
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", throwable0);
            return null;
        }
    }

    public static zzjz b(int v, int v1, e e0) {
        try {
            zzjx zzjx0 = zzjz.zzc();
            zzke zzke0 = zzki.zzc();
            zzke0.zzn(e0.a);
            zzke0.zzm(e0.b);
            zzke0.zzo(v);
            zzjx0.zza(zzke0);
            zzjx0.zzn(v1);
            return (zzjz)zzjx0.zzf();
        }
        catch(Exception exception0) {
            zze.zzm("BillingLogger", "Unable to create logging payload", exception0);
            return null;
        }
    }

    public static zzjz c(int v, int v1, e e0, String s) {
        try {
            zzke zzke0 = zzki.zzc();
            zzke0.zzn(e0.a);
            zzke0.zzm(e0.b);
            zzke0.zzo(v);
            if(s != null) {
                zzke0.zza(s);
            }
            zzjx zzjx0 = zzjz.zzc();
            zzjx0.zza(zzke0);
            zzjx0.zzn(v1);
            return (zzjz)zzjx0.zzf();
        }
        catch(Throwable throwable0) {
        }
        zze.zzm("BillingLogger", "Unable to create logging payload", throwable0);
        return null;
    }

    public static zzkd d(int v) {
        try {
            zzkb zzkb0 = zzkd.zzc();
            zzkb0.zzn(v);
            return (zzkd)zzkb0.zzf();
        }
        catch(Exception exception0) {
            zze.zzm("BillingLogger", "Unable to create logging payload", exception0);
            return null;
        }
    }
}

