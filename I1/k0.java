package i1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzlh;
import java.io.Serializable;
import java.util.List;

public final class k0 {
    public zzfs a;
    public Long b;
    public long c;
    public final b d;

    public k0(b b0) {
        this.d = b0;
    }

    public final zzfs a(zzfs zzfs0, String s) {
        List list0 = zzfs0.zzi();
        b b0 = this.d;
        b0.b.zzu();
        Long long0 = (Long)zzlh.d(zzfs0, "_eid");
        if(long0 != null) {
            zzge zzge0 = b0.a;
            zzlf zzlf0 = b0.b;
            this.b = long0;
            this.a = zzfs0;
            zzlf0.zzu();
            Serializable serializable0 = 0L;
            Serializable serializable1 = zzlh.d(zzfs0, "_epc");
            if(serializable1 != null) {
                serializable0 = serializable1;
            }
            long v = (long)(((Long)serializable0));
            this.c = v;
            if(v <= 0L) {
                zzge0.zzay().zzh().zzb("Complex event with zero extra param count. eventName", "");
            }
            else {
                zzlf0.zzi().h(s, ((Long)Preconditions.checkNotNull(long0)), this.c, zzfs0);
            }
        }
        zzfr zzfr0 = (zzfr)zzfs0.zzby();
        zzfr0.zzi("");
        zzfr0.zzg();
        zzfr0.zzd(list0);
        return (zzfs)zzfr0.zzaE();
    }
}

