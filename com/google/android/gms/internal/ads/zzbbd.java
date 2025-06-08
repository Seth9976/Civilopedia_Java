package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbd {
    public final Object a;
    public int b;
    public final LinkedList c;

    public zzbbd() {
        this.a = new Object();
        this.c = new LinkedList();
    }

    public final zzbbc zza(boolean z) {
        int v = 0;
        zzbbc zzbbc0 = null;
        synchronized(this.a) {
            if(this.c.isEmpty()) {
                zzcfi.zze("Queue empty");
                return null;
            }
            if(this.c.size() >= 2) {
                int v2 = 0x80000000;
                int v3 = 0;
                for(Object object1: this.c) {
                    zzbbc zzbbc1 = (zzbbc)object1;
                    int v4 = zzbbc1.zzb();
                    if(v4 > v2) {
                        v = v3;
                    }
                    if(v4 > v2) {
                        zzbbc0 = zzbbc1;
                    }
                    ++v3;
                    v2 = v4 <= v2 ? v2 : v4;
                }
                this.c.remove(v);
                return zzbbc0;
            }
            zzbbc zzbbc2 = (zzbbc)this.c.get(0);
            if(z) {
                this.c.remove(0);
            }
            else {
                zzbbc2.zzi();
            }
            return zzbbc2;
        }
    }

    public final void zzb(zzbbc zzbbc0) {
        synchronized(this.a) {
            if(this.c.size() >= 10) {
                zzcfi.zze(("Queue is full, current size = " + this.c.size()));
                this.c.remove(0);
            }
            int v1 = this.b;
            this.b = v1 + 1;
            zzbbc0.zzj(v1);
            zzbbc0.zzn();
            this.c.add(zzbbc0);
        }
    }

    public final boolean zzc(zzbbc zzbbc0) {
        synchronized(this.a) {
            Iterator iterator0 = this.c.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                zzbbc zzbbc1 = (zzbbc)object1;
                if(!zzt.zzo().zzh().zzM()) {
                    if(zzbbc0 == zzbbc1 || !zzbbc1.zzd().equals(zzbbc0.zzd())) {
                        continue;
                    }
                    iterator0.remove();
                    return true;
                }
                if(!zzt.zzo().zzh().zzN() && zzbbc0 != zzbbc1 && zzbbc1.zzf().equals(zzbbc0.zzf())) {
                    iterator0.remove();
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbc zzbbc0) {
        synchronized(this.a) {
            return this.c.contains(zzbbc0);
        }
    }
}

