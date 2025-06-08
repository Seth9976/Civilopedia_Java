package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class v4 implements zzbom {
    public final int a;
    public final Object b;

    public v4(o3 o30) {
        this.a = 3;
        super();
        this.b = o30;
    }

    public v4(zzdmh zzdmh0, int v) {
        this.a = v;
        switch(v) {
            case 1: {
                super();
                this.b = new WeakReference(zzdmh0);
                return;
            }
            case 2: {
                super();
                this.b = new WeakReference(zzdmh0);
                return;
            }
            default: {
                super();
                this.b = new WeakReference(zzdmh0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        switch(this.a) {
            case 0: {
                zzdmh zzdmh0 = (zzdmh)((WeakReference)this.b).get();
                if(zzdmh0 != null && "_ac".equals(((String)map0.get("eventName")))) {
                    zzdmh0.h.onAdClicked();
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                        zzdmh0.i.zzq();
                    }
                }
                return;
            }
            case 1: {
                zzdmh zzdmh1 = (zzdmh)((WeakReference)this.b).get();
                if(zzdmh1 != null) {
                    zzdmh1.h.onAdClicked();
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                        zzdmh1.i.zzq();
                    }
                }
                return;
            }
            case 2: {
                zzdmh zzdmh2 = (zzdmh)((WeakReference)this.b).get();
                if(zzdmh2 != null) {
                    zzdmh2.g.zza();
                }
                return;
            }
            default: {
                zzcli zzcli0 = (zzcli)object0;
                if(map0 != null) {
                    String s = (String)map0.get("height");
                    if(!TextUtils.isEmpty(s)) {
                        try {
                            int v = Integer.parseInt(s);
                            o3 o30 = (o3)this.b;
                            synchronized(o30) {
                                o3 o31 = (o3)this.b;
                                if(o31.N != v) {
                                    o31.N = v;
                                    o31.requestLayout();
                                }
                            }
                        }
                        catch(Exception exception0) {
                            zzcfi.zzk("Exception occurred while getting webview content height", exception0);
                        }
                    }
                }
            }
        }
    }
}

