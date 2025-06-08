package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcf;
import i1.B;
import i1.h0;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzln extends B {
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public Integer f;
    public static final String[] g;
    public static final String[] h;

    static {
        zzln.g = new String[]{"firebase_", "google_", "ga_"};
        zzln.h = new String[]{"_err"};
    }

    public zzln(zzge zzge0) {
        super(zzge0);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static boolean A(Context context0) {
        Preconditions.checkNotNull(context0);
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ActivityInfo activityInfo0 = packageManager0.getReceiverInfo(new ComponentName(context0, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if(activityInfo0 != null) {
                return activityInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public static boolean B(Context context0) {
        Preconditions.checkNotNull(context0);
        return Build.VERSION.SDK_INT < 24 ? zzln.I(context0, "com.google.android.gms.measurement.AppMeasurementService") : zzln.I(context0, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean C(String s, String s1, String s2, String s3) {
        boolean z = TextUtils.isEmpty(s);
        boolean z1 = TextUtils.isEmpty(s1);
        if(!z && !z1) {
            Preconditions.checkNotNull(s);
            return !s.equals(s1);
        }
        if(z && z1) {
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) ? !TextUtils.isEmpty(s3) : !s2.equals(s3);
        }
        return z || !TextUtils.isEmpty(s3) ? TextUtils.isEmpty(s2) || !s2.equals(s3) : false;
    }

    public static byte[] D(Parcelable parcelable0) {
        if(parcelable0 == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcelable0.writeToParcel(parcel0, 0);
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    public static final boolean E(int v, Bundle bundle0) {
        if(bundle0.getLong("_err") == 0L) {
            bundle0.putLong("_err", ((long)v));
            return true;
        }
        return false;
    }

    public final int F(String s) {
        if("_ldl".equals(s)) {
            return 0x800;
        }
        if("_id".equals(s)) {
            return 0x100;
        }
        return "_lgclid".equals(s) ? 100 : 36;
    }

    public final Object G(int v, Object object0, boolean z, boolean z1) {
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Double)) {
            if(object0 instanceof Integer) {
                return (long)(((int)(((Integer)object0))));
            }
            if(object0 instanceof Byte) {
                return (long)(((byte)(((Byte)object0))));
            }
            if(object0 instanceof Short) {
                return (long)(((short)(((Short)object0))));
            }
            if(object0 instanceof Boolean) {
                return ((Boolean)object0).booleanValue() ? 1L : 0L;
            }
            if(object0 instanceof Float) {
                return ((Float)object0).doubleValue();
            }
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                if(z1 && (object0 instanceof Bundle[] || object0 instanceof Parcelable[])) {
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < ((Parcelable[])object0).length; ++v1) {
                        Parcelable parcelable0 = ((Parcelable[])object0)[v1];
                        if(parcelable0 instanceof Bundle) {
                            Bundle bundle0 = this.P(((Bundle)parcelable0));
                            if(!bundle0.isEmpty()) {
                                arrayList0.add(bundle0);
                            }
                        }
                    }
                    return arrayList0.toArray(new Bundle[arrayList0.size()]);
                }
                return null;
            }
            return this.zzD(object0.toString(), v, z);
        }
        return object0;
    }

    public static boolean H(String s, String[] arr_s) {
        Preconditions.checkNotNull(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            if(zzll.zza(s, arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(Context context0, String s) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                return false;
            }
            ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, s), 0);
            if(serviceInfo0 != null) {
                return serviceInfo0.enabled;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    // 去混淆评级： 低(40)
    public final int J(Object object0, String s) {
        return ("_ldl".equals(s) ? this.s("user property referrer", s, this.F(s), object0) : this.s("user property", s, this.F(s), object0)) ? 0 : 7;
    }

    public final int K(String s) {
        if(!this.t("event param", s)) {
            return 3;
        }
        if(!this.q("event param", null, null, s)) {
            return 14;
        }
        return this.p(40, "event param", s) ? 0 : 3;
    }

    public final int L(String s) {
        if(!this.u("event param", s)) {
            return 3;
        }
        if(!this.q("event param", null, null, s)) {
            return 14;
        }
        return this.p(40, "event param", s) ? 0 : 3;
    }

    public final int M(String s) {
        if(!this.t("user property", s)) {
            return 6;
        }
        if(!this.q("user property", zzhd.zza, null, s)) {
            return 15;
        }
        return this.p(24, "user property", s) ? 0 : 6;
    }

    public static long N(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        int v = 0;
        Preconditions.checkState(arr_b.length > 0);
        int v1 = arr_b.length - 1;
        long v2 = 0L;
        while(v1 >= 0 && v1 >= arr_b.length - 8) {
            v2 += (((long)arr_b[v1]) & 0xFFL) << v;
            v += 8;
            --v1;
        }
        return v2;
    }

    public final Bundle O(Uri uri0, boolean z, boolean z1) {
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        String s;
        if(uri0 != null) {
            try {
                if(uri0.isHierarchical()) {
                    s = uri0.getQueryParameter("utm_campaign");
                    s1 = uri0.getQueryParameter("utm_source");
                    s2 = uri0.getQueryParameter("utm_medium");
                    s3 = uri0.getQueryParameter("gclid");
                    if(z) {
                        s4 = uri0.getQueryParameter("utm_id");
                        s5 = uri0.getQueryParameter("dclid");
                    }
                    else {
                        s4 = null;
                        s5 = null;
                    }
                    s6 = z1 ? uri0.getQueryParameter("srsltid") : null;
                }
                else {
                    s = null;
                    s1 = null;
                    s2 = null;
                    s3 = null;
                    s4 = null;
                    s5 = null;
                    s6 = null;
                }
            }
            catch(UnsupportedOperationException unsupportedOperationException0) {
                this.a.zzay().zzk().zzb("Install referrer url isn\'t a hierarchical URI", unsupportedOperationException0);
                return null;
            }
            if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s3) && (!z || TextUtils.isEmpty(s4) && TextUtils.isEmpty(s5)) && (!z1 || TextUtils.isEmpty(s6))) {
                return null;
            }
            Bundle bundle0 = new Bundle();
            if(!TextUtils.isEmpty(s)) {
                bundle0.putString("campaign", s);
            }
            if(!TextUtils.isEmpty(s1)) {
                bundle0.putString("source", s1);
            }
            if(!TextUtils.isEmpty(s2)) {
                bundle0.putString("medium", s2);
            }
            if(!TextUtils.isEmpty(s3)) {
                bundle0.putString("gclid", s3);
            }
            String s7 = uri0.getQueryParameter("utm_term");
            if(!TextUtils.isEmpty(s7)) {
                bundle0.putString("term", s7);
            }
            String s8 = uri0.getQueryParameter("utm_content");
            if(!TextUtils.isEmpty(s8)) {
                bundle0.putString("content", s8);
            }
            String s9 = uri0.getQueryParameter("aclid");
            if(!TextUtils.isEmpty(s9)) {
                bundle0.putString("aclid", s9);
            }
            String s10 = uri0.getQueryParameter("cp1");
            if(!TextUtils.isEmpty(s10)) {
                bundle0.putString("cp1", s10);
            }
            String s11 = uri0.getQueryParameter("anid");
            if(!TextUtils.isEmpty(s11)) {
                bundle0.putString("anid", s11);
            }
            if(z) {
                if(!TextUtils.isEmpty(s4)) {
                    bundle0.putString("campaign_id", s4);
                }
                if(!TextUtils.isEmpty(s5)) {
                    bundle0.putString("dclid", s5);
                }
                String s12 = uri0.getQueryParameter("utm_source_platform");
                if(!TextUtils.isEmpty(s12)) {
                    bundle0.putString("source_platform", s12);
                }
                String s13 = uri0.getQueryParameter("utm_creative_format");
                if(!TextUtils.isEmpty(s13)) {
                    bundle0.putString("creative_format", s13);
                }
                String s14 = uri0.getQueryParameter("utm_marketing_tactic");
                if(!TextUtils.isEmpty(s14)) {
                    bundle0.putString("marketing_tactic", s14);
                }
            }
            if(z1 && !TextUtils.isEmpty(s6)) {
                bundle0.putString("srsltid", s6);
            }
            return bundle0;
        }
        return null;
    }

    public final Bundle P(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                Object object1 = this.d(bundle0.get(s), s);
                if(object1 == null) {
                    this.a.zzay().zzl().zzb("Param value can\'t be null", this.a.zzj().e(s));
                }
                else {
                    this.m(bundle1, s, object1);
                }
            }
        }
        return bundle1;
    }

    public final Bundle Q(String s, Bundle bundle0, List list0, boolean z) {
        String s2;
        int v4;
        int v2;
        boolean z1 = zzln.H(s, zzhb.zzd);
        if(bundle0 != null) {
            Bundle bundle1 = new Bundle(bundle0);
            zzge zzge0 = this.a;
            int v = zzge0.zzf().zzc();
            int v1 = 0;
            for(Object object0: new TreeSet(bundle0.keySet())) {
                String s1 = (String)object0;
                if(list0 == null || !list0.contains(s1)) {
                    int v3 = z ? 0 : this.L(s1);
                    v2 = v3 == 0 ? this.K(s1) : v3;
                }
                else {
                    v2 = 0;
                }
                switch(v2) {
                    case 0: {
                        v4 = v;
                        int v5 = this.r(s, s1, bundle0.get(s1), bundle1, list0, z, z1);
                        if(v5 == 17) {
                            this.i(bundle1, 17, s1, Boolean.FALSE);
                        }
                        else if(v5 != 0 && !"_ev".equals(s1)) {
                            this.i(bundle1, v5, (v5 == 21 ? s : s1), bundle0.get(s1));
                            bundle1.remove(s1);
                            break;
                        }
                        if(zzln.z(s1)) {
                            if(v1 + 1 > v4) {
                                zzge0.zzay().zze().zzc("Event can\'t contain more than " + v4 + " params", zzge0.zzj().d(s), zzge0.zzj().b(bundle0));
                                zzln.E(5, bundle1);
                                bundle1.remove(s1);
                            }
                            ++v1;
                        }
                        break;
                    }
                    case 3: {
                        s2 = s1;
                        this.i(bundle1, v2, s1, s2);
                        bundle1.remove(s1);
                        v4 = v;
                        break;
                    }
                    default: {
                        s2 = null;
                        this.i(bundle1, v2, s1, s2);
                        bundle1.remove(s1);
                        v4 = v;
                        break;
                    }
                }
                v = v4;
            }
            return bundle1;
        }
        return null;
    }

    public final zzaw R(String s, Bundle bundle0, String s1, long v, boolean z) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(this.zzh(s) == 0) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle1.putString("_o", s1);
            Bundle bundle2 = this.Q(s, bundle1, CollectionUtils.listOf("_o"), true);
            if(z) {
                bundle2 = this.P(bundle2);
            }
            Preconditions.checkNotNull(bundle2);
            return new zzaw(s, new zzau(bundle2), s1, v);
        }
        this.a.zzay().zzd().zzb("Invalid conditional property event name", this.a.zzj().f(s));
        throw new IllegalArgumentException();
    }

    @Override  // i1.B
    public final void a() {
        this.zzg();
        SecureRandom secureRandom0 = new SecureRandom();
        long v = secureRandom0.nextLong();
        if(v == 0L) {
            v = secureRandom0.nextLong();
            if(v == 0L) {
                this.a.zzay().zzk().zza("Utils falling back to Random for random id");
            }
        }
        this.d.set(v);
    }

    @Override  // i1.B
    public final boolean b() {
        return true;
    }

    public final Object d(Object object0, String s) {
        if("_ev".equals(s)) {
            return this.G(0x100, object0, true, true);
        }
        return zzln.y(s) ? this.G(0x100, object0, false, true) : this.G(100, object0, false, true);
    }

    // 去混淆评级： 低(20)
    public final Object e(Object object0, String s) {
        return "_ldl".equals(s) ? this.G(this.F(s), object0, true, false) : this.G(this.F(s), object0, false, false);
    }

    public static MessageDigest f() {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }

    public final SecureRandom g() {
        this.zzg();
        if(this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void h(Bundle bundle0, long v) {
        long v1 = bundle0.getLong("_et");
        if(v1 == 0L) {
            v1 = 0L;
        }
        else {
            this.a.zzay().zzk().zzb("Params already contained engagement", v1);
        }
        bundle0.putLong("_et", v + v1);
    }

    public final void i(Bundle bundle0, int v, String s, Object object0) {
        if(zzln.E(v, bundle0)) {
            bundle0.putString("_ev", this.zzD(s, 40, true));
            if(object0 != null) {
                Preconditions.checkNotNull(bundle0);
                if(object0 instanceof String || object0 instanceof CharSequence) {
                    bundle0.putLong("_el", ((long)object0.toString().length()));
                }
            }
        }
    }

    public final void j(Bundle bundle0, Bundle bundle1) {
        if(bundle1 == null) {
            return;
        }
        for(Object object0: bundle1.keySet()) {
            String s = (String)object0;
            if(!bundle0.containsKey(s)) {
                this.a.zzv().m(bundle0, s, bundle1.get(s));
            }
        }
    }

    public final void k(zzev zzev0, int v) {
        int v1 = 0;
        for(Object object0: new TreeSet(zzev0.zzd.keySet())) {
            String s = (String)object0;
            if(zzln.z(s)) {
                ++v1;
                if(v1 > v) {
                    this.a.zzay().zze().zzc("Event can\'t contain more than " + v + " params", this.a.zzj().d(zzev0.zza), this.a.zzj().b(zzev0.zzd));
                    zzln.E(5, zzev0.zzd);
                    zzev0.zzd.remove(s);
                }
            }
        }
    }

    public static void l(h0 h00, String s, int v, String s1, String s2, int v1) {
        Bundle bundle0 = new Bundle();
        zzln.E(v, bundle0);
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            bundle0.putString(s1, s2);
        }
        if(v == 2 || v == 6 || v == 7) {
            bundle0.putLong("_el", ((long)v1));
        }
        h00.zza(s, bundle0);
    }

    public final void m(Bundle bundle0, String s, Object object0) {
        if(bundle0 == null) {
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong(s, ((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof String) {
            bundle0.putString(s, String.valueOf(object0));
            return;
        }
        if(object0 instanceof Double) {
            bundle0.putDouble(s, ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Bundle[]) {
            bundle0.putParcelableArray(s, ((Bundle[])object0));
            return;
        }
        if(s != null) {
            String s1 = object0 == null ? null : object0.getClass().getSimpleName();
            this.a.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.a.zzj().e(s), s1);
        }
    }

    public final void n(String s, String s1, Bundle bundle0, List list0, boolean z) {
        String s3;
        String s4;
        int v3;
        int v1;
        if(bundle0 == null) {
            return;
        }
        zzge zzge0 = this.a;
        int v = 0;
        for(Object object0: new TreeSet(bundle0.keySet())) {
            String s2 = (String)object0;
            if(list0 == null || !list0.contains(s2)) {
                int v2 = z ? 0 : this.L(s2);
                v1 = v2 == 0 ? this.K(s2) : v2;
            }
            else {
                v1 = 0;
            }
            switch(v1) {
                case 0: {
                    if(zzln.w(bundle0.get(s2))) {
                        zzge0.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s, s1, s2);
                        v3 = 22;
                        s4 = s2;
                    }
                    else {
                        s4 = s2;
                        v3 = this.r(s, s2, bundle0.get(s2), bundle0, list0, z, false);
                    }
                    if(v3 == 0 || "_ev".equals(s4)) {
                        if(!zzln.z(s4) || zzln.H(s4, zzhc.zzd)) {
                            continue;
                        }
                        ++v;
                        if(v <= 0) {
                            continue;
                        }
                        zzge0.zzay().zze().zzc("Item cannot contain custom parameters", zzge0.zzj().d(s), zzge0.zzj().b(bundle0));
                        zzln.E(23, bundle0);
                    }
                    else {
                        this.i(bundle0, v3, s4, bundle0.get(s4));
                    }
                    bundle0.remove(s4);
                    continue;
                }
                case 3: {
                    s3 = s2;
                    break;
                }
                default: {
                    s3 = null;
                }
            }
            this.i(bundle0, v1, s2, s3);
            bundle0.remove(s2);
        }
    }

    public final boolean o(String s, String s1) {
        boolean z = TextUtils.isEmpty(s);
        zzge zzge0 = this.a;
        if(!z) {
            Preconditions.checkNotNull(s);
            if(s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if(zzge0.zzL()) {
                zzge0.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeu.d(s));
            }
            return false;
        }
        if(!TextUtils.isEmpty(s1)) {
            Preconditions.checkNotNull(s1);
            if(!s1.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                zzge0.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeu.d(s1));
                return false;
            }
            return true;
        }
        if(zzge0.zzL()) {
            zzge0.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    public final boolean p(int v, String s, String s1) {
        zzge zzge0 = this.a;
        if(s1 == null) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.codePointCount(0, s1.length()) > v) {
            zzge0.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", s, v, s1);
            return false;
        }
        return true;
    }

    public final boolean q(String s, String[] arr_s, String[] arr_s1, String s1) {
        zzge zzge0 = this.a;
        if(s1 == null) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        Preconditions.checkNotNull(s1);
        String[] arr_s2 = zzln.g;
        for(int v = 0; v < 3; ++v) {
            if(s1.startsWith(arr_s2[v])) {
                zzge0.zzay().zze().zzc("Name starts with reserved prefix. Type, name", s, s1);
                return false;
            }
        }
        if(arr_s != null && zzln.H(s1, arr_s) && (arr_s1 == null || !zzln.H(s1, arr_s1))) {
            zzge0.zzay().zze().zzc("Name is reserved. Type, name", s, s1);
            return false;
        }
        return true;
    }

    public final int r(String s, String s1, Object object0, Bundle bundle0, List list0, boolean z, boolean z1) {
        int v1;
        int v;
        this.zzg();
        zzge zzge0 = this.a;
        if(zzln.w(object0)) {
            if(!z1) {
                return 21;
            }
            if(!zzln.H(s1, zzhc.zzc)) {
                return 20;
            }
            zzjy zzjy0 = zzge0.zzt();
            zzjy0.zzg();
            zzjy0.zza();
            if(zzjy0.f() && zzjy0.a.zzv().zzm() < 200900) {
                return 25;
            }
            if(object0 instanceof Parcelable[]) {
                v = ((Parcelable[])object0).length;
                goto label_16;
            }
            else if(object0 instanceof ArrayList) {
                v = ((ArrayList)object0).size();
            label_16:
                if(v > 200) {
                    zzge0.zzay().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", s1, v);
                    if(!(object0 instanceof Parcelable[])) {
                        if(object0 instanceof ArrayList && ((ArrayList)object0).size() > 200) {
                            bundle0.putParcelableArrayList(s1, new ArrayList(((ArrayList)object0).subList(0, 200)));
                        }
                    }
                    else if(((Parcelable[])object0).length > 200) {
                        bundle0.putParcelableArray(s1, ((Parcelable[])Arrays.copyOf(((Parcelable[])object0), 200)));
                    }
                    v1 = 17;
                }
                else {
                    v1 = 0;
                }
            }
            else {
                v1 = 0;
            }
        }
        else {
            v1 = 0;
        }
        if(this.s("param", s1, (zzln.y(s) || zzln.y(s1) ? 0x100 : 100), object0)) {
            return v1;
        }
        if(z1) {
            if(object0 instanceof Bundle) {
                this.n(s, s1, ((Bundle)object0), list0, z);
                return v1;
            }
            if(object0 instanceof Parcelable[]) {
                for(int v2 = 0; v2 < ((Parcelable[])object0).length; ++v2) {
                    Parcelable parcelable0 = ((Parcelable[])object0)[v2];
                    if(!(parcelable0 instanceof Bundle)) {
                        zzge0.zzay().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable0.getClass(), s1);
                        return 4;
                    }
                    this.n(s, s1, ((Bundle)parcelable0), list0, z);
                }
                return v1;
            }
            if(object0 instanceof ArrayList) {
                int v3 = ((ArrayList)object0).size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object1 = ((ArrayList)object0).get(v4);
                    if(!(object1 instanceof Bundle)) {
                        zzes zzes0 = zzge0.zzay().zzl();
                        Class class0 = object1 == null ? "null" : object1.getClass();
                        zzes0.zzc("All ArrayList elements must be of type Bundle. Value type, name", class0, s1);
                        return 4;
                    }
                    this.n(s, s1, ((Bundle)object1), list0, z);
                }
                return v1;
            }
        }
        return 4;
    }

    public final boolean s(String s, String s1, int v, Object object0) {
        if(object0 == null) {
            return true;
        }
        if(!(object0 instanceof Long) && !(object0 instanceof Float) && !(object0 instanceof Integer) && !(object0 instanceof Byte) && !(object0 instanceof Short) && !(object0 instanceof Boolean) && !(object0 instanceof Double)) {
            if(!(object0 instanceof String) && !(object0 instanceof Character) && !(object0 instanceof CharSequence)) {
                return false;
            }
            String s2 = object0.toString();
            if(s2.codePointCount(0, s2.length()) > v) {
                this.a.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", s, s1, s2.length());
                return false;
            }
        }
        return true;
    }

    public final boolean t(String s, String s1) {
        zzge zzge0 = this.a;
        if(s1 == null) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            if(v == 0x5F) {
                v = 0x5F;
                goto label_14;
            }
            zzge0.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", s, s1);
            return false;
        }
    label_14:
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                zzge0.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    public final boolean u(String s, String s1) {
        zzge zzge0 = this.a;
        if(s1 == null) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be null. Type", s);
            return false;
        }
        if(s1.length() == 0) {
            zzge0.zzay().zze().zzb("Name is required and can\'t be empty. Type", s);
            return false;
        }
        int v = s1.codePointAt(0);
        if(!Character.isLetter(v)) {
            zzge0.zzay().zze().zzc("Name must start with a letter. Type, name", s, s1);
            return false;
        }
        int v1 = s1.length();
        for(int v2 = Character.charCount(v); v2 < v1; v2 += Character.charCount(v3)) {
            int v3 = s1.codePointAt(v2);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                zzge0.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", s, s1);
                return false;
            }
        }
        return true;
    }

    public final boolean v(String s) {
        this.zzg();
        zzge zzge0 = this.a;
        if(Wrappers.packageManager(zzge0.zzau()).checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        zzge0.zzay().zzc().zzb("Permission not granted", s);
        return false;
    }

    // 去混淆评级： 低(30)
    public static boolean w(Object object0) {
        return object0 instanceof Parcelable[] || object0 instanceof ArrayList || object0 instanceof Bundle;
    }

    public final boolean x(Context context0, String s) {
        zzge zzge0 = this.a;
        X500Principal x500Principal0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(s, 0x40);
            if(packageInfo0 != null) {
                Signature[] arr_signature = packageInfo0.signatures;
                if(arr_signature != null && arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature0.toByteArray()))).getSubjectX500Principal().equals(x500Principal0);
                }
            }
        }
        catch(CertificateException certificateException0) {
            zzge0.zzay().zzd().zzb("Error obtaining certificate", certificateException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzge0.zzay().zzd().zzb("Package name not found", packageManager$NameNotFoundException0);
        }
        return true;
    }

    // 去混淆评级： 低(20)
    public static boolean y(String s) {
        return !TextUtils.isEmpty(s) && s.startsWith("_");
    }

    public static boolean z(String s) {
        Preconditions.checkNotEmpty(s);
        return s.charAt(0) != 0x5F || s.equals("_ep");
    }

    public final String zzD(String s, int v, boolean z) {
        if(s == null) {
            return null;
        }
        if(s.codePointCount(0, s.length()) > v) {
            return z ? s.substring(0, s.offsetByCodePoints(0, v)) + "..." : null;
        }
        return s;
    }

    public final URL zzE(long v, String s, String s1, long v1) {
        zzge zzge0;
        try {
            zzge0 = this.a;
            Preconditions.checkNotEmpty(s1);
            Preconditions.checkNotEmpty(s);
            String s2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v68000." + this.zzm()) + "&rdid=" + s1 + "&bundleid=" + s + "&retry=" + v1;
            if(s.equals(zzge0.zzf().zzm())) {
                s2 = s2 + "&ddl_test=1";
            }
            return new URL(s2);
        }
        catch(MalformedURLException | IllegalArgumentException malformedURLException0) {
        }
        zzge0.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", malformedURLException0.getMessage());
        return null;
    }

    public static ArrayList zzH(List list0) {
        if(list0 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("app_id", ((zzac)object0).zza);
            bundle0.putString("origin", ((zzac)object0).zzb);
            bundle0.putLong("creation_timestamp", ((zzac)object0).zzd);
            bundle0.putString("name", ((zzac)object0).zzc.zzb);
            zzha.zzb(bundle0, Preconditions.checkNotNull(((zzac)object0).zzc.zza()));
            bundle0.putBoolean("active", ((zzac)object0).zze);
            String s = ((zzac)object0).zzf;
            if(s != null) {
                bundle0.putString("trigger_event_name", s);
            }
            zzaw zzaw0 = ((zzac)object0).zzg;
            if(zzaw0 != null) {
                bundle0.putString("timed_out_event_name", zzaw0.zza);
                zzau zzau0 = zzaw0.zzb;
                if(zzau0 != null) {
                    bundle0.putBundle("timed_out_event_params", zzau0.zzc());
                }
            }
            bundle0.putLong("trigger_timeout", ((zzac)object0).zzh);
            zzaw zzaw1 = ((zzac)object0).zzi;
            if(zzaw1 != null) {
                bundle0.putString("triggered_event_name", zzaw1.zza);
                zzau zzau1 = zzaw1.zzb;
                if(zzau1 != null) {
                    bundle0.putBundle("triggered_event_params", zzau1.zzc());
                }
            }
            bundle0.putLong("triggered_timestamp", ((zzac)object0).zzc.zzc);
            bundle0.putLong("time_to_live", ((zzac)object0).zzj);
            zzaw zzaw2 = ((zzac)object0).zzk;
            if(zzaw2 != null) {
                bundle0.putString("expired_event_name", zzaw2.zza);
                zzau zzau2 = zzaw2.zzb;
                if(zzau2 != null) {
                    bundle0.putBundle("expired_event_params", zzau2.zzc());
                }
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    public static void zzK(zziq zziq0, Bundle bundle0, boolean z) {
        if(bundle0 != null && zziq0 != null) {
            if(bundle0.containsKey("_sc") && !z) {
                z = false;
                goto label_16;
            }
            String s = zziq0.zza;
            if(s == null) {
                bundle0.remove("_sn");
            }
            else {
                bundle0.putString("_sn", s);
            }
            String s1 = zziq0.zzb;
            if(s1 == null) {
                bundle0.remove("_sc");
            }
            else {
                bundle0.putString("_sc", s1);
            }
            bundle0.putLong("_si", zziq0.zzc);
            return;
        }
    label_16:
        if(bundle0 != null && zziq0 == null && z) {
            bundle0.remove("_sn");
            bundle0.remove("_sc");
            bundle0.remove("_si");
        }
    }

    public final void zzP(zzcf zzcf0, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("r", z);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning boolean value to wrapper", remoteException0);
        }
    }

    public final void zzQ(zzcf zzcf0, ArrayList arrayList0) {
        Bundle bundle0 = new Bundle();
        bundle0.putParcelableArrayList("r", arrayList0);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning bundle list to wrapper", remoteException0);
        }
    }

    public final void zzR(zzcf zzcf0, Bundle bundle0) {
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning bundle value to wrapper", remoteException0);
        }
    }

    public final void zzS(zzcf zzcf0, byte[] arr_b) {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("r", arr_b);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning byte array to wrapper", remoteException0);
        }
    }

    public final void zzT(zzcf zzcf0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("r", v);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning int value to wrapper", remoteException0);
        }
    }

    public final void zzU(zzcf zzcf0, long v) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("r", v);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning long value to wrapper", remoteException0);
        }
    }

    public final void zzV(zzcf zzcf0, String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("r", s);
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning string value to wrapper", remoteException0);
        }
    }

    public static boolean zzal(String s) {
        return !zzln.h[0].equals(s);
    }

    public final int zzh(String s) {
        if(!this.t("event", s)) {
            return 2;
        }
        if(!this.q("event", zzhb.zza, zzhb.zzb, s)) {
            return 13;
        }
        return this.p(40, "event", s) ? 0 : 2;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if(this.f == null) {
            this.f = (int)(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.a.zzau()) / 1000);
        }
        return (int)this.f;
    }

    public final int zzo(int v) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.a.zzau(), 12451000);
    }

    public final long zzq() {
        int v2;
        long v1;
        if(this.d.get() == 0L) {
            synchronized(this.d) {
                v1 = new Random(System.nanoTime() ^ this.a.zzav().currentTimeMillis()).nextLong();
                v2 = this.e + 1;
                this.e = v2;
            }
            return v1 + ((long)v2);
        }
        synchronized(this.d) {
            this.d.compareAndSet(-1L, 1L);
        }
        return this.d.getAndIncrement();
    }

    public final long zzr(long v, long v1) {
        return (v1 * 60000L + v) / 86400000L;
    }
}

