package v0;

import C1.d;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import o2.C;
import q0.i;
import q0.l;
import t0.c;
import t0.e;
import t0.g;
import x0.f;
import x0.h;

public final class a implements f, y0.a {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;

    public a(Object object0, Object object1, Object object2, int v) {
        this.i = v;
        this.k = object0;
        this.j = object1;
        this.l = object2;
        super();
    }

    public a(h h0, Object object0, i i0, int v) {
        this.i = v;
        this.k = h0;
        this.l = object0;
        this.j = i0;
        super();
    }

    @Override  // y0.a
    public Object a() {
        b b0 = (b)this.k;
        h h0 = (h)b0.d;
        h0.getClass();
        i i0 = (i)this.j;
        q0.h h1 = (q0.h)this.l;
        if(Log.isLoggable("TRuntime.SQLiteEventStore", 3)) {
            Log.d("TRuntime.SQLiteEventStore", "Storing event with priority=" + i0.c + ", name=" + h1.a + " for destination " + i0.a);
        }
        ((Long)h0.c(new a(h0, h1, i0, 2))).getClass();
        b0.a.a(i0, 1, false);
        return null;
    }

    @Override  // x0.f
    public Object apply(Object object0) {
        g g0;
        c c3;
        c c2;
        long v11;
        byte[] arr_b1;
        c c0 = c.l;
        Object object1 = this.l;
        Object object2 = this.j;
        Object object3 = this.k;
        switch(this.i) {
            case 1: {
                ((h)object3).getClass();
                while(((Cursor)object0).moveToNext()) {
                    long v5 = ((Cursor)object0).getLong(0);
                    boolean z = ((Cursor)object0).getInt(7) != 0;
                    d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
                    d0.n = new HashMap();
                    String s1 = ((Cursor)object0).getString(1);
                    if(s1 == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    d0.i = s1;
                    d0.l = ((Cursor)object0).getLong(2);
                    d0.m = ((Cursor)object0).getLong(3);
                    if(z) {
                        String s2 = ((Cursor)object0).getString(4);
                        d0.k = new l((s2 == null ? h.n : new n0.b(s2)), ((Cursor)object0).getBlob(5));
                    }
                    else {
                        String s3 = ((Cursor)object0).getString(4);
                        n0.b b0 = s3 == null ? h.n : new n0.b(s3);
                        try(Cursor cursor1 = ((h)object3).a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(v5)}, null, null, "sequence_num")) {
                            ArrayList arrayList0 = new ArrayList();
                            int v6;
                            for(v6 = 0; true; v6 += arr_b.length) {
                                if(!cursor1.moveToNext()) {
                                    break;
                                }
                                byte[] arr_b = cursor1.getBlob(0);
                                arrayList0.add(arr_b);
                            }
                            arr_b1 = new byte[v6];
                            int v8 = 0;
                            for(int v7 = 0; true; ++v7) {
                                if(v7 >= arrayList0.size()) {
                                    break;
                                }
                                byte[] arr_b2 = (byte[])arrayList0.get(v7);
                                System.arraycopy(arr_b2, 0, arr_b1, v8, arr_b2.length);
                                v8 += arr_b2.length;
                            }
                        }
                        d0.k = new l(b0, arr_b1);
                    }
                    if(!((Cursor)object0).isNull(6)) {
                        d0.j = ((Cursor)object0).getInt(6);
                    }
                    ((ArrayList)object1).add(new x0.b(v5, ((i)object2), d0.o()));
                }
                return null;
            }
            case 2: {
                long v9 = ((h)object3).a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                long v10 = ((h)object3).a().compileStatement("PRAGMA page_size").simpleQueryForLong();
                x0.a a0 = ((h)object3).l;
                String s4 = ((q0.h)object1).a;
                if(v10 * v9 >= a0.a) {
                    ((h)object3).e(1L, c0, s4);
                    return -1L;
                }
                Long long0 = h.b(((SQLiteDatabase)object0), ((i)object2));
                if(long0 == null) {
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("backend_name", ((i)object2).a);
                    contentValues0.put("priority", A0.a.a(((i)object2).c));
                    contentValues0.put("next_request_ms", 0);
                    byte[] arr_b3 = ((i)object2).b;
                    if(arr_b3 != null) {
                        contentValues0.put("extras", Base64.encodeToString(arr_b3, 0));
                    }
                    v11 = ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
                }
                else {
                    v11 = (long)long0;
                }
                byte[] arr_b4 = ((q0.h)object1).c.b;
                int v12 = a0.e;
                boolean z1 = arr_b4.length <= v12;
                ContentValues contentValues1 = new ContentValues();
                contentValues1.put("context_id", v11);
                contentValues1.put("transport_name", s4);
                contentValues1.put("timestamp_ms", ((q0.h)object1).d);
                contentValues1.put("uptime_ms", ((q0.h)object1).e);
                contentValues1.put("payload_encoding", ((q0.h)object1).c.a.a);
                contentValues1.put("code", ((q0.h)object1).b);
                contentValues1.put("num_attempts", 0);
                contentValues1.put("inline", Boolean.valueOf(z1));
                contentValues1.put("payload", (z1 ? arr_b4 : new byte[0]));
                long v13 = ((SQLiteDatabase)object0).insert("events", null, contentValues1);
                if(!z1) {
                    int v14 = (int)Math.ceil(((double)arr_b4.length) / ((double)v12));
                    for(int v15 = 1; v15 <= v14; ++v15) {
                        byte[] arr_b5 = Arrays.copyOfRange(arr_b4, (v15 - 1) * v12, Math.min(v15 * v12, arr_b4.length));
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("event_id", v13);
                        contentValues2.put("sequence_num", v15);
                        contentValues2.put("bytes", arr_b5);
                        ((SQLiteDatabase)object0).insert("event_payloads", null, contentValues2);
                    }
                }
                for(Object object5: Collections.unmodifiableMap(((q0.h)object1).f).entrySet()) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("event_id", v13);
                    contentValues3.put("name", ((String)((Map.Entry)object5).getKey()));
                    contentValues3.put("value", ((String)((Map.Entry)object5).getValue()));
                    ((SQLiteDatabase)object0).insert("event_metadata", null, contentValues3);
                }
                return v13;
            }
            default: {
                ((h)object3).getClass();
                while(((Cursor)object0).moveToNext()) {
                    String s = ((Cursor)object0).getString(0);
                    int v = ((Cursor)object0).getInt(1);
                    c c1 = c.j;
                    switch(v) {
                        case 0: {
                            c2 = c0;
                            c3 = c1;
                            break;
                        }
                        case 1: {
                            c2 = c0;
                            c3 = c.k;
                            break;
                        }
                        case 2: {
                            c3 = c0;
                            c2 = c3;
                            break;
                        }
                        case 3: {
                            c2 = c0;
                            c3 = c.m;
                            break;
                        }
                        case 4: {
                            c2 = c0;
                            c3 = c.n;
                            break;
                        }
                        case 5: {
                            c2 = c0;
                            c3 = c.o;
                            break;
                        }
                        default: {
                            if(v == 6) {
                                c1 = c.p;
                            }
                            else {
                                C.f("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", v);
                            }
                            c2 = c0;
                            c3 = c1;
                            break;
                        }
                    }
                    long v1 = ((Cursor)object0).getLong(2);
                    if(!((HashMap)object2).containsKey(s)) {
                        ((HashMap)object2).put(s, new ArrayList());
                    }
                    ((List)((HashMap)object2).get(s)).add(new t0.d(v1, c3));
                    c0 = c2;
                }
                for(Object object4: ((HashMap)object2).entrySet()) {
                    new ArrayList();
                    e e0 = new e(((String)((Map.Entry)object4).getKey()), Collections.unmodifiableList(((List)((Map.Entry)object4).getValue())));
                    ((ArrayList)((f0.g)object1).k).add(e0);
                }
                long v2 = ((h)object3).j.d();
                SQLiteDatabase sQLiteDatabase0 = ((h)object3).a();
                sQLiteDatabase0.beginTransaction();
                try {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursor0.moveToNext();
                        g0 = new g(cursor0.getLong(0), v2);
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                    cursor0.close();
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                ((f0.g)object1).j = g0;
                long v4 = ((h)object3).a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ((f0.g)object1).l = new t0.b(new t0.f(((h)object3).a().compileStatement("PRAGMA page_size").simpleQueryForLong() * v4, x0.a.f.a));
                ((f0.g)object1).m = (String)((h)object3).m.get();
                return new t0.a(((g)((f0.g)object1).j), Collections.unmodifiableList(((ArrayList)((f0.g)object1).k)), ((t0.b)((f0.g)object1).l), ((String)((f0.g)object1).m));
            }
        }
    }
}

