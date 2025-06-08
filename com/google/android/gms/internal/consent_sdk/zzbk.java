package com.google.android.gms.internal.consent_sdk;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import d1.g;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbk implements Runnable {
    public final g zza;

    public zzbk(g g0) {
        this.zza = g0;
    }

    @Override
    public final void run() {
        String s;
        g g0 = this.zza;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("app_name", g0.a.getPackageManager().getApplicationLabel(g0.a.getApplicationInfo()).toString());
            Drawable drawable0 = g0.a.getPackageManager().getApplicationIcon(g0.a.getApplicationInfo());
            if(drawable0 == null) {
                s = null;
            }
            else {
                Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                drawable0.draw(canvas0);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                String s1 = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
                s = s1.length() == 0 ? new String("data:image/png;base64,") : "data:image/png;base64," + s1;
            }
            jSONObject0.put("app_icon", s);
            jSONObject0.put("stored_infos_map", g0.h.zzb());
        }
        catch(JSONException unused_ex) {
        }
        g0.g.f.zzb("UMP_configureFormWithAppAssets", jSONObject0.toString());
    }
}

