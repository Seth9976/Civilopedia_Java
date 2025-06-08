package i1;

import N.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzg;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzln;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;

public final class e extends c0 {
    public final d d;
    public final b e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;

    static {
        e.f = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        e.g = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        e.h = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
        e.i = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        e.j = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        e.k = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        e.l = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        e.m = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    }

    public e(zzlf zzlf0) {
        super(zzlf0);
        this.e = new b(this.a.zzav());
        this.d = new d(this, this.a.zzau());
    }

    public final List A(String s) {
        List list1;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.a();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.r().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    long v = cursor0.getLong(2);
                    Object object0 = this.x(cursor0, 3);
                    if(object0 == null) {
                        zzge0.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeu.d(s));
                    }
                    else {
                        ((ArrayList)list0).add(new g0(s, s2, s1, v, object0));
                    }
                }
                while(cursor0.moveToNext());
                goto label_29;
            }
            goto label_31;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                zzge0.zzay().zzd().zzc("Error querying user properties. appId", zzeu.d(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_24;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
        label_24:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_27:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_29:
        cursor0.close();
        return list0;
    label_31:
        cursor0.close();
        return list0;
    }

    public final List B(String s, String s1, String s2) {
        List list1;
        String s3;
        Cursor cursor0;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.a();
        List list0 = new ArrayList();
        try {
            ArrayList arrayList0 = new ArrayList(3);
            arrayList0.add(s);
            StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
            if(!TextUtils.isEmpty(s1)) {
                arrayList0.add(s1);
                stringBuilder0.append(" and origin=?");
            }
            if(!TextUtils.isEmpty(s2)) {
                arrayList0.add(s2 + "*");
                stringBuilder0.append(" and name glob ?");
            }
            Object[] arr_object = arrayList0.toArray(new String[arrayList0.size()]);
            cursor0 = this.r().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arr_object), null, null, "rowid", "1001");
            goto label_24;
        label_20:
            s3 = s1;
            cursor0 = null;
            goto label_46;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
        try {
        label_24:
            if(!cursor0.moveToFirst()) {
                goto label_29;
            }
            goto label_31;
        }
        catch(SQLiteException sQLiteException0) {
            s3 = s1;
            goto label_46;
        label_29:
            cursor0.close();
            return list0;
        label_31:
            s3 = s1;
            try {
                while(true) {
                    if(((ArrayList)list0).size() >= 1000) {
                        goto label_43;
                    }
                    String s4 = cursor0.getString(0);
                    long v = cursor0.getLong(1);
                    Object object0 = this.x(cursor0, 2);
                    s3 = cursor0.getString(3);
                    if(object0 == null) {
                        zzge0.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeu.d(s), s3, s2);
                    }
                    else {
                        ((ArrayList)list0).add(new g0(s, s3, s4, v, object0));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            catch(SQLiteException sQLiteException0) {
                goto label_46;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
            goto label_54;
            try {
                try {
                label_43:
                    zzge0.zzay().zzd().zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                    goto label_54;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_46:
                zzge0.zzay().zzd().zzd("(2)Error querying user properties", zzeu.d(s), s3, sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_49;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
        label_49:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_52:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_54:
        cursor0.close();
        return list0;
    }

    public final void C() {
        this.a();
        this.r().endTransaction();
    }

    public final void D(List list0) {
        this.zzg();
        this.a();
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotZero(list0.size());
        if(!this.g()) {
            return;
        }
        String s = i3.e.f("(", TextUtils.join(",", list0), ")");
        long v = this.m("SELECT COUNT(1) FROM queue WHERE rowid IN " + s + " AND retry_count =  2147483647 LIMIT 1", null);
        zzge zzge0 = this.a;
        if(v > 0L) {
            zzge0.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.r().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + s + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzb("Error incrementing retry count. error", sQLiteException0);
        }
    }

    @Override  // i1.c0
    public final void b() {
    }

    public final void c(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.a();
        try {
            this.r().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.a.zzay().zzd().zzd("Error deleting user property. appId", zzeu.d(s), this.a.zzj().f(s1), sQLiteException0);
        }
    }

    public final void d() {
        this.a();
        this.r().setTransactionSuccessful();
    }

    public final void e(D d0) {
        Preconditions.checkNotNull(d0);
        this.zzg();
        this.a();
        String s = d0.w();
        Preconditions.checkNotNull(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("app_instance_id", d0.x());
        contentValues0.put("gmp_app_id", d0.A());
        zzge zzge0 = d0.a;
        zzge0.zzaz().zzg();
        contentValues0.put("resettable_device_id_hash", d0.e);
        zzge0.zzaz().zzg();
        contentValues0.put("last_bundle_index", d0.g);
        zzge0.zzaz().zzg();
        contentValues0.put("last_bundle_start_timestamp", d0.h);
        zzge0.zzaz().zzg();
        contentValues0.put("last_bundle_end_timestamp", d0.i);
        contentValues0.put("app_version", d0.y());
        zzge0.zzaz().zzg();
        contentValues0.put("app_store", d0.l);
        zzge0.zzaz().zzg();
        contentValues0.put("gmp_version", d0.m);
        zzge0.zzaz().zzg();
        contentValues0.put("dev_cert_hash", d0.n);
        zzge0.zzaz().zzg();
        contentValues0.put("measurement_enabled", Boolean.valueOf(d0.o));
        zzge0.zzaz().zzg();
        contentValues0.put("day", d0.v);
        zzge0.zzaz().zzg();
        contentValues0.put("daily_public_events_count", d0.w);
        zzge0.zzaz().zzg();
        contentValues0.put("daily_events_count", d0.x);
        zzge0.zzaz().zzg();
        contentValues0.put("daily_conversions_count", d0.y);
        zzge0.zzaz().zzg();
        contentValues0.put("config_fetched_time", d0.D);
        zzge0.zzaz().zzg();
        contentValues0.put("failed_config_fetch_time", d0.E);
        contentValues0.put("app_version_int", d0.t());
        contentValues0.put("firebase_instance_id", d0.z());
        zzge0.zzaz().zzg();
        contentValues0.put("daily_error_events_count", d0.z);
        zzge0.zzaz().zzg();
        contentValues0.put("daily_realtime_events_count", d0.A);
        zzge0.zzaz().zzg();
        contentValues0.put("health_monitor_sample", d0.B);
        zzge0.zzaz().zzg();
        contentValues0.put("android_id", 0L);
        zzge0.zzaz().zzg();
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(d0.p));
        contentValues0.put("admob_app_id", d0.u());
        zzge0.zzaz().zzg();
        contentValues0.put("dynamite_version", d0.s);
        zzge0.zzaz().zzg();
        contentValues0.put("session_stitching_token", d0.u);
        zzge0.zzaz().zzg();
        ArrayList arrayList0 = d0.t;
        zzge zzge1 = this.a;
        if(arrayList0 != null) {
            if(arrayList0.isEmpty()) {
                zzge1.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", s);
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", arrayList0));
            }
        }
        zzny.zzc();
        if(zzge1.zzf().zzs(null, zzeh.zzap) && !contentValues0.containsKey("safelisted_events")) {
            contentValues0.put("safelisted_events", null);
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.r();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                zzge1.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge1.zzay().zzd().zzc("Error storing app. appId", zzeu.d(s), sQLiteException0);
        }
    }

    public final void f(g g0) {
        zzge zzge0 = this.a;
        Preconditions.checkNotNull(g0);
        this.zzg();
        this.a();
        ContentValues contentValues0 = new ContentValues();
        String s = g0.a;
        contentValues0.put("app_id", s);
        contentValues0.put("name", g0.b);
        contentValues0.put("lifetime_count", g0.c);
        contentValues0.put("current_bundle_count", g0.d);
        contentValues0.put("last_fire_timestamp", g0.f);
        contentValues0.put("last_bundled_timestamp", g0.g);
        contentValues0.put("last_bundled_day", g0.h);
        contentValues0.put("last_sampled_complex_event_id", g0.i);
        contentValues0.put("last_sampling_rate", g0.j);
        contentValues0.put("current_session_count", g0.e);
        contentValues0.put("last_exempt_from_sampling", (g0.k == null || !g0.k.booleanValue() ? null : 1L));
        try {
            if(this.r().insertWithOnConflict("events", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing event aggregates. appId", zzeu.d(s), sQLiteException0);
        }
    }

    public final boolean g() {
        return this.a.zzau().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void h(String s, Long long0, long v, zzfs zzfs0) {
        this.zzg();
        this.a();
        Preconditions.checkNotNull(zzfs0);
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(long0);
        byte[] arr_b = zzfs0.zzbv();
        zzge zzge0 = this.a;
        zzge0.zzay().zzj().zzc("Saving complex main event, appId, data size", zzge0.zzj().d(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", v);
        contentValues0.put("main_event", arr_b);
        try {
            if(this.r().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing complex main event. appId", zzeu.d(s), sQLiteException0);
        }
    }

    public final boolean i(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        this.zzg();
        this.a();
        String s = zzac0.zza;
        Preconditions.checkNotNull(s);
        g0 g00 = this.w(s, zzac0.zzc.zzb);
        zzge zzge0 = this.a;
        if(g00 == null && this.m("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", zzac0.zzb);
        contentValues0.put("name", zzac0.zzc.zzb);
        e.l(contentValues0, Preconditions.checkNotNull(zzac0.zzc.zza()));
        contentValues0.put("active", Boolean.valueOf(zzac0.zze));
        contentValues0.put("trigger_event_name", zzac0.zzf);
        contentValues0.put("trigger_timeout", zzac0.zzh);
        zzge0.zzv().getClass();
        contentValues0.put("timed_out_event", zzln.D(zzac0.zzg));
        contentValues0.put("creation_timestamp", zzac0.zzd);
        zzln zzln0 = zzge0.zzv();
        zzaw zzaw0 = zzac0.zzi;
        zzln0.getClass();
        contentValues0.put("triggered_event", zzln.D(zzaw0));
        contentValues0.put("triggered_timestamp", zzac0.zzc.zzc);
        contentValues0.put("time_to_live", zzac0.zzj);
        zzge0.zzv().getClass();
        contentValues0.put("expired_event", zzln.D(zzac0.zzk));
        try {
            if(this.r().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeu.d(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing conditional user property", zzeu.d(s), sQLiteException0);
        }
        return true;
    }

    public final boolean j(g0 g00) {
        Preconditions.checkNotNull(g00);
        this.zzg();
        this.a();
        String s = g00.a;
        String s1 = g00.c;
        g0 g01 = this.w(s, s1);
        zzge zzge0 = this.a;
        String s2 = g00.b;
        if(g01 == null) {
            if(zzln.z(s1)) {
                if(this.m("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}) >= ((long)zzge0.zzf().zzf(s, zzeh.zzF, 25, 100))) {
                    return false;
                }
            }
            else if(!"_npa".equals(s1) && this.m("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{s, s2}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", s2);
        contentValues0.put("name", s1);
        contentValues0.put("set_timestamp", g00.d);
        e.l(contentValues0, g00.e);
        try {
            if(this.r().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeu.d(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing user property. appId", zzeu.d(s), sQLiteException0);
        }
        return true;
    }

    public final void k(long v, long v1, e0 e00) {
        zzfr zzfr0;
        String[] arr_s2;
        String s3;
        zzgc zzgc0;
        String s2;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        String s1;
        zzge zzge0 = this.a;
        Preconditions.checkNotNull(e00);
        this.zzg();
        this.a();
        String s = null;
        try {
            s1 = "";
            sQLiteDatabase0 = this.r();
            if(TextUtils.isEmpty(null)) {
                int v2 = Long.compare(v1, -1L);
                String[] arr_s = v2 == 0 ? new String[]{String.valueOf(v)} : new String[]{String.valueOf(v1), String.valueOf(v)};
                if(v2 != 0) {
                    s1 = "rowid <= ? and ";
                }
                cursor0 = sQLiteDatabase0.rawQuery("select app_id, metadata_fingerprint from raw_events where " + s1 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", arr_s);
                goto label_13;
            }
            goto label_20;
        }
        catch(SQLiteException sQLiteException0) {
            cursor0 = null;
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_84;
        }
        try {
        label_13:
            if(cursor0.moveToFirst()) {
                s = cursor0.getString(0);
                s2 = cursor0.getString(1);
                cursor0.close();
                goto label_34;
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
        cursor0.close();
        return;
        try {
        label_20:
            int v3 = Long.compare(v1, -1L);
            String[] arr_s1 = v3 == 0 ? new String[]{0} : new String[]{0, String.valueOf(v1)};
            if(v3 != 0) {
                s1 = " and rowid <= ?";
            }
            cursor0 = sQLiteDatabase0.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + s1 + " order by rowid limit 1;", arr_s1);
        }
        catch(SQLiteException sQLiteException0) {
            cursor0 = null;
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_84;
        }
        try {
            if(cursor0.moveToFirst()) {
                s2 = cursor0.getString(0);
                cursor0.close();
            label_34:
                cursor0 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s, s2}, null, null, "rowid", "2");
                if(!cursor0.moveToFirst()) {
                    zzge0.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeu.d(s));
                    goto label_37;
                }
                goto label_39;
            }
            goto label_89;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
    label_37:
        cursor0.close();
        return;
        try {
        label_39:
            byte[] arr_b = cursor0.getBlob(0);
            try {
                zzgc0 = (zzgc)((zzgb)zzlh.r(zzgc.zzt(), arr_b)).zzaE();
                goto label_46;
            }
            catch(IOException iOException0) {
            }
            zzge0.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeu.d(s), iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
        cursor0.close();
        return;
        try {
        label_46:
            if(cursor0.moveToNext()) {
                zzge0.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeu.d(s));
            }
            cursor0.close();
            Preconditions.checkNotNull(zzgc0);
            e00.a = zzgc0;
            if(v1 == -1L) {
                s3 = "app_id = ? and metadata_fingerprint = ?";
                arr_s2 = new String[]{s, s2};
            }
            else {
                s3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                arr_s2 = new String[]{s, s2, String.valueOf(v1)};
            }
            cursor0 = sQLiteDatabase0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, s3, arr_s2, null, null, "rowid", null);
            if(cursor0.moveToFirst()) {
                while(true) {
                    long v4 = cursor0.getLong(0);
                    byte[] arr_b1 = cursor0.getBlob(3);
                    try {
                        zzfr0 = (zzfr)zzlh.r(zzfs.zze(), arr_b1);
                    }
                    catch(IOException iOException1) {
                        zzge0.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeu.d(s), iOException1);
                        goto label_69;
                    }
                    zzfr0.zzi(cursor0.getString(1));
                    zzfr0.zzm(cursor0.getLong(2));
                    if(!e00.a(v4, ((zzfs)zzfr0.zzaE()))) {
                        goto label_73;
                    }
                label_69:
                    if(!cursor0.moveToNext()) {
                        goto label_70;
                    }
                }
            }
            goto label_75;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_78;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
    label_70:
        cursor0.close();
        return;
    label_73:
        cursor0.close();
        return;
        try {
        label_75:
            zzge0.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeu.d(s));
            goto label_87;
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_78:
                zzge0.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeu.d(s), sQLiteException0);
                if(cursor0 != null) {
                    goto label_80;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_83;
            }
        label_80:
            cursor0.close();
            return;
        }
        catch(Throwable throwable0) {
        label_83:
            s = cursor0;
        }
    label_84:
        if(s != null) {
            ((Cursor)s).close();
        }
        throw throwable0;
    label_87:
        cursor0.close();
        return;
    label_89:
        cursor0.close();
    }

    public static final void l(ContentValues contentValues0, Object object0) {
        new String("value");
        Preconditions.checkNotNull(object0);
        if(object0 instanceof String) {
            contentValues0.put("value", ((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            contentValues0.put("value", ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put("value", ((Double)object0));
    }

    public final long m(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.r();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.a.zzay().zzd().zzc("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public final void n(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.a();
        try {
            this.r().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.a.zzay().zzd().zzd("Error deleting conditional property", zzeu.d(s), this.a.zzj().f(s1), sQLiteException0);
        }
    }

    public final long o(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.r();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v1 = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.a.zzay().zzd().zzc("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v1;
    label_14:
        cursor0.close();
        return v;
    }

    public final long p(String s) {
        long v2;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        new String("first_open_count");
        this.zzg();
        this.a();
        SQLiteDatabase sQLiteDatabase0 = this.r();
        sQLiteDatabase0.beginTransaction();
        long v = 0L;
        try {
            v2 = this.o("select first_open_count from app2 where app_id=?", new String[]{s}, -1L);
            if(v2 == -1L) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                contentValues0.put("first_open_count", 0);
                contentValues0.put("previous_install_count", 0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    zzge0.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeu.d(s), "first_open_count");
                    return -1L;
                }
                goto label_21;
            }
            goto label_25;
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzd("Error inserting column. appId", zzeu.d(s), "first_open_count", sQLiteException0);
            return v;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
        label_21:
            v2 = 0L;
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzd("Error inserting column. appId", zzeu.d(s), "first_open_count", sQLiteException0);
            return v;
        }
        try {
        label_25:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put("first_open_count", ((long)(v2 + 1L)));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                zzge0.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeu.d(s), "first_open_count");
                return -1L;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return v2;
        }
        catch(SQLiteException sQLiteException0) {
            v = v2;
        }
        zzge0.zzay().zzd().zzd("Error inserting column. appId", zzeu.d(s), "first_open_count", sQLiteException0);
        return v;
    }

    public final long q(String s) {
        Preconditions.checkNotEmpty(s);
        return this.o("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L);
    }

    public final SQLiteDatabase r() {
        this.zzg();
        try {
            return this.d.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.a.zzay().zzk().zzb("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final D s(String s) {
        D d0;
        Cursor cursor0;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.a();
        try {
            cursor0 = null;
            cursor0 = this.r().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_77;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    d0 = new D(this.b.l, s);
                    zzge zzge1 = d0.a;
                    d0.c(cursor0.getString(0));
                    d0.k(cursor0.getString(1));
                    d0.r(cursor0.getString(2));
                    d0.o(cursor0.getLong(3));
                    d0.p(cursor0.getLong(4));
                    d0.n(cursor0.getLong(5));
                    d0.e(cursor0.getString(6));
                    d0.d(cursor0.getString(7));
                    d0.l(cursor0.getLong(8));
                    d0.h(cursor0.getLong(9));
                    d0.q(cursor0.isNull(10) || cursor0.getInt(10) != 0);
                    long v = cursor0.getLong(11);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.v != v;
                    d0.v = v;
                    long v1 = cursor0.getLong(12);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.w != v1;
                    d0.w = v1;
                    long v2 = cursor0.getLong(13);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.x != v2;
                    d0.x = v2;
                    long v3 = cursor0.getLong(14);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.y != v3;
                    d0.y = v3;
                    d0.g(cursor0.getLong(15));
                    long v4 = cursor0.getLong(16);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.E != v4;
                    d0.E = v4;
                    d0.f((cursor0.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor0.getInt(17))));
                    d0.j(cursor0.getString(18));
                    long v5 = cursor0.getLong(19);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.z != v5;
                    d0.z = v5;
                    long v6 = cursor0.getLong(20);
                    zzge1.zzaz().zzg();
                    d0.C |= d0.A != v6;
                    d0.A = v6;
                    d0.m(cursor0.getString(21));
                    boolean z = cursor0.isNull(23) || cursor0.getInt(23) != 0;
                    zzge1.zzaz().zzg();
                    d0.C |= d0.p != z;
                    d0.p = z;
                    d0.b(cursor0.getString(24));
                    d0.i((cursor0.isNull(25) ? 0L : cursor0.getLong(25)));
                    if(!cursor0.isNull(26)) {
                        d0.s(Arrays.asList(cursor0.getString(26).split(",", -1)));
                    }
                    zzpi.zzc();
                    if(zzge0.zzf().zzs(null, zzeh.zzay)) {
                        String s1 = cursor0.getString(28);
                        zzge1.zzaz().zzg();
                        boolean z1 = d0.C;
                        d0.C = true ^ zzg.zza(d0.u, s1) | z1;
                        d0.u = s1;
                    }
                    zzge1.zzaz().zzg();
                    d0.C = false;
                    if(cursor0.moveToNext()) {
                        zzge0.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeu.d(s));
                    }
                    goto label_84;
                }
                goto label_86;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_77:
            zzge0.zzay().zzd().zzc("Error querying app. appId", zzeu.d(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_79;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_82;
        }
    label_79:
        cursor0.close();
        return null;
    label_82:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_84:
        cursor0.close();
        return d0;
    label_86:
        cursor0.close();
        return null;
    }

    public final zzac t(String s, String s1) {
        zzac zzac0;
        Cursor cursor0;
        zzlf zzlf0 = this.b;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.a();
        try {
            cursor0 = null;
            cursor0 = this.r().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    String s2 = cursor0.getString(0);
                    if(s2 == null) {
                        s2 = "";
                    }
                    Object object0 = this.x(cursor0, 1);
                    boolean z = cursor0.getInt(2) != 0;
                    String s3 = cursor0.getString(3);
                    long v = cursor0.getLong(4);
                    Parcelable parcelable0 = zzlf0.zzu().o(cursor0.getBlob(5), zzaw.CREATOR);
                    long v1 = cursor0.getLong(6);
                    Parcelable parcelable1 = zzlf0.zzu().o(cursor0.getBlob(7), zzaw.CREATOR);
                    long v2 = cursor0.getLong(8);
                    long v3 = cursor0.getLong(9);
                    Parcelable parcelable2 = zzlf0.zzu().o(cursor0.getBlob(10), zzaw.CREATOR);
                    zzac0 = new zzac(s, s2, new zzli(v2, object0, s1, s2), v1, z, s3, ((zzaw)parcelable0), v, ((zzaw)parcelable1), v3, ((zzaw)parcelable2));
                    if(cursor0.moveToNext()) {
                        zzge0.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeu.d(s), zzge0.zzj().f(s1));
                    }
                    goto label_38;
                }
                goto label_40;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            zzge0.zzay().zzd().zzd("Error querying conditional property", zzeu.d(s), zzge0.zzj().f(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_33;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
    label_33:
        cursor0.close();
        return null;
    label_36:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_38:
        cursor0.close();
        return zzac0;
    label_40:
        cursor0.close();
        return null;
    }

    public final zzak u(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.a();
        String[] arr_s = {s};
        zzak zzak0 = new zzak();
        Cursor cursor0 = null;
        try {
            SQLiteDatabase sQLiteDatabase0 = this.r();
            cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                if(cursor0.getLong(0) == v) {
                    zzak0.b = cursor0.getLong(1);
                    zzak0.a = cursor0.getLong(2);
                    zzak0.c = cursor0.getLong(3);
                    zzak0.d = cursor0.getLong(4);
                    zzak0.e = cursor0.getLong(5);
                }
                if(z) {
                    zzak0.b += v1;
                }
                if(z1) {
                    zzak0.a += v1;
                }
                if(z2) {
                    zzak0.c += v1;
                }
                if(z3) {
                    zzak0.d += v1;
                }
                if(z4) {
                    zzak0.e += v1;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("day", v);
                contentValues0.put("daily_public_events_count", zzak0.a);
                contentValues0.put("daily_events_count", zzak0.b);
                contentValues0.put("daily_conversions_count", zzak0.c);
                contentValues0.put("daily_error_events_count", zzak0.d);
                contentValues0.put("daily_realtime_events_count", zzak0.e);
                sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                goto label_34;
            }
            goto label_36;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_34:
        cursor0.close();
        return zzak0;
        try {
            try {
            label_36:
                zzge0.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeu.d(s));
                goto label_46;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_39:
            zzge0.zzay().zzd().zzc("Error updating daily counts. appId", zzeu.d(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_41;
            }
            return zzak0;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_41:
        cursor0.close();
        return zzak0;
    label_44:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_46:
        cursor0.close();
        return zzak0;
    }

    public final g v(String s, String s1) {
        g g0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.a();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.r().query("events", ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_13;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_32;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_13:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    g0 = new g(s, s1, v, v1, (cursor0.isNull(8) ? 0L : cursor0.getLong(8)), v2, v3, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        zzge0.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeu.d(s));
                    }
                    goto label_39;
                }
                goto label_41;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_32:
            zzge0.zzay().zzd().zzd("Error querying events. appId", zzeu.d(s), zzge0.zzj().d(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_34;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_37;
        }
    label_34:
        cursor0.close();
        return null;
    label_37:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_39:
        cursor0.close();
        return g0;
    label_41:
        cursor0.close();
        return null;
    }

    public final g0 w(String s, String s1) {
        g0 g00;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        zzge zzge0 = this.a;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.a();
        try {
            cursor0 = this.r().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_23;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            if(cursor0.moveToFirst()) {
                long v = cursor0.getLong(0);
                Object object0 = this.x(cursor0, 1);
                if(object0 != null) {
                    g00 = new g0(s, cursor0.getString(2), s1, v, object0);
                    if(cursor0.moveToNext()) {
                        zzge0.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeu.d(s));
                    }
                    goto label_30;
                }
                goto label_32;
            }
            goto label_34;
        }
        catch(SQLiteException sQLiteException1) {
            try {
            label_23:
                zzge0.zzay().zzd().zzd("Error querying user property. appId", zzeu.d(s), zzge0.zzj().f(s1), sQLiteException1);
                if(cursor0 != null) {
                    goto label_25;
                }
                return null;
            }
            catch(Throwable throwable0) {
                goto label_28;
            }
        label_25:
            cursor0.close();
            return null;
        }
        catch(Throwable throwable0) {
        label_28:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_30:
        cursor0.close();
        return g00;
    label_32:
        cursor0.close();
        return null;
    label_34:
        cursor0.close();
        return null;
    }

    public final Object x(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        zzge zzge0 = this.a;
        switch(v1) {
            case 0: {
                u9.o(zzge0, "Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                u9.o(zzge0, "Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                zzge0.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", v1);
                return null;
            }
        }
    }

    public final List y(String s, String s1, String s2) {
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.a();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.z(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List z(String s, String[] arr_s) {
        List list1;
        zzlf zzlf0 = this.b;
        zzge zzge0 = this.a;
        this.zzg();
        this.a();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.r().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
            if(cursor0.moveToFirst()) {
                while(true) {
                label_8:
                    if(((ArrayList)list0).size() >= 1000) {
                        zzge0.zzay().zzd().zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        goto label_37;
                    }
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    String s3 = cursor0.getString(2);
                    Object object0 = this.x(cursor0, 3);
                    boolean z = cursor0.getInt(4) != 0;
                    String s4 = cursor0.getString(5);
                    long v = cursor0.getLong(6);
                    Parcelable parcelable0 = zzlf0.zzu().o(cursor0.getBlob(7), zzaw.CREATOR);
                    long v1 = cursor0.getLong(8);
                    Parcelable parcelable1 = zzlf0.zzu().o(cursor0.getBlob(9), zzaw.CREATOR);
                    long v2 = cursor0.getLong(10);
                    long v3 = cursor0.getLong(11);
                    Parcelable parcelable2 = zzlf0.zzu().o(cursor0.getBlob(12), zzaw.CREATOR);
                    ((ArrayList)list0).add(new zzac(s1, s2, new zzli(v2, object0, s3, s2), v1, z, s4, ((zzaw)parcelable0), v, ((zzaw)parcelable1), v3, ((zzaw)parcelable2)));
                    if(!cursor0.moveToNext()) {
                        goto label_37;
                    }
                }
            }
            goto label_39;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                zzge0.zzay().zzd().zzb("Error querying conditional user property value", sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_31;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_34;
            }
        label_31:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_34:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        goto label_8;
    label_37:
        cursor0.close();
        return list0;
    label_39:
        cursor0.close();
        return list0;
    }

    public final String zzr() {
        String s;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.r();
        try {
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_14;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            if(cursor0.moveToFirst()) {
                s = cursor0.getString(0);
                goto label_21;
            }
            goto label_23;
        }
        catch(SQLiteException sQLiteException1) {
            try {
            label_14:
                this.a.zzay().zzd().zzb("Database error getting next bundle app id", sQLiteException1);
                if(cursor0 != null) {
                    goto label_16;
                }
                return null;
            }
            catch(Throwable throwable1) {
                goto label_19;
            }
        label_16:
            cursor0.close();
            return null;
        }
        catch(Throwable throwable1) {
        label_19:
            TWR.safeClose$NT(cursor0, throwable1);
            throw throwable1;
        }
    label_21:
        cursor0.close();
        return s;
    label_23:
        cursor0.close();
        return null;
    }

    public final void zzw() {
        this.a();
        this.r().beginTransaction();
    }

    public final void zzz() {
        this.zzg();
        this.a();
        if(this.g()) {
            zzlf zzlf0 = this.b;
            long v = zzlf0.zzs().zza.zza();
            zzge zzge0 = this.a;
            long v1 = zzge0.zzav().elapsedRealtime();
            if(Math.abs(v1 - v) > ((long)(((Long)zzeh.zzx.zza(null))))) {
                zzlf0.zzs().zza.zzb(v1);
                this.zzg();
                this.a();
                if(this.g()) {
                    int v2 = this.r().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzge0.zzav().currentTimeMillis()), "2419200000"});
                    if(v2 > 0) {
                        zzge0.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", v2);
                    }
                }
            }
        }
    }
}

