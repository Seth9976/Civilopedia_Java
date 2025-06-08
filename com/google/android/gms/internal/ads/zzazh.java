package com.google.android.gms.internal.ads;

public final class zzazh {
    public int a;
    public int b;
    public byte[] zza;

    public zzazh() {
    }

    public zzazh(int v) {
        this.zza = new byte[v];
        this.b = v;
    }

    public zzazh(byte[] arr_b) {
        this.zza = arr_b;
        this.b = arr_b.length;
    }

    public final int zza() {
        return this.b - this.a;
    }

    public final int zzb() {
        return this.zza == null ? 0 : this.zza.length;
    }

    public final int zzc() {
        return this.a;
    }

    public final int zzd() {
        return this.b;
    }

    public final int zze() {
        int v = this.a;
        this.a = v + 4;
        return this.zza[v + 3] & 0xFF | ((this.zza[v] & 0xFF) << 24 | (this.zza[v + 1] & 0xFF) << 16 | (this.zza[v + 2] & 0xFF) << 8);
    }

    public final int zzf() {
        int v = this.a;
        this.a = v + 2;
        return (this.zza[v + 1] & 0xFF) << 8 | this.zza[v] & 0xFF;
    }

    public final int zzg() {
        int v = this.a;
        this.a = v + 1;
        return this.zza[v] & 0xFF;
    }

    public final int zzh() {
        int v = this.a;
        this.a = v + 4;
        return this.zza[v + 1] & 0xFF | (this.zza[v] & 0xFF) << 8;
    }

    public final int zzi() {
        int v = this.zze();
        if(v < 0) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final int zzj() {
        int v = this.a;
        this.a = v + 2;
        return this.zza[v + 1] & 0xFF | (this.zza[v] & 0xFF) << 8;
    }

    public final long zzk() {
        int v = this.a;
        this.a = v + 4;
        return (((long)this.zza[v + 1]) & 0xFFL) << 8 | ((long)this.zza[v]) & 0xFFL | (((long)this.zza[v + 2]) & 0xFFL) << 16 | (((long)this.zza[v + 3]) & 0xFFL) << 24;
    }

    public final long zzl() {
        int v = this.a;
        this.a = v + 8;
        return (((long)this.zza[v + 1]) & 0xFFL) << 0x30 | (((long)this.zza[v]) & 0xFFL) << 56 | (((long)this.zza[v + 2]) & 0xFFL) << 40 | (((long)this.zza[v + 3]) & 0xFFL) << 0x20 | (((long)this.zza[v + 4]) & 0xFFL) << 24 | (((long)this.zza[v + 5]) & 0xFFL) << 16 | (((long)this.zza[v + 6]) & 0xFFL) << 8 | ((long)this.zza[v + 7]) & 0xFFL;
    }

    public final long zzm() {
        int v = this.a;
        this.a = v + 4;
        return (((long)this.zza[v + 1]) & 0xFFL) << 16 | (((long)this.zza[v]) & 0xFFL) << 24 | (((long)this.zza[v + 2]) & 0xFFL) << 8 | ((long)this.zza[v + 3]) & 0xFFL;
    }

    public final long zzn() {
        long v = this.zzl();
        if(v < 0L) {
            throw new IllegalStateException("Top bit not zero: " + v);
        }
        return v;
    }

    public final String zzo(int v) {
        if(v == 0) {
            return "";
        }
        int v1 = this.a;
        int v2 = v1 + v;
        if(v2 - 1 < this.b && this.zza[v2 - 1] == 0) {
            --v;
        }
        String s = new String(this.zza, v1, v);
        this.a = v2;
        return s;
    }

    public final short zzp() {
        int v = this.a;
        this.a = v + 2;
        return (short)(this.zza[v + 1] & 0xFF | (this.zza[v] & 0xFF) << 8);
    }

    public final void zzq(byte[] arr_b, int v, int v1) {
        System.arraycopy(this.zza, this.a, arr_b, v, v1);
        this.a += v1;
    }

    public final void zzr() {
        this.a = 0;
        this.b = 0;
    }

    public final void zzs(int v) {
        this.zzt((this.zzb() >= v ? this.zza : new byte[v]), v);
    }

    public final void zzt(byte[] arr_b, int v) {
        this.zza = arr_b;
        this.b = v;
        this.a = 0;
    }

    public final void zzu(int v) {
        zzayz.zzc(v >= 0 && v <= this.zza.length);
        this.b = v;
    }

    public final void zzv(int v) {
        zzayz.zzc(v >= 0 && v <= this.b);
        this.a = v;
    }

    public final void zzw(int v) {
        this.zzv(this.a + v);
    }
}

