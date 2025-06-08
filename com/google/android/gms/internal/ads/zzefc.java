package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzefc implements zzbxp {
    public static zzfis a(String s) {
        switch(s) {
            case "htmlDisplay": {
                return zzfis.zzb;
            }
            case "nativeDisplay": {
                return zzfis.zzc;
            }
            case "video": {
                return zzfis.zzd;
            }
            default: {
                return null;
            }
        }
    }

    public static zzfiu b(String s) {
        switch(s) {
            case "beginToRender": {
                return zzfiu.zzd;
            }
            case "definedByJavascript": {
                return zzfiu.zza;
            }
            case "onePixel": {
                return zzfiu.zze;
            }
            default: {
                return zzfiu.zzb;
            }
        }
    }

    public static zzfiv c(String s) {
        if("native".equals(s)) {
            return zzfiv.zza;
        }
        return "javascript".equals(s) ? zzfiv.zzb : zzfiv.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxp
    public final IObjectWrapper zza(String s, WebView webView0, String s1, String s2, String s3, zzbxr zzbxr0, zzbxq zzbxq0, String s4) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            zzfiw zzfiw0 = zzfiw.zza("Google", s);
            zzfiv zzfiv0 = zzefc.c("javascript");
            zzfis zzfis0 = zzefc.a(zzbxq0.toString());
            zzfiv zzfiv1 = zzfiv.zzc;
            if(zzfiv0 == zzfiv1) {
                zzcfi.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfis0 == null) {
                zzcfi.zzj(("Omid html session error; Unable to parse creative type: " + zzbxq0));
                return null;
            }
            zzfiv zzfiv2 = zzefc.c(s3);
            if(zzfis0 == zzfis.zzd && zzfiv2 == zzfiv1) {
                zzcfi.zzj(("Omid html session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfip zzfip0 = zzfip.zzb(zzfiw0, webView0, s4, "");
            return ObjectWrapper.wrap(zzfin.zza(zzfio.zza(zzfis0, zzefc.b(zzbxr0.toString()), zzfiv0, zzfiv2, true), zzfip0));
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxp
    public final IObjectWrapper zzb(String s, WebView webView0, String s1, String s2, String s3, String s4, zzbxr zzbxr0, zzbxq zzbxq0, String s5) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            zzfiw zzfiw0 = zzfiw.zza(s4, s);
            zzfiv zzfiv0 = zzefc.c("javascript");
            zzfiv zzfiv1 = zzefc.c(s3);
            zzfis zzfis0 = zzefc.a(zzbxq0.toString());
            zzfiv zzfiv2 = zzfiv.zzc;
            if(zzfiv0 == zzfiv2) {
                zzcfi.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            }
            if(zzfis0 == null) {
                zzcfi.zzj(("Omid js session error; Unable to parse creative type: " + zzbxq0));
                return null;
            }
            if(zzfis0 == zzfis.zzd && zzfiv1 == zzfiv2) {
                zzcfi.zzj(("Omid js session error; Video events owner unknown for video creative: " + s3));
                return null;
            }
            zzfip zzfip0 = zzfip.zzc(zzfiw0, webView0, s5, "");
            return ObjectWrapper.wrap(zzfin.zza(zzfio.zza(zzfis0, zzefc.b(zzbxr0.toString()), zzfiv0, zzfiv1, true), zzfip0));
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxp
    public final void zzc(IObjectWrapper iObjectWrapper0, View view0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(object0 instanceof zzfin) {
                ((zzfin)object0).zzd(view0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxp
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(object0 instanceof zzfin) {
                ((zzfin)object0).zze();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxp
    public final boolean zze(Context context0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue()) {
            zzcfi.zzj("Omid flag is disabled");
            return false;
        }
        zzfil.zza(context0);
        return false;
    }
}

