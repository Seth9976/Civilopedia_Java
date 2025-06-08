package x0;

import A0.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import n0.c;
import q0.i;

public final class e implements f {
    public final int i;
    public final long j;
    public final Object k;

    public e(long v, i i0) {
        this.i = 1;
        super();
        this.j = v;
        this.k = i0;
    }

    public e(h h0, long v) {
        this.i = 0;
        super();
        this.k = h0;
        this.j = v;
    }

    @Override  // x0.f
    public final Object apply(Object object0) {
        String[] arr_s;
        if(this.i != 0) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("next_request_ms", this.j);
            i i0 = (i)this.k;
            c c0 = i0.c;
            String s = String.valueOf(a.a(c0));
            if(((SQLiteDatabase)object0).update("transport_contexts", contentValues0, "backend_name = ? and priority = ?", new String[]{i0.a, s}) < 1) {
                contentValues0.put("backend_name", i0.a);
                contentValues0.put("priority", a.a(c0));
                ((SQLiteDatabase)object0).insert("transport_contexts", null, contentValues0);
            }
            return null;
        }
        h h0 = (h)this.k;
        h0.getClass();
        arr_s = new String[]{String.valueOf(this.j)};
        try(Cursor cursor0 = ((SQLiteDatabase)object0).rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", arr_s)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                int v = cursor0.getInt(0);
                String s1 = cursor0.getString(1);
                h0.e(((long)v), t0.c.k, s1);
            }
        }
        return ((SQLiteDatabase)object0).delete("events", "timestamp_ms < ?", arr_s);
    }
}

