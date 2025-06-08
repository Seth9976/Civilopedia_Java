package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzdxn extends zzbpj {
    public final zzdxq i;
    public final zzdxl j;
    public final HashMap k;

    public zzdxn(zzdxq zzdxq0, zzdxl zzdxl0) {
        this.k = new HashMap();
        this.i = zzdxq0;
        this.j = zzdxl0;
    }

    public static zzl b(Map map0) {
        zzm zzm0 = new zzm();
        String s = (String)map0.get("ad_request");
        if(s == null) {
            return zzm0.zza();
        }
        JsonReader jsonReader0 = new JsonReader(new StringReader(Uri.decode(s)));
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                String s1 = jsonReader0.nextName();
                switch(s1.hashCode()) {
                    case -1289032093: {
                        if(s1.equals("extras")) {
                            jsonReader0.beginObject();
                            Bundle bundle0 = new Bundle();
                            while(jsonReader0.hasNext()) {
                                bundle0.putString(jsonReader0.nextName(), jsonReader0.nextString());
                            }
                            jsonReader0.endObject();
                            zzm0.zzb(bundle0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    case 0xCDFC1652: {
                        if(s1.equals("isTestDevice")) {
                            zzm0.zzd(jsonReader0.nextBoolean());
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    case 0xD448A3ED: {
                        if(!s1.equals("tagForUnderAgeOfConsent")) {
                            jsonReader0.skipValue();
                        }
                        else if(jsonReader0.nextBoolean()) {
                            zzm0.zzh(1);
                        }
                        else {
                            zzm0.zzh(0);
                        }
                        continue;
                    }
                    case 0xFA0BCB5F: {
                        if(s1.equals("httpTimeoutMillis")) {
                            zzm0.zzc(jsonReader0.nextInt());
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    case 0x1F2E9FAA: {
                        if(s1.equals("keywords")) {
                            jsonReader0.beginArray();
                            ArrayList arrayList0 = new ArrayList();
                            while(jsonReader0.hasNext()) {
                                arrayList0.add(jsonReader0.nextString());
                            }
                            jsonReader0.endArray();
                            zzm0.zze(arrayList0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    case 0x239F260F: {
                        if(s1.equals("maxAdContentRating")) {
                            String s2 = jsonReader0.nextString();
                            if(!RequestConfiguration.zza.contains(s2)) {
                                continue;
                            }
                            zzm0.zzf(s2);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                        continue;
                    }
                    case 0x54230B03: {
                        break;
                    }
                    default: {
                        jsonReader0.skipValue();
                        continue;
                    }
                }
                if(!s1.equals("tagForChildDirectedTreatment")) {
                    jsonReader0.skipValue();
                }
                else if(jsonReader0.nextBoolean()) {
                    zzm0.zzg(1);
                }
                else {
                    zzm0.zzg(0);
                }
            }
            jsonReader0.endObject();
        }
        catch(IOException unused_ex) {
            zzcfi.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzl zzl0 = zzm0.zza();
        Bundle bundle1 = zzl0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle1 == null) {
            bundle1 = zzl0.zzc;
            zzl0.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle1);
        }
        return new zzl(zzl0.zza, zzl0.zzb, bundle1, zzl0.zzd, zzl0.zze, zzl0.zzf, zzl0.zzg, zzl0.zzh, zzl0.zzi, zzl0.zzj, zzl0.zzk, zzl0.zzl, zzl0.zzm, zzl0.zzn, zzl0.zzo, zzl0.zzp, zzl0.zzq, zzl0.zzr, zzl0.zzs, zzl0.zzt, zzl0.zzu, zzl0.zzv, zzl0.zzw, zzl0.zzx);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() {
        this.k.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf(String s) throws RemoteException {
        long v2;
        int v1;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            return;
        }
        zze.zza(("Received H5 gmsg: " + s));
        Map map0 = zzs.zzK(Uri.parse(s));
        String s1 = (String)map0.get("action");
        if(TextUtils.isEmpty(s1)) {
            zzcfi.zze("H5 gmsg did not contain an action");
            return;
        }
        int v = -1;
        switch(s1) {
            case "dispose_all": {
                v1 = 1;
                break;
            }
            case "initialize": {
                v1 = 0;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        HashMap hashMap0 = this.k;
        zzdxl zzdxl0 = this.j;
        switch(v1) {
            case 0: {
                hashMap0.clear();
                zzdxl0.zza();
                return;
            }
            case 1: {
                for(Object object0: hashMap0.values()) {
                    ((O4)object0).zza();
                }
                hashMap0.clear();
                return;
            }
            default: {
                String s2 = (String)map0.get("obj_id");
                try {
                    s2.getClass();
                    v2 = Long.parseLong(s2);
                    switch(s1) {
                        case "create_interstitial_ad": {
                            v = 0;
                            goto label_38;
                        }
                        case "create_rewarded_ad": {
                            goto label_37;
                        }
                        case "dispose": {
                            v = 6;
                            goto label_38;
                        }
                        case "load_interstitial_ad": {
                            v = 1;
                            goto label_38;
                        }
                        case "load_rewarded_ad": {
                            v = 4;
                            goto label_38;
                        }
                        case "show_interstitial_ad": {
                            break;
                        }
                        case "show_rewarded_ad": {
                            v = 5;
                            goto label_38;
                        }
                        default: {
                            goto label_38;
                        }
                    }
                }
                catch(NumberFormatException | NullPointerException unused_ex) {
                    zzcfi.zze(("H5 gmsg did not contain a valid object id: " + s2));
                    return;
                }
                v = 2;
                goto label_38;
            label_37:
                v = 3;
            label_38:
                zzdxq zzdxq0 = this.i;
                switch(v) {
                    case 0: {
                        if(hashMap0.size() >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhT))))) {
                            zzcfi.zzj("Could not create H5 ad, too many existing objects");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        Long long0 = v2;
                        if(hashMap0.containsKey(long0)) {
                            zzcfi.zze("Could not create H5 ad, object ID already exists");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        String s3 = (String)map0.get("ad_unit");
                        if(TextUtils.isEmpty(s3)) {
                            zzcfi.zzj("Could not create H5 ad, missing ad unit id");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        zzdxh zzdxh0 = zzdxq0.zzb();
                        zzdxh0.zzb(v2);
                        zzdxh0.zza(s3);
                        hashMap0.put(long0, zzdxh0.zzc().zza());
                        zzdxl0.zzh(v2);
                        zze.zza(("Created H5 interstitial #" + v2 + " with ad unit " + s3));
                        return;
                    }
                    case 1: {
                        O4 o40 = (O4)hashMap0.get(v2);
                        if(o40 == null) {
                            zzcfi.zze("Could not load H5 ad, object ID does not exist");
                            zzdxl0.zzf(v2);
                            return;
                        }
                        o40.zzb(zzdxn.b(map0));
                        return;
                    }
                    case 2: {
                        O4 o41 = (O4)hashMap0.get(v2);
                        if(o41 == null) {
                            zzcfi.zze("Could not show H5 ad, object ID does not exist");
                            zzdxl0.zzf(v2);
                            return;
                        }
                        o41.zzc();
                        return;
                    }
                    case 3: {
                        if(hashMap0.size() >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhT))))) {
                            zzcfi.zzj("Could not create H5 ad, too many existing objects");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        Long long1 = v2;
                        if(hashMap0.containsKey(long1)) {
                            zzcfi.zze("Could not create H5 ad, object ID already exists");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        String s4 = (String)map0.get("ad_unit");
                        if(TextUtils.isEmpty(s4)) {
                            zzcfi.zzj("Could not create H5 ad, missing ad unit id");
                            zzdxl0.zzi(v2);
                            return;
                        }
                        zzdxh zzdxh1 = zzdxq0.zzb();
                        zzdxh1.zzb(v2);
                        zzdxh1.zza(s4);
                        hashMap0.put(long1, zzdxh1.zzc().zzb());
                        zzdxl0.zzh(v2);
                        zze.zza(("Created H5 rewarded #" + v2 + " with ad unit " + s4));
                        return;
                    }
                    case 4: {
                        O4 o42 = (O4)hashMap0.get(v2);
                        if(o42 == null) {
                            zzcfi.zze("Could not load H5 ad, object ID does not exist");
                            zzdxl0.zzq(v2);
                            return;
                        }
                        o42.zzb(zzdxn.b(map0));
                        return;
                    }
                    case 5: {
                        O4 o43 = (O4)hashMap0.get(v2);
                        if(o43 == null) {
                            zzcfi.zze("Could not show H5 ad, object ID does not exist");
                            zzdxl0.zzq(v2);
                            return;
                        }
                        o43.zzc();
                        return;
                    }
                    case 6: {
                        Long long2 = v2;
                        O4 o44 = (O4)hashMap0.get(long2);
                        if(o44 == null) {
                            zzcfi.zze("Could not dispose H5 ad, object ID does not exist");
                            return;
                        }
                        o44.zza();
                        hashMap0.remove(long2);
                        zze.zza(("Disposed H5 ad #" + v2));
                        return;
                    }
                    default: {
                        zzcfi.zze(("H5 gmsg contained invalid action: " + s1));
                    }
                }
            }
        }
    }
}

