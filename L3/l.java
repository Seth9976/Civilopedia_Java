package L3;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;
import n0.a;
import n0.c;
import y1.f;
import y1.g;

public final class l implements g {
    public final int a;
    public boolean b;
    public Object c;

    public l() {
        this.a = 3;
        super();
    }

    public l(Object object0, boolean z, int v) {
        this.a = v;
        this.c = object0;
        this.b = z;
        super();
    }

    public l(StringBuilder stringBuilder0) {
        this.a = 4;
        super();
        this.c = stringBuilder0;
        this.b = true;
    }

    public l(boolean z, String s) {
        this.a = 1;
        super();
        this.b = z;
        this.c = s;
    }

    @Override  // y1.g
    public void a(f f0, int v) {
        boolean z = this.b;
        StringBuilder stringBuilder0 = (StringBuilder)this.c;
        if(z) {
            this.b = false;
        }
        else {
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(v);
    }

    public void b(zzlk zzlk0) {
        if(this.b) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((B.f)this.c).v(new a(zzlk0, c.i), new A1.a(12));
        }
        catch(Throwable unused_ex) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    @Override
    public String toString() {
        if(this.a != 0) {
            return super.toString();
        }
        return this.b ? "FALL_THROUGH" : String.valueOf(this.c);
    }
}

