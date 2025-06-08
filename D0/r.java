package D0;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzdyw;
import java.util.ArrayList;
import java.util.List;

public final class r extends zzbqm {
    public final int i;
    public final Object j;

    public r(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list0) {
        ArrayList arrayList0;
        if(this.i != 0) {
            ((zzdyw)this.j).a(list0);
            return;
        }
        synchronized(((zzed)this.j).a) {
            ((zzed)this.j).c = false;
            ((zzed)this.j).d = true;
            arrayList0 = new ArrayList(((zzed)this.j).b);
            ((zzed)this.j).b.clear();
        }
        zzbqp zzbqp0 = zzed.a(list0);
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((OnInitializationCompleteListener)arrayList0.get(v1)).onInitializationComplete(zzbqp0);
        }
    }
}

