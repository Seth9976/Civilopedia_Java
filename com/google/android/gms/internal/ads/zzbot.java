package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

public final class zzbot implements zzbom {
    public final zzb a;
    public final zzbwp b;
    public final zzbww c;
    public static final Map d;

    static {
        zzbot.d = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    }

    public zzbot(zzb zzb0, zzbwp zzbwp0, zzbww zzbww0) {
        this.a = zzb0;
        this.b = zzbwp0;
        this.c = zzbww0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("a");
        int v = (int)(((Integer)zzbot.d.get(s)));
        int v1 = 6;
        boolean z = true;
        switch(v) {
            case 5: {
                String s1 = (String)map0.get("forceOrientation");
                if(map0.containsKey("allowOrientationChange")) {
                    z = Boolean.parseBoolean(((String)map0.get("allowOrientationChange")));
                }
                if(((zzcli)object0) == null) {
                    zzcfi.zzj("AdWebView is null");
                    return;
                }
                if("portrait".equalsIgnoreCase(s1)) {
                    v1 = 7;
                }
                else if(!"landscape".equalsIgnoreCase(s1)) {
                    v1 = z ? -1 : 14;
                }
                ((zzcli)object0).zzas(v1);
                return;
            }
            case 7: {
                this.c.zzc();
                return;
            }
            default: {
                zzb zzb0 = this.a;
                if(zzb0.zzc()) {
                    zzbwp zzbwp0 = this.b;
                    switch(v) {
                        case 1: {
                            zzbwp0.zzb(map0);
                            return;
                        }
                        case 3: {
                            new zzbws(((zzcli)object0), map0).zzb();
                            return;
                        }
                        case 4: {
                            new zzbwn(((zzcli)object0), map0).zzc();
                            return;
                        }
                        case 6: {
                            zzbwp0.zza(true);
                            return;
                        }
                        default: {
                            zzcfi.zzi("Unknown MRAID command called.");
                            return;
                        }
                    }
                }
                zzb0.zzb(null);
            }
        }
    }
}

