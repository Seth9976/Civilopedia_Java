package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdpf implements zzdnp {
    public final zzbup a;
    public final zzdcl b;
    public final zzdbr c;
    public final zzdje d;
    public final Context e;
    public final zzfbl f;
    public final zzcfo g;
    public final zzfcd h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final zzbul l;
    public final zzbum m;

    public zzdpf(zzbul zzbul0, zzbum zzbum0, zzbup zzbup0, zzdcl zzdcl0, zzdbr zzdbr0, zzdje zzdje0, Context context0, zzfbl zzfbl0, zzcfo zzcfo0, zzfcd zzfcd0, byte[] arr_b) {
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = zzbul0;
        this.m = zzbum0;
        this.a = zzbup0;
        this.b = zzdcl0;
        this.c = zzdbr0;
        this.d = zzdje0;
        this.e = context0;
        this.f = zzfbl0;
        this.g = zzcfo0;
        this.h = zzfcd0;
    }

    public final void a(View view0) {
        zzbup zzbup0 = this.a;
        zzdje zzdje0 = this.d;
        zzdbr zzdbr0 = this.c;
        if(zzbup0 == null) {
            goto label_10;
        }
        else {
            try {
                if(zzbup0.zzA()) {
                label_10:
                    zzbul zzbul0 = this.l;
                    if(zzbul0 == null || zzbul0.zzx()) {
                        zzbum zzbum0 = this.m;
                        if(zzbum0 != null && !zzbum0.zzv()) {
                            zzbum0.zzq(ObjectWrapper.wrap(view0));
                            zzdbr0.onAdClicked();
                            if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                                zzdje0.zzq();
                            }
                        }
                    }
                    else {
                        zzbul0.zzs(ObjectWrapper.wrap(view0));
                        zzdbr0.onAdClicked();
                        if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                            zzdje0.zzq();
                        }
                    }
                }
                else {
                    zzbup0.zzw(ObjectWrapper.wrap(view0));
                    zzdbr0.onAdClicked();
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                        zzdje0.zzq();
                    }
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to call handleClick", remoteException0);
            }
        }
    }

    public static final HashMap b(Map map0) {
        HashMap hashMap0 = new HashMap();
        if(map0 == null) {
            return hashMap0;
        }
        synchronized(map0) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                View view0 = (View)((WeakReference)map$Entry0.getValue()).get();
                if(view0 != null) {
                    hashMap0.put(((String)map$Entry0.getKey()), view0);
                }
            }
            return hashMap0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzA(Bundle bundle0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zzd(View view0, Map map0, Map map1) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zze(View view0, Map map0, Map map1) {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzg() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzh() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzi(zzcu zzcu0) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzj(View view0, View view1, Map map0, Map map1, boolean z) {
        if(this.j && this.f.zzM) {
            return;
        }
        this.a(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzk(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzl(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzn(View view0, Map map0, Map map1, boolean z) {
        if(!this.j) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
            return;
        }
        if(!this.f.zzM) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
            return;
        }
        this.a(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzo() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzp(View view0, Map map0, Map map1) {
        try {
            if(!this.i) {
                this.i = zzt.zzs().zzn(this.e, this.g.zza, this.f.zzD.toString(), this.h.zzf);
            }
            if(!this.k) {
                return;
            }
            zzbup zzbup0 = this.a;
            zzdcl zzdcl0 = this.b;
            if(zzbup0 != null && !zzbup0.zzB()) {
                zzbup0.zzx();
                zzdcl0.zza();
                return;
            }
            zzbul zzbul0 = this.l;
            if(zzbul0 != null && !zzbul0.zzy()) {
                zzbul0.zzt();
                zzdcl0.zza();
                return;
            }
            zzbum zzbum0 = this.m;
            if(zzbum0 != null && !zzbum0.zzw()) {
                zzbum0.zzr();
                zzdcl0.zza();
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzk("Failed to call recordImpression", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzr(View view0, MotionEvent motionEvent0, View view1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzs(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzt(View view0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzu() {
        this.j = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzv(zzcq zzcq0) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzw(zzbmv zzbmv0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzx(View view0, Map map0, Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        IObjectWrapper iObjectWrapper1;
        Class class0;
        Object object2;
        JSONArray jSONArray0;
        boolean z1;
        zzbul zzbul0;
        zzbum zzbum0;
        zzbup zzbup0;
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = ObjectWrapper.wrap(view0);
            JSONObject jSONObject0 = this.f.zzal;
            boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzbq)).booleanValue();
            zzbup0 = this.a;
            zzbum0 = this.m;
            zzbul0 = this.l;
            z1 = true;
            if(z && jSONObject0.length() != 0) {
                Map map2 = map0 == null ? new HashMap() : map0;
                Map map3 = map1 == null ? new HashMap() : map1;
                HashMap hashMap0 = new HashMap();
                hashMap0.putAll(map2);
                hashMap0.putAll(map3);
                Iterator iterator0 = jSONObject0.keys();
                while(true) {
                label_20:
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    jSONArray0 = jSONObject0.optJSONArray(s);
                    if(jSONArray0 == null) {
                        continue;
                    }
                    WeakReference weakReference0 = (WeakReference)hashMap0.get(s);
                    if(weakReference0 == null) {
                        goto label_55;
                    }
                    Object object1 = weakReference0.get();
                    if(object1 == null) {
                        goto label_55;
                    }
                    object2 = null;
                    class0 = object1.getClass();
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzbr)).booleanValue() && s.equals("3010")) {
                        goto label_32;
                    }
                    goto label_46;
                }
            }
            goto label_56;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to call trackView", remoteException0);
            return;
        }
        try {
        label_32:
            if(zzbup0 != null) {
                iObjectWrapper1 = zzbup0.zzn();
            }
            else if(zzbul0 == null) {
                if(zzbum0 != null) {
                    iObjectWrapper1 = zzbum0.zzj();
                    goto label_42;
                }
                goto label_41;
            }
            else {
                iObjectWrapper1 = zzbul0.zzk();
            }
            goto label_42;
        }
        catch(RemoteException unused_ex) {
            goto label_44;
        }
    label_41:
        iObjectWrapper1 = null;
    label_42:
        if(iObjectWrapper1 != null) {
            try {
                try {
                    object2 = ObjectWrapper.unwrap(iObjectWrapper1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            label_44:
                if(object2 == null) {
                    goto label_55;
                }
                class0 = object2.getClass();
                try {
                label_46:
                    ArrayList arrayList0 = new ArrayList();
                    zzbu.zzc(jSONArray0, arrayList0);
                    ClassLoader classLoader0 = this.e.getClassLoader();
                    Iterator iterator1 = arrayList0.iterator();
                label_50:
                    if(!iterator1.hasNext()) {
                        goto label_55;
                    }
                    Object object3 = iterator1.next();
                    String s1 = (String)object3;
                    goto label_53;
                }
                catch(JSONException unused_ex) {
                    goto label_20;
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Failed to call trackView", remoteException0);
                return;
            }
        }
        goto label_44;
        try {
        label_53:
            if(!Class.forName(s1, false, classLoader0).isAssignableFrom(class0)) {
                goto label_50;
            }
            goto label_20;
        }
        catch(Throwable unused_ex) {
        }
        goto label_50;
        try {
        label_55:
            z1 = false;
        label_56:
            this.k = z1;
            HashMap hashMap1 = zzdpf.b(map0);
            HashMap hashMap2 = zzdpf.b(map1);
            if(zzbup0 != null) {
                zzbup0.zzy(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                return;
            }
            if(zzbul0 != null) {
                zzbul0.zzv(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                zzbul0.zzu(iObjectWrapper0);
                return;
            }
            if(zzbum0 != null) {
                zzbum0.zzt(iObjectWrapper0, ObjectWrapper.wrap(hashMap1), ObjectWrapper.wrap(hashMap2));
                zzbum0.zzs(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzk("Failed to call trackView", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzy(View view0, Map map0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            zzbup zzbup0 = this.a;
            if(zzbup0 != null) {
                zzbup0.zzz(iObjectWrapper0);
                return;
            }
            zzbul zzbul0 = this.l;
            if(zzbul0 != null) {
                zzbul0.zzw(iObjectWrapper0);
                return;
            }
            zzbum zzbum0 = this.m;
            if(zzbum0 != null) {
                zzbum0.zzu(iObjectWrapper0);
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzk("Failed to call untrackView", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzz() {
        return this.f.zzM;
    }
}

