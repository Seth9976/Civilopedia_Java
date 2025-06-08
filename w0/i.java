package w0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import t0.c;
import x0.e;
import x0.h;
import y0.a;

public final class i implements a {
    public final j i;
    public final Iterable j;
    public final q0.i k;
    public final long l;

    public i(j j0, Iterable iterable0, q0.i i0, long v) {
        this.i = j0;
        this.j = iterable0;
        this.k = i0;
        this.l = v;
    }

    @Override  // y0.a
    public final Object a() {
        j j0 = this.i;
        h h0 = (h)j0.c;
        h0.getClass();
        Iterable iterable0 = this.j;
        if(iterable0.iterator().hasNext()) {
            String s = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + h.g(iterable0);
            SQLiteDatabase sQLiteDatabase0 = h0.a();
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.compileStatement(s).execute();
                Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while(true) {
                    try {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        int v1 = cursor0.getInt(0);
                        String s1 = cursor0.getString(1);
                        h0.e(((long)v1), c.n, s1);
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                }
                cursor0.close();
                sQLiteDatabase0.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
        }
        h0.c(new e(j0.g.d() + this.l, this.k));
        return null;
    }
}

