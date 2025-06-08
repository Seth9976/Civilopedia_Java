package androidx.startup;

import T.a;
import T.b;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashSet;

public final class InitializationProvider extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        Context context0 = this.getContext();
        if(context0 != null) {
            if(a.d == null) {
                Object object0 = a.e;
                synchronized(object0) {
                    if(a.d == null) {
                        a.d = new a(context0);
                    }
                }
            }
            try {
                a a0 = a.d;
                Trace.beginSection("Startup");
                ComponentName componentName0 = new ComponentName("com.spears.civilopedia", "androidx.startup.InitializationProvider");
                Bundle bundle0 = a0.c.getPackageManager().getProviderInfo(componentName0, 0x80).metaData;
                if(bundle0 != null) {
                    HashSet hashSet0 = new HashSet();
                    for(Object object1: bundle0.keySet()) {
                        String s = (String)object1;
                        if("androidx.startup".equals(bundle0.getString(s, null))) {
                            Class class0 = Class.forName(s);
                            if(b.class.isAssignableFrom(class0)) {
                                a0.b.add(class0);
                                a0.a(class0, hashSet0);
                            }
                        }
                    }
                }
                return true;
            }
            catch(PackageManager.NameNotFoundException | ClassNotFoundException packageManager$NameNotFoundException0) {
                throw new StartupException(packageManager$NameNotFoundException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            finally {
                Trace.endSection();
            }
        }
        throw new StartupException("Context cannot be null");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new IllegalStateException("Not allowed.");
    }
}

