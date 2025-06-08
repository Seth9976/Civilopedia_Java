package x1;

import E1.a;
import O1.c;
import O1.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.regex.Pattern;
import m0.A;

public final class q {
    public final a a;
    public final Context b;
    public final String c;
    public final d d;
    public final A e;
    public String f;
    public static final Pattern g;
    public static final String h;

    static {
        q.g = Pattern.compile("[^\\p{Alnum}]");
        q.h = "\\Q/\\E";
    }

    public q(Context context0, String s, d d0, A a0) {
        if(context0 == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if(s == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context0;
        this.c = s;
        this.d = d0;
        this.e = a0;
        this.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final String a(SharedPreferences sharedPreferences0, String s) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Created new Crashlytics installation ID: 927c408116b546c198ab7b3b7527ce85 for FID: " + s, null);
            }
            sharedPreferences0.edit().putString("crashlytics.installation.id", "927c408116b546c198ab7b3b7527ce85").putString("firebase.installation.id", s).apply();
            return "927c408116b546c198ab7b3b7527ce85";
        }
    }

    public static String b() [...] // Potential decryptor

    public final String c() {
        String s2;
        synchronized(this) {
            String s = this.f;
            if(s != null) {
                return s;
            }
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
            }
            SharedPreferences sharedPreferences0 = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String s1 = sharedPreferences0.getString("firebase.installation.id", null);
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Cached Firebase Installation ID: " + s1, null);
            }
            if(this.e.a()) {
                Task task0 = ((c)this.d).c();
                try {
                    s2 = (String)s.a(task0);
                }
                catch(Exception exception0) {
                    Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", exception0);
                    s2 = null;
                }
                if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Fetched Firebase Installation ID: " + s2, null);
                }
                if(s2 == null) {
                    s2 = s1 == null ? "SYN_282f7409-2661-4b45-a439-b23f2e8cae5c" : s1;
                }
                this.f = s2.equals(s1) ? sharedPreferences0.getString("crashlytics.installation.id", null) : this.a(sharedPreferences0, s2);
            }
            else if(s1 == null || !s1.startsWith("SYN_")) {
                this.f = this.a(sharedPreferences0, "SYN_282f7409-2661-4b45-a439-b23f2e8cae5c");
            }
            else {
                this.f = sharedPreferences0.getString("crashlytics.installation.id", null);
            }
            if(this.f == null) {
                Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
                this.f = this.a(sharedPreferences0, "SYN_282f7409-2661-4b45-a439-b23f2e8cae5c");
            }
            String s3 = "Crashlytics installation ID: " + this.f;
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", s3, null);
            }
            return this.f;
        }
    }

    public final String d() {
        a a0 = this.a;
        Context context0 = this.b;
        synchronized(a0) {
            if(a0.i == null) {
                String s = context0.getPackageManager().getInstallerPackageName("com.spears.civilopedia");
                if(s == null) {
                    s = "";
                }
                a0.i = s;
            }
            return "".equals(a0.i) ? null : a0.i;
        }
    }
}

