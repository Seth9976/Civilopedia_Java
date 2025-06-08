package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzelh extends zzbvv {
    public final zzbvt i;
    public final zzcga j;
    public final JSONObject k;
    public boolean l;

    public zzelh(String s, zzbvt zzbvt0, zzcga zzcga0) {
        JSONObject jSONObject0 = new JSONObject();
        this.k = jSONObject0;
        this.l = false;
        this.j = zzcga0;
        this.i = zzbvt0;
        try {
            jSONObject0.put("adapter_version", zzbvt0.zzf().toString());
            jSONObject0.put("sdk_version", zzbvt0.zzg().toString());
            jSONObject0.put("name", s);
        }
        catch(JSONException | NullPointerException | RemoteException unused_ex) {
        }
    }

    public static void zzb(String s, zzcga zzcga0) {
        synchronized(zzelh.class) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("name", s);
                jSONObject0.put("signal_error", "Adapter failed to instantiate");
                zzcga0.zzd(jSONObject0);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            try {
                this.zzf("Signal collection timeout.");
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    public final void zzd() {
        synchronized(this) {
            if(this.l) {
                return;
            }
            this.j.zzd(this.k);
            this.l = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zze(String s) throws RemoteException {
        __monitor_enter(this);
        if(this.l) {
            __monitor_exit(this);
            return;
        }
        if(s == null) {
            try {
                this.zzf("Adapter returned null signals");
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
            __monitor_exit(this);
            return;
        }
        try {
            try {
                this.k.put("signals", s);
            }
            catch(JSONException unused_ex) {
            }
            this.j.zzd(this.k);
            this.l = true;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(String s) throws RemoteException {
        synchronized(this) {
            if(this.l) {
                return;
            }
            try {
                this.k.put("signal_error", s);
            }
            catch(JSONException unused_ex) {
            }
            this.j.zzd(this.k);
            this.l = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zze zze0) throws RemoteException {
        synchronized(this) {
            if(this.l) {
                return;
            }
            try {
                this.k.put("signal_error", zze0.zzb);
            }
            catch(JSONException unused_ex) {
            }
            this.j.zzd(this.k);
            this.l = true;
        }
    }
}

