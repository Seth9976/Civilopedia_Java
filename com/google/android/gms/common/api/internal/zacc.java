package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public final class zacc extends zap {
    public TaskCompletionSource n;

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void b(ConnectionResult connectionResult0, int v) {
        String s = connectionResult0.getErrorMessage();
        if(s == null) {
            s = "Error connecting to Google Play services";
        }
        this.n.setException(new ApiException(new Status(connectionResult0, s, connectionResult0.getErrorCode())));
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void c() {
        Activity activity0 = this.i.getLifecycleActivity();
        if(activity0 == null) {
            this.n.trySetException(new ApiException(new Status(8)));
            return;
        }
        int v = this.m.isGooglePlayServicesAvailable(activity0);
        if(v == 0) {
            this.n.trySetResult(null);
            return;
        }
        if(!this.n.getTask().isComplete()) {
            this.zah(new ConnectionResult(v, null), 0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.n.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public static zacc zaa(Activity activity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        zacc zacc0 = (zacc)lifecycleFragment0.getCallbackOrNull("GmsAvailabilityHelper", zacc.class);
        if(zacc0 != null) {
            if(zacc0.n.getTask().isComplete()) {
                zacc0.n = new TaskCompletionSource();
            }
            return zacc0;
        }
        zacc zacc1 = new zacc(lifecycleFragment0, GoogleApiAvailability.getInstance());  // 初始化器: Lcom/google/android/gms/common/api/internal/zap;-><init>(Lcom/google/android/gms/common/api/internal/LifecycleFragment;Lcom/google/android/gms/common/GoogleApiAvailability;)V
        zacc1.n = new TaskCompletionSource();
        lifecycleFragment0.addCallback("GmsAvailabilityHelper", zacc1);
        return zacc1;
    }

    public final Task zad() {
        return this.n.getTask();
    }
}

