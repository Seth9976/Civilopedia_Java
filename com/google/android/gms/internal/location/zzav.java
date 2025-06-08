package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import e1.f;
import e1.h;
import e1.r;
import java.util.HashMap;

public final class zzav {
    public final zzbg a;
    public final Context b;
    public boolean c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;

    public zzav(Context context0, zzbg zzbg0) {
        this.c = false;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.b = context0;
        this.a = zzbg0;
    }

    public final Location zza(String s) throws RemoteException {
        ((r)this.a).a.a();
        return ((r)this.a).a().zzn(s);
    }

    @Deprecated
    public final Location zzb() throws RemoteException {
        ((r)this.a).a.a();
        return ((r)this.a).a().zzm();
    }

    public final LocationAvailability zzc() throws RemoteException {
        ((r)this.a).a.a();
        return ((r)this.a).a().zzs("com.spears.civilopedia");
    }

    public final void zzd(LocationRequest locationRequest0, ListenerHolder listenerHolder0, zzai zzai0) throws RemoteException {
        h h0;
        IBinder iBinder0;
        ((r)this.a).a.a();
        ListenerKey listenerHolder$ListenerKey0 = listenerHolder0.getListenerKey();
        if(listenerHolder$ListenerKey0 == null) {
            iBinder0 = null;
        }
        else {
            synchronized(this.d) {
                h0 = (h)this.d.get(listenerHolder$ListenerKey0);
                if(h0 == null) {
                    h0 = new h(listenerHolder0);
                }
                this.d.put(listenerHolder$ListenerKey0, h0);
            }
            iBinder0 = h0;
        }
        if(iBinder0 == null) {
            return;
        }
        ((r)this.a).a().zzo(new zzbc(1, zzba.zza(null, locationRequest0), iBinder0, null, null, ((IBinder)zzai0)));
    }

    public final void zze(zzba zzba0, ListenerHolder listenerHolder0, zzai zzai0) throws RemoteException {
        f f0;
        ((r)this.a).a.a();
        ListenerKey listenerHolder$ListenerKey0 = listenerHolder0.getListenerKey();
        if(listenerHolder$ListenerKey0 == null) {
            f0 = null;
        }
        else {
            synchronized(this.f) {
                f f1 = (f)this.f.get(listenerHolder$ListenerKey0);
                if(f1 == null) {
                    f1 = new f(listenerHolder0);
                }
                f0 = f1;
                this.f.put(listenerHolder$ListenerKey0, f0);
            }
        }
        if(f0 == null) {
            return;
        }
        ((r)this.a).a().zzo(new zzbc(1, zzba0, null, null, f0, ((IBinder)zzai0)));
    }

    public final void zzf(zzba zzba0, PendingIntent pendingIntent0, zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzo(zzbc.zzb(zzba0, pendingIntent0, zzai0));
    }

    public final void zzg(LocationRequest locationRequest0, PendingIntent pendingIntent0, zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzo(zzbc.zzb(zzba.zza(null, locationRequest0), pendingIntent0, zzai0));
    }

    public final void zzh(ListenerKey listenerHolder$ListenerKey0, zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        Preconditions.checkNotNull(listenerHolder$ListenerKey0, "Invalid null listener key");
        synchronized(this.d) {
            h h0 = (h)this.d.remove(listenerHolder$ListenerKey0);
            if(h0 != null) {
                h0.zzc();
                ((r)this.a).a().zzo(zzbc.zza(h0, zzai0));
            }
        }
    }

    public final void zzi(ListenerKey listenerHolder$ListenerKey0, zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        Preconditions.checkNotNull(listenerHolder$ListenerKey0, "Invalid null listener key");
        synchronized(this.f) {
            f f0 = (f)this.f.remove(listenerHolder$ListenerKey0);
            if(f0 != null) {
                f0.zzc();
                ((r)this.a).a().zzo(zzbc.zzc(f0, zzai0));
            }
        }
    }

    public final void zzj(PendingIntent pendingIntent0, zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzo(new zzbc(2, null, null, pendingIntent0, null, ((IBinder)zzai0)));
    }

    public final void zzk(boolean z) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzp(z);
        this.c = z;
    }

    public final void zzl(Location location0) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzq(location0);
    }

    public final void zzm(zzai zzai0) throws RemoteException {
        ((r)this.a).a.a();
        ((r)this.a).a().zzr(zzai0);
    }

    public final void zzn() throws RemoteException {
        synchronized(this.d) {
            for(Object object0: this.d.values()) {
                h h0 = (h)object0;
                if(h0 != null) {
                    ((r)this.a).a().zzo(zzbc.zza(h0, null));
                }
            }
            this.d.clear();
        }
        synchronized(this.f) {
            for(Object object1: this.f.values()) {
                f f0 = (f)object1;
                if(f0 != null) {
                    ((r)this.a).a().zzo(zzbc.zzc(f0, null));
                }
            }
            this.f.clear();
        }
        synchronized(this.e) {
            for(Object object2: this.e.values()) {
                if(object2 != null) {
                    throw new ClassCastException();
                }
                if(false) {
                    break;
                }
            }
            this.e.clear();
        }
    }

    public final void zzo() throws RemoteException {
        if(this.c) {
            this.zzk(false);
        }
    }
}

