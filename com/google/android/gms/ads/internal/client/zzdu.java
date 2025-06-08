package com.google.android.gms.ads.internal.client;

import D0.e;
import D0.g;
import D0.o;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzdu {
    public final zzbtx a;
    public final zzp b;
    public final AtomicBoolean c;
    public final VideoController d;
    public final o e;
    public zza f;
    public AdListener g;
    public AdSize[] h;
    public AppEventListener i;
    public zzbs j;
    public VideoOptions k;
    public String l;
    public final ViewGroup m;
    public final int n;
    public boolean o;
    public OnPaidEventListener p;

    public zzdu(ViewGroup viewGroup0) {
        this(viewGroup0, null, false, zzp.zza, 0);
    }

    public zzdu(ViewGroup viewGroup0, int v) {
        this(viewGroup0, null, false, zzp.zza, v);
    }

    public zzdu(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z) {
        this(viewGroup0, attributeSet0, z, zzp.zza, 0);
    }

    public zzdu(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, int v) {
        this(viewGroup0, attributeSet0, z, zzp.zza, v);
    }

    public zzdu(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, zzp zzp0, int v) {
        zzq zzq0;
        this.a = new zzbtx();
        this.d = new VideoController();
        this.e = new o(this);
        this.m = viewGroup0;
        this.b = zzp0;
        this.j = null;
        boolean z1 = false;
        this.c = new AtomicBoolean(false);
        this.n = v;
        if(attributeSet0 != null) {
            Context context0 = viewGroup0.getContext();
            try {
                zzy zzy0 = new zzy(context0, attributeSet0);
                this.h = zzy0.zzb(z);
                this.l = zzy0.zza();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzaw.zzb().zzk(viewGroup0, new zzq(context0, AdSize.BANNER), illegalArgumentException0.getMessage(), illegalArgumentException0.getMessage());
                return;
            }
            if(viewGroup0.isInEditMode()) {
                zzcfb zzcfb0 = zzaw.zzb();
                AdSize adSize0 = this.h[0];
                if(adSize0.equals(AdSize.INVALID)) {
                    zzq0 = zzq.zze();
                }
                else {
                    zzq zzq1 = new zzq(context0, adSize0);
                    if(v == 1) {
                        z1 = true;
                    }
                    zzq1.zzj = z1;
                    zzq0 = zzq1;
                }
                zzcfb0.zzl(viewGroup0, zzq0, "Ads by Google");
            }
        }
    }

    public static zzq a(Context context0, AdSize[] arr_adSize, int v) {
        boolean z = false;
        for(int v1 = 0; v1 < arr_adSize.length; ++v1) {
            if(arr_adSize[v1].equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzq0 = new zzq(context0, arr_adSize);
        if(v == 1) {
            z = true;
        }
        zzq0.zzj = z;
        return zzq0;
    }

    public final boolean zzA() {
        zzbs zzbs0 = this.j;
        if(zzbs0 != null) {
            try {
                return zzbs0.zzY();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return false;
    }

    public final AdSize[] zzB() {
        return this.h;
    }

    public final AdListener zza() {
        return this.g;
    }

    public final AdSize zzb() {
        zzbs zzbs0 = this.j;
        if(zzbs0 != null) {
            try {
                zzq zzq0 = zzbs0.zzg();
                if(zzq0 != null) {
                    return zzb.zzc(zzq0.zze, zzq0.zzb, zzq0.zza);
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return this.h == null ? null : this.h[0];
    }

    public final OnPaidEventListener zzc() {
        return this.p;
    }

    public final ResponseInfo zzd() {
        zzbs zzbs0 = this.j;
        if(zzbs0 != null) {
            try {
                return ResponseInfo.zza(zzbs0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zza(null);
            }
        }
        return ResponseInfo.zza(null);
    }

    public final VideoController zzf() {
        return this.d;
    }

    public final VideoOptions zzg() {
        return this.k;
    }

    public final AppEventListener zzh() {
        return this.i;
    }

    public final zzdk zzi() {
        zzbs zzbs0 = this.j;
        if(zzbs0 != null) {
            try {
                return zzbs0.zzl();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return null;
    }

    public final String zzj() {
        if(this.l == null) {
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                try {
                    this.l = zzbs0.zzr();
                    return this.l;
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        return this.l;
    }

    public final void zzk() {
        try {
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzx();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzm(zzdr zzdr0) {
        zzbs zzbs1;
        ViewGroup viewGroup0;
        try {
            viewGroup0 = this.m;
            if(this.j == null) {
                if(this.h == null || this.l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context0 = viewGroup0.getContext();
                zzq zzq0 = zzdu.a(context0, this.h, this.n);
                zzbs zzbs0 = "search_v2".equals(zzq0.zza) ? ((zzbs)new g(zzaw.zza(), context0, zzq0, this.l).d(context0, false)) : ((zzbs)new e(zzaw.zza(), context0, zzq0, this.l, this.a).d(context0, false));
                this.j = zzbs0;
                zzbs0.zzD(new zzg(this.e));
                zza zza0 = this.f;
                if(zza0 != null) {
                    this.j.zzC(new com.google.android.gms.ads.internal.client.zzb(zza0));
                }
                AppEventListener appEventListener0 = this.i;
                if(appEventListener0 != null) {
                    this.j.zzG(new zzbbb(appEventListener0));
                }
                if(this.k != null) {
                    this.j.zzU(new zzff(this.k));
                }
                this.j.zzP(new zzey(this.p));
                this.j.zzN(this.o);
                zzbs1 = this.j;
                if(zzbs1 != null) {
                    goto label_21;
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            return;
        }
        try {
        label_21:
            IObjectWrapper iObjectWrapper0 = zzbs1.zzn();
            if(iObjectWrapper0 != null) {
                if(!((Boolean)zzbjn.zze.zze()).booleanValue() || !((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                    viewGroup0.addView(((View)ObjectWrapper.unwrap(iObjectWrapper0)));
                }
                else {
                    zzds zzds0 = new zzds(this, iObjectWrapper0);
                    zzcfb.zza.post(zzds0);
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException1) {
        }
        try {
            zzcfi.zzl("#007 Could not call remote method.", remoteException1);
        label_31:
            zzbs zzbs2 = this.j;
            if(zzbs2 == null) {
                throw null;
            }
            Context context1 = viewGroup0.getContext();
            zzbs2.zzaa(this.b.zza(context1, zzdr0));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzn() {
        try {
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzz();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzo() {
        if(this.c.getAndSet(true)) {
            return;
        }
        try {
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzA();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzp() {
        try {
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzB();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzq(zza zza0) {
        try {
            this.f = zza0;
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzC((zza0 == null ? null : new com.google.android.gms.ads.internal.client.zzb(zza0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzr(AdListener adListener0) {
        this.g = adListener0;
        this.e.zza(adListener0);
    }

    public final void zzs(AdSize[] arr_adSize) {
        if(this.h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.zzt(arr_adSize);
    }

    public final void zzt(AdSize[] arr_adSize) {
        ViewGroup viewGroup0 = this.m;
        this.h = arr_adSize;
        zzbs zzbs0 = this.j;
        if(zzbs0 != null) {
            try {
                zzbs0.zzF(zzdu.a(viewGroup0.getContext(), this.h, this.n));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        viewGroup0.requestLayout();
    }

    public final void zzu(String s) {
        if(this.l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.l = s;
    }

    public final void zzv(AppEventListener appEventListener0) {
        try {
            this.i = appEventListener0;
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzG((appEventListener0 == null ? null : new zzbbb(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzw(boolean z) {
        try {
            this.o = z;
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzN(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener0) {
        try {
            this.p = onPaidEventListener0;
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzP(new zzey(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzy(VideoOptions videoOptions0) {
        try {
            this.k = videoOptions0;
            zzbs zzbs0 = this.j;
            if(zzbs0 != null) {
                zzbs0.zzU((videoOptions0 == null ? null : new zzff(videoOptions0)));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final boolean zzz(zzbs zzbs0) {
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = zzbs0.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
        if(iObjectWrapper0 == null) {
            return false;
        }
        if(((View)ObjectWrapper.unwrap(iObjectWrapper0)).getParent() != null) {
            return false;
        }
        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
        this.m.addView(view0);
        this.j = zzbs0;
        return true;
    }
}

