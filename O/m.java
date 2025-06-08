package O;

import S.f;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class m {
    public final AtomicBoolean a;
    public final j b;
    public volatile f c;

    public m(j j0) {
        this.a = new AtomicBoolean(false);
        this.b = j0;
    }

    public final f a() {
        this.b.a();
        if(this.a.compareAndSet(false, true)) {
            if(this.c == null) {
                String s = this.b();
                this.b.a();
                this.b.b();
                this.c = new f(((SQLiteDatabase)this.b.c.h().j).compileStatement(s));
            }
            return this.c;
        }
        String s1 = this.b();
        this.b.a();
        this.b.b();
        return new f(((SQLiteDatabase)this.b.c.h().j).compileStatement(s1));
    }

    public abstract String b();

    public final void c(f f0) {
        if(f0 == this.c) {
            this.a.set(false);
        }
    }
}

