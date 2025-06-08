package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import java.util.Iterator;
import java.util.Map;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzccb implements zzfuj {
    public final zzcce zza;

    public zzccb(zzcce zzcce0) {
        this.zza = zzcce0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzgpj zzgpj0;
        Object object6;
        int v2;
        Object object5;
        JSONArray jSONArray0;
        String s;
        zzcce zzcce0 = this.zza;
        Map map0 = (Map)object0;
        zzcce0.getClass();
        try {
            if(map0 == null) {
                goto label_6;
            }
            Iterator iterator0 = map0.keySet().iterator();
            while(true) {
            label_5:
                if(!iterator0.hasNext()) {
                label_6:
                    if(zzcce0.f) {
                        synchronized(zzcce0.h) {
                            zzcce0.a.zzn(10);
                        }
                    }
                    if(zzcce0.f && zzcce0.g.zzg || zzcce0.k && zzcce0.g.zzf || !zzcce0.f && zzcce0.g.zzd) {
                        synchronized(zzcce0.h) {
                            for(Object object2: zzcce0.b.values()) {
                                zzgpk zzgpk0 = (zzgpk)((zzgpj)object2).zzal();
                                zzcce0.a.zzc(zzgpk0);
                            }
                            zzcce0.a.zza(zzcce0.c);
                            zzcce0.a.zzb(zzcce0.d);
                            if(zzcci.zzb()) {
                                StringBuilder stringBuilder0 = new StringBuilder("Sending SB report\n  url: " + zzcce0.a.zzl() + "\n  clickUrl: " + zzcce0.a.zzk() + "\n  resources: \n");
                                for(Object object3: zzcce0.a.zzm()) {
                                    stringBuilder0.append("    [");
                                    stringBuilder0.append(((zzgpk)object3).zza());
                                    stringBuilder0.append("] ");
                                    stringBuilder0.append("");
                                }
                                zzcci.zza(stringBuilder0.toString());
                            }
                            byte[] arr_b = ((zzgpq)zzcce0.a.zzal()).zzaw();
                            zzfvl zzfvl0 = new zzbo(zzcce0.e).zzb(1, zzcce0.g.zzb, null, arr_b);
                            if(zzcci.zzb()) {
                                zzfvl0.zzc(zzcbz.zza, zzcfv.zza);
                            }
                            return zzfvc.zzm(zzfvl0, zzcca.zza, zzcfv.zzf);
                        }
                    }
                    return zzfvc.zzi(null);
                }
                Object object4 = iterator0.next();
                s = (String)object4;
                jSONArray0 = new JSONObject(((String)map0.get(s))).optJSONArray("matches");
                if(jSONArray0 != null) {
                    object5 = zzcce0.h;
                    __monitor_enter(object5);
                    v2 = FIN.finallyOpen$NT();
                    int v3 = jSONArray0.length();
                    object6 = zzcce0.h;
                    __monitor_enter(object6);
                    break;
                }
            }
        }
        catch(JSONException jSONException0) {
            goto label_81;
        }
        try {
            zzgpj0 = (zzgpj)zzcce0.b.get(s);
            goto label_62;
        }
        catch(Throwable throwable0) {
            try {
                __monitor_exit(object6);
                FIN.finallyExec$NT(v2);
                throw throwable0;
            label_62:
                __monitor_exit(object6);
                if(zzgpj0 == null) {
                    zzcci.zza(("Cannot find the corresponding resource object for " + s));
                }
                else {
                    boolean z = false;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        zzgpj0.zza(jSONArray0.getJSONObject(v4).getString("threat_type"));
                    }
                    boolean z1 = zzcce0.f;
                    if(v3 > 0) {
                        z = true;
                    }
                    zzcce0.f = z | z1;
                }
                FIN.finallyCodeBegin$NT(v2);
                __monitor_exit(object5);
                FIN.finallyCodeEnd$NT(v2);
                goto label_5;
            }
            catch(JSONException jSONException0) {
            }
        }
    label_81:
        if(((Boolean)zzbjw.zzb.zze()).booleanValue()) {
            zzcfi.zzf("Failed to get SafeBrowsing metadata", jSONException0);
        }
        return zzfvc.zzh(new Exception("Safebrowsing report transmission failed."));
    }
}

