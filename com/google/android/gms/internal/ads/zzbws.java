package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbws extends zzbwv {
    public final Map c;
    public final Activity d;

    public zzbws(zzcli zzcli0, Map map0) {
        super(zzcli0, "storePicture");
        this.c = map0;
        this.d = zzcli0.zzk();
    }

    public final void zzb() {
        Activity activity0 = this.d;
        if(activity0 == null) {
            this.zzg("Activity context is not available");
            return;
        }
        if(!new zzbhj(activity0).zzc()) {
            this.zzg("Feature is not supported by the device.");
            return;
        }
        String s = (String)this.c.get("iurl");
        if(TextUtils.isEmpty(s)) {
            this.zzg("Image url cannot be empty.");
            return;
        }
        if(URLUtil.isValidUrl(s)) {
            String s1 = Uri.parse(s).getLastPathSegment();
            if(!TextUtils.isEmpty(s1) && s1.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources resources0 = zzt.zzo().zzd();
                AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0);
                alertDialog$Builder0.setTitle((resources0 == null ? "Save image" : resources0.getString(string.s1)));
                alertDialog$Builder0.setMessage((resources0 == null ? "Allow Ad to store image in Picture gallery?" : resources0.getString(string.s2)));
                alertDialog$Builder0.setPositiveButton((resources0 == null ? "Accept" : resources0.getString(string.s3)), new h2(this, s, s1));
                alertDialog$Builder0.setNegativeButton((resources0 == null ? "Decline" : resources0.getString(string.s4)), new i2(this, 0));
                alertDialog$Builder0.create().show();
                return;
            }
            this.zzg("Image type not recognized: " + s1);
            return;
        }
        this.zzg("Invalid image url: " + s);
    }
}

