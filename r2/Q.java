package R2;

import I2.a;
import J2.j;
import J2.l;
import X2.K;
import X2.c;
import android.content.Intent;
import com.spears.civilopedia.planning.LeaderListActivity;
import com.spears.civilopedia.planning.PlanningSavesActivity;
import java.io.Serializable;
import java.util.ArrayList;
import n2.m;
import w2.k;

public final class q extends l implements a {
    public final int i;
    public final int j;
    public final Object k;

    public q(int v, int v1, Object object0) {
        this.i = v1;
        this.k = object0;
        this.j = v;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        switch(this.i) {
            case 0: {
                Object object0 = ((c)this.k).z0().get(this.j);
                j.e(object0, "get(...)");
                return (K)object0;
            }
            case 1: {
                String s = ((o2.q)((m)((LeaderListActivity)this.k).k().b().f).c().get(this.j)).b;
                Intent intent1 = new Intent();
                intent1.putExtra("LEADER", s);
                ((LeaderListActivity)this.k).setResult(-1, intent1);
                ((LeaderListActivity)this.k).finish();
                return k.a;
            }
            default: {
                Intent intent0 = new Intent();
                PlanningSavesActivity planningSavesActivity0 = (PlanningSavesActivity)this.k;
                ArrayList arrayList0 = planningSavesActivity0.B;
                if(arrayList0 != null) {
                    intent0.putExtra("FILE", ((Serializable)arrayList0.get(this.j)));
                    planningSavesActivity0.setResult(-1, intent0);
                    planningSavesActivity0.finish();
                    return k.a;
                }
                j.l("files");
                throw null;
            }
        }
    }
}

