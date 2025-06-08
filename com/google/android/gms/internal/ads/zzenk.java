package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;

public final class zzenk implements zzetg {
    public final zzfvm a;
    public final zzfvm b;
    public final Context c;
    public final zzfcd d;
    public final ViewGroup e;

    public zzenk(zzfvm zzfvm0, zzfvm zzfvm1, Context context0, zzfcd zzfcd0, ViewGroup viewGroup0) {
        this.a = zzfvm0;
        this.b = zzfvm1;
        this.c = context0;
        this.d = zzfcd0;
        this.e = viewGroup0;
    }

    public final ArrayList a() {
        ArrayList arrayList0 = new ArrayList();
        for(View view0 = this.e; view0 != null; view0 = (View)viewParent0) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 == null) {
                break;
            }
            int v = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0).indexOfChild(view0) : -1;
            Bundle bundle0 = new Bundle();
            bundle0.putString("type", viewParent0.getClass().getName());
            bundle0.putInt("index_of_child", v);
            arrayList0.add(bundle0);
            if(!(viewParent0 instanceof View)) {
                break;
            }
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzbhz.zzc(this.c);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzir)).booleanValue()) {
            zzeni zzeni0 = new zzeni(this);
            return this.b.zzb(zzeni0);
        }
        zzenj zzenj0 = new zzenj(this);
        return this.a.zzb(zzenj0);
    }
}

