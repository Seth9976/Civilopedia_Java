package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzbhs {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public zzbhs() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final List zza() {
        List list0 = new ArrayList();
        for(Object object0: this.b) {
            String s = (String)zzay.zzc().zzb(((zzbhr)object0));
            if(!TextUtils.isEmpty(s)) {
                ((ArrayList)list0).add(s);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        zzbia.a(arrayList0, zzbjb.zzc("gad:dynamite_module:experiment_id", ""));
        zzbia.a(arrayList0, zzbjm.zza);
        zzbia.a(arrayList0, zzbjm.zzb);
        zzbia.a(arrayList0, zzbjm.zzc);
        zzbia.a(arrayList0, zzbjm.zzd);
        zzbia.a(arrayList0, zzbjm.zze);
        zzbia.a(arrayList0, zzbjm.zzu);
        zzbia.a(arrayList0, zzbjm.zzf);
        zzbia.a(arrayList0, zzbjm.zzm);
        zzbia.a(arrayList0, zzbjm.zzn);
        zzbia.a(arrayList0, zzbjm.zzo);
        zzbia.a(arrayList0, zzbjm.zzp);
        zzbia.a(arrayList0, zzbjm.zzq);
        zzbia.a(arrayList0, zzbjm.zzr);
        zzbia.a(arrayList0, zzbjm.zzs);
        zzbia.a(arrayList0, zzbjm.zzt);
        zzbia.a(arrayList0, zzbjm.zzg);
        zzbia.a(arrayList0, zzbjm.zzh);
        zzbia.a(arrayList0, zzbjm.zzi);
        zzbia.a(arrayList0, zzbjm.zzj);
        zzbia.a(arrayList0, zzbjm.zzk);
        zzbia.a(arrayList0, zzbjm.zzl);
        ((ArrayList)list0).addAll(arrayList0);
        return list0;
    }

    public final List zzb() {
        List list0 = this.zza();
        for(Object object0: this.c) {
            String s = (String)zzay.zzc().zzb(((zzbhr)object0));
            if(!TextUtils.isEmpty(s)) {
                list0.add(s);
            }
        }
        ArrayList arrayList0 = new ArrayList();
        zzbia.a(arrayList0, zzbjz.zza);
        list0.addAll(arrayList0);
        return list0;
    }

    public final void zzc(zzbhr zzbhr0) {
        this.b.add(zzbhr0);
    }

    public final void zzd(zzbhr zzbhr0) {
        this.a.add(zzbhr0);
    }

    public final void zze(SharedPreferences.Editor sharedPreferences$Editor0, int v, JSONObject jSONObject0) {
        for(Object object0: this.a) {
            zzbhr zzbhr0 = (zzbhr)object0;
            if(zzbhr0.zze() == 1) {
                zzbhr0.zzd(sharedPreferences$Editor0, zzbhr0.a(jSONObject0));
            }
        }
        if(jSONObject0 != null) {
            sharedPreferences$Editor0.putString("flag_configuration", jSONObject0.toString());
            return;
        }
        zzcfi.zzg("Flag Json is null.");
    }
}

