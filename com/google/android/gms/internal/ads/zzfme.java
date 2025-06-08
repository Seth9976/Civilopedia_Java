package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "GassResponseParcelCreator")
public final class zzfme extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public zzaly i;
    public byte[] j;
    @VersionField(id = 1)
    public final int zza;

    static {
        zzfme.CREATOR = new zzfmf();
    }

    public zzfme(int v, byte[] arr_b) {
        this.zza = v;
        this.i = null;
        this.j = arr_b;
        this.a();
    }

    public final void a() {
        zzaly zzaly0 = this.i;
        if(zzaly0 == null && this.j != null) {
            return;
        }
        if(zzaly0 != null && this.j == null) {
            return;
        }
        if(zzaly0 == null || this.j == null) {
            throw zzaly0 != null || this.j != null ? new IllegalStateException("Impossible") : new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Invalid internal representation - full");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel0, 2, (this.j == null ? this.i.zzaw() : this.j), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final zzaly zza() {
        if(this.i == null) {
            try {
                this.i = zzaly.zze(this.j, zzgkc.zza());
                this.j = null;
            }
            catch(zzglc | NullPointerException zzglc0) {
                throw new IllegalStateException(zzglc0);
            }
        }
        this.a();
        return this.i;
    }
}

