package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zak implements Handler.Callback {
    public final zaj i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public volatile boolean m;
    public final AtomicInteger n;
    public boolean o;
    public final zau p;
    public final Object q;

    public zak(Looper looper0, zaj zaj0) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = false;
        this.n = new AtomicInteger(0);
        this.o = false;
        this.q = new Object();
        this.i = zaj0;
        this.p = new zau(looper0, this);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = message0.what;
        if(v == 1) {
            ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)message0.obj;
            synchronized(this.q) {
                if(this.m && this.i.isConnected() && this.j.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(null);
                }
                return true;
            }
        }
        Log.wtf("GmsClientEvents", "Don\'t know how to handle message: " + v, new Exception());
        return false;
    }

    public final void zaa() {
        this.m = false;
        this.n.incrementAndGet();
    }

    public final void zab() {
        this.m = true;
    }

    public final void zac(ConnectionResult connectionResult0) {
        Preconditions.checkHandlerThread(this.p, "onConnectionFailure must only be called on the Handler thread");
        this.p.removeMessages(1);
        synchronized(this.q) {
            ArrayList arrayList0 = new ArrayList(this.l);
            int v1 = this.n.get();
            for(Object object1: arrayList0) {
                OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = (OnConnectionFailedListener)object1;
                if(this.m && this.n.get() == v1) {
                    if(!this.l.contains(googleApiClient$OnConnectionFailedListener0)) {
                        continue;
                    }
                    googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
                    continue;
                }
                return;
            }
        }
    }

    public final void zad(Bundle bundle0) {
        Preconditions.checkHandlerThread(this.p, "onConnectionSuccess must only be called on the Handler thread");
        synchronized(this.q) {
            Preconditions.checkState(!this.o);
            this.p.removeMessages(1);
            this.o = true;
            Preconditions.checkState(this.k.isEmpty());
            ArrayList arrayList0 = new ArrayList(this.j);
            int v1 = this.n.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.m || !this.i.isConnected() || this.n.get() != v1) {
                    break;
                }
                if(!this.k.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(bundle0);
                }
            }
            this.k.clear();
            this.o = false;
        }
    }

    public final void zae(int v) {
        Preconditions.checkHandlerThread(this.p, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.p.removeMessages(1);
        synchronized(this.q) {
            this.o = true;
            ArrayList arrayList0 = new ArrayList(this.j);
            int v2 = this.n.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.m || this.n.get() != v2) {
                    break;
                }
                if(this.j.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnectionSuspended(v);
                }
            }
            this.k.clear();
            this.o = false;
        }
    }

    public final void zaf(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.q) {
            if(this.j.contains(googleApiClient$ConnectionCallbacks0)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks0 + " is already registered");
            }
            else {
                this.j.add(googleApiClient$ConnectionCallbacks0);
            }
        }
        if(this.i.isConnected()) {
            Message message0 = this.p.obtainMessage(1, googleApiClient$ConnectionCallbacks0);
            this.p.sendMessage(message0);
        }
    }

    public final void zag(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.q) {
            if(this.l.contains(googleApiClient$OnConnectionFailedListener0)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener0 + " is already registered");
            }
            else {
                this.l.add(googleApiClient$OnConnectionFailedListener0);
            }
        }
    }

    public final void zah(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.q) {
            if(!this.j.remove(googleApiClient$ConnectionCallbacks0)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks0 + " not found");
            }
            else if(this.o) {
                this.k.add(googleApiClient$ConnectionCallbacks0);
            }
        }
    }

    public final void zai(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.q) {
            if(!this.l.remove(googleApiClient$OnConnectionFailedListener0)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener0 + " not found");
            }
        }
    }

    public final boolean zaj(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.q) {
        }
        return this.j.contains(googleApiClient$ConnectionCallbacks0);
    }

    public final boolean zak(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.q) {
        }
        return this.l.contains(googleApiClient$OnConnectionFailedListener0);
    }
}

