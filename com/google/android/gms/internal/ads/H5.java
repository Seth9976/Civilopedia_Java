package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h5 implements zzfuy {
    public final boolean i;
    public final zzeea j;

    public h5(zzeea zzeea0, boolean z) {
        this.j = zzeea0;
        this.i = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        zzcfi.zzg("Failed to get signals bundle");
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        zzbek zzbek0;
        int v;
        List list1;
        Iterator iterator0;
        ArrayList arrayList0;
        zzeea zzeea0 = this.j;
        if(zzeea0.a.zzP()) {
            return;
        }
        Object object1 = ((Bundle)object0).get("ad_types");
        if(object1 instanceof List) {
            arrayList0 = new ArrayList(((List)object1).size());
            iterator0 = ((List)object1).iterator();
            goto label_12;
        }
        else if(object1 instanceof String[]) {
            List list0 = Arrays.asList(((String[])object1));
            arrayList0 = new ArrayList(list0.size());
            iterator0 = list0.iterator();
        label_12:
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(object2 instanceof String) {
                    arrayList0.add(((String)object2));
                }
            }
            list1 = Collections.unmodifiableList(arrayList0);
        }
        else {
            list1 = Collections.emptyList();
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = list1.iterator();
        while(true) {
            v = 2;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object3 = iterator1.next();
            switch(((String)object3)) {
                case "banner": {
                    zzbek0 = zzbek.zzb;
                    break;
                }
                case "interstitial": {
                    zzbek0 = zzbek.zzc;
                    break;
                }
                case "native": {
                    zzbek0 = zzbek.zzf;
                    break;
                }
                case "rewarded": {
                    zzbek0 = zzbek.zzj;
                    break;
                }
                default: {
                    zzbek0 = zzbek.zza;
                }
            }
            arrayList1.add(zzbek0);
        }
        int v1 = zzfco.zza(zzfco.zza(((Bundle)object0), "device"), "network").getInt("active_network_state", -1);
        zzbfz zzbfz0 = (zzbfz)zzeea.h.get(v1, zzbfz.zza);
        zzbfj zzbfj0 = zzbfq.zza();
        int v2 = ((Bundle)object0).getInt("cnt", -2);
        int v3 = ((Bundle)object0).getInt("gnt", 0);
        if(v2 == -1) {
            zzeea0.g = 2;
        }
        else {
            zzeea0.g = 1;
            switch(v2) {
                case 0: {
                    zzbfj0.zzb(2);
                    break;
                }
                case 1: {
                    zzbfj0.zzb(3);
                    break;
                }
                default: {
                    zzbfj0.zzb(1);
                }
            }
            switch(v3) {
                case 13: {
                    v = 5;
                    break;
                }
                case 1: 
                case 2: 
                case 4: 
                case 7: 
                case 11: 
                case 16: {
                    break;
                }
                case 3: 
                case 5: 
                case 6: 
                case 8: 
                case 9: 
                case 10: 
                case 12: 
                case 14: 
                case 15: 
                case 17: {
                    v = 3;
                    break;
                }
                default: {
                    v = 1;
                }
            }
            zzbfj0.zza(v);
        }
        zzgkq zzgkq0 = zzbfj0.zzal();
        zzedy zzedy0 = new zzedy(this, this.i, arrayList1, ((zzbfq)zzgkq0), zzbfz0);
        zzeea0.b.zza(zzedy0);
    }
}

