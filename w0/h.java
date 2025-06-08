package w0;

import D1.b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import q0.i;
import y0.a;

public final class h implements a {
    public final int i;
    public final j j;
    public final i k;

    public h(j j0, i i0, int v) {
        this.i = v;
        this.j = j0;
        this.k = i0;
        super();
    }

    @Override  // y0.a
    public final Object a() {
        Boolean boolean1;
        Boolean boolean0;
        if(this.i != 0) {
            ((x0.h)this.j.c).getClass();
            b b0 = new b(7, ((x0.h)this.j.c), this.k);
            return (Iterable)((x0.h)this.j.c).c(b0);
        }
        x0.h h0 = (x0.h)this.j.c;
        SQLiteDatabase sQLiteDatabase0 = h0.a();
        sQLiteDatabase0.beginTransaction();
        try {
            Long long0 = x0.h.b(sQLiteDatabase0, this.k);
            if(long0 == null) {
                boolean0 = Boolean.FALSE;
            }
            else {
                Cursor cursor0 = h0.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{long0.toString()});
                try {
                    boolean1 = Boolean.valueOf(cursor0.moveToNext());
                }
                catch(Throwable throwable0) {
                    cursor0.close();
                    throw throwable0;
                }
                cursor0.close();
                boolean0 = boolean1;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return boolean0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}

