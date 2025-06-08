package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

public final class zzbtx extends zzbtz {
    static {
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final zzbud zzb(String s) throws RemoteException {
        try {
            Class class0 = Class.forName(s, false, zzbtx.class.getClassLoader());
            if(MediationAdapter.class.isAssignableFrom(class0)) {
                return new zzbuz(((MediationAdapter)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            if(Adapter.class.isAssignableFrom(class0)) {
                return new zzbuz(((Adapter)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            zzcfi.zzj(("Could not instantiate mediation adapter: " + s + " (not a valid adapter)."));
        }
        catch(Throwable unused_ex) {
        }
        try {
            zzcfi.zze("Reflection failed, retrying using direct instantiation");
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                return new zzbuz(new AdMobAdapter());
            }
            if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                return new zzbuz(new CustomEventAdapter());
            }
        }
        catch(Throwable throwable0) {
            zzcfi.zzk(("Could not instantiate mediation adapter: " + s + ". "), throwable0);
        }
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final zzbvt zzc(String s) throws RemoteException {
        try {
            return new zzbwe(((RtbAdapter)Class.forName(s, false, zzbvx.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null)));
        }
        catch(Throwable unused_ex) {
            throw new RemoteException();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final boolean zzd(String s) throws RemoteException {
        try {
            Class class0 = Class.forName(s, false, zzbtx.class.getClassLoader());
            return Adapter.class.isAssignableFrom(class0);
        }
        catch(Throwable unused_ex) {
            zzcfi.zzj(("Could not load custom event implementation class as Adapter: " + s + ", assuming old custom event implementation."));
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbua
    public final boolean zze(String s) throws RemoteException {
        try {
            Class class0 = Class.forName(s, false, zzbtx.class.getClassLoader());
            return CustomEvent.class.isAssignableFrom(class0);
        }
        catch(Throwable unused_ex) {
            zzcfi.zzj(("Could not load custom event implementation class: " + s + ", trying Adapter implementation class."));
            return false;
        }
    }
}

