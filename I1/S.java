package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.measurement.internal.zzfv;
import p.b;
import p.f;

public final class s extends f {
    public final zzfv i;

    public s(zzfv zzfv0) {
        this.i = zzfv0;
        super(20);
    }

    @Override  // p.f
    public final Object a(Object object0) {
        Preconditions.checkNotEmpty(((String)object0));
        zzfv zzfv0 = this.i;
        zzfv0.a();
        Preconditions.checkNotEmpty(((String)object0));
        if(zzfv0.zzo(((String)object0))) {
            b b0 = zzfv0.h;
            if(b0.containsKey(((String)object0)) && b0.getOrDefault(((String)object0), null) != null) {
                zzfv0.f(((String)object0), ((zzfe)b0.getOrDefault(((String)object0), null)));
                return (zzc)zzfv0.j.snapshot().get(((String)object0));
            }
            zzfv0.e(((String)object0));
            return (zzc)zzfv0.j.snapshot().get(((String)object0));
        }
        return null;
    }
}

