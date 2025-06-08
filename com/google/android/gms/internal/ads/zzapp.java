package com.google.android.gms.internal.ads;

import P0.f;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzapp extends zzaqn {
    public final Context h;
    public static final zzaqo i;

    static {
        zzapp.i = new zzaqo();
    }

    public zzapp(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, Context context0, zzalb zzalb0) {
        super(zzapc0, "8zPzMumx8VK4Q4ZZMffWEJsAX0/i9gohXVA/VhPpWBNlLRmzgRsEh/j6Aaymt8Wu", "GsEHhtmZy7+TitdN6KLdSnSR7WpVlkZahwBwH9Jv1wQ=", zzali0, v, 27);
        this.h = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        zzamo zzamo2;
        AtomicReference atomicReference0 = zzapp.i.zza("com.spears.civilopedia");
        synchronized(atomicReference0) {
            zzamo zzamo0 = (zzamo)atomicReference0.get();
            if(zzamo0 == null || zzapf.zzg(zzamo0.zza) || zzamo0.zza.equals("E") || zzamo0.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                Boolean boolean0 = (Boolean)zzay.zzc().zzb(zzbhz.zzbW);
                String s = ((Boolean)zzay.zzc().zzb(zzbhz.zzbV)).booleanValue() ? this.b() : null;
                if(boolean0.booleanValue() && this.a.zzp() && zzapf.zzg(s)) {
                    s = this.c();
                }
                zzamo zzamo1 = new zzamo(((String)this.e.invoke(null, this.h, Boolean.TRUE, s)));
                boolean z = !zzapf.zzg(zzamo1.zza) && !zzamo1.zza.equals("E");
                atomicReference0.set(zzamo1);
            }
            zzamo2 = (zzamo)atomicReference0.get();
        }
        synchronized(this.d) {
            if(zzamo2 != null) {
                this.d.zzw(zzamo2.zza);
                this.d.zzW(zzamo2.zzb);
                this.d.zzY(zzamo2.zzc);
                this.d.zzh(zzamo2.zzd);
                this.d.zzv(zzamo2.zze);
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
            byte[] arr_b = zzapf.zzi(((String)zzay.zzc().zzb(zzbhz.zzbX)));
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b)));
            if(!Build.TYPE.equals("user")) {
                arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(zzapf.zzi(((String)zzay.zzc().zzb(zzbhz.zzbY))))));
            }
            Context context0 = this.h;
            if(Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                zzfvt zzfvt0 = zzfvt.zzf();
                f.q(context0.getPackageManager(), "com.spears.civilopedia", arrayList0, new zzaqp(zzfvt0));
                return (String)zzfvt0.get();
            }
        }
        catch(CertificateEncodingException | PackageManager.NameNotFoundException | ExecutionException | InterruptedException | CertificateException | NoClassDefFoundError unused_ex) {
        }
        return null;
    }

    public final String c() {
        try {
            zzapc zzapc0 = this.a;
            if(zzapc0.zzl() != null) {
                zzapc0.zzl().get();
            }
            zzaly zzaly0 = zzapc0.zzc();
            if(zzaly0 != null && zzaly0.zzai()) {
                return "";
            }
        }
        catch(InterruptedException | ExecutionException unused_ex) {
        }
        return null;
    }
}

