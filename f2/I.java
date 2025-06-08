package f2;

import J2.j;
import android.content.SharedPreferences;
import q2.e;
import u2.b;

public final class i implements b {
    public b i;
    public b j;
    public b k;

    @Override  // v2.a
    public Object get() {
        SharedPreferences sharedPreferences0 = (SharedPreferences)this.i.get();
        m m0 = (m)this.j.get();
        e e0 = (e)this.k.get();
        j.f(sharedPreferences0, "sharedPreferences");
        j.f(m0, "gameData");
        j.f(e0, "billingRepository");
        return new l(sharedPreferences0, m0, e0);
    }
}

