package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class i implements Parcelable.Creator {
    public final int a;

    public i(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                return new zzabd(parcel0);
            }
            case 1: {
                return new zzabg(parcel0);
            }
            case 2: {
                return new zzabi(parcel0);
            }
            case 3: {
                return new zzabk(parcel0);
            }
            case 4: {
                return new zzabm(parcel0);
            }
            case 5: {
                return new zzabo(parcel0);
            }
            case 6: {
                return new zzabq(parcel0);
            }
            case 7: {
                return new zzabs(parcel0);
            }
            case 8: {
                return new zzabu(parcel0);
            }
            case 9: {
                return new zzabw(parcel0);
            }
            case 10: {
                return new zzacd(parcel0);
            }
            case 11: {
                return new zzacf(parcel0);
            }
            case 12: {
                return new zzach(parcel0);
            }
            case 13: {
                return new zzacj(parcel0);
            }
            case 14: {
                return new zzacl(parcel0);
            }
            case 15: {
                return new zzaco(parcel0);
            }
            case 16: {
                return new zzacr(parcel0);
            }
            case 17: {
                return new zzacu(parcel0);
            }
            case 18: {
                return new zzacw(parcel0);  // 初始化器: Lcom/google/android/gms/internal/ads/zzabi;-><init>(Landroid/os/Parcel;)V
            }
            case 19: {
                return new zzart(parcel0);
            }
            case 20: {
                return new zzats(parcel0);
            }
            case 21: {
                return new zzatr(parcel0);
            }
            case 22: {
                return new zzawe(parcel0);
            }
            case 23: {
                return new zzawg(parcel0);
            }
            case 24: {
                return new zzawi(parcel0);
            }
            case 25: {
                return new zzawm(parcel0);
            }
            case 26: {
                return new zzazr(parcel0);
            }
            case 27: {
                return new zzbl(parcel0);
            }
            case 28: {
                return new zzv(parcel0);
            }
            default: {
                return new zzu(parcel0);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new zzabd[v];
            }
            case 1: {
                return new zzabg[v];
            }
            case 2: {
                return new zzabi[v];
            }
            case 3: {
                return new zzabk[v];
            }
            case 4: {
                return new zzabm[v];
            }
            case 5: {
                return new zzabo[v];
            }
            case 6: {
                return new zzabq[v];
            }
            case 7: {
                return new zzabs[v];
            }
            case 8: {
                return new zzabu[v];
            }
            case 9: {
                return new zzabw[v];
            }
            case 10: {
                return new zzacd[v];
            }
            case 11: {
                return new zzacf[v];
            }
            case 12: {
                return new zzach[v];
            }
            case 13: {
                return new zzacj[v];
            }
            case 14: {
                return new zzacl[v];
            }
            case 15: {
                return new zzaco[v];
            }
            case 16: {
                return new zzacr[v];
            }
            case 17: {
                return new zzacu[v];
            }
            case 18: {
                return new zzacw[v];
            }
            case 19: {
                return new zzart[v];
            }
            case 20: {
                return new zzats[v];
            }
            case 21: {
                return new zzatr[v];
            }
            case 22: {
                return new zzawe[0];
            }
            case 23: {
                return new zzawg[v];
            }
            case 24: {
                return new zzawi[v];
            }
            case 25: {
                return new zzawm[v];
            }
            case 26: {
                return new zzazr[0];
            }
            case 27: {
                return new zzbl[v];
            }
            case 28: {
                return new zzv[v];
            }
            default: {
                return new zzu[v];
            }
        }
    }
}

