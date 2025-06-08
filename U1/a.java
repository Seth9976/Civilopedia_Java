package u1;

import N1.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import q0.i;
import t0.c;
import w0.j;
import x0.e;
import x0.f;
import x0.h;
import z1.S;

public final class a implements N1.a, f, y0.a {
    public final long i;
    public final Object j;
    public final Object k;

    public a(long v, Object object0, Object object1) {
        this.j = object0;
        this.k = object1;
        this.i = v;
        super();
    }

    public a(String s, long v, S s1) {
        this.j = s;
        this.i = v;
        this.k = s1;
    }

    @Override  // y0.a
    public Object a() {
        long v = ((j)this.j).g.d();
        h h0 = (h)((j)this.j).c;
        h0.getClass();
        h0.c(new e(v + this.i, ((i)this.k)));
        return null;
    }

    @Override  // x0.f
    public Object apply(Object object0) {
        String s;
        int v;
        v = ((c)this.k).i;
        s = (String)this.j;
        try(Cursor cursor0 = ((SQLiteDatabase)object0).rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(v)})) {
            if(cursor0.getCount() > 0) {
                goto label_10;
            }
            else {
                goto label_12;
            }
        }
        goto label_13;
    label_10:
        boolean z = true;
        goto label_13;
    label_12:
        z = false;
    label_13:
        long v1 = this.i;
        if(!z) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("log_source", s);
            contentValues0.put("reason", v);
            contentValues0.put("events_dropped_count", v1);
            ((SQLiteDatabase)object0).insert("log_event_dropped", null, contentValues0);
            return null;
        }
        ((SQLiteDatabase)object0).execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + v1 + " WHERE log_source = ? AND reason = ?", new String[]{s, Integer.toString(v)});
        return null;
    }

    @Override  // N1.a
    public void b(b b0) {
        ((u1.b)b0.get()).d(((String)this.j), this.i, ((S)this.k));
    }
}

