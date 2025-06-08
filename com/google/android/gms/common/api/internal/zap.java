package com.google.android.gms.common.api.internal;

import B.a;
import M0.D;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean j;
    public final AtomicReference k;
    public final zau l;
    public final GoogleApiAvailability m;

    public zap(LifecycleFragment lifecycleFragment0, GoogleApiAvailability googleApiAvailability0) {
        super(lifecycleFragment0);
        this.k = new AtomicReference(null);
        this.l = new zau(Looper.getMainLooper());
        this.m = googleApiAvailability0;
    }

    public abstract void b(ConnectionResult arg1, int arg2);

    public abstract void c();

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int v, int v1, Intent intent0) {
        int v2 = 13;
        AtomicReference atomicReference0 = this.k;
        D d0 = (D)atomicReference0.get();
    alab1:
        switch(v) {
            case 1: {
                switch(v1) {
                    case -1: {
                        atomicReference0.set(null);
                        this.c();
                        return;
                    }
                    case 0: {
                        if(d0 != null) {
                            if(intent0 != null) {
                                v2 = intent0.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                            }
                            ConnectionResult connectionResult0 = new ConnectionResult(v2, null, d0.b.toString());
                            atomicReference0.set(null);
                            this.b(connectionResult0, d0.a);
                            return;
                        }
                        break alab1;
                    }
                    default: {
                        goto label_25;
                    }
                }
            }
            case 2: {
                Activity activity0 = this.getActivity();
                int v3 = this.m.isGooglePlayServicesAvailable(activity0);
                if(v3 == 0) {
                    atomicReference0.set(null);
                    this.c();
                    return;
                }
                if(d0 == null || d0.b.getErrorCode() == 18 && v3 == 18) {
                    return;
                }
            label_25:
                if(d0 != null) {
                    atomicReference0.set(null);
                    this.b(d0.b, d0.a);
                }
                break;
            }
            default: {
                goto label_25;
            }
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        ConnectionResult connectionResult0 = new ConnectionResult(13, null);
        D d0 = (D)this.k.get();
        this.k.set(null);
        this.b(connectionResult0, (d0 == null ? -1 : d0.a));
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            D d0 = bundle0.getBoolean("resolving_error", false) ? new D(new ConnectionResult(bundle0.getInt("failed_status"), ((PendingIntent)bundle0.getParcelable("failed_resolution"))), bundle0.getInt("failed_client_id", -1)) : null;
            this.k.set(d0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        D d0 = (D)this.k.get();
        if(d0 == null) {
            return;
        }
        bundle0.putBoolean("resolving_error", true);
        bundle0.putInt("failed_client_id", d0.a);
        bundle0.putInt("failed_status", d0.b.getErrorCode());
        bundle0.putParcelable("failed_resolution", d0.b.getResolution());
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.j = true;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.j = false;
    }

    public final void zah(ConnectionResult connectionResult0, int v) {
        D d0 = new D(connectionResult0, v);
        do {
            AtomicReference atomicReference0 = this.k;
            do {
                if(atomicReference0.compareAndSet(null, d0)) {
                    a a0 = new a(this, d0, 4, false);
                    this.l.post(a0);
                    return;
                }
            }
            while(atomicReference0.get() == null);
        }
        while(atomicReference0.get() == null);
    }
}

