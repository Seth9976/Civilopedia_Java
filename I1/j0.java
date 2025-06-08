package i1;

import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import p.b;
import p.h;

public final class j0 {
    public final String a;
    public final boolean b;
    public final zzgh c;
    public final BitSet d;
    public final BitSet e;
    public final b f;
    public final b g;
    public final i1.b h;

    public j0(i1.b b0, String s) {
        this.h = b0;
        this.a = s;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new b();  // 初始化器: Lp/k;-><init>()V
        this.g = new b();  // 初始化器: Lp/k;-><init>()V
    }

    public j0(i1.b b0, String s, zzgh zzgh0, BitSet bitSet0, BitSet bitSet1, b b1, b b2) {
        this.h = b0;
        this.a = s;
        this.d = bitSet0;
        this.e = bitSet1;
        this.f = b1;
        this.g = new b();  // 初始化器: Lp/k;-><init>()V
        for(Object object0: ((h)b2.keySet())) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(((Long)b2.getOrDefault(((Integer)object0), null)));
            this.g.put(((Integer)object0), arrayList0);
        }
        this.b = false;
        this.c = zzgh0;
    }

    public final zzfo a(int v) {
        List list0;
        ArrayList arrayList0;
        zzfn zzfn0 = zzfo.zzb();
        zzfn0.zza(v);
        zzfn0.zzc(this.b);
        zzgh zzgh0 = this.c;
        if(zzgh0 != null) {
            zzfn0.zzd(zzgh0);
        }
        zzgg zzgg0 = zzgh.zzf();
        zzgg0.zzb(zzlh.v(this.d));
        zzgg0.zzd(zzlh.v(this.e));
        b b0 = this.f;
        if(b0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(b0.k);
            for(Object object0: ((h)b0.keySet())) {
                int v1 = (int)(((Integer)object0));
                Long long0 = (Long)b0.getOrDefault(((Integer)object0), null);
                if(long0 != null) {
                    zzfp zzfp0 = zzfq.zzc();
                    zzfp0.zzb(v1);
                    zzfp0.zza(((long)long0));
                    arrayList0.add(((zzfq)zzfp0.zzaE()));
                }
            }
        }
        if(arrayList0 != null) {
            zzgg0.zza(arrayList0);
        }
        b b1 = this.g;
        if(b1 == null) {
            list0 = Collections.emptyList();
        }
        else {
            ArrayList arrayList1 = new ArrayList(b1.k);
            for(Object object1: ((h)b1.keySet())) {
                zzgi zzgi0 = zzgj.zzd();
                zzgi0.zzb(((int)(((Integer)object1))));
                List list1 = (List)b1.getOrDefault(((Integer)object1), null);
                if(list1 != null) {
                    Collections.sort(list1);
                    zzgi0.zza(list1);
                }
                arrayList1.add(((zzgj)zzgi0.zzaE()));
            }
            list0 = arrayList1;
        }
        zzgg0.zzc(list0);
        zzfn0.zzb(zzgg0);
        return (zzfo)zzfn0.zzaE();
    }

    public final void b(l0 l00) {
        int v = l00.g == 0 ? ((zzej)l00.i).zzb() : ((zzes)l00.i).zza();
        Boolean boolean0 = l00.c;
        if(boolean0 != null) {
            this.e.set(v, boolean0.booleanValue());
        }
        Boolean boolean1 = l00.d;
        if(boolean1 != null) {
            this.d.set(v, boolean1.booleanValue());
        }
        if(l00.e != null) {
            Integer integer0 = v;
            b b0 = this.f;
            Long long0 = (Long)b0.getOrDefault(integer0, null);
            long v1 = (long)l00.e;
            if(long0 == null || v1 / 1000L > ((long)long0)) {
                b0.put(integer0, ((long)(v1 / 1000L)));
            }
        }
        if(l00.f != null) {
            Integer integer1 = v;
            b b1 = this.g;
            List list0 = (List)b1.getOrDefault(integer1, null);
            if(list0 == null) {
                list0 = new ArrayList();
                b1.put(integer1, list0);
            }
            if(l00.g != 0) {
                list0.clear();
            }
            zzoe.zzc();
            i1.b b2 = this.h;
            zzeg zzeg0 = zzeh.zzW;
            String s = this.a;
            if(b2.a.zzf().zzs(s, zzeg0) && (l00.g == 0 ? ((zzej)l00.i).zzo() : false)) {
                list0.clear();
            }
            zzoe.zzc();
            if(b2.a.zzf().zzs(s, zzeg0)) {
                Long long1 = (long)(((long)l00.f) / 1000L);
                if(!list0.contains(long1)) {
                    list0.add(long1);
                }
            }
            else {
                list0.add(((long)(((long)l00.f) / 1000L)));
            }
        }
    }
}

