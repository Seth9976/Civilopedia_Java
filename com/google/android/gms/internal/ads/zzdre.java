package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzdre extends zzbqu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkm {
    public View i;
    public zzdk j;
    public zzdnc k;
    public boolean l;
    public boolean m;

    public zzdre(zzdnc zzdnc0, zzdnh zzdnh0) {
        this.i = zzdnh0.zzf();
        this.j = zzdnh0.zzj();
        this.k = zzdnc0;
        this.l = false;
        this.m = false;
        if(zzdnh0.zzr() != null) {
            zzdnh0.zzr().zzao(this);
        }
    }

    public final void b() {
        zzdnc zzdnc0 = this.k;
        if(zzdnc0 != null) {
            View view0 = this.i;
            if(view0 != null) {
                zzdnc0.zzv(view0, Collections.emptyMap(), Collections.emptyMap(), zzdnc.zzP(this.i));
            }
        }
    }

    public final void c() {
        View view0 = this.i;
        if(view0 == null) {
            return;
        }
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.i);
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzbqv
    public final zzdk zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.l) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqv
    public final zzbky zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.l) {
            zzcfi.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.k == null || this.k.zza() == null ? null : this.k.zza().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbqv
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.c();
        zzdnc zzdnc0 = this.k;
        if(zzdnc0 != null) {
            zzdnc0.zzV();
        }
        this.k = null;
        this.i = null;
        this.j = null;
        this.l = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqv
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzf(iObjectWrapper0, new y4());  // 初始化器: Lcom/google/android/gms/internal/ads/zzbqx;-><init>()V
    }

    @Override  // com.google.android.gms.internal.ads.zzbqv
    public final void zzf(IObjectWrapper iObjectWrapper0, zzbqy zzbqy0) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.l) {
            zzcfi.zzg("Instream ad can not be shown after destroy().");
            try {
                zzbqy0.zze(2);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
            return;
        }
        View view0 = this.i;
        if(view0 != null && this.j != null) {
            if(this.m) {
                zzcfi.zzg("Instream ad should not be used again.");
                try {
                    zzbqy0.zze(1);
                }
                catch(RemoteException remoteException1) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException1);
                }
                return;
            }
            this.m = true;
            this.c();
            ((ViewGroup)ObjectWrapper.unwrap(iObjectWrapper0)).addView(this.i, new ViewGroup.LayoutParams(-1, -1));
            zzcgi.zza(this.i, this);
            zzcgi.zzb(this.i, this);
            this.b();
            try {
                zzbqy0.zzf();
            }
            catch(RemoteException remoteException2) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException2);
            }
            return;
        }
        zzcfi.zzg(("Instream internal error: " + (view0 == null ? "can not get video view." : "can not get video controller.")));
        try {
            zzbqy0.zze(0);
        }
        catch(RemoteException remoteException3) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException3);
        }
    }
}

