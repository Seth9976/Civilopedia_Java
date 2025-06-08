package com.google.android.gms.internal.play_billing;

public enum zzhc {
    DOUBLE(0, 1, zzhs.zze),
    FLOAT(1, 1, zzhs.zzd),
    INT64(2, 1, zzhs.zzc),
    UINT64(3, 1, zzhs.zzc),
    INT32(4, 1, zzhs.zzb),
    FIXED64(5, 1, zzhs.zzc),
    FIXED32(6, 1, zzhs.zzb),
    BOOL(7, 1, zzhs.zzf),
    STRING(8, 1, zzhs.zzg),
    MESSAGE(9, 1, zzhs.zzj),
    BYTES(10, 1, zzhs.zzh),
    UINT32(11, 1, zzhs.zzb),
    ENUM(12, 1, zzhs.zzi),
    SFIXED32(13, 1, zzhs.zzb),
    SFIXED64(14, 1, zzhs.zzc),
    SINT32(15, 1, zzhs.zzb),
    SINT64(16, 1, zzhs.zzc),
    GROUP(17, 1, zzhs.zzj),
    DOUBLE_LIST(18, 2, zzhs.zze),
    FLOAT_LIST(19, 2, zzhs.zzd),
    INT64_LIST(20, 2, zzhs.zzc),
    UINT64_LIST(21, 2, zzhs.zzc),
    INT32_LIST(22, 2, zzhs.zzb),
    FIXED64_LIST(23, 2, zzhs.zzc),
    FIXED32_LIST(24, 2, zzhs.zzb),
    BOOL_LIST(25, 2, zzhs.zzf),
    STRING_LIST(26, 2, zzhs.zzg),
    MESSAGE_LIST(27, 2, zzhs.zzj),
    BYTES_LIST(28, 2, zzhs.zzh),
    UINT32_LIST(29, 2, zzhs.zzb),
    ENUM_LIST(30, 2, zzhs.zzi),
    SFIXED32_LIST(0x1F, 2, zzhs.zzb),
    SFIXED64_LIST(0x20, 2, zzhs.zzc),
    SINT32_LIST(33, 2, zzhs.zzb),
    SINT64_LIST(34, 2, zzhs.zzc),
    DOUBLE_LIST_PACKED(35, 3, zzhs.zze),
    FLOAT_LIST_PACKED(36, 3, zzhs.zzd),
    INT64_LIST_PACKED(37, 3, zzhs.zzc),
    UINT64_LIST_PACKED(38, 3, zzhs.zzc),
    INT32_LIST_PACKED(39, 3, zzhs.zzb),
    FIXED64_LIST_PACKED(40, 3, zzhs.zzc),
    FIXED32_LIST_PACKED(41, 3, zzhs.zzb),
    BOOL_LIST_PACKED(42, 3, zzhs.zzf),
    UINT32_LIST_PACKED(43, 3, zzhs.zzb),
    ENUM_LIST_PACKED(44, 3, zzhs.zzi),
    SFIXED32_LIST_PACKED(45, 3, zzhs.zzb),
    SFIXED64_LIST_PACKED(46, 3, zzhs.zzc),
    SINT32_LIST_PACKED(0x2F, 3, zzhs.zzb),
    SINT64_LIST_PACKED(0x30, 3, zzhs.zzc),
    GROUP_LIST(49, 2, zzhs.zzj),
    MAP(50, 4, zzhs.zza);

    public final int i;
    public static final zzhc[] j;

    static {
        arr_zzhc[0] = zzhc.zza;
        arr_zzhc[1] = zzhc.zzb;
        arr_zzhc[2] = zzhc.zzc;
        arr_zzhc[3] = zzhc.zzd;
        arr_zzhc[4] = zzhc.zze;
        arr_zzhc[5] = zzhc.zzf;
        arr_zzhc[6] = zzhc.zzg;
        arr_zzhc[7] = zzhc.zzh;
        arr_zzhc[8] = zzhc.zzi;
        arr_zzhc[9] = zzhc.zzj;
        arr_zzhc[10] = zzhc.zzk;
        arr_zzhc[11] = zzhc.zzl;
        arr_zzhc[12] = zzhc.zzm;
        arr_zzhc[13] = zzhc.zzn;
        arr_zzhc[14] = zzhc.zzo;
        arr_zzhc[15] = zzhc.zzp;
        arr_zzhc[16] = zzhc.zzq;
        arr_zzhc[17] = zzhc.zzr;
        arr_zzhc[18] = zzhc.zzs;
        arr_zzhc[19] = zzhc.zzt;
        arr_zzhc[20] = zzhc.zzu;
        arr_zzhc[21] = zzhc.zzv;
        arr_zzhc[22] = zzhc.zzw;
        arr_zzhc[23] = zzhc.zzx;
        arr_zzhc[24] = zzhc.zzy;
        arr_zzhc[25] = zzhc.zzz;
        arr_zzhc[26] = zzhc.zzA;
        arr_zzhc[27] = zzhc.zzB;
        arr_zzhc[28] = zzhc.zzC;
        arr_zzhc[29] = zzhc.zzD;
        arr_zzhc[30] = zzhc.zzE;
        arr_zzhc[0x1F] = zzhc.zzF;
        arr_zzhc[0x20] = zzhc.zzG;
        arr_zzhc[33] = zzhc.zzH;
        arr_zzhc[34] = zzhc.zzI;
        arr_zzhc[35] = zzhc.zzJ;
        arr_zzhc[36] = zzhc.zzK;
        arr_zzhc[37] = zzhc.zzL;
        arr_zzhc[38] = zzhc.zzM;
        arr_zzhc[39] = zzhc.zzN;
        arr_zzhc[40] = zzhc.zzO;
        arr_zzhc[41] = zzhc.zzP;
        arr_zzhc[42] = zzhc.zzQ;
        arr_zzhc[43] = zzhc.zzR;
        arr_zzhc[44] = zzhc.zzS;
        arr_zzhc[45] = zzhc.zzT;
        arr_zzhc[46] = zzhc.zzU;
        arr_zzhc[0x2F] = zzhc.zzV;
        arr_zzhc[0x30] = zzhc.zzW;
        arr_zzhc[49] = zzhc.zzX;
        arr_zzhc[50] = zzhc.zzY;
        zzhc.k = arr_zzhc;
        zzhc[] arr_zzhc1 = (zzhc[])zzhc.k.clone();
        zzhc.j = new zzhc[arr_zzhc1.length];
        for(int v = 0; v < arr_zzhc1.length; ++v) {
            zzhc zzhc0 = arr_zzhc1[v];
            zzhc.j[zzhc0.i] = zzhc0;
        }
    }

    public zzhc(int v1, int v2, zzhs zzhs0) {
        this.i = v1;
        if(v2 == 1) {
            zzhs0.ordinal();
        }
    }

    public final int zza() {
        return this.i;
    }
}

