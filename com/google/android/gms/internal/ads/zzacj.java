package com.google.android.gms.internal.ads;

import A.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class zzacj extends zzacb {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;

    static {
        zzacj.CREATOR = new i(13);
    }

    public zzacj(Parcel parcel0) {
        super(parcel0.readString());
        this.zza = parcel0.readString();
        this.zzb = parcel0.readString();
    }

    public zzacj(String s, String s1, String s2) {
        super(s);
        this.zza = s1;
        this.zzb = s2;
    }

    public static ArrayList a(String s) {
        ArrayList arrayList0 = new ArrayList();
        try {
            if(s.length() >= 10) {
                arrayList0.add(Integer.parseInt(s.substring(0, 4)));
                arrayList0.add(Integer.parseInt(s.substring(5, 7)));
                arrayList0.add(Integer.parseInt(s.substring(8, 10)));
                return arrayList0;
            }
            if(s.length() >= 7) {
                arrayList0.add(Integer.parseInt(s.substring(0, 4)));
                arrayList0.add(Integer.parseInt(s.substring(5, 7)));
                return arrayList0;
            }
            if(s.length() >= 4) {
                arrayList0.add(Integer.parseInt(s.substring(0, 4)));
            }
            return arrayList0;
        }
        catch(NumberFormatException unused_ex) {
            return new ArrayList();
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzacj.class == class0 && zzeg.zzS(this.zzf, ((zzacj)object0).zzf) && zzeg.zzS(this.zza, ((zzacj)object0).zza) && zzeg.zzS(this.zzb, ((zzacj)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = f.b(0x20F, 0x1F, this.zzf);
        int v1 = 0;
        int v2 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": value=" + this.zzb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.zzf);
        parcel0.writeString(this.zza);
        parcel0.writeString(this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzacb
    public final void zza(zzbf zzbf0) {
        switch(this.zzf) {
            case "TAL": 
            case "TALB": {
                zzbf0.zzd(this.zzb);
                return;
            }
            case "TCM": 
            case "TCOM": {
                zzbf0.zzg(this.zzb);
                return;
            }
            case "TDA": 
            case "TDAT": {
                try {
                    int v = Integer.parseInt(this.zzb.substring(2, 4));
                    int v1 = Integer.parseInt(this.zzb.substring(0, 2));
                    zzbf0.zzl(v);
                    zzbf0.zzk(v1);
                }
                catch(NumberFormatException | StringIndexOutOfBoundsException unused_ex) {
                }
                return;
            }
            case "TDRC": {
                ArrayList arrayList0 = zzacj.a(this.zzb);
                switch(arrayList0.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzbf0.zzl(((Integer)arrayList0.get(1)));
                        break;
                    }
                    case 3: {
                        zzbf0.zzk(((Integer)arrayList0.get(2)));
                        zzbf0.zzl(((Integer)arrayList0.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzbf0.zzm(((Integer)arrayList0.get(0)));
                return;
            }
            case "TDRL": {
                ArrayList arrayList1 = zzacj.a(this.zzb);
                switch(arrayList1.size()) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        zzbf0.zzo(((Integer)arrayList1.get(1)));
                        break;
                    }
                    case 3: {
                        zzbf0.zzn(((Integer)arrayList1.get(2)));
                        zzbf0.zzo(((Integer)arrayList1.get(1)));
                        break;
                    }
                    default: {
                        return;
                    }
                }
                zzbf0.zzp(((Integer)arrayList1.get(0)));
                return;
            }
            case "TEXT": 
            case "TXT": {
                zzbf0.zzu(this.zzb);
                return;
            }
            case "TIT2": 
            case "TT2": {
                zzbf0.zzr(this.zzb);
                return;
            }
            case "TP1": 
            case "TPE1": {
                zzbf0.zze(this.zzb);
                return;
            }
            case "TP2": 
            case "TPE2": {
                zzbf0.zzc(this.zzb);
                return;
            }
            case "TP3": 
            case "TPE3": {
                zzbf0.zzh(this.zzb);
                return;
            }
            case "TRCK": 
            case "TRK": {
                try {
                    String[] arr_s = zzeg.zzaf(this.zzb, "/");
                    int v2 = Integer.parseInt(arr_s[0]);
                    Integer integer0 = arr_s.length <= 1 ? null : Integer.parseInt(arr_s[1]);
                    zzbf0.zzt(v2);
                    zzbf0.zzs(integer0);
                }
                catch(NumberFormatException unused_ex) {
                }
                return;
            }
            case "TYE": 
            case "TYER": {
                try {
                    zzbf0.zzm(Integer.parseInt(this.zzb));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
    }
}

