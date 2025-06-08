package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;

public final class zzdos {
    public final zzdtp a;
    public final zzdse b;
    public final zzcun c;
    public final zzdnp d;

    public zzdos(zzdtp zzdtp0, zzdse zzdse0, zzcun zzcun0, zzdnp zzdnp0) {
        this.a = zzdtp0;
        this.b = zzdse0;
        this.c = zzcun0;
        this.d = zzdnp0;
    }

    public final View zza() throws zzclt {
        zzq zzq0 = zzq.zzc();
        zzcli zzcli0 = this.a.zza(zzq0, null, null);
        ((View)zzcli0).setVisibility(8);
        zzcli0.zzaf("/sendMessageToSdk", new zzdom(this));
        zzcli0.zzaf("/adMuted", new zzdon(this));
        WeakReference weakReference0 = new WeakReference(zzcli0);
        zzdoo zzdoo0 = new zzdoo(this);
        this.b.zzj(weakReference0, "/loadHtml", zzdoo0);
        WeakReference weakReference1 = new WeakReference(zzcli0);
        zzdop zzdop0 = new zzdop(this);
        this.b.zzj(weakReference1, "/showOverlay", zzdop0);
        WeakReference weakReference2 = new WeakReference(zzcli0);
        zzdoq zzdoq0 = new zzdoq(this);
        this.b.zzj(weakReference2, "/hideOverlay", zzdoq0);
        return (View)zzcli0;
    }
}

