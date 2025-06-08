package com.google.android.gms.measurement.internal;

import B.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import i1.V;
import i1.W;

@VisibleForTesting
public final class zzjx implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public volatile boolean i;
    public volatile zzeq j;
    public final zzjy k;

    public zzjx(zzjy zzjy0) {
        this.k = zzjy0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized(this) {
            try {
                Preconditions.checkNotNull(this.j);
                zzek zzek0 = (zzek)this.j.getService();
                this.k.a.zzaz().zzp(new V(this, zzek0, 1));
            }
            catch(DeadObjectException | IllegalStateException unused_ex) {
                this.j = null;
                this.i = false;
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzeu zzeu0 = this.k.a.zzl();
        if(zzeu0 != null) {
            zzeu0.zzk().zzb("Service connection failed", connectionResult0);
        }
        synchronized(this) {
            this.i = false;
            this.j = null;
        }
        this.k.a.zzaz().zzp(new W(this, 1));
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.k.a.zzay().zzc().zza("Service connection suspended");
        this.k.a.zzaz().zzp(new W(this, 0));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzek zzek0;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized(this) {
            if(iBinder0 == null) {
                this.i = false;
                this.k.a.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            try {
                zzek0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzek zzek1 = iInterface0 instanceof zzek ? ((zzek)iInterface0) : new zzei(iBinder0);
                    zzek0 = zzek1;
                    this.k.a.zzay().zzj().zza("Bound to IMeasurementService interface");
                }
                else {
                    this.k.a.zzay().zzd().zzb("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.k.a.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if(zzek0 == null) {
                try {
                    this.i = false;
                    ConnectionTracker.getInstance().unbindService(this.k.a.zzau(), this.k.c);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else {
                this.k.a.zzaz().zzp(new V(this, zzek0, 0));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.k.a.zzay().zzc().zza("Service disconnected");
        this.k.a.zzaz().zzp(new a(this, componentName0, 15, false));
    }

    public final void zzb(Intent intent0) {
        this.k.zzg();
        Context context0 = this.k.a.zzau();
        ConnectionTracker connectionTracker0 = ConnectionTracker.getInstance();
        synchronized(this) {
            if(this.i) {
                this.k.a.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.k.a.zzay().zzj().zza("Using local app measurement service");
            this.i = true;
            connectionTracker0.bindService(context0, intent0, this.k.c, 0x81);
        }
    }

    public final void zzc() {
        this.k.zzg();
        Context context0 = this.k.a.zzau();
        synchronized(this) {
            if(this.i) {
                this.k.a.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            if(this.j != null && (this.j.isConnecting() || this.j.isConnected())) {
                this.k.a.zzay().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.j = new zzeq(context0, Looper.getMainLooper(), this, this);
            this.k.a.zzay().zzj().zza("Connecting to remote service");
            this.i = true;
            Preconditions.checkNotNull(this.j);
            this.j.checkAvailabilityAndConnect();
        }
    }

    public final void zzd() {
        if(this.j != null && (this.j.isConnected() || this.j.isConnecting())) {
            this.j.disconnect();
        }
        this.j = null;
    }
}

