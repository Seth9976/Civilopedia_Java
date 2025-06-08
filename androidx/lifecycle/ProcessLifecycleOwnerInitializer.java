package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        Context context0 = this.getContext();
        if(!k.a.getAndSet(true)) {
            ((Application)context0.getApplicationContext()).registerActivityLifecycleCallbacks(new j());  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        Context context1 = this.getContext();
        x.q.getClass();
        x.q.m = new Handler();
        x.q.n.e(g.ON_CREATE);
        ((Application)context1.getApplicationContext()).registerActivityLifecycleCallbacks(new w(x.q));
        return true;
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }
}

