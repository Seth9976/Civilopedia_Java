package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbwn extends zzbwv {
    public final Map c;
    public final Activity d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    public zzbwn(zzcli zzcli0, Map map0) {
        super(zzcli0, "createCalendarEvent");
        this.c = map0;
        this.d = zzcli0.zzk();
        this.e = this.a("description");
        this.h = this.a("summary");
        String s = (String)map0.get("start_ticks");
        long v = -1L;
        long v1 = -1L;
        if(s != null) {
            try {
                v1 = Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        this.f = v1;
        String s1 = (String)this.c.get("end_ticks");
        if(s1 != null) {
            try {
                v = Long.parseLong(s1);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        this.g = v;
        this.i = this.a("location");
    }

    // 去混淆评级： 低(20)
    public final String a(String s) {
        return TextUtils.isEmpty(((CharSequence)this.c.get(s))) ? "" : ((String)this.c.get(s));
    }

    public final void zzc() {
        Activity activity0 = this.d;
        if(activity0 == null) {
            this.zzg("Activity context is not available.");
            return;
        }
        if(!new zzbhj(activity0).zzb()) {
            this.zzg("This feature is not available on the device.");
            return;
        }
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0);
        Resources resources0 = zzt.zzo().zzd();
        alertDialog$Builder0.setTitle((resources0 == null ? "Create calendar event" : resources0.getString(string.s5)));
        alertDialog$Builder0.setMessage((resources0 == null ? "Allow Ad to create a calendar event?" : resources0.getString(string.s6)));
        alertDialog$Builder0.setPositiveButton((resources0 == null ? "Accept" : resources0.getString(string.s3)), new f2(this, 0));
        alertDialog$Builder0.setNegativeButton((resources0 == null ? "Decline" : resources0.getString(string.s4)), new f2(this, 1));
        alertDialog$Builder0.create().show();
    }
}

