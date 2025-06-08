package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzduc {
    public final zzfcw a;
    public final zzdtz b;

    public zzduc(zzfcw zzfcw0, zzdtz zzdtz0) {
        this.a = zzfcw0;
        this.b = zzdtz0;
    }

    public final zzbvt zzb(String s) throws RemoteException {
        zzbwg zzbwg1;
        zzbwg zzbwg0;
        zzbua zzbua0 = this.a.zzb();
        if(zzbua0 != null) {
            zzbvt zzbvt0 = zzbua0.zzc(s);
            zzdtz zzdtz0 = this.b;
            synchronized(zzdtz0) {
                if(zzdtz0.a.containsKey(s)) {
                    return zzbvt0;
                }
                goto label_8;
            }
            return zzbvt0;
            try {
            label_8:
                zzbwg0 = zzbvt0.zzf();
                zzbwg1 = zzbvt0.zzg();
            }
            catch(Throwable unused_ex) {
                return zzbvt0;
            }
            zzdty zzdty0 = new zzdty(s, zzbwg0, zzbwg1);
            zzdtz0.a.put(s, zzdty0);
            return zzbvt0;
        }
        zzcfi.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzfcy zzc(String s, JSONObject jSONObject0) throws zzfci {
        zzbwg zzbwg1;
        zzbwg zzbwg0;
        zzfcy zzfcy0;
        zzbud zzbud0;
        try {
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                zzbud0 = new zzbuz(new AdMobAdapter());
            }
            else if("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(s)) {
                zzbud0 = new zzbuz(new zzbwk());
            }
            else {
                zzbua zzbua0 = this.a.zzb();
                if(zzbua0 == null) {
                    zzcfi.zzj("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if(!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) && !"com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                label_20:
                    zzbud0 = zzbua0.zzb(s);
                }
                else {
                    try {
                        String s1 = jSONObject0.getString("class_name");
                        if(zzbua0.zze(s1)) {
                            zzbud0 = zzbua0.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        }
                        else if(zzbua0.zzd(s1)) {
                            zzbud0 = zzbua0.zzb(s1);
                        }
                        else {
                            zzbud0 = zzbua0.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                        goto label_23;
                    }
                    catch(JSONException jSONException0) {
                    }
                    zzcfi.zzh("Invalid custom event.", jSONException0);
                    goto label_20;
                }
            }
        label_23:
            zzfcy0 = new zzfcy(zzbud0);
        }
        catch(Throwable throwable0) {
            throw new zzfci(throwable0);
        }
        zzdtz zzdtz0 = this.b;
        synchronized(zzdtz0) {
            if(zzdtz0.a.containsKey(s)) {
                return zzfcy0;
            }
            try {
                zzbwg0 = zzfcy0.zze();
                zzbwg1 = zzfcy0.zzf();
            }
            catch(zzfci unused_ex) {
                return zzfcy0;
            }
            zzdty zzdty0 = new zzdty(s, zzbwg0, zzbwg1);
            zzdtz0.a.put(s, zzdty0);
            return zzfcy0;
        }
    }

    public final boolean zzd() {
        return this.a.zzb() != null;
    }
}

