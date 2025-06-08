package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@Class(creator = "AdRequestInfoParcelCreator")
@ParametersAreNonnullByDefault
public final class zzbzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    @Field(id = 0x1F)
    public final long zzA;
    @Field(id = 33)
    public final String zzB;
    @Field(id = 34)
    public final float zzC;
    @Field(id = 35)
    public final int zzD;
    @Field(id = 36)
    public final int zzE;
    @Field(id = 37)
    public final boolean zzF;
    @Field(id = 39)
    public final String zzG;
    @Field(id = 40)
    public final boolean zzH;
    @Field(id = 41)
    public final String zzI;
    @Field(id = 42)
    public final boolean zzJ;
    @Field(id = 43)
    public final int zzK;
    @Field(id = 44)
    public final Bundle zzL;
    @Field(id = 45)
    public final String zzM;
    @Field(id = 46)
    public final zzdo zzN;
    @Field(id = 0x2F)
    public final boolean zzO;
    @Field(id = 0x30)
    public final Bundle zzP;
    @Field(id = 49)
    public final String zzQ;
    @Field(id = 50)
    public final String zzR;
    @Field(id = 51)
    public final String zzS;
    @Field(id = 52)
    public final boolean zzT;
    @Field(id = 53)
    public final List zzU;
    @Field(id = 54)
    public final String zzV;
    @Field(id = 55)
    public final List zzW;
    @Field(id = 56)
    public final int zzX;
    @Field(id = 57)
    public final boolean zzY;
    @Field(id = 58)
    public final boolean zzZ;
    @Field(id = 1)
    public final int zza;
    @Field(id = 59)
    public final boolean zzaa;
    @Field(id = 60)
    public final ArrayList zzab;
    @Field(id = 61)
    public final String zzac;
    @Field(id = 0x3F)
    public final zzbqs zzad;
    @Field(id = 0x40)
    public final String zzae;
    @Field(id = 65)
    public final Bundle zzaf;
    @Field(id = 2)
    public final Bundle zzb;
    @Field(id = 3)
    public final zzl zzc;
    @Field(id = 4)
    public final zzq zzd;
    @Field(id = 5)
    public final String zze;
    @Field(id = 6)
    public final ApplicationInfo zzf;
    @Field(id = 7)
    public final PackageInfo zzg;
    @Field(id = 8)
    public final String zzh;
    @Field(id = 9)
    public final String zzi;
    @Field(id = 10)
    public final String zzj;
    @Field(id = 11)
    public final zzcfo zzk;
    @Field(id = 12)
    public final Bundle zzl;
    @Field(id = 13)
    public final int zzm;
    @Field(id = 14)
    public final List zzn;
    @Field(id = 15)
    public final Bundle zzo;
    @Field(id = 16)
    public final boolean zzp;
    @Field(id = 18)
    public final int zzq;
    @Field(id = 19)
    public final int zzr;
    @Field(id = 20)
    public final float zzs;
    @Field(id = 21)
    public final String zzt;
    @Field(id = 25)
    public final long zzu;
    @Field(id = 26)
    public final String zzv;
    @Field(id = 27)
    public final List zzw;
    @Field(id = 28)
    public final String zzx;
    @Field(id = 29)
    public final zzbkp zzy;
    @Field(id = 30)
    public final List zzz;

    static {
        zzbzh.CREATOR = new zzbzi();
    }

    public zzbzh(int v, Bundle bundle0, zzl zzl0, zzq zzq0, String s, ApplicationInfo applicationInfo0, PackageInfo packageInfo0, String s1, String s2, String s3, zzcfo zzcfo0, Bundle bundle1, int v1, ArrayList arrayList0, Bundle bundle2, boolean z, int v2, int v3, float f, String s4, long v4, String s5, ArrayList arrayList1, String s6, zzbkp zzbkp0, ArrayList arrayList2, long v5, String s7, float f1, boolean z1, int v6, int v7, boolean z2, String s8, String s9, boolean z3, int v8, Bundle bundle3, String s10, zzdo zzdo0, boolean z4, Bundle bundle4, String s11, String s12, String s13, boolean z5, ArrayList arrayList3, String s14, ArrayList arrayList4, int v9, boolean z6, boolean z7, boolean z8, ArrayList arrayList5, String s15, zzbqs zzbqs0, String s16, Bundle bundle5) {
        this.zza = v;
        this.zzb = bundle0;
        this.zzc = zzl0;
        this.zzd = zzq0;
        this.zze = s;
        this.zzf = applicationInfo0;
        this.zzg = packageInfo0;
        this.zzh = s1;
        this.zzi = s2;
        this.zzj = s3;
        this.zzk = zzcfo0;
        this.zzl = bundle1;
        this.zzm = v1;
        this.zzn = arrayList0;
        this.zzz = arrayList2 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList2);
        this.zzo = bundle2;
        this.zzp = z;
        this.zzq = v2;
        this.zzr = v3;
        this.zzs = f;
        this.zzt = s4;
        this.zzu = v4;
        this.zzv = s5;
        this.zzw = arrayList1 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList1);
        this.zzx = s6;
        this.zzy = zzbkp0;
        this.zzA = v5;
        this.zzB = s7;
        this.zzC = f1;
        this.zzH = z1;
        this.zzD = v6;
        this.zzE = v7;
        this.zzF = z2;
        this.zzG = s8;
        this.zzI = s9;
        this.zzJ = z3;
        this.zzK = v8;
        this.zzL = bundle3;
        this.zzM = s10;
        this.zzN = zzdo0;
        this.zzO = z4;
        this.zzP = bundle4;
        this.zzQ = s11;
        this.zzR = s12;
        this.zzS = s13;
        this.zzT = z5;
        this.zzU = arrayList3;
        this.zzV = s14;
        this.zzW = arrayList4;
        this.zzX = v9;
        this.zzY = z6;
        this.zzZ = z7;
        this.zzaa = z8;
        this.zzab = arrayList5;
        this.zzac = s15;
        this.zzad = zzbqs0;
        this.zzae = s16;
        this.zzaf = bundle5;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zza);
        SafeParcelWriter.writeBundle(parcel0, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.zzc, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzd, v, false);
        SafeParcelWriter.writeString(parcel0, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzf, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 7, this.zzg, v, false);
        SafeParcelWriter.writeString(parcel0, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel0, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel0, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel0, 11, this.zzk, v, false);
        SafeParcelWriter.writeBundle(parcel0, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel0, 13, this.zzm);
        SafeParcelWriter.writeStringList(parcel0, 14, this.zzn, false);
        SafeParcelWriter.writeBundle(parcel0, 15, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel0, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel0, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel0, 19, this.zzr);
        SafeParcelWriter.writeFloat(parcel0, 20, this.zzs);
        SafeParcelWriter.writeString(parcel0, 21, this.zzt, false);
        SafeParcelWriter.writeLong(parcel0, 25, this.zzu);
        SafeParcelWriter.writeString(parcel0, 26, this.zzv, false);
        SafeParcelWriter.writeStringList(parcel0, 27, this.zzw, false);
        SafeParcelWriter.writeString(parcel0, 28, this.zzx, false);
        SafeParcelWriter.writeParcelable(parcel0, 29, this.zzy, v, false);
        SafeParcelWriter.writeStringList(parcel0, 30, this.zzz, false);
        SafeParcelWriter.writeLong(parcel0, 0x1F, this.zzA);
        SafeParcelWriter.writeString(parcel0, 33, this.zzB, false);
        SafeParcelWriter.writeFloat(parcel0, 34, this.zzC);
        SafeParcelWriter.writeInt(parcel0, 35, this.zzD);
        SafeParcelWriter.writeInt(parcel0, 36, this.zzE);
        SafeParcelWriter.writeBoolean(parcel0, 37, this.zzF);
        SafeParcelWriter.writeString(parcel0, 39, this.zzG, false);
        SafeParcelWriter.writeBoolean(parcel0, 40, this.zzH);
        SafeParcelWriter.writeString(parcel0, 41, this.zzI, false);
        SafeParcelWriter.writeBoolean(parcel0, 42, this.zzJ);
        SafeParcelWriter.writeInt(parcel0, 43, this.zzK);
        SafeParcelWriter.writeBundle(parcel0, 44, this.zzL, false);
        SafeParcelWriter.writeString(parcel0, 45, this.zzM, false);
        SafeParcelWriter.writeParcelable(parcel0, 46, this.zzN, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 0x2F, this.zzO);
        SafeParcelWriter.writeBundle(parcel0, 0x30, this.zzP, false);
        SafeParcelWriter.writeString(parcel0, 49, this.zzQ, false);
        SafeParcelWriter.writeString(parcel0, 50, this.zzR, false);
        SafeParcelWriter.writeString(parcel0, 51, this.zzS, false);
        SafeParcelWriter.writeBoolean(parcel0, 52, this.zzT);
        SafeParcelWriter.writeIntegerList(parcel0, 53, this.zzU, false);
        SafeParcelWriter.writeString(parcel0, 54, this.zzV, false);
        SafeParcelWriter.writeStringList(parcel0, 55, this.zzW, false);
        SafeParcelWriter.writeInt(parcel0, 56, this.zzX);
        SafeParcelWriter.writeBoolean(parcel0, 57, this.zzY);
        SafeParcelWriter.writeBoolean(parcel0, 58, this.zzZ);
        SafeParcelWriter.writeBoolean(parcel0, 59, this.zzaa);
        SafeParcelWriter.writeStringList(parcel0, 60, this.zzab, false);
        SafeParcelWriter.writeString(parcel0, 61, this.zzac, false);
        SafeParcelWriter.writeParcelable(parcel0, 0x3F, this.zzad, v, false);
        SafeParcelWriter.writeString(parcel0, 0x40, this.zzae, false);
        SafeParcelWriter.writeBundle(parcel0, 65, this.zzaf, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

