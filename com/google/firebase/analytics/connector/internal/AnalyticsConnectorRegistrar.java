package com.google.firebase.analytics.connector.internal;

import L1.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.h1;
import com.google.android.gms.internal.measurement.zzee;
import java.util.Arrays;
import java.util.List;
import o1.f;
import q1.a;
import s1.e;
import s1.j;
import s1.k;
import z1.a0;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements e {
    @Override  // s1.e
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List getComponents() {
        h1 h10 = new h1(a.class, new Class[0]);
        h10.a(new j(f.class, 1, 0));
        h10.a(new j(Context.class, 1, 0));
        h10.a(new j(b.class, 1, 0));
        h10.e = r1.a.i;
        if(h10.a != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        h10.a = 2;
        return Arrays.asList(new s1.a[]{h10.b(), a0.l("fire-analytics", "21.1.0")});
    }

    public static a lambda$getComponents$0(s1.b b0) {
        f f0 = (f)b0.a(f.class);
        Context context0 = (Context)b0.a(Context.class);
        b b1 = (b)b0.a(b.class);
        Preconditions.checkNotNull(f0);
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(b1);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(q1.b.c == null) {
            synchronized(q1.b.class) {
                if(q1.b.c == null) {
                    Bundle bundle0 = new Bundle(1);
                    f0.a();
                    if("[DEFAULT]".equals(f0.b)) {
                        ((k)b1).a();
                        bundle0.putBoolean("dataCollectionDefaultEnabled", f0.f());
                    }
                    q1.b.c = new q1.b(zzee.zzg(context0, null, null, null, bundle0).zzd());
                }
            }
        }
        return q1.b.c;
    }
}

