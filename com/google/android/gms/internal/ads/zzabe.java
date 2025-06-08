package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class zzabe {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public zzabe() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x200);
        this.a = byteArrayOutputStream0;
        this.b = new DataOutputStream(byteArrayOutputStream0);
    }

    public final byte[] zza(zzabd zzabd0) {
        this.a.reset();
        try {
            this.b.writeBytes(zzabd0.zza);
            this.b.writeByte(0);
            this.b.writeBytes((zzabd0.zzb == null ? "" : zzabd0.zzb));
            this.b.writeByte(0);
            this.b.writeLong(zzabd0.zzc);
            this.b.writeLong(zzabd0.zzd);
            this.b.write(zzabd0.zze);
            this.b.flush();
            return this.a.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }
}

