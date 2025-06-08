package com.google.firebase.analytics;

import O1.c;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1.a;

public final class FirebaseAnalytics {
    public final zzee a;
    public static volatile FirebaseAnalytics b;

    public FirebaseAnalytics(zzee zzee0) {
        Preconditions.checkNotNull(zzee0);
        this.a = zzee0;
    }

    public final void a(String s, Bundle bundle0) {
        this.a.zzx(s, bundle0);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String)Tasks.await(c.d().c(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new IllegalStateException(executionException0.getCause());
        }
        catch(TimeoutException unused_ex) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context0) {
        if(FirebaseAnalytics.b == null) {
            Class class0 = FirebaseAnalytics.class;
            synchronized(class0) {
                if(FirebaseAnalytics.b == null) {
                    FirebaseAnalytics.b = new FirebaseAnalytics(zzee.zzg(context0, null, null, null, null));
                }
            }
        }
        return FirebaseAnalytics.b;
    }

    @Keep
    public static zzik getScionFrontendApiImplementation(Context context0, Bundle bundle0) {
        zzee zzee0 = zzee.zzg(context0, null, null, null, bundle0);
        return zzee0 == null ? null : new a(zzee0);
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity0, String s, String s1) {
        this.a.zzG(activity0, s, s1);
    }
}

