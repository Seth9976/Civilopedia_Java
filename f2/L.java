package f2;

import android.content.SharedPreferences;
import q2.e;

public final class l {
    public final SharedPreferences a;
    public final m b;
    public final e c;

    public l(SharedPreferences sharedPreferences0, m m0, e e0) {
        this.a = sharedPreferences0;
        this.b = m0;
        this.c = e0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        if(!this.a.equals(((l)object0).a)) {
            return false;
        }
        return this.b.equals(((l)object0).b) ? this.c.equals(((l)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Environment(prefs=" + this.a + ", gameData=" + this.b + ", billingRepository=" + this.c + ")";
    }
}

