package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class zzefi {
    public final List a;
    public final Map b;
    public zzfbo c;
    public zzfbl d;
    public zzu e;

    public zzefi() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = Collections.synchronizedMap(new HashMap());
        this.a = Collections.synchronizedList(new ArrayList());
    }

    public final void a(zzfbl zzfbl0, long v, zze zze0, boolean z) {
        String s = zzfbl0.zzx;
        Map map0 = this.b;
        if(!map0.containsKey(s)) {
            return;
        }
        if(this.d == null) {
            this.d = zzfbl0;
        }
        zzu zzu0 = (zzu)map0.get(s);
        zzu0.zzb = v;
        zzu0.zzc = zze0;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfM)).booleanValue() && z) {
            this.e = zzu0;
        }
    }

    public final zzu zza() {
        return this.e;
    }

    public final zzdbm zzb() {
        return new zzdbm(this.d, "", this, this.c);
    }

    public final List zzc() {
        return this.a;
    }

    public final void zzd(zzfbl zzfbl0) {
        String s5;
        String s4;
        String s3;
        String s2;
        String s = zzfbl0.zzx;
        Map map0 = this.b;
        if(map0.containsKey(s)) {
            return;
        }
        Bundle bundle0 = new Bundle();
        Iterator iterator0 = zzfbl0.zzw.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            try {
                bundle0.putString(s1, zzfbl0.zzw.getString(s1));
            }
            catch(JSONException unused_ex) {
            }
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfL)).booleanValue()) {
            s2 = zzfbl0.zzG;
            s3 = zzfbl0.zzH;
            s4 = zzfbl0.zzI;
            s5 = zzfbl0.zzJ;
        }
        else {
            s2 = "";
            s3 = "";
            s4 = "";
            s5 = "";
        }
        zzu zzu0 = new zzu(zzfbl0.zzF, 0L, null, bundle0, s2, s3, s4, s5);
        this.a.add(zzu0);
        map0.put(s, zzu0);
    }

    public final void zze(zzfbl zzfbl0, long v, zze zze0) {
        this.a(zzfbl0, v, zze0, false);
    }

    public final void zzf(zzfbl zzfbl0, long v, zze zze0) {
        this.a(zzfbl0, v, null, true);
    }

    public final void zzg(zzfbo zzfbo0) {
        this.c = zzfbo0;
    }
}

