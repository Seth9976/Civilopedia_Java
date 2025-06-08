package com.google.android.gms.internal.play_billing;

public final class a0 implements zzhm {
    public final int a;
    public static final a0 b;
    public static final a0 c;
    public static final a0 d;
    public static final a0 e;
    public static final a0 f;
    public static final a0 g;
    public static final a0 h;
    public static final a0 i;

    static {
        a0.b = new a0(0);
        a0.c = new a0(1);
        a0.d = new a0(2);
        a0.e = new a0(3);
        a0.f = new a0(4);
        a0.g = new a0(5);
        a0.h = new a0(6);
        a0.i = new a0(7);
    }

    public a0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzhm
    public final boolean zza(int v) {
        switch(this.a) {
            case 0: {
                switch(v) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 1: {
                switch(v) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 2: {
                return zzkg.zza(v) != 0;
            }
            case 3: {
                switch(v) {
                    case 0: {
                        return zzkn.zza != null;
                    }
                    case 1: {
                        return zzkn.zzb != null;
                    }
                    case 2: {
                        return zzkn.zzc != null;
                    }
                    case 3: {
                        return zzkn.zzd != null;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 4: {
                return v == 0 || v == 1 || (v == 2 || v == 3);
            }
            case 5: {
                if(v != 17 && v != 18) {
                    switch(v) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: {
                            break;
                        }
                        default: {
                            return false;
                        }
                    }
                }
                return true;
            }
            case 6: {
                return v == 0 || v == 1 || (v == 2 || v == 3 || v == 4 || v == 5);
            }
            default: {
                return v == 0 || v == 1;
            }
        }
    }
}

