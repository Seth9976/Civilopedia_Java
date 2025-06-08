package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class zzaoc {
    public final String[] a;
    public final zzany b;
    public static final String[] c;

    static {
        zzaoc.c = new String[]{"/aclk", "/pcs/click", "/dbm/clk"};
    }

    @Deprecated
    public zzaoc(zzany zzany0) {
        this.a = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.b = zzany0;
    }

    public final Uri a(String s, Uri uri0) {
        if(uri0 == null) {
            throw null;
        }
        else {
            try {
                try {
                    if(uri0.getHost().equals("ad.doubleclick.net")) {
                        goto label_2;
                    }
                }
                catch(NullPointerException unused_ex) {
                }
                goto label_11;
            label_2:
                if(uri0.toString().contains("dc_ms=")) {
                    throw new zzaod("Parameter already exists: dc_ms");
                }
                String s1 = uri0.toString();
                int v = s1.indexOf(";adurl");
                if(v != -1) {
                    return Uri.parse((s1.substring(0, v + 1) + "dc_ms=" + s + ";" + s1.substring(v + 1)));
                }
                String s2 = uri0.getEncodedPath();
                int v1 = s1.indexOf(s2);
                return Uri.parse((s1.substring(0, s2.length() + v1) + ";dc_ms=" + s + ";" + s1.substring(v1 + s2.length())));
            label_11:
                if(uri0.getQueryParameter("ms") != null) {
                    throw new zzaod("Query parameter already exists: ms");
                }
                String s3 = uri0.toString();
                int v2 = s3.indexOf("&adurl");
                if(v2 == -1) {
                    v2 = s3.indexOf("?adurl");
                }
                return v2 == -1 ? uri0.buildUpon().appendQueryParameter("ms", s).build() : Uri.parse((s3.substring(0, v2 + 1) + "ms=" + s + "&" + s3.substring(v2 + 1)));
            }
            catch(UnsupportedOperationException unused_ex) {
            }
        }
        throw new zzaod("Provided Uri is not in a valid state");
    }

    @Deprecated
    public final Uri zza(Uri uri0, Context context0, View view0, Activity activity0) throws zzaod {
        try {
            String s = uri0.getQueryParameter("ai");
            return this.a(this.b.zzf(context0, s, view0, activity0), uri0);
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new zzaod("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri0, Context context0) throws zzaod {
        return this.a(this.b.zzg(context0), uri0);
    }

    @Deprecated
    public final zzany zzc() {
        return this.b;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent0) {
        this.b.zzk(motionEvent0);
    }

    public final boolean zze(Uri uri0) {
        if(this.zzf(uri0)) {
            String[] arr_s = zzaoc.c;
            for(int v = 0; v < 3; ++v) {
                String s = arr_s[v];
                if(uri0.getPath().endsWith(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri0) {
        uri0.getClass();
        try {
            String s = uri0.getHost();
            String[] arr_s = this.a;
            for(int v = 0; v < 3; ++v) {
                if(s.endsWith(arr_s[v])) {
                    return true;
                }
            }
        }
        catch(NullPointerException unused_ex) {
        }
        return false;
    }
}

