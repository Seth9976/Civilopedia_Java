package i1;

import com.google.android.gms.measurement.internal.zzlf;

public abstract class c0 extends b0 {
    public boolean c;

    public c0(zzlf zzlf0) {
        super(zzlf0);
        ++this.b.q;
    }

    public final void a() {
        if(!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public abstract void b();

    public final void zzX() {
        if(this.c) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.b();
        ++this.b.r;
        this.c = true;
    }
}

