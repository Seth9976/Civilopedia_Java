package i1;

import N.b;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzen;
import com.google.android.gms.measurement.internal.zzge;

public final class d extends SQLiteOpenHelper {
    public final int i;
    public final A j;

    public d(zzen zzen0, Context context0) {
        this.i = 1;
        this.j = zzen0;
        super(context0, "google_app_measurement_local.db", null, 1);
    }

    public d(e e0, Context context0) {
        this.i = 0;
        this.j = e0;
        super(context0, "google_app_measurement.db", null, 1);
    }

    private final void a(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final void c(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if(this.i != 0) {
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                throw sQLiteDatabaseLockedException0;
            }
            catch(SQLiteException unused_ex) {
                zzen zzen0 = (zzen)this.j;
                u9.o(zzen0.a, "Opening the local database failed, dropping and recreating it");
                if(!zzen0.a.zzau().getDatabasePath("google_app_measurement_local.db").delete()) {
                    zzen0.a.zzay().zzd().zzb("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                }
                try {
                    return super.getWritableDatabase();
                }
                catch(SQLiteException sQLiteException0) {
                    zzen0.a.zzay().zzd().zzb("Failed to open local database. Events will bypass local storage", sQLiteException0);
                    return null;
                }
            }
        }
        e e0 = (e)this.j;
        zzge zzge0 = e0.a;
        if(e0.e.j == 0L || ((Clock)e0.e.k).elapsedRealtime() - e0.e.j >= 3600000L) {
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                b b0 = e0.e;
                b0.j = ((Clock)b0.k).elapsedRealtime();
                zzge0.zzay().zzd().zza("Opening the database failed, dropping and recreating it");
                if(!zzge0.zzau().getDatabasePath("google_app_measurement.db").delete()) {
                    zzge0.zzay().zzd().zzb("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase sQLiteDatabase0 = super.getWritableDatabase();
                    b0.j = 0L;
                    return sQLiteDatabase0;
                }
                catch(SQLiteException sQLiteException1) {
                    zzge0.zzay().zzd().zzb("Failed to open freshly created database", sQLiteException1);
                    throw sQLiteException1;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        if(this.i != 0) {
            zzan.b(((zzen)this.j).a.zzay(), sQLiteDatabase0);
            return;
        }
        zzan.b(((e)this.j).a.zzay(), sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        if(this.i != 0) {
            zzan.a(((zzen)this.j).a.zzay(), sQLiteDatabase0, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
            return;
        }
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", e.f);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", e.g);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", e.h);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", e.j);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", e.i);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", e.k);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", e.l);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", e.m);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzan.a(((e)this.j).a.zzay(), sQLiteDatabase0, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

