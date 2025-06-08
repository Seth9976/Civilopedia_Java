package Z;

import P.a;
import S.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

public final class h extends a {
    public final int c;
    public final Context d;

    public h(Context context0) {
        this.c = 1;
        super(9, 10);
        this.d = context0;
    }

    public h(Context context0, int v, int v1) {
        this.c = 0;
        super(v, v1);
        this.d = context0;
    }

    @Override  // P.a
    public final void a(b b0) {
        Context context0 = this.d;
        if(this.c != 0) {
            b0.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.preferences", 0);
            boolean z = sharedPreferences0.contains("reschedule_needed");
            SQLiteDatabase sQLiteDatabase0 = (SQLiteDatabase)b0.j;
            if(z || sharedPreferences0.contains("last_cancel_all_time_ms")) {
                long v = 0L;
                long v1 = sharedPreferences0.getLong("last_cancel_all_time_ms", 0L);
                if(sharedPreferences0.getBoolean("reschedule_needed", false)) {
                    v = 1L;
                }
                b0.a();
                try {
                    sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", v1});
                    sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", v});
                    sharedPreferences0.edit().clear().apply();
                    b0.k();
                }
                catch(Throwable throwable0) {
                    b0.f();
                    throw throwable0;
                }
                b0.f();
            }
            SharedPreferences sharedPreferences1 = context0.getSharedPreferences("androidx.work.util.id", 0);
            if(sharedPreferences1.contains("next_job_scheduler_id") || sharedPreferences1.contains("next_job_scheduler_id")) {
                int v2 = sharedPreferences1.getInt("next_job_scheduler_id", 0);
                int v3 = sharedPreferences1.getInt("next_alarm_manager_id", 0);
                b0.a();
                try {
                    sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", v2});
                    sQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", v3});
                    sharedPreferences1.edit().clear().apply();
                    b0.k();
                }
                catch(Throwable throwable1) {
                    b0.f();
                    throw throwable1;
                }
                b0.f();
            }
            return;
        }
        if(this.b >= 10) {
            ((SQLiteDatabase)b0.j).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        context0.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}

