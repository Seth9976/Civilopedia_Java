package M1;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public final class i {
    public final SharedPreferences a;

    public i(Context context0, String s) {
        this.a = context0.getSharedPreferences("FirebaseHeartBeat" + s, 0);
    }

    public final void a() {
        synchronized(this) {
            long v1 = this.a.getLong("fire-count", 0L);
            String s = "";
            String s1 = null;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        String s2 = (String)object1;
                        if(s1 == null || s1.compareTo(s2) > 0) {
                            s = (String)map$Entry0.getKey();
                            s1 = s2;
                        }
                    }
                }
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.remove(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v1 - 1L).commit();
        }
    }

    public final void b() {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    sharedPreferences$Editor0.remove(((String)map$Entry0.getKey()));
                }
            }
            sharedPreferences$Editor0.remove("fire-count");
            sharedPreferences$Editor0.commit();
        }
    }

    public final ArrayList c() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    arrayList0.add(new a(((String)map$Entry0.getKey()), new ArrayList(((Set)map$Entry0.getValue()))));
                }
            }
            this.f(System.currentTimeMillis());
            return arrayList0;
        }
    }

    public final String d(long v) {
        synchronized(this) {
            return Build.VERSION.SDK_INT >= 26 ? new Date(v).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(v));
        }
    }

    public final void e(String s, long v) {
        synchronized(this) {
            String s1 = this.d(v);
            if(this.a.getString("last-used-date", "").equals(s1)) {
                return;
            }
            long v2 = this.a.getLong("fire-count", 0L);
            if(v2 + 1L == 30L) {
                this.a();
                v2 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v2 + 1L).putString("last-used-date", s1).commit();
        }
    }

    public final void f(long v) {
        synchronized(this) {
            this.a.edit().putLong("fire-global", v).commit();
        }
    }
}

