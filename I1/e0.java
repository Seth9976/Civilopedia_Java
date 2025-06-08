package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzlf;
import java.util.ArrayList;

public final class e0 {
    public zzgc a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final zzlf e;

    public e0(zzlf zzlf0) {
        this.e = zzlf0;
    }

    public final boolean a(long v, zzfs zzfs0) {
        Preconditions.checkNotNull(zzfs0);
        if(this.c == null) {
            this.c = new ArrayList();
        }
        if(this.b == null) {
            this.b = new ArrayList();
        }
        if(!this.c.isEmpty() && ((zzfs)this.c.get(0)).zzd() / 1000L / 60L / 60L != zzfs0.zzd() / 1000L / 60L / 60L) {
            return false;
        }
        long v1 = this.d + ((long)zzfs0.zzbw());
        zzlf zzlf0 = this.e;
        zzlf0.zzg();
        if(v1 >= ((long)Math.max(0, ((int)(((Integer)zzeh.zzh.zza(null))))))) {
            return false;
        }
        this.d = v1;
        this.c.add(zzfs0);
        this.b.add(v);
        int v2 = this.c.size();
        zzlf0.zzg();
        return v2 < Math.max(1, ((int)(((Integer)zzeh.zzi.zza(null)))));
    }
}

