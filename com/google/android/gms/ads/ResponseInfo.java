package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ResponseInfo {
    public final zzdh a;
    public final ArrayList b;
    public final AdapterResponseInfo c;

    public ResponseInfo(zzdh zzdh0) {
        zzu zzu0;
        this.a = zzdh0;
        this.b = new ArrayList();
        if(zzdh0 != null) {
            try {
                List list0 = zzdh0.zzi();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", remoteException0);
                goto label_17;
            }
            if(list0 != null) {
                for(Object object0: list0) {
                    AdapterResponseInfo adapterResponseInfo0 = AdapterResponseInfo.zza(((zzu)object0));
                    if(adapterResponseInfo0 != null) {
                        this.b.add(adapterResponseInfo0);
                    }
                }
            }
        }
    label_17:
        zzdh zzdh1 = this.a;
        if(zzdh1 != null) {
            try {
                zzu0 = zzdh1.zzf();
            }
            catch(RemoteException remoteException1) {
                zzcfi.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", remoteException1);
                return;
            }
            if(zzu0 != null) {
                this.c = AdapterResponseInfo.zza(zzu0);
            }
        }
    }

    public List getAdapterResponses() {
        return this.b;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.c;
    }

    public String getMediationAdapterClassName() {
        zzdh zzdh0 = this.a;
        if(zzdh0 != null) {
            try {
                return zzdh0.zzg();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    public Bundle getResponseExtras() {
        zzdh zzdh0 = this.a;
        if(zzdh0 != null) {
            try {
                return zzdh0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Could not forward getResponseExtras to ResponseInfo.", remoteException0);
            }
        }
        return new Bundle();
    }

    public String getResponseId() {
        zzdh zzdh0 = this.a;
        if(zzdh0 != null) {
            try {
                return zzdh0.zzh();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Could not forward getResponseId to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        try {
            return this.zzc().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    public static ResponseInfo zza(zzdh zzdh0) {
        return zzdh0 == null ? null : new ResponseInfo(zzdh0);
    }

    public static ResponseInfo zzb(zzdh zzdh0) {
        return new ResponseInfo(zzdh0);
    }

    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        String s = this.getResponseId();
        if(s == null) {
            jSONObject0.put("Response ID", "null");
        }
        else {
            jSONObject0.put("Response ID", s);
        }
        String s1 = this.getMediationAdapterClassName();
        if(s1 == null) {
            jSONObject0.put("Mediation Adapter Class Name", "null");
        }
        else {
            jSONObject0.put("Mediation Adapter Class Name", s1);
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.b) {
            jSONArray0.put(((AdapterResponseInfo)object0).zzb());
        }
        jSONObject0.put("Adapter Responses", jSONArray0);
        AdapterResponseInfo adapterResponseInfo0 = this.c;
        if(adapterResponseInfo0 != null) {
            jSONObject0.put("Loaded Adapter Response", adapterResponseInfo0.zzb());
        }
        Bundle bundle0 = this.getResponseExtras();
        if(bundle0 != null) {
            jSONObject0.put("Response Extras", zzaw.zzb().zzh(bundle0));
        }
        return jSONObject0;
    }
}

