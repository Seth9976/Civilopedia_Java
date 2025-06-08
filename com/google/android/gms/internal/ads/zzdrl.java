package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
import p.b;
import p.k;

public final class zzdrl extends zzblu {
    public final Context i;
    public final zzdnh j;
    public zzdoh k;
    public zzdnc l;

    public zzdrl(Context context0, zzdnh zzdnh0, zzdoh zzdoh0, zzdnc zzdnc0) {
        this.i = context0;
        this.j = zzdnh0;
        this.k = zzdoh0;
        this.l = zzdnc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final zzdk zze() {
        return this.j.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final zzblb zzf(String s) {
        return (zzblb)this.j.zzh().getOrDefault(s, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final IObjectWrapper zzg() {
        return ObjectWrapper.wrap(this.i);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final String zzh() {
        return this.j.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final String zzi(String s) {
        return (String)this.j.zzi().getOrDefault(s, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final List zzj() {
        k k0 = this.j.zzh();
        k k1 = this.j.zzi();
        String[] arr_s = new String[k0.k + k1.k];
        int v = 0;
        int v1 = 0;
        int v2;
        for(v2 = 0; v1 < k0.k; ++v2) {
            arr_s[v2] = (String)k0.i(v1);
            ++v1;
        }
        while(v < k1.k) {
            arr_s[v2] = (String)k1.i(v);
            ++v;
            ++v2;
        }
        return Arrays.asList(arr_s);
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzk() {
        zzdnc zzdnc0 = this.l;
        if(zzdnc0 != null) {
            zzdnc0.zzV();
        }
        this.l = null;
        this.k = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzl() {
        String s = this.j.zzA();
        if("Google".equals(s)) {
            zzcfi.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if(TextUtils.isEmpty(s)) {
            zzcfi.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdnc zzdnc0 = this.l;
        if(zzdnc0 != null) {
            zzdnc0.zzq(s, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzm(String s) {
        zzdnc zzdnc0 = this.l;
        if(zzdnc0 != null) {
            zzdnc0.zzy(s);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzn() {
        zzdnc zzdnc0 = this.l;
        if(zzdnc0 != null) {
            zzdnc0.zzB();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(!(object0 instanceof View)) {
            return;
        }
        if(this.j.zzu() == null) {
            return;
        }
        zzdnc zzdnc0 = this.l;
        if(zzdnc0 != null) {
            zzdnc0.zzC(((View)object0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzp() {
        if(this.l != null && !this.l.zzO()) {
            return false;
        }
        return this.j.zzq() == null ? false : this.j.zzr() == null;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzq(IObjectWrapper iObjectWrapper0) {
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        if(!(object0 instanceof ViewGroup)) {
            return false;
        }
        if(this.k != null && this.k.zzf(((ViewGroup)object0))) {
            this.j.zzr().zzaq(new E9(this, 17));
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzblv
    public final boolean zzr() {
        zzdnh zzdnh0 = this.j;
        IObjectWrapper iObjectWrapper0 = zzdnh0.zzu();
        if(iObjectWrapper0 != null) {
            zzt.zzh().zzd(iObjectWrapper0);
            if(zzdnh0.zzq() != null) {
                zzdnh0.zzq().zzd("onSdkLoaded", new b());  // 初始化器: Lp/k;-><init>()V
            }
            return true;
        }
        zzcfi.zzj("Trying to start OMID session before creation.");
        return false;
    }
}

