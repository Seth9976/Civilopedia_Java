package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class zzdok implements View.OnClickListener {
    public final zzdse i;
    public final Clock j;
    public zzbmv k;
    public zzdoj l;
    public String m;
    public Long n;
    public WeakReference o;

    public zzdok(zzdse zzdse0, Clock clock0) {
        this.i = zzdse0;
        this.j = clock0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.o != null && this.o.get() == view0) {
            if(this.m != null && this.n != null) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("id", this.m);
                hashMap0.put("time_interval", String.valueOf(this.j.currentTimeMillis() - ((long)this.n)));
                hashMap0.put("messageType", "onePointFiveClick");
                this.i.zzg("sendMessageToNativeJs", hashMap0);
            }
            this.m = null;
            this.n = null;
            WeakReference weakReference0 = this.o;
            if(weakReference0 != null) {
                View view1 = (View)weakReference0.get();
                if(view1 != null) {
                    view1.setClickable(false);
                    view1.setOnClickListener(null);
                    this.o = null;
                }
            }
        }
    }

    public final zzbmv zza() {
        return this.k;
    }

    public final void zzb() {
        if(this.k == null) {
            return;
        }
        if(this.n == null) {
            return;
        }
        this.m = null;
        this.n = null;
        WeakReference weakReference0 = this.o;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(view0 != null) {
                view0.setClickable(false);
                view0.setOnClickListener(null);
                this.o = null;
            }
        }
        try {
            this.k.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzc(zzbmv zzbmv0) {
        this.k = zzbmv0;
        zzdoj zzdoj0 = this.l;
        zzdse zzdse0 = this.i;
        if(zzdoj0 != null) {
            zzdse0.zzk("/unconfirmedClick", zzdoj0);
        }
        zzdoj zzdoj1 = new zzdoj(this, zzbmv0);
        this.l = zzdoj1;
        zzdse0.zzi("/unconfirmedClick", zzdoj1);
    }
}

