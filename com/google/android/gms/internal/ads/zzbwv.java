package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class zzbwv {
    public final zzcli a;
    public final String b;

    public zzbwv(zzcli zzcli0, String s) {
        this.a = zzcli0;
        this.b = s;
    }

    public final void zzf(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.a.zze("onDefaultPositionReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while dispatching default position.", jSONException0);
        }
    }

    public final void zzg(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("message", s).put("action", this.b);
            zzcli zzcli0 = this.a;
            if(zzcli0 != null) {
                zzcli0.zze("onError", jSONObject0);
            }
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while dispatching error event.", jSONException0);
        }
    }

    public final void zzh(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("js", s);
            this.a.zze("onReadyEventReceived", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while dispatching ready Event.", jSONException0);
        }
    }

    public final void zzi(int v, int v1, int v2, int v3, float f, int v4) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("width", v).put("height", v1).put("maxSizeWidth", v2).put("maxSizeHeight", v3).put("density", ((double)f)).put("rotation", v4);
            this.a.zze("onScreenInfoChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while obtaining screen information.", jSONException0);
        }
    }

    public final void zzj(int v, int v1, int v2, int v3) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("x", v).put("y", v1).put("width", v2).put("height", v3);
            this.a.zze("onSizeChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while dispatching size change.", jSONException0);
        }
    }

    public final void zzk(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject().put("state", s);
            this.a.zze("onStateChanged", jSONObject0);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while dispatching state change.", jSONException0);
        }
    }
}

