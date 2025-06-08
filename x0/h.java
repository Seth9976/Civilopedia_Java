package x0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import q0.i;
import y0.b;
import z0.a;

public final class h implements c, d, b {
    public final j i;
    public final a j;
    public final a k;
    public final x0.a l;
    public final v2.a m;
    public static final n0.b n;

    static {
        h.n = new n0.b("proto");
    }

    public h(a a0, a a1, x0.a a2, j j0, v2.a a3) {
        this.i = j0;
        this.j = a0;
        this.k = a1;
        this.l = a2;
        this.m = a3;
    }

    public final SQLiteDatabase a() {
        j j0 = this.i;
        Objects.requireNonNull(j0);
        a a0 = this.k;
        long v = a0.d();
        while(true) {
            try {
                return j0.getWritableDatabase();
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            }
            if(a0.d() >= ((long)this.l.c) + v) {
                break;
            }
            SystemClock.sleep(50L);
        }
        throw new SynchronizationException("Timed out while trying to open db.", sQLiteDatabaseLockedException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static Long b(SQLiteDatabase sQLiteDatabase0, i i0) {
        StringBuilder stringBuilder0 = new StringBuilder("backend_name = ? and priority = ?");
        String s = String.valueOf(A0.a.a(i0.c));
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{i0.a, s}));
        byte[] arr_b = i0.b;
        if(arr_b == null) {
            stringBuilder0.append(" and extras is null");
        }
        else {
            stringBuilder0.append(" and extras = ?");
            arrayList0.add(Base64.encodeToString(arr_b, 0));
        }
        Object[] arr_object = arrayList0.toArray(new String[0]);
        try(Cursor cursor0 = sQLiteDatabase0.query("transport_contexts", new String[]{"_id"}, stringBuilder0.toString(), ((String[])arr_object), null, null, null)) {
            return !cursor0.moveToNext() ? null : cursor0.getLong(0);
        }
    }

    public final Object c(f f0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Object object0 = f0.apply(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    @Override
    public final void close() {
        this.i.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase0, i i0, int v) {
        ArrayList arrayList0 = new ArrayList();
        Long long0 = h.b(sQLiteDatabase0, i0);
        if(long0 == null) {
            return arrayList0;
        }
        h.i(sQLiteDatabase0.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{long0.toString()}, null, null, null, String.valueOf(v)), new v0.a(this, arrayList0, i0, 1));
        return arrayList0;
    }

    public final void e(long v, t0.c c0, String s) {
        this.c(new u1.a(v, s, c0));
    }

    public final Object f(y0.a a0) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        a a1 = this.k;
        long v = a1.d();
        while(true) {
            try {
                sQLiteDatabase0.beginTransaction();
                break;
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                if(a1.d() >= ((long)this.l.c) + v) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", sQLiteDatabaseLockedException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object object0 = a0.a();
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public static String g(Iterable iterable0) {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        Iterator iterator0 = iterable0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((x0.b)object0).a);
            if(iterator0.hasNext()) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    public static Object i(Cursor cursor0, f f0) {
        try(cursor0) {
            return f0.apply(cursor0);
        }
    }
}

