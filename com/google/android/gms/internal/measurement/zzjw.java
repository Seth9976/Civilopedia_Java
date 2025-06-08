package com.google.android.gms.internal.measurement;

public enum zzjw {
    DOUBLE(0, 1, zzkp.zze),
    FLOAT(1, 1, zzkp.zzd),
    INT64(2, 1, zzkp.zzc),
    UINT64(3, 1, zzkp.zzc),
    INT32(4, 1, zzkp.zzb),
    FIXED64(5, 1, zzkp.zzc),
    FIXED32(6, 1, zzkp.zzb),
    BOOL(7, 1, zzkp.zzf),
    STRING(8, 1, zzkp.zzg),
    MESSAGE(9, 1, zzkp.zzj),
    BYTES(10, 1, zzkp.zzh),
    UINT32(11, 1, zzkp.zzb),
    ENUM(12, 1, zzkp.zzi),
    SFIXED32(13, 1, zzkp.zzb),
    SFIXED64(14, 1, zzkp.zzc),
    SINT32(15, 1, zzkp.zzb),
    SINT64(16, 1, zzkp.zzc),
    GROUP(17, 1, zzkp.zzj),
    DOUBLE_LIST(18, 2, zzkp.zze),
    FLOAT_LIST(19, 2, zzkp.zzd),
    INT64_LIST(20, 2, zzkp.zzc),
    UINT64_LIST(21, 2, zzkp.zzc),
    INT32_LIST(22, 2, zzkp.zzb),
    FIXED64_LIST(23, 2, zzkp.zzc),
    FIXED32_LIST(24, 2, zzkp.zzb),
    BOOL_LIST(25, 2, zzkp.zzf),
    STRING_LIST(26, 2, zzkp.zzg),
    MESSAGE_LIST(27, 2, zzkp.zzj),
    BYTES_LIST(28, 2, zzkp.zzh),
    UINT32_LIST(29, 2, zzkp.zzb),
    ENUM_LIST(30, 2, zzkp.zzi),
    SFIXED32_LIST(0x1F, 2, zzkp.zzb),
    SFIXED64_LIST(0x20, 2, zzkp.zzc),
    SINT32_LIST(33, 2, zzkp.zzb),
    SINT64_LIST(34, 2, zzkp.zzc),
    DOUBLE_LIST_PACKED(35, 3, zzkp.zze),
    FLOAT_LIST_PACKED(36, 3, zzkp.zzd),
    INT64_LIST_PACKED(37, 3, zzkp.zzc),
    UINT64_LIST_PACKED(38, 3, zzkp.zzc),
    INT32_LIST_PACKED(39, 3, zzkp.zzb),
    FIXED64_LIST_PACKED(40, 3, zzkp.zzc),
    FIXED32_LIST_PACKED(41, 3, zzkp.zzb),
    BOOL_LIST_PACKED(42, 3, zzkp.zzf),
    UINT32_LIST_PACKED(43, 3, zzkp.zzb),
    ENUM_LIST_PACKED(44, 3, zzkp.zzi),
    SFIXED32_LIST_PACKED(45, 3, zzkp.zzb),
    SFIXED64_LIST_PACKED(46, 3, zzkp.zzc),
    SINT32_LIST_PACKED(0x2F, 3, zzkp.zzb),
    SINT64_LIST_PACKED(0x30, 3, zzkp.zzc),
    GROUP_LIST(49, 2, zzkp.zzj),
    MAP(50, 4, zzkp.zza);

    public final int i;
    public static final zzjw[] j;

    static {
        arr_zzjw[0] = zzjw.zza;
        arr_zzjw[1] = zzjw.zzb;
        arr_zzjw[2] = zzjw.zzc;
        arr_zzjw[3] = zzjw.zzd;
        arr_zzjw[4] = zzjw.zze;
        arr_zzjw[5] = zzjw.zzf;
        arr_zzjw[6] = zzjw.zzg;
        arr_zzjw[7] = zzjw.zzh;
        arr_zzjw[8] = zzjw.zzi;
        arr_zzjw[9] = zzjw.zzj;
        arr_zzjw[10] = zzjw.zzk;
        arr_zzjw[11] = zzjw.zzl;
        arr_zzjw[12] = zzjw.zzm;
        arr_zzjw[13] = zzjw.zzn;
        arr_zzjw[14] = zzjw.zzo;
        arr_zzjw[15] = zzjw.zzp;
        arr_zzjw[16] = zzjw.zzq;
        arr_zzjw[17] = zzjw.zzr;
        arr_zzjw[18] = zzjw.zzs;
        arr_zzjw[19] = zzjw.zzt;
        arr_zzjw[20] = zzjw.zzu;
        arr_zzjw[21] = zzjw.zzv;
        arr_zzjw[22] = zzjw.zzw;
        arr_zzjw[23] = zzjw.zzx;
        arr_zzjw[24] = zzjw.zzy;
        arr_zzjw[25] = zzjw.zzz;
        arr_zzjw[26] = zzjw.zzA;
        arr_zzjw[27] = zzjw.zzB;
        arr_zzjw[28] = zzjw.zzC;
        arr_zzjw[29] = zzjw.zzD;
        arr_zzjw[30] = zzjw.zzE;
        arr_zzjw[0x1F] = zzjw.zzF;
        arr_zzjw[0x20] = zzjw.zzG;
        arr_zzjw[33] = zzjw.zzH;
        arr_zzjw[34] = zzjw.zzI;
        arr_zzjw[35] = zzjw.zzJ;
        arr_zzjw[36] = zzjw.zzK;
        arr_zzjw[37] = zzjw.zzL;
        arr_zzjw[38] = zzjw.zzM;
        arr_zzjw[39] = zzjw.zzN;
        arr_zzjw[40] = zzjw.zzO;
        arr_zzjw[41] = zzjw.zzP;
        arr_zzjw[42] = zzjw.zzQ;
        arr_zzjw[43] = zzjw.zzR;
        arr_zzjw[44] = zzjw.zzS;
        arr_zzjw[45] = zzjw.zzT;
        arr_zzjw[46] = zzjw.zzU;
        arr_zzjw[0x2F] = zzjw.zzV;
        arr_zzjw[0x30] = zzjw.zzW;
        arr_zzjw[49] = zzjw.zzX;
        arr_zzjw[50] = zzjw.zzY;
        zzjw.k = arr_zzjw;
        zzjw[] arr_zzjw1 = (zzjw[])zzjw.k.clone();
        zzjw.j = new zzjw[arr_zzjw1.length];
        for(int v = 0; v < arr_zzjw1.length; ++v) {
            zzjw zzjw0 = arr_zzjw1[v];
            zzjw.j[zzjw0.i] = zzjw0;
        }
    }

    public zzjw(int v1, int v2, zzkp zzkp0) {
        this.i = v1;
        if(v2 == 1) {
            zzkp0.ordinal();
        }
    }

    public final int zza() {
        return this.i;
    }
}

