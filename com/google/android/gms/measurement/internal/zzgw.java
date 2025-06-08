package com.google.android.gms.measurement.internal;

import B.a;
import B.o;
import C0.c;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import i1.g0;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzgw extends zzej {
    public final zzlf i;
    public Boolean j;
    public String k;

    public zzgw(zzlf zzlf0, String s) {
        Preconditions.checkNotNull(zzlf0);
        this.i = zzlf0;
        this.k = null;
    }

    public final void b(zzaw zzaw0, zzq zzq0) {
        this.i.a();
        this.i.e(zzaw0, zzq0);
    }

    public final void c(Runnable runnable0) {
        Preconditions.checkNotNull(runnable0);
        zzlf zzlf0 = this.i;
        if(zzlf0.zzaz().zzs()) {
            runnable0.run();
            return;
        }
        zzlf0.zzaz().zzp(runnable0);
    }

    public final void d(zzq zzq0) {
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        this.e(zzq0.zza, false);
        this.i.zzv().o(zzq0.zzb, zzq0.zzq);
    }

    public final void e(String s, boolean z) {
        boolean z1 = true;
        boolean z2 = TextUtils.isEmpty(s);
        zzlf zzlf0 = this.i;
        if(!z2) {
            try {
                if(z) {
                    if(this.j == null) {
                        if(!"com.google.android.gms".equals(this.k) && !UidVerifier.isGooglePlayServicesUid(zzlf0.zzau(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(zzlf0.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z1 = false;
                        }
                        this.j = Boolean.valueOf(z1);
                    }
                    if(!this.j.booleanValue()) {
                        goto label_10;
                    }
                    return;
                }
            label_10:
                if(this.k == null && GooglePlayServicesUtilLight.uidHasPackageName(zzlf0.zzau(), Binder.getCallingUid(), s)) {
                    this.k = s;
                }
                if(!s.equals(this.k)) {
                    throw new SecurityException("Unknown calling package name \'" + s + "\'.");
                }
                return;
            }
            catch(SecurityException securityException0) {
            }
            zzlf0.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeu.d(s));
            throw securityException0;
        }
        zzlf0.zzay().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final String zzd(zzq zzq0) {
        this.d(zzq0);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new y(1, zzlf0, zzq0));
        try {
            return (String)future0.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            zzlf0.zzay().zzd().zzc("Failed to get app instance id. appId", zzeu.d(zzq0.zza), timeoutException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zze(zzq zzq0, boolean z) {
        this.d(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new y(0, this, zzq0.zza));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                g0 g00 = (g0)object0;
                if(z || !zzln.y(g00.c)) {
                    ((ArrayList)list1).add(new zzli(g00));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzlf0.zzay().zzd().zzc("Failed to get user properties. appId", zzeu.d(zzq0.zza), interruptedException0);
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzf(String s, String s1, zzq zzq0) {
        this.d(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new w(this, zzq0.zza, s, s1, 2));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzlf0.zzay().zzd().zzb("Failed to get conditional user properties", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzg(String s, String s1, String s2) {
        this.e(s, true);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new w(this, s, s1, s2, 3));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzlf0.zzay().zzd().zzb("Failed to get conditional user properties as", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzh(String s, String s1, boolean z, zzq zzq0) {
        this.d(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new w(this, zzq0.zza, s, s1, 0));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                g0 g00 = (g0)object0;
                if(z || !zzln.y(g00.c)) {
                    ((ArrayList)list1).add(new zzli(g00));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzlf0.zzay().zzd().zzc("Failed to query user properties. appId", zzeu.d(zzq0.zza), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final List zzi(String s, String s1, String s2, boolean z) {
        this.e(s, true);
        zzlf zzlf0 = this.i;
        Future future0 = zzlf0.zzaz().zzh(new w(this, s, s1, s2, 1));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                g0 g00 = (g0)object0;
                if(z || !zzln.y(g00.c)) {
                    ((ArrayList)list1).add(new zzli(g00));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzlf0.zzay().zzd().zzc("Failed to get user properties as. appId", zzeu.d(s), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzj(zzq zzq0) {
        this.d(zzq0);
        this.c(new x(this, zzq0, 3));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzk(zzaw zzaw0, zzq zzq0) {
        Preconditions.checkNotNull(zzaw0);
        this.d(zzq0);
        this.c(new o(this, zzaw0, zzq0, 13));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzl(zzaw zzaw0, String s, String s1) {
        Preconditions.checkNotNull(zzaw0);
        Preconditions.checkNotEmpty(s);
        this.e(s, true);
        this.c(new o(this, zzaw0, s, 14));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzm(zzq zzq0) {
        Preconditions.checkNotEmpty(zzq0.zza);
        this.e(zzq0.zza, false);
        this.c(new x(this, zzq0, 0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzn(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotNull(zzac0.zzc);
        this.d(zzq0);
        zzac zzac1 = new zzac(zzac0);
        zzac1.zza = zzq0.zza;
        this.c(new o(this, zzac1, zzq0, 12));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzo(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zza);
        this.e(zzac0.zza, true);
        this.c(new a(this, new zzac(zzac0), 12, false));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzp(zzq zzq0) {
        Preconditions.checkNotEmpty(zzq0.zza);
        Preconditions.checkNotNull(zzq0.zzv);
        x x0 = new x(this, zzq0, 2);
        Preconditions.checkNotNull(x0);
        zzlf zzlf0 = this.i;
        if(zzlf0.zzaz().zzs()) {
            x0.run();
            return;
        }
        zzlf0.zzaz().zzq(x0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzq(long v, String s, String s1, String s2) {
        this.c(new z(this, s1, s2, s, v, 0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzr(Bundle bundle0, zzq zzq0) {
        this.d(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        this.c(new zzgf(this, zzq0.zza, bundle0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzs(zzq zzq0) {
        this.d(zzq0);
        this.c(new x(this, zzq0, 1));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final void zzt(zzli zzli0, zzq zzq0) {
        Preconditions.checkNotNull(zzli0);
        this.d(zzq0);
        this.c(new o(this, zzli0, zzq0, 15));
    }

    @Override  // com.google.android.gms.measurement.internal.zzek
    public final byte[] zzu(zzaw zzaw0, String s) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzaw0);
        this.e(s, true);
        zzlf zzlf0 = this.i;
        zzlf0.zzay().zzc().zzb("Log and bundle. event", zzlf0.zzj().d(zzaw0.zza));
        long v = zzlf0.zzav().nanoTime();
        Future future0 = zzlf0.zzaz().zzi(new c(this, zzaw0, s));
        try {
            byte[] arr_b = (byte[])future0.get();
            if(arr_b == null) {
                zzlf0.zzay().zzd().zzb("Log and bundle returned null. appId", zzeu.d(s));
                arr_b = new byte[0];
            }
            long v1 = zzlf0.zzav().nanoTime();
            zzlf0.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", zzlf0.zzj().d(zzaw0.zza), ((int)arr_b.length), ((long)(v1 / 1000000L - v / 1000000L)));
            return arr_b;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzlf0.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeu.d(s), zzlf0.zzj().d(zzaw0.zza), interruptedException0);
        return null;
    }
}

