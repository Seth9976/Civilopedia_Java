package f2;

import J2.j;
import android.content.SharedPreferences;
import com.spears.civilopedia.MyApplication;
import q2.e;
import u2.b;

public final class h implements b {
    public final int i;
    public final D3.b j;
    public final b k;

    public h(D3.b b0, b b1, int v) {
        this.i = v;
        this.j = b0;
        this.k = b1;
        super();
    }

    @Override  // v2.a
    public final Object get() {
        if(this.i != 0) {
            SharedPreferences sharedPreferences0 = (SharedPreferences)this.k.get();
            j.f(sharedPreferences0, "sharedPreferences");
            return new m(((MyApplication)this.j.j), sharedPreferences0);
        }
        SharedPreferences sharedPreferences1 = (SharedPreferences)this.k.get();
        j.f(sharedPreferences1, "sharedPreferences");
        return new e(((MyApplication)this.j.j), sharedPreferences1);
    }
}

