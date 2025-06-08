package o0;

import J1.d;
import T1.c;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import o2.C;
import p0.e;
import p0.f;
import p0.h;
import p0.i;
import p0.j;
import p0.k;
import p0.l;
import p0.n;
import p0.o;
import p0.q;
import p0.r;
import p0.s;
import p0.t;
import p0.v;
import r0.g;
import z0.a;

public final class b implements g {
    public final c a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final a e;
    public final a f;
    public final int g;

    public b(Context context0, a a0, a a1) {
        d d0 = new d();
        d0.a(o.class, p0.c.a);
        d0.a(i.class, p0.c.a);
        d0.a(s.class, f.a);
        d0.a(l.class, f.a);
        d0.a(q.class, p0.d.a);
        d0.a(j.class, p0.d.a);
        d0.a(p0.a.class, p0.b.a);
        d0.a(h.class, p0.b.a);
        d0.a(r.class, e.a);
        d0.a(k.class, e.a);
        d0.a(v.class, p0.g.a);
        d0.a(n.class, p0.g.a);
        d0.d = true;
        this.a = new c(d0, 6);
        this.c = context0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.d = b.b("https://firebaselogging.googleapis.com/v0cc/log/batch?format=json_proto3");
        this.e = a1;
        this.f = a0;
        this.g = 130000;
    }

    public final q0.h a(q0.h h0) {
        int v4;
        NetworkInfo networkInfo0 = this.b.getActiveNetworkInfo();
        C1.d d0 = h0.c();
        int v = Build.VERSION.SDK_INT;
        HashMap hashMap0 = (HashMap)d0.n;
        if(hashMap0 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap0.put("sdk-version", String.valueOf(v));
        d0.m("model", Build.MODEL);
        d0.m("hardware", Build.HARDWARE);
        d0.m("device", Build.DEVICE);
        d0.m("product", Build.PRODUCT);
        d0.m("os-uild", Build.ID);
        d0.m("manufacturer", Build.MANUFACTURER);
        d0.m("fingerprint", "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys");
        Calendar.getInstance();
        int v1 = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis());
        HashMap hashMap1 = (HashMap)d0.n;
        if(hashMap1 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap1.put("tz-offset", String.valueOf(v1 / 1000));
        int v2 = -1;
        int v3 = networkInfo0 == null ? -1 : networkInfo0.getType();
        HashMap hashMap2 = (HashMap)d0.n;
        if(hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("net-type", String.valueOf(v3));
        if(networkInfo0 == null) {
            v4 = 0;
        }
        else {
            v4 = networkInfo0.getSubtype();
            if(v4 == -1) {
                v4 = 100;
            }
            else if(((t)t.i.get(v4)) == null) {
                v4 = 0;
            }
        }
        HashMap hashMap3 = (HashMap)d0.n;
        if(hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("mobile-subtype", String.valueOf(v4));
        d0.m("country", Locale.getDefault().getCountry());
        d0.m("locale", Locale.getDefault().getLanguage());
        d0.m("mcc_mnc", ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator());
        try {
            v2 = this.c.getPackageManager().getPackageInfo("com.spears.civilopedia", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            C.i("CctTransportBackend", "Unable to find version code for package", packageManager$NameNotFoundException0);
        }
        d0.m("application_build", Integer.toString(v2));
        return d0.o();
    }

    public static URL b(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new IllegalArgumentException("Invalid url: " + s, malformedURLException0);
        }
    }
}

