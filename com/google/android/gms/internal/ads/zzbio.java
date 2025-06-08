package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbio {
    public final LinkedList a;
    public final LinkedHashMap b;
    public final Object c;

    public zzbio(boolean z, String s, String s1) {
        this.a = new LinkedList();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.b = linkedHashMap0;
        this.c = new Object();
        linkedHashMap0.put("action", "make_wv");
        linkedHashMap0.put("ad_format", s1);
    }

    public final zzbin zza() {
        String s1;
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
        StringBuilder stringBuilder0 = new StringBuilder();
        HashMap hashMap0 = new HashMap();
        synchronized(this.c) {
            for(Object object1: this.a) {
                long v1 = ((zzbil)object1).zza();
                String s = ((zzbil)object1).zzc();
                zzbil zzbil0 = ((zzbil)object1).zzb();
                if(zzbil0 != null && v1 > 0L) {
                    stringBuilder0.append(s);
                    stringBuilder0.append('.');
                    stringBuilder0.append(v1 - zzbil0.zza());
                    stringBuilder0.append(',');
                    if(!z) {
                    }
                    else if(hashMap0.containsKey(zzbil0.zza())) {
                        StringBuilder stringBuilder1 = (StringBuilder)hashMap0.get(zzbil0.zza());
                        stringBuilder1.append('+');
                        stringBuilder1.append(s);
                    }
                    else {
                        hashMap0.put(zzbil0.zza(), new StringBuilder(s));
                    }
                }
            }
            this.a.clear();
            s1 = null;
            if(!TextUtils.isEmpty(null)) {
                stringBuilder0.append(null);
            }
            else if(stringBuilder0.length() > 0) {
                stringBuilder0.setLength(stringBuilder0.length() - 1);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if(z) {
                for(Object object2: hashMap0.entrySet()) {
                    stringBuilder2.append(((CharSequence)((Map.Entry)object2).getValue()));
                    stringBuilder2.append('.');
                    long v2 = (long)(((Long)((Map.Entry)object2).getKey()));
                    stringBuilder2.append(zzt.zzA().currentTimeMillis() + (v2 - zzt.zzA().elapsedRealtime()));
                    stringBuilder2.append(',');
                }
                if(stringBuilder2.length() > 0) {
                    stringBuilder2.setLength(stringBuilder2.length() - 1);
                }
                s1 = stringBuilder2.toString();
            }
        }
        return new zzbin(stringBuilder0.toString(), s1);
    }

    @VisibleForTesting
    public final Map zzb() {
        synchronized(this.c) {
        }
        return this.b;
    }

    public final void zzc(zzbio zzbio0) {
        synchronized(this.c) {
        }
    }

    public final void zzd(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        zzbie zzbie0 = zzt.zzo().zzf();
        if(zzbie0 == null) {
            return;
        }
        synchronized(this.c) {
            String s2 = zzbie0.zza(s).zza(((String)this.b.get(s)), s1);
            this.b.put(s, s2);
        }
    }

    public final boolean zze(zzbil zzbil0, long v, String[] arr_s) {
        synchronized(this.c) {
            for(int v2 = 0; v2 <= 0; ++v2) {
                zzbil zzbil1 = new zzbil(v, arr_s[v2], zzbil0);
                this.a.add(zzbil1);
            }
            return true;
        }
    }

    public static final zzbil zzf() {
        return new zzbil(zzt.zzA().elapsedRealtime(), null, null);
    }
}

