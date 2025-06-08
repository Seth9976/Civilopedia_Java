package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdod;
import com.google.android.gms.internal.ads.zzdxp;
import com.google.android.gms.internal.ads.zzell;
import com.google.android.gms.internal.ads.zzewj;
import com.google.android.gms.internal.ads.zzewk;
import com.google.android.gms.internal.ads.zzexx;
import com.google.android.gms.internal.ads.zzezq;
import com.google.android.gms.internal.ads.zzfbe;
import java.util.HashMap;

public class ClientApi extends zzcb {
    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper0, String s, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        return new zzell(zzcnf.zza(context0, zzbua0, v), context0, s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzewj zzewj0 = zzcnf.zza(context0, zzbua0, v).zzr();
        zzewj0.zza(s);
        zzewj0.zzb(context0);
        zzewk zzewk0 = zzewj0.zzc();
        return v >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzek)))) ? zzewk0.zzb() : zzewk0.zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzexx zzexx0 = zzcnf.zza(context0, zzbua0, v).zzs();
        zzexx0.zzc(context0);
        zzexx0.zza(zzq0);
        zzexx0.zzb(s);
        return zzexx0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzezq zzezq0 = zzcnf.zza(context0, zzbua0, v).zzt();
        zzezq0.zzc(context0);
        zzezq0.zza(zzq0);
        zzezq0.zzb(s);
        return zzezq0.zzd().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper0, zzq zzq0, String s, int v) {
        return new zzs(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzq0, s, new zzcfo(221908000, v, true, false));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper0, int v) {
        return zzcnf.zza(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), null, v).zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzblf zzh(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) {
        return new zzdod(((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper0)), ((FrameLayout)ObjectWrapper.unwrap(iObjectWrapper1)), 221908000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbll zzi(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        return new zzdob(((View)ObjectWrapper.unwrap(iObjectWrapper0)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper1)), ((HashMap)ObjectWrapper.unwrap(iObjectWrapper2)));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpk zzj(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v, zzbph zzbph0) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzdxp zzdxp0 = zzcnf.zza(context0, zzbua0, v).zzj();
        zzdxp0.zzb(context0);
        zzdxp0.zza(zzbph0);
        return zzdxp0.zzc().zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxl zzk(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) {
        return zzcnf.zza(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbua0, v).zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxv zzl(IObjectWrapper iObjectWrapper0) {
        Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(activity0.getIntent());
        if(adOverlayInfoParcel0 == null) {
            return new zzt(activity0);
        }
        switch(adOverlayInfoParcel0.zzk) {
            case 1: {
                return new com.google.android.gms.ads.internal.overlay.zzs(activity0);
            }
            case 2: {
                return new zzab(activity0);
            }
            case 3: {
                return new zzac(activity0);
            }
            case 4: {
                return new zzv(activity0, adOverlayInfoParcel0);
            }
            case 5: {
                return new zzz(activity0);
            }
            default: {
                return new zzt(activity0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcao zzm(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfbe zzfbe0 = zzcnf.zza(context0, zzbua0, v).zzu();
        zzfbe0.zzb(context0);
        return zzfbe0.zzc().zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbe zzn(IObjectWrapper iObjectWrapper0, String s, zzbua zzbua0, int v) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzfbe zzfbe0 = zzcnf.zza(context0, zzbua0, v).zzu();
        zzfbe0.zzb(context0);
        zzfbe0.zza(s);
        return zzfbe0.zzc().zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper0, zzbua zzbua0, int v) {
        return zzcnf.zza(((Context)ObjectWrapper.unwrap(iObjectWrapper0)), zzbua0, v).zzo();
    }
}

