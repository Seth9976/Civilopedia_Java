package com.google.android.gms.common.api.internal;

import M0.C;
import M0.D;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class zak extends zap {
    public final SparseArray n;

    public zak(LifecycleFragment lifecycleFragment0) {
        super(lifecycleFragment0, GoogleApiAvailability.getInstance());
        this.n = new SparseArray();
        lifecycleFragment0.addCallback("AutoManageHelper", this);
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void b(ConnectionResult connectionResult0, int v) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if(v < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C c0 = (C)this.n.get(v);
        if(c0 != null) {
            this.zae(v);
            OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = c0.k;
            if(googleApiClient$OnConnectionFailedListener0 != null) {
                googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void c() {
        for(int v = 0; v < this.n.size(); ++v) {
            C c0 = this.d(v);
            if(c0 != null) {
                c0.j.connect();
            }
        }
    }

    public final C d(int v) {
        return this.n.size() > v ? ((C)this.n.get(this.n.keyAt(v))) : null;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        for(int v = 0; v < this.n.size(); ++v) {
            C c0 = this.d(v);
            if(c0 != null) {
                printWriter0.append(s).append("GoogleApiClient #").print(c0.i);
                printWriter0.println(":");
                c0.j.dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        super.onStart();
        Log.d("AutoManageHelper", "onStart " + this.j + " " + this.n);
        if(this.k.get() == null) {
            for(int v = 0; v < this.n.size(); ++v) {
                C c0 = this.d(v);
                if(c0 != null) {
                    c0.j.connect();
                }
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        super.onStop();
        for(int v = 0; v < this.n.size(); ++v) {
            C c0 = this.d(v);
            if(c0 != null) {
                c0.j.disconnect();
            }
        }
    }

    public static zak zaa(LifecycleActivity lifecycleActivity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.a(lifecycleActivity0);
        zak zak0 = (zak)lifecycleFragment0.getCallbackOrNull("AutoManageHelper", zak.class);
        return zak0 == null ? new zak(lifecycleFragment0) : zak0;
    }

    public final void zad(int v, GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient0, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.n.indexOfKey(v) < 0, "Already managing a GoogleApiClient with id " + v);
        D d0 = (D)this.k.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + v + " " + this.j + " " + d0);
        C c0 = new C(this, v, googleApiClient0, googleApiClient$OnConnectionFailedListener0);
        googleApiClient0.registerConnectionFailedListener(c0);
        this.n.put(v, c0);
        if(this.j && d0 == null) {
            Log.d("AutoManageHelper", "connecting " + googleApiClient0.toString());
            googleApiClient0.connect();
        }
    }

    public final void zae(int v) {
        C c0 = (C)this.n.get(v);
        this.n.remove(v);
        if(c0 != null) {
            c0.j.unregisterConnectionFailedListener(c0);
            c0.j.disconnect();
        }
    }
}

