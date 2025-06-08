package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyl {
    public final Context a;
    public final ApplicationInfo b;
    public final int c;
    public final int d;
    public String e;

    public zzdyl(Context context0) {
        this.e = "";
        this.a = context0;
        this.b = context0.getApplicationInfo();
        this.c = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzhI)));
        this.d = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzhJ)));
    }

    public final JSONObject zza() throws JSONException {
        String s;
        Drawable drawable0;
        ApplicationInfo applicationInfo0 = this.b;
        Context context0 = this.a;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("name", Wrappers.packageManager(context0).getApplicationLabel(applicationInfo0.packageName));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        jSONObject0.put("packageName", applicationInfo0.packageName);
        jSONObject0.put("adMobAppId", zzs.zzo(context0));
        int v = this.d;
        int v1 = this.c;
        if(this.e.isEmpty()) {
            try {
                drawable0 = null;
                drawable0 = Wrappers.packageManager(context0).getApplicationLabelAndIcon(applicationInfo0.packageName).b;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(drawable0 == null) {
                s = "";
            }
            else {
                drawable0.setBounds(0, 0, v1, v);
                Bitmap bitmap0 = Bitmap.createBitmap(v1, v, Bitmap.Config.ARGB_8888);
                drawable0.draw(new Canvas(bitmap0));
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
                s = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
            }
            this.e = s;
        }
        if(!this.e.isEmpty()) {
            jSONObject0.put("icon", this.e);
            jSONObject0.put("iconWidthPx", v1);
            jSONObject0.put("iconHeightPx", v);
        }
        return jSONObject0;
    }
}

