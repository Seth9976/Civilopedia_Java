package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import i1.X;
import i1.c0;
import i1.r;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

public final class zzka extends c0 {
    public final HashMap d;
    public final zzff zza;
    public final zzff zzb;
    public final zzff zzc;
    public final zzff zzd;
    public final zzff zze;

    public zzka(zzlf zzlf0) {
        super(zzlf0);
        this.d = new HashMap();
        r r0 = this.a.zzm();
        r0.getClass();
        this.zza = new zzff(r0, "last_delete_stale", 0L);
        r r1 = this.a.zzm();
        r1.getClass();
        this.zzb = new zzff(r1, "backoff", 0L);
        r r2 = this.a.zzm();
        r2.getClass();
        this.zzc = new zzff(r2, "last_upload", 0L);
        r r3 = this.a.zzm();
        r3.getClass();
        this.zzd = new zzff(r3, "last_upload_attempt", 0L);
        r r4 = this.a.zzm();
        r4.getClass();
        this.zze = new zzff(r4, "midnight_offset", 0L);
    }

    @Override  // i1.c0
    public final void b() {
    }

    public final Pair c(String s) {
        X x1;
        this.zzg();
        zzge zzge0 = this.a;
        long v = zzge0.zzav().elapsedRealtime();
        HashMap hashMap0 = this.d;
        X x0 = (X)hashMap0.get(s);
        if(x0 != null && v < x0.c) {
            return new Pair(x0.a, Boolean.valueOf(x0.b));
        }
        long v1 = zzge0.zzf().zzi(s, zzeh.zza) + v;
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(zzge0.zzau());
            if(advertisingIdClient$Info0 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String s1 = advertisingIdClient$Info0.getId();
            x1 = s1 == null ? new X("", advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1) : new X(s1, advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1);
        }
        catch(Exception exception0) {
            zzge0.zzay().zzc().zzb("Unable to get advertising id", exception0);
            x1 = new X("", false, v1);
        }
        hashMap0.put(s, x1);
        return new Pair(x1.a, Boolean.valueOf(x1.b));
    }

    public final String d(String s, boolean z) {
        this.zzg();
        String s1 = !this.a.zzf().zzs(null, zzeh.zzaj) || z ? ((String)this.c(s).first) : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest0 = zzln.f();
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s1.getBytes())));
    }
}

