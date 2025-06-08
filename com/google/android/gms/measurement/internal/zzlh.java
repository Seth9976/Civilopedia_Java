package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzpi;
import i1.c0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class zzlh extends c0 {
    public static boolean A(String s) [...] // Potential decryptor

    public final byte[] B(byte[] arr_b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            gZIPOutputStream0.write(arr_b);
            gZIPOutputStream0.close();
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            this.a.zzay().zzd().zzb("Failed to gzip content", iOException0);
            throw iOException0;
        }
    }

    public static final void C(zzfr zzfr0, String s, Long long0) {
        List list0 = zzfr0.zzp();
        int v;
        for(v = 0; true; ++v) {
            if(v >= list0.size()) {
                v = -1;
                break;
            }
            if(s.equals("")) {
                break;
            }
        }
        zzfv zzfv0 = zzfw.zze();
        zzfv0.zzj(s);
        if(long0 instanceof Long) {
            zzfv0.zzi(((long)long0));
        }
        if(v >= 0) {
            zzfr0.zzj(v, zzfv0);
            return;
        }
        zzfr0.zze(zzfv0);
    }

    @Override  // i1.c0
    public final void b() {
    }

    public static final zzfw c(zzfs zzfs0, String s) {
        for(Object object0: zzfs0.zzi()) {
            zzfw zzfw0 = (zzfw)object0;
            if("".equals(s)) {
                return zzfw0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final Serializable d(zzfs zzfs0, String s) {
        zzfw zzfw0 = zzlh.c(zzfs0, s);
        if(zzfw0 != null) {
            if(zzfw0.zzy()) {
                return "";
            }
            if(zzfw0.zzw()) {
                return zzfw0.zzd();
            }
            if(zzfw0.zzu()) {
                return zzfw0.zza();
            }
            if(zzfw0.zzc() > 0) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: zzfw0.zzi()) {
                    zzfw zzfw1 = (zzfw)object0;
                    if(zzfw1 != null) {
                        Bundle bundle0 = new Bundle();
                        for(Object object1: zzfw1.zzi()) {
                            zzfw zzfw2 = (zzfw)object1;
                            if(zzfw2.zzy()) {
                                bundle0.putString("", "");
                            }
                            else if(zzfw2.zzw()) {
                                bundle0.putLong("", zzfw2.zzd());
                            }
                            else if(zzfw2.zzu()) {
                                bundle0.putDouble("", zzfw2.zza());
                            }
                        }
                        if(!bundle0.isEmpty()) {
                            arrayList0.add(bundle0);
                        }
                    }
                }
                return (Bundle[])arrayList0.toArray(new Bundle[arrayList0.size()]);
            }
        }
        return null;
    }

    public final void e(StringBuilder stringBuilder0, int v, List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            zzfw zzfw0 = (zzfw)object0;
            if(zzfw0 != null) {
                zzlh.g(v + 1, stringBuilder0);
                stringBuilder0.append("param {\n");
                Double double0 = null;
                zzlh.j(stringBuilder0, v + 1, "name", (zzfw0.zzx() ? this.a.zzj().e("") : null));
                zzlh.j(stringBuilder0, v + 1, "string_value", (zzfw0.zzy() ? "" : null));
                zzlh.j(stringBuilder0, v + 1, "int_value", (zzfw0.zzw() ? zzfw0.zzd() : null));
                if(zzfw0.zzu()) {
                    double0 = zzfw0.zza();
                }
                zzlh.j(stringBuilder0, v + 1, "double_value", double0);
                if(zzfw0.zzc() > 0) {
                    this.e(stringBuilder0, v + 1, zzfw0.zzi());
                }
                zzlh.g(v + 1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
    }

    public final void f(StringBuilder stringBuilder0, int v, zzel zzel0) {
        String s;
        if(zzel0 == null) {
            return;
        }
        zzlh.g(v, stringBuilder0);
        stringBuilder0.append("filter {\n");
        if(zzel0.zzh()) {
            zzlh.j(stringBuilder0, v, "complement", Boolean.valueOf(zzel0.zzg()));
        }
        if(zzel0.zzj()) {
            zzlh.j(stringBuilder0, v, "param_name", this.a.zzj().e(""));
        }
        if(zzel0.zzk()) {
            zzex zzex0 = zzel0.zzd();
            if(zzex0 != null) {
                zzlh.g(v + 1, stringBuilder0);
                stringBuilder0.append("string_filter {\n");
                if(zzex0.zzi()) {
                    switch(zzex0.zzj()) {
                        case 1: {
                            s = "UNKNOWN_MATCH_TYPE";
                            break;
                        }
                        case 2: {
                            s = "REGEXP";
                            break;
                        }
                        case 3: {
                            s = "BEGINS_WITH";
                            break;
                        }
                        case 4: {
                            s = "ENDS_WITH";
                            break;
                        }
                        case 5: {
                            s = "PARTIAL";
                            break;
                        }
                        case 6: {
                            s = "EXACT";
                            break;
                        }
                        default: {
                            s = "IN_LIST";
                        }
                    }
                    zzlh.j(stringBuilder0, v + 1, "match_type", s);
                }
                if(zzex0.zzh()) {
                    zzlh.j(stringBuilder0, v + 1, "expression", "");
                }
                if(zzex0.zzg()) {
                    zzlh.j(stringBuilder0, v + 1, "case_sensitive", Boolean.valueOf(zzex0.zzf()));
                }
                if(zzex0.zza() > 0) {
                    zzlh.g(v + 2, stringBuilder0);
                    stringBuilder0.append("expression_list {\n");
                    for(Object object0: zzex0.zze()) {
                        zzlh.g(v + 3, stringBuilder0);
                        stringBuilder0.append(((String)object0));
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append("}\n");
                }
                zzlh.g(v + 1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
        if(zzel0.zzi()) {
            zzlh.k(stringBuilder0, v + 1, "number_filter", zzel0.zzc());
        }
        zzlh.g(v, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static final void g(int v, StringBuilder stringBuilder0) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
    }

    public static final String h(boolean z, boolean z1, boolean z2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append("Dynamic ");
        }
        if(z1) {
            stringBuilder0.append("Sequence ");
        }
        if(z2) {
            stringBuilder0.append("Session-Scoped ");
        }
        return stringBuilder0.toString();
    }

    public static final void i(StringBuilder stringBuilder0, String s, zzgh zzgh0) {
        if(zzgh0 == null) {
            return;
        }
        zzlh.g(3, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzgh0.zzb() != 0) {
            zzlh.g(4, stringBuilder0);
            stringBuilder0.append("results: ");
            int v = 0;
            for(Object object0: zzgh0.zzk()) {
                if(v != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object0));
                ++v;
            }
            stringBuilder0.append('\n');
        }
        if(zzgh0.zzd() != 0) {
            zzlh.g(4, stringBuilder0);
            stringBuilder0.append("status: ");
            int v1 = 0;
            for(Object object1: zzgh0.zzn()) {
                if(v1 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object1));
                ++v1;
            }
            stringBuilder0.append('\n');
        }
        if(zzgh0.zza() != 0) {
            zzlh.g(4, stringBuilder0);
            stringBuilder0.append("dynamic_filter_timestamps: {");
            int v2 = 0;
            for(Object object2: zzgh0.zzj()) {
                zzfq zzfq0 = (zzfq)object2;
                if(v2 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzfq0.zzh() ? zzfq0.zza() : null));
                stringBuilder0.append(":");
                stringBuilder0.append((zzfq0.zzg() ? zzfq0.zzb() : null));
                ++v2;
            }
            stringBuilder0.append("}\n");
        }
        if(zzgh0.zzc() != 0) {
            zzlh.g(4, stringBuilder0);
            stringBuilder0.append("sequence_filter_timestamps: {");
            int v3 = 0;
            for(Object object3: zzgh0.zzm()) {
                zzgj zzgj0 = (zzgj)object3;
                if(v3 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append((zzgj0.zzi() ? zzgj0.zzb() : null));
                stringBuilder0.append(": [");
                int v4 = 0;
                for(Object object4: zzgj0.zzf()) {
                    long v5 = (long)(((Long)object4));
                    if(v4 != 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(v5);
                    ++v4;
                }
                stringBuilder0.append("]");
                ++v3;
            }
            stringBuilder0.append("}\n");
        }
        zzlh.g(3, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static final void j(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 == null) {
            return;
        }
        zzlh.g(v + 1, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
        stringBuilder0.append('\n');
    }

    public static final void k(StringBuilder stringBuilder0, int v, String s, zzeq zzeq0) {
        String s1;
        if(zzeq0 == null) {
            return;
        }
        zzlh.g(v, stringBuilder0);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(zzeq0.zzg()) {
            switch(zzeq0.zzm()) {
                case 1: {
                    s1 = "UNKNOWN_COMPARISON_TYPE";
                    break;
                }
                case 2: {
                    s1 = "LESS_THAN";
                    break;
                }
                case 3: {
                    s1 = "GREATER_THAN";
                    break;
                }
                case 4: {
                    s1 = "EQUAL";
                    break;
                }
                default: {
                    s1 = "BETWEEN";
                }
            }
            zzlh.j(stringBuilder0, v, "comparison_type", s1);
        }
        if(zzeq0.zzi()) {
            zzlh.j(stringBuilder0, v, "match_as_float", Boolean.valueOf(zzeq0.zzf()));
        }
        if(zzeq0.zzh()) {
            zzlh.j(stringBuilder0, v, "comparison_value", "");
        }
        if(zzeq0.zzk()) {
            zzlh.j(stringBuilder0, v, "min_comparison_value", "");
        }
        if(zzeq0.zzj()) {
            zzlh.j(stringBuilder0, v, "max_comparison_value", "");
        }
        zzlh.g(v, stringBuilder0);
        stringBuilder0.append("}\n");
    }

    public static int l(zzgb zzgb0, String s) {
        for(int v = 0; v < zzgb0.zzb(); ++v) {
            if(s.equals("")) {
                return v;
            }
        }
        return -1;
    }

    public final long m(byte[] arr_b) {
        Preconditions.checkNotNull(arr_b);
        zzge zzge0 = this.a;
        zzge0.zzv().zzg();
        MessageDigest messageDigest0 = zzln.f();
        if(messageDigest0 == null) {
            u9.o(zzge0, "Failed to get MD5");
            return 0L;
        }
        return zzln.N(messageDigest0.digest(arr_b));
    }

    public final Bundle n(Map map0, boolean z) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 == null) {
                bundle0.putString(s, null);
            }
            else if(object1 instanceof Long) {
                bundle0.putLong(s, ((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                bundle0.putDouble(s, ((double)(((Double)object1))));
            }
            else if(!(object1 instanceof ArrayList)) {
                bundle0.putString(s, object1.toString());
            }
            else if(z) {
                zzow.zzc();
                if(this.a.zzf().zzs(null, zzeh.zzai)) {
                    ArrayList arrayList0 = (ArrayList)object1;
                    ArrayList arrayList1 = new ArrayList();
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        arrayList1.add(this.n(((Map)arrayList0.get(v1)), false));
                    }
                    bundle0.putParcelableArray(s, ((Parcelable[])arrayList1.toArray(new Parcelable[0])));
                }
                else {
                    ArrayList arrayList2 = (ArrayList)object1;
                    ArrayList arrayList3 = new ArrayList();
                    int v2 = arrayList2.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        arrayList3.add(this.n(((Map)arrayList2.get(v3)), false));
                    }
                    bundle0.putParcelableArrayList(s, arrayList3);
                }
            }
        }
        return bundle0;
    }

    public final Parcelable o(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            return (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        catch(ParseException unused_ex) {
            this.a.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        }
        finally {
            parcel0.recycle();
        }
    }

    public final zzaw p(zzaa zzaa0) {
        String s;
        Bundle bundle0 = this.n(zzaa0.zze(), true);
        if(bundle0.containsKey("_o")) {
            Object object0 = bundle0.get("_o");
            s = object0 == null ? "app" : object0.toString();
        }
        else {
            s = "app";
        }
        String s1 = zzhb.zzb(zzaa0.zzd());
        if(s1 == null) {
            s1 = zzaa0.zzd();
        }
        return new zzaw(s1, new zzau(bundle0), s, zzaa0.zza());
    }

    public final zzfs q(zzar zzar0) {
        zzfr zzfr0 = zzfs.zze();
        zzfr0.zzl(zzar0.e);
        zzau zzau0 = zzar0.f;
        for(Object object0: zzau0.i.keySet()) {
            zzfv zzfv0 = zzfw.zze();
            zzfv0.zzj(((String)object0));
            Object object1 = zzau0.i.get(((String)object0));
            Preconditions.checkNotNull(object1);
            Preconditions.checkNotNull(object1);
            zzfv0.zzg();
            zzfv0.zze();
            zzfv0.zzd();
            zzfv0.zzf();
            if(object1 instanceof String) {
                zzfv0.zzk(((String)object1));
            }
            else if(object1 instanceof Long) {
                zzfv0.zzi(((long)(((Long)object1))));
            }
            else if(object1 instanceof Double) {
                zzfv0.zzh(((double)(((Double)object1))));
            }
            else if(object1 instanceof Bundle[]) {
                Bundle[] arr_bundle = (Bundle[])object1;
                ArrayList arrayList0 = new ArrayList();
                int v = 0;
                while(v < arr_bundle.length) {
                    Bundle bundle0 = arr_bundle[v];
                    if(bundle0 != null) {
                        zzfv zzfv1 = zzfw.zze();
                        for(Object object2: bundle0.keySet()) {
                            zzfv zzfv2 = zzfw.zze();
                            zzfv2.zzj(((String)object2));
                            Object object3 = bundle0.get(((String)object2));
                            if(object3 instanceof Long) {
                                zzfv2.zzi(((long)(((Long)object3))));
                            }
                            else if(object3 instanceof String) {
                                zzfv2.zzk(((String)object3));
                            }
                            else {
                                if(!(object3 instanceof Double)) {
                                    continue;
                                }
                                zzfv2.zzh(((double)(((Double)object3))));
                            }
                            zzfv1.zzc(zzfv2);
                        }
                        if(zzfv1.zza() > 0) {
                            arrayList0.add(((zzfw)zzfv1.zzaE()));
                        }
                    }
                    ++v;
                }
                zzfv0.zzb(arrayList0);
            }
            else {
                this.a.zzay().zzd().zzb("Ignoring invalid (type) event param value", object1);
            }
            zzfr0.zze(zzfv0);
        }
        return (zzfs)zzfr0.zzaE();
    }

    public static zzlk r(zzka zzka0, byte[] arr_b) {
        zzjq zzjq0 = zzjq.zzb();
        return zzjq0 == null ? zzka0.zzaz(arr_b) : zzka0.zzaA(arr_b, zzjq0);
    }

    public final String s(zzga zzga0) {
        if(zzga0 == null) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nbatch {\n");
        for(Object object0: zzga0.zzd()) {
            zzgc zzgc0 = (zzgc)object0;
            if(zzgc0 != null) {
                zzlh.g(1, stringBuilder0);
                stringBuilder0.append("bundle {\n");
                if(zzgc0.zzbj()) {
                    zzlh.j(stringBuilder0, 1, "protocol_version", zzgc0.zzd());
                }
                zzpi.zzc();
                zzge zzge0 = this.a;
                if(zzge0.zzf().zzs(null, zzeh.zzay) && zzgc0.zzbm()) {
                    zzlh.j(stringBuilder0, 1, "session_stitching_token", "");
                }
                zzlh.j(stringBuilder0, 1, "platform", "");
                if(zzgc0.zzbf()) {
                    zzlh.j(stringBuilder0, 1, "gmp_version", zzgc0.zzm());
                }
                if(zzgc0.zzbq()) {
                    zzlh.j(stringBuilder0, 1, "uploading_gmp_version", zzgc0.zzr());
                }
                if(zzgc0.zzbd()) {
                    zzlh.j(stringBuilder0, 1, "dynamite_version", zzgc0.zzj());
                }
                if(zzgc0.zzba()) {
                    zzlh.j(stringBuilder0, 1, "config_version", zzgc0.zzh());
                }
                zzlh.j(stringBuilder0, 1, "gmp_app_id", "");
                zzlh.j(stringBuilder0, 1, "admob_app_id", "");
                zzlh.j(stringBuilder0, 1, "app_id", "");
                zzlh.j(stringBuilder0, 1, "app_version", "");
                if(zzgc0.zzaY()) {
                    zzlh.j(stringBuilder0, 1, "app_version_major", zzgc0.zza());
                }
                zzlh.j(stringBuilder0, 1, "firebase_instance_id", "");
                if(zzgc0.zzbc()) {
                    zzlh.j(stringBuilder0, 1, "dev_cert_hash", zzgc0.zzi());
                }
                zzlh.j(stringBuilder0, 1, "app_store", "");
                if(zzgc0.zzbp()) {
                    zzlh.j(stringBuilder0, 1, "upload_timestamp_millis", zzgc0.zzq());
                }
                if(zzgc0.zzbn()) {
                    zzlh.j(stringBuilder0, 1, "start_timestamp_millis", zzgc0.zzp());
                }
                if(zzgc0.zzbe()) {
                    zzlh.j(stringBuilder0, 1, "end_timestamp_millis", zzgc0.zzk());
                }
                if(zzgc0.zzbi()) {
                    zzlh.j(stringBuilder0, 1, "previous_bundle_start_timestamp_millis", zzgc0.zzo());
                }
                if(zzgc0.zzbh()) {
                    zzlh.j(stringBuilder0, 1, "previous_bundle_end_timestamp_millis", zzgc0.zzn());
                }
                zzlh.j(stringBuilder0, 1, "app_instance_id", "");
                zzlh.j(stringBuilder0, 1, "resettable_device_id", "");
                zzlh.j(stringBuilder0, 1, "ds_id", "");
                if(zzgc0.zzbg()) {
                    zzlh.j(stringBuilder0, 1, "limited_ad_tracking", Boolean.valueOf(zzgc0.zzaW()));
                }
                zzlh.j(stringBuilder0, 1, "os_version", "");
                zzlh.j(stringBuilder0, 1, "device_model", "");
                zzlh.j(stringBuilder0, 1, "user_default_language", "");
                if(zzgc0.zzbo()) {
                    zzlh.j(stringBuilder0, 1, "time_zone_offset_minutes", zzgc0.zzf());
                }
                if(zzgc0.zzaZ()) {
                    zzlh.j(stringBuilder0, 1, "bundle_sequential_index", zzgc0.zzb());
                }
                if(zzgc0.zzbl()) {
                    zzlh.j(stringBuilder0, 1, "service_upload", Boolean.valueOf(zzgc0.zzaX()));
                }
                zzlh.j(stringBuilder0, 1, "health_monitor", "");
                if(zzgc0.zzbk()) {
                    zzlh.j(stringBuilder0, 1, "retry_counter", zzgc0.zze());
                }
                if(zzgc0.zzbb()) {
                    zzlh.j(stringBuilder0, 1, "consent_signals", "");
                }
                List list0 = zzgc0.zzO();
                if(list0 != null) {
                    for(Object object1: list0) {
                        zzgl zzgl0 = (zzgl)object1;
                        if(zzgl0 != null) {
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("user_property {\n");
                            zzlh.j(stringBuilder0, 2, "set_timestamp_millis", (zzgl0.zzs() ? zzgl0.zzc() : null));
                            zzlh.j(stringBuilder0, 2, "name", zzge0.zzj().f(""));
                            zzlh.j(stringBuilder0, 2, "string_value", "");
                            zzlh.j(stringBuilder0, 2, "int_value", (zzgl0.zzr() ? zzgl0.zzb() : null));
                            zzlh.j(stringBuilder0, 2, "double_value", (zzgl0.zzq() ? zzgl0.zza() : null));
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list1 = zzgc0.zzM();
                if(list1 != null) {
                    for(Object object2: list1) {
                        zzfo zzfo0 = (zzfo)object2;
                        if(zzfo0 != null) {
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("audience_membership {\n");
                            if(zzfo0.zzk()) {
                                zzlh.j(stringBuilder0, 2, "audience_id", zzfo0.zza());
                            }
                            if(zzfo0.zzm()) {
                                zzlh.j(stringBuilder0, 2, "new_audience", Boolean.valueOf(zzfo0.zzj()));
                            }
                            zzlh.i(stringBuilder0, "current_data", zzfo0.zzd());
                            if(zzfo0.zzn()) {
                                zzlh.i(stringBuilder0, "previous_data", zzfo0.zze());
                            }
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                List list2 = zzgc0.zzN();
                if(list2 != null) {
                    for(Object object3: list2) {
                        zzfs zzfs0 = (zzfs)object3;
                        if(zzfs0 != null) {
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("event {\n");
                            zzlh.j(stringBuilder0, 2, "name", zzge0.zzj().d(""));
                            if(zzfs0.zzu()) {
                                zzlh.j(stringBuilder0, 2, "timestamp_millis", zzfs0.zzd());
                            }
                            if(zzfs0.zzt()) {
                                zzlh.j(stringBuilder0, 2, "previous_timestamp_millis", zzfs0.zzc());
                            }
                            if(zzfs0.zzs()) {
                                zzlh.j(stringBuilder0, 2, "count", zzfs0.zza());
                            }
                            if(zzfs0.zzb() != 0) {
                                this.e(stringBuilder0, 2, zzfs0.zzi());
                            }
                            zzlh.g(2, stringBuilder0);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                zzlh.g(1, stringBuilder0);
                stringBuilder0.append("}\n");
            }
        }
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    public final String t(zzes zzes0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nproperty_filter {\n");
        if(zzes0.zzj()) {
            zzlh.j(stringBuilder0, 0, "filter_id", zzes0.zza());
        }
        zzlh.j(stringBuilder0, 0, "property_name", this.a.zzj().f(""));
        String s = zzlh.h(zzes0.zzg(), zzes0.zzh(), zzes0.zzi());
        if(!s.isEmpty()) {
            zzlh.j(stringBuilder0, 0, "filter_type", s);
        }
        this.f(stringBuilder0, 1, zzes0.zzb());
        stringBuilder0.append("}\n");
        return stringBuilder0.toString();
    }

    public final List u(List list0, List list1) {
        int v3;
        ArrayList arrayList0 = new ArrayList(list0);
        for(Object object0: list1) {
            Integer integer0 = (Integer)object0;
            zzge zzge0 = this.a;
            if(((int)integer0) < 0) {
                zzge0.zzay().zzk().zzb("Ignoring negative bit index to be cleared", integer0);
            }
            else {
                int v = ((int)integer0) / 0x40;
                if(v >= arrayList0.size()) {
                    zzge0.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", integer0, arrayList0.size());
                }
                else {
                    arrayList0.set(v, ((long)(((long)(((Long)arrayList0.get(v)))) & ~(1L << ((int)integer0) % 0x40))));
                }
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = arrayList0.size() - 1; true; v2 = v1 - 1) {
            v3 = v1;
            v1 = v2;
            if(v1 < 0 || ((long)(((Long)arrayList0.get(v1)))) != 0L) {
                break;
            }
        }
        return arrayList0.subList(0, v3);
    }

    public static ArrayList v(BitSet bitSet0) {
        int v = (bitSet0.length() + 0x3F) / 0x40;
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = 0L;
            for(int v3 = 0; v3 < 0x40; ++v3) {
                int v4 = v1 * 0x40 + v3;
                if(v4 >= bitSet0.length()) {
                    break;
                }
                if(bitSet0.get(v4)) {
                    v2 |= 1L << v3;
                }
            }
            arrayList0.add(v2);
        }
        return arrayList0;
    }

    public final HashMap w(Bundle bundle0, boolean z) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            zzow.zzc();
            if(this.a.zzf().zzs(null, zzeh.zzai)) {
                if(!(object1 instanceof Parcelable[]) && !(object1 instanceof ArrayList) && !(object1 instanceof Bundle)) {
                    goto label_11;
                }
                else {
                    goto label_14;
                }
                goto label_10;
            }
            else {
            label_10:
                if(!(object1 instanceof Bundle[]) && !(object1 instanceof ArrayList) && !(object1 instanceof Bundle)) {
                label_11:
                    if(object1 == null) {
                        continue;
                    }
                    hashMap0.put(s, object1);
                    continue;
                }
            }
        label_14:
            if(z) {
                ArrayList arrayList0 = new ArrayList();
                if(object1 instanceof Parcelable[]) {
                    Parcelable[] arr_parcelable = (Parcelable[])object1;
                    for(int v = 0; v < arr_parcelable.length; ++v) {
                        Parcelable parcelable0 = arr_parcelable[v];
                        if(parcelable0 instanceof Bundle) {
                            arrayList0.add(this.w(((Bundle)parcelable0), false));
                        }
                    }
                }
                else if(object1 instanceof ArrayList) {
                    ArrayList arrayList1 = (ArrayList)object1;
                    int v1 = arrayList1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object2 = arrayList1.get(v2);
                        if(object2 instanceof Bundle) {
                            arrayList0.add(this.w(((Bundle)object2), false));
                        }
                    }
                }
                else if(object1 instanceof Bundle) {
                    arrayList0.add(this.w(((Bundle)object1), false));
                }
                hashMap0.put(s, arrayList0);
            }
        }
        return hashMap0;
    }

    public final void x(zzgk zzgk0, Object object0) {
        Preconditions.checkNotNull(object0);
        zzgk0.zzc();
        zzgk0.zzb();
        zzgk0.zza();
        if(object0 instanceof String) {
            zzgk0.zzh(((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            zzgk0.zze(((long)(((Long)object0))));
            return;
        }
        if(object0 instanceof Double) {
            zzgk0.zzd(((double)(((Double)object0))));
            return;
        }
        this.a.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", object0);
    }

    public static boolean y(int v, List list0) {
        return v < list0.size() * 0x40 && (1L << v % 0x40 & ((long)(((Long)list0.get(v / 0x40))))) != 0L;
    }

    public final boolean z(long v, long v1) {
        return v == 0L || v1 <= 0L || Math.abs(this.a.zzav().currentTimeMillis() - v) > v1;
    }
}

