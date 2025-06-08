package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;

public final class zzfie {
    public final zzeiq a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final zzfby f;
    public final Clock g;
    public final zzaoc h;

    public zzfie(zzeiq zzeiq0, zzcfo zzcfo0, String s, String s1, Context context0, zzfby zzfby0, Clock clock0, zzaoc zzaoc0) {
        this.a = zzeiq0;
        this.b = zzcfo0.zza;
        this.c = s;
        this.d = s1;
        this.e = context0;
        this.f = zzfby0;
        this.g = clock0;
        this.h = zzaoc0;
    }

    public static String a(String s, String s1, String s2) {
        if(TextUtils.isEmpty(s2)) {
            s2 = "";
        }
        return s.replaceAll(s1, s2);
    }

    public final List zza(zzfbx zzfbx0, zzfbl zzfbl0, List list0) {
        return this.zzb(zzfbx0, zzfbl0, false, "", "", list0);
    }

    // This method was un-flattened
    public final List zzb(zzfbx zzfbx0, zzfbl zzfbl0, boolean z, String s, String s1, List list0) {
        int v;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            String s2 = zzfie.a(zzfie.a(zzfie.a(((String)object0), "@gw_adlocid@", zzfbx0.zza.zza.zzf), "@gw_adnetrefresh@", (z ? "1" : "0")), "@gw_sdkver@", this.b);
            if(zzfbl0 != null) {
                s2 = zzcdp.zzc(zzfie.a(zzfie.a(zzfie.a(s2, "@gw_qdata@", zzfbl0.zzz), "@gw_adnetid@", zzfbl0.zzy), "@gw_allocid@", zzfbl0.zzx), this.e, zzfbl0.zzX);
            }
            boolean z1 = false;
            String s3 = zzfie.a(zzfie.a(zzfie.a(s2, "@gw_adnetstatus@", this.a.zzf()), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcF)).booleanValue() && !TextUtils.isEmpty(s)) {
                z1 = true;
                v = !TextUtils.isEmpty(s1);
                goto label_15;
            }
            else if(!TextUtils.isEmpty(s1)) {
                v = 1;
            label_15:
                Uri uri0 = Uri.parse(s3);
                if(this.h.zzf(uri0)) {
                    Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
                    if(z1) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("ms", s);
                    }
                    if(v != 0) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("attok", s1);
                    }
                    s3 = uri$Builder0.build().toString();
                }
            }
            ((ArrayList)list1).add(s3);
        }
        return list1;
    }

    public final List zzc(zzfbl zzfbl0, List list0, zzcal zzcal0) {
        String s4;
        zzfby zzfby0;
        String s3;
        String s2;
        String s1;
        String s;
        List list1 = new ArrayList();
        long v = this.g.currentTimeMillis();
        try {
            s = zzcal0.zzc();
            s1 = Integer.toString(zzcal0.zzb());
            s2 = "fakeForAdDebugLog";
            s3 = "";
            zzfby0 = this.f;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to determine award type and amount.", remoteException0);
            return list1;
        }
        if(zzfby0 == null) {
            s4 = "";
        }
        else {
            s4 = zzfby0.zza;
            if(!TextUtils.isEmpty(s4) && zzcfh.zzl()) {
                s4 = "fakeForAdDebugLog";
            }
        }
        if(zzfby0 != null) {
            String s5 = zzfby0.zzb;
            if(TextUtils.isEmpty(s5) || !zzcfh.zzl()) {
                s2 = s5;
            }
            s3 = s2;
        }
        for(Object object0: list0) {
            ((ArrayList)list1).add(zzcdp.zzc(zzfie.a(zzfie.a(zzfie.a(zzfie.a(zzfie.a(zzfie.a(((String)object0), "@gw_rwd_userid@", Uri.encode(s4)), "@gw_rwd_custom_data@", Uri.encode(s3)), "@gw_tmstmp@", Long.toString(v)), "@gw_rwd_itm@", Uri.encode(s)), "@gw_rwd_amt@", s1), "@gw_sdkver@", this.b), this.e, zzfbl0.zzX));
        }
        return list1;
    }

    public static final List zzd(int v, int v1, List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            ((ArrayList)list1).add(zzfie.a(((String)object0), "@gw_mpe@", "2." + v1));
        }
        return list1;
    }
}

