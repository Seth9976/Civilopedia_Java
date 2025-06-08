package com.google.android.gms.internal.ads;

import D0.r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzdyw {
    public final zzdyj a;
    public final zzdtz b;
    public final Object c;
    public final ArrayList d;
    public boolean e;

    public zzdyw(zzdyj zzdyj0, zzdtz zzdtz0) {
        this.c = new Object();
        this.a = zzdyj0;
        this.b = zzdtz0;
        this.d = new ArrayList();
    }

    public final void a(List list0) {
        synchronized(this.c) {
            if(this.e) {
                return;
            }
            for(Object object1: list0) {
                String s = this.b.zzc(((zzbqg)object1).zza);
                U4 u40 = new U4(((zzbqg)object1).zza, s, ((int)((zzbqg)object1).zzb), ((zzbqg)object1).zzd, ((zzbqg)object1).zzc);
                this.d.add(u40);
            }
            this.e = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        synchronized(this.c) {
            if(!this.e) {
                if(this.a.zzt()) {
                    this.a(this.a.zzg());
                    goto label_13;
                }
                this.zzc();
                return jSONArray0;
            }
        label_13:
            for(Object object1: this.d) {
                jSONArray0.put(((U4)object1).a());
            }
            return jSONArray0;
        }
    }

    public final void zzc() {
        r r0 = new r(this, 1);
        this.a.zzs(r0);
    }
}

