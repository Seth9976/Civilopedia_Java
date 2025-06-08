package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import p.c;

public final class zaae extends zap {
    public final c n;
    public final GoogleApiManager o;

    public zaae(LifecycleFragment lifecycleFragment0, GoogleApiManager googleApiManager0, GoogleApiAvailability googleApiAvailability0) {
        super(lifecycleFragment0, googleApiAvailability0);
        this.n = new c(0);
        this.o = googleApiManager0;
        lifecycleFragment0.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void b(ConnectionResult connectionResult0, int v) {
        this.o.zax(connectionResult0, v);
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void c() {
        this.o.zay();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if(!this.n.isEmpty()) {
            this.o.zaA(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        super.onStart();
        if(!this.n.isEmpty()) {
            this.o.zaA(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        super.onStop();
        GoogleApiManager googleApiManager0 = this.o;
        googleApiManager0.getClass();
        synchronized(GoogleApiManager.y) {
            if(googleApiManager0.s == this) {
                googleApiManager0.s = null;
                googleApiManager0.t.clear();
            }
        }
    }

    public static void zad(Activity activity0, GoogleApiManager googleApiManager0, ApiKey apiKey0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        zaae zaae0 = (zaae)lifecycleFragment0.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if(zaae0 == null) {
            zaae0 = new zaae(lifecycleFragment0, googleApiManager0, GoogleApiAvailability.getInstance());
        }
        Preconditions.checkNotNull(apiKey0, "ApiKey cannot be null");
        zaae0.n.add(apiKey0);
        googleApiManager0.zaA(zaae0);
    }
}

