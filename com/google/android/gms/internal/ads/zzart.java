package com.google.android.gms.internal.ads;

import A.f;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import i3.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzart implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzawe zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzats zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzazr zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    static {
        zzart.CREATOR = new i(19);
    }

    public zzart(Parcel parcel0) {
        this.zza = parcel0.readString();
        this.zze = parcel0.readString();
        this.zzf = parcel0.readString();
        this.zzc = parcel0.readString();
        this.zzb = parcel0.readInt();
        this.zzg = parcel0.readInt();
        this.zzj = parcel0.readInt();
        this.zzk = parcel0.readInt();
        this.zzl = parcel0.readFloat();
        this.zzm = parcel0.readInt();
        this.zzn = parcel0.readFloat();
        this.zzp = parcel0.readInt() == 0 ? null : parcel0.createByteArray();
        this.zzo = parcel0.readInt();
        this.zzq = (zzazr)parcel0.readParcelable(zzazr.class.getClassLoader());
        this.zzr = parcel0.readInt();
        this.zzs = parcel0.readInt();
        this.zzt = parcel0.readInt();
        this.zzu = parcel0.readInt();
        this.zzv = parcel0.readInt();
        this.zzx = parcel0.readInt();
        this.zzy = parcel0.readString();
        this.zzz = parcel0.readInt();
        this.zzw = parcel0.readLong();
        int v = parcel0.readInt();
        this.zzh = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            byte[] arr_b = parcel0.createByteArray();
            this.zzh.add(arr_b);
        }
        this.zzi = (zzats)parcel0.readParcelable(zzats.class.getClassLoader());
        this.zzd = (zzawe)parcel0.readParcelable(zzawe.class.getClassLoader());
    }

    public zzart(String s, String s1, String s2, String s3, int v, int v1, int v2, int v3, float f, int v4, float f1, byte[] arr_b, int v5, zzazr zzazr0, int v6, int v7, int v8, int v9, int v10, int v11, String s4, int v12, long v13, List list0, zzats zzats0, zzawe zzawe0) {
        this.zza = s;
        this.zze = s1;
        this.zzf = s2;
        this.zzc = s3;
        this.zzb = v;
        this.zzg = v1;
        this.zzj = v2;
        this.zzk = v3;
        this.zzl = f;
        this.zzm = v4;
        this.zzn = f1;
        this.zzp = arr_b;
        this.zzo = v5;
        this.zzq = zzazr0;
        this.zzr = v6;
        this.zzs = v7;
        this.zzt = v8;
        this.zzu = v9;
        this.zzv = v10;
        this.zzx = v11;
        this.zzy = s4;
        this.zzz = v12;
        this.zzw = v13;
        this.zzh = list0 == null ? Collections.emptyList() : list0;
        this.zzi = zzats0;
        this.zzd = zzawe0;
    }

    public static void a(MediaFormat mediaFormat0, String s, int v) {
        if(v != -1) {
            mediaFormat0.setInteger(s, v);
        }
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzart.class == class0) {
                zzart zzart0 = (zzart)object0;
                if(this.zzb == zzart0.zzb && this.zzg == zzart0.zzg && this.zzj == zzart0.zzj && this.zzk == zzart0.zzk && this.zzl == zzart0.zzl && this.zzm == zzart0.zzm && this.zzn == zzart0.zzn && this.zzo == zzart0.zzo && this.zzr == zzart0.zzr && this.zzs == zzart0.zzs && this.zzt == zzart0.zzt && this.zzu == zzart0.zzu && this.zzv == zzart0.zzv && this.zzw == zzart0.zzw && this.zzx == zzart0.zzx && zzazo.zzo(this.zza, zzart0.zza) && zzazo.zzo(this.zzy, zzart0.zzy) && this.zzz == zzart0.zzz && zzazo.zzo(this.zze, zzart0.zze) && zzazo.zzo(this.zzf, zzart0.zzf) && zzazo.zzo(this.zzc, zzart0.zzc) && zzazo.zzo(this.zzi, zzart0.zzi) && zzazo.zzo(this.zzd, zzart0.zzd) && zzazo.zzo(this.zzq, zzart0.zzq) && Arrays.equals(this.zzp, zzart0.zzp) && this.zzh.size() == zzart0.zzh.size()) {
                    for(int v = 0; v < this.zzh.size(); ++v) {
                        if(!Arrays.equals(((byte[])this.zzh.get(v)), ((byte[])zzart0.zzh.get(v)))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.i;
        if(v == 0) {
            int v1 = 0;
            int v2 = ((((((((((((this.zza == null ? 0 : this.zza.hashCode()) + 0x20F) * 0x1F + (this.zze == null ? 0 : this.zze.hashCode())) * 0x1F + (this.zzf == null ? 0 : this.zzf.hashCode())) * 0x1F + (this.zzc == null ? 0 : this.zzc.hashCode())) * 0x1F + this.zzb) * 0x1F + this.zzj) * 0x1F + this.zzk) * 0x1F + this.zzr) * 0x1F + this.zzs) * 0x1F + (this.zzy == null ? 0 : this.zzy.hashCode())) * 0x1F + this.zzz) * 0x1F;
            int v3 = this.zzi == null ? 0 : this.zzi.hashCode();
            zzawe zzawe0 = this.zzd;
            if(zzawe0 != null) {
                v1 = zzawe0.hashCode();
            }
            v = (v2 + v3) * 0x1F + v1;
            this.i = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = e.j("Format(", this.zza, ", ", this.zze, ", ");
        f.s(stringBuilder0, this.zzf, ", ", this.zzb, ", ");
        f.s(stringBuilder0, this.zzy, ", [", this.zzj, ", ");
        stringBuilder0.append(this.zzk);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzl);
        stringBuilder0.append("], [");
        stringBuilder0.append(this.zzr);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzs);
        stringBuilder0.append("])");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zze);
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zzc);
        parcel0.writeInt(this.zzb);
        parcel0.writeInt(this.zzg);
        parcel0.writeInt(this.zzj);
        parcel0.writeInt(this.zzk);
        parcel0.writeFloat(this.zzl);
        parcel0.writeInt(this.zzm);
        parcel0.writeFloat(this.zzn);
        parcel0.writeInt((this.zzp == null ? 0 : 1));
        byte[] arr_b = this.zzp;
        if(arr_b != null) {
            parcel0.writeByteArray(arr_b);
        }
        parcel0.writeInt(this.zzo);
        parcel0.writeParcelable(this.zzq, v);
        parcel0.writeInt(this.zzr);
        parcel0.writeInt(this.zzs);
        parcel0.writeInt(this.zzt);
        parcel0.writeInt(this.zzu);
        parcel0.writeInt(this.zzv);
        parcel0.writeInt(this.zzx);
        parcel0.writeString(this.zzy);
        parcel0.writeInt(this.zzz);
        parcel0.writeLong(this.zzw);
        int v1 = this.zzh.size();
        parcel0.writeInt(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            parcel0.writeByteArray(((byte[])this.zzh.get(v2)));
        }
        parcel0.writeParcelable(this.zzi, 0);
        parcel0.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int v = this.zzj;
        if(v != -1) {
            return this.zzk == -1 ? -1 : v * this.zzk;
        }
        return -1;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzb() {
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", this.zzf);
        String s = this.zzy;
        if(s != null) {
            mediaFormat0.setString("language", s);
        }
        zzart.a(mediaFormat0, "max-input-size", this.zzg);
        zzart.a(mediaFormat0, "width", this.zzj);
        zzart.a(mediaFormat0, "height", this.zzk);
        float f = this.zzl;
        if(f != -1.0f) {
            mediaFormat0.setFloat("frame-rate", f);
        }
        zzart.a(mediaFormat0, "rotation-degrees", this.zzm);
        zzart.a(mediaFormat0, "channel-count", this.zzr);
        zzart.a(mediaFormat0, "sample-rate", this.zzs);
        zzart.a(mediaFormat0, "encoder-delay", this.zzu);
        zzart.a(mediaFormat0, "encoder-padding", this.zzv);
        for(int v = 0; v < this.zzh.size(); ++v) {
            mediaFormat0.setByteBuffer("csd-" + v, ByteBuffer.wrap(((byte[])this.zzh.get(v))));
        }
        zzazr zzazr0 = this.zzq;
        if(zzazr0 != null) {
            zzart.a(mediaFormat0, "color-transfer", zzazr0.zzc);
            zzart.a(mediaFormat0, "color-standard", zzazr0.zza);
            zzart.a(mediaFormat0, "color-range", zzazr0.zzb);
            byte[] arr_b = zzazr0.zzd;
            if(arr_b != null) {
                mediaFormat0.setByteBuffer("hdr-static-info", ByteBuffer.wrap(arr_b));
            }
        }
        return mediaFormat0;
    }

    public final zzart zzc(zzats zzats0) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzats0, this.zzd);
    }

    public final zzart zzd(int v, int v1) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, v, v1, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zze(int v) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, v, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zzf(zzawe zzawe0) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzawe0);
    }

    public static zzart zzg(String s, String s1, String s2, int v, int v1, int v2, int v3, List list0, zzats zzats0, int v4, String s3) {
        return zzart.zzh(s, s1, null, -1, -1, v2, v3, -1, -1, -1, null, zzats0, 0, s3, null);
    }

    public static zzart zzh(String s, String s1, String s2, int v, int v1, int v2, int v3, int v4, int v5, int v6, List list0, zzats zzats0, int v7, String s3, zzawe zzawe0) {
        return new zzart(s, null, s1, null, -1, v1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, v2, v3, v4, -1, -1, v7, s3, -1, 0x7FFFFFFFFFFFFFFFL, list0, zzats0, null);
    }

    public static zzart zzi(String s, String s1, String s2, int v, List list0, String s3, zzats zzats0) {
        return new zzart(s, null, s1, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, s3, -1, 0x7FFFFFFFFFFFFFFFL, list0, zzats0, null);
    }

    public static zzart zzj(String s, String s1, String s2, int v, zzats zzats0) {
        return new zzart(s, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, 0x7FFFFFFFFFFFFFFFL, null, zzats0, null);
    }

    public static zzart zzk(String s, String s1, String s2, int v, int v1, String s3, int v2, zzats zzats0, long v3, List list0) {
        return new zzart(s, null, s1, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, v1, s3, -1, v3, list0, zzats0, null);
    }

    public static zzart zzl(String s, String s1, String s2, int v, int v1, int v2, int v3, float f, List list0, int v4, float f1, byte[] arr_b, int v5, zzazr zzazr0, zzats zzats0) {
        return new zzart(s, null, s1, null, -1, v1, v2, v3, -1.0f, v4, f1, arr_b, v5, zzazr0, -1, -1, -1, -1, -1, 0, null, -1, 0x7FFFFFFFFFFFFFFFL, list0, zzats0, null);
    }
}

