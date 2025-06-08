package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgc extends zzke implements zzlm {
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private zzkl zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private zzgf zzT;
    private zzkj zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    public static final int zza;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private zzfy zzad;
    private String zzae;
    private zzkl zzaf;
    private String zzag;
    private static final zzgc zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzkl zzi;
    private zzkl zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;

    static {
        zzgc zzgc0 = new zzgc();
        zzgc.zze = zzgc0;
        zzke.f(zzgc.class, zzgc0);
    }

    public zzgc() {
        this.zzi = q0.l;
        this.zzj = q0.l;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = q0.l;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = Z.l;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = q0.l;
        this.zzag = "";
    }

    public static void A(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFFDFFFF;
        zzgc0.zzA = false;
    }

    public static void B(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x40000;
        zzgc0.zzB = s;
    }

    public static void C(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFFBFFFF;
        zzgc0.zzB = "";
    }

    public static void D(zzgc zzgc0, long v) {
        zzgc0.zzf |= 0x80000;
        zzgc0.zzC = v;
    }

    public static void E(zzgc zzgc0, int v) {
        zzgc0.zzf |= 0x100000;
        zzgc0.zzD = v;
    }

    public static void F(zzgc zzgc0, String s) {
        zzgc0.zzf |= 0x200000;
        zzgc0.zzE = s;
    }

    public static void G(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFDFFFFF;
        zzgc0.zzE = "";
    }

    public static void H(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x400000;
        zzgc0.zzF = s;
    }

    public static void I(zzgc zzgc0, boolean z) {
        zzgc0.zzf |= 0x800000;
        zzgc0.zzG = z;
    }

    public static void J(zzgc zzgc0, Iterable iterable0) {
        zzkl zzkl0 = zzgc0.zzH;
        if(!zzkl0.zzc()) {
            zzgc0.zzH = zzke.d(zzkl0);
        }
        zzin.b(iterable0, zzgc0.zzH);
    }

    public static void K(zzgc zzgc0) {
        zzgc0.zzH = q0.l;
    }

    public static void L(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x1000000;
        zzgc0.zzI = s;
    }

    public static void M(zzgc zzgc0, int v) {
        zzgc0.zzf |= 0x2000000;
        zzgc0.zzJ = v;
    }

    public static void N(zzgc zzgc0) {
        zzgc0.zzf |= 1;
        zzgc0.zzh = 1;
    }

    public static void O(zzgc zzgc0) {
        zzgc0.zzf &= 0xEFFFFFFF;
        zzgc0.zzM = "";
    }

    public static void P(zzgc zzgc0, long v) {
        zzgc0.zzf |= 0x20000000;
        zzgc0.zzN = v;
    }

    public static void Q(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzg |= 0x2000;
        zzgc0.zzae = s;
    }

    public static void R(zzgc zzgc0) {
        zzgc0.zzg &= 0xFFFFDFFF;
        zzgc0.zzae = "";
    }

    public static void S(zzgc zzgc0, Iterable iterable0) {
        zzkl zzkl0 = zzgc0.zzaf;
        if(!zzkl0.zzc()) {
            zzgc0.zzaf = zzke.d(zzkl0);
        }
        zzin.b(iterable0, zzgc0.zzaf);
    }

    public static void T(zzgc zzgc0) {
        zzgc0.zzi = q0.l;
    }

    public static void U(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzg |= 0x4000;
        zzgc0.zzag = s;
    }

    public static void V(zzgc zzgc0, int v) {
        zzgc0.q0();
        zzgc0.zzi.remove(v);
    }

    public static void W(zzgc zzgc0, int v, zzgl zzgl0) {
        zzgl0.getClass();
        zzgc0.r0();
        zzgc0.zzj.set(v, zzgl0);
    }

    public static void X(zzgc zzgc0, zzgl zzgl0) {
        zzgl0.getClass();
        zzgc0.r0();
        zzgc0.zzj.add(zzgl0);
    }

    public static void Y(zzgc zzgc0, Iterable iterable0) {
        zzgc0.r0();
        zzin.b(iterable0, zzgc0.zzj);
    }

    public static void Z(zzgc zzgc0, int v) {
        zzgc0.r0();
        zzgc0.zzj.remove(v);
    }

    public static void a0(zzgc zzgc0, long v) {
        zzgc0.zzf |= 2;
        zzgc0.zzk = v;
    }

    public static void b0(zzgc zzgc0, long v) {
        zzgc0.zzf |= 4;
        zzgc0.zzl = v;
    }

    public static void c0(zzgc zzgc0, long v) {
        zzgc0.zzf |= 8;
        zzgc0.zzm = v;
    }

    public static void d0(zzgc zzgc0, long v) {
        zzgc0.zzf |= 16;
        zzgc0.zzn = v;
    }

    public static void e0(zzgc zzgc0) {
        zzgc0.zzf &= -17;
        zzgc0.zzn = 0L;
    }

    public static void f0(zzgc zzgc0, long v) {
        zzgc0.zzf |= 0x20;
        zzgc0.zzo = v;
    }

    public static void g0(zzgc zzgc0) {
        zzgc0.zzf &= -33;
        zzgc0.zzo = 0L;
    }

    public static void h0(zzgc zzgc0) {
        zzgc0.zzf |= 0x40;
        zzgc0.zzp = "android";
    }

    @Override  // com.google.android.gms.internal.measurement.zzke
    public final Object i(int v) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return new r0(zzgc.zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000Bဈ\t\fင\n\rဈ\u000B\u000Eဈ\f\u0010ဈ\r\u0011ဂ\u000E\u0012ဂ\u000F\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001Aဂ\u0004\u001Cဇ\u0017\u001D\u001B\u001Eဈ\u0018\u001Fင\u0019 င\u001A!င\u001B\"ဈ\u001C#ဂ\u001D$ဂ\u001E%ဈ\u001F&ဈ \'င!)ဈ\",ဉ#-\u001D.ဂ$/ဂ%2ဈ&4ဈ\'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001AAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfs.class, "zzj", zzgl.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfo.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", z.d, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
            }
            case 3: {
                return new zzgc();
            }
            case 4: {
                return new zzgb(zzgc.zze);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzka;-><init>(Lcom/google/android/gms/internal/measurement/zzke;)V
            }
            case 5: {
                return zzgc.zze;
            }
            default: {
                return null;
            }
        }
    }

    public static void i0(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x80;
        zzgc0.zzq = s;
    }

    public static void j(zzgc zzgc0) {
        zzgc0.zzf &= 0x7FFFFFFF;
        zzgc0.zzP = "";
    }

    public static void j0(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFFFFF7F;
        zzgc0.zzq = "";
    }

    public static void k(zzgc zzgc0, int v) {
        zzgc0.zzg |= 2;
        zzgc0.zzR = v;
    }

    public static void k0(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x100;
        zzgc0.zzr = s;
    }

    public static void l(zzgc zzgc0, int v, zzfs zzfs0) {
        zzfs0.getClass();
        zzgc0.q0();
        zzgc0.zzi.set(v, zzfs0);
    }

    public static void l0(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFFFFEFF;
        zzgc0.zzr = "";
    }

    public static void m(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzg |= 4;
        zzgc0.zzS = s;
    }

    public static void m0(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x200;
        zzgc0.zzs = s;
    }

    public static void n(zzgc zzgc0, zzgf zzgf0) {
        zzgf0.getClass();
        zzgc0.zzT = zzgf0;
        zzgc0.zzg |= 8;
    }

    public static void n0(zzgc zzgc0, int v) {
        zzgc0.zzf |= 0x400;
        zzgc0.zzt = v;
    }

    public static void o(zzgc zzgc0, Iterable iterable0) {
        zzkj zzkj0 = zzgc0.zzU;
        if(!zzkj0.zzc()) {
            int v = zzkj0.size();
            zzgc0.zzU = zzkj0.zzg((v == 0 ? 10 : v + v));
        }
        zzin.b(iterable0, zzgc0.zzU);
    }

    public static void o0(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x800;
        zzgc0.zzu = s;
    }

    public static void p(zzgc zzgc0, zzfs zzfs0) {
        zzfs0.getClass();
        zzgc0.q0();
        zzgc0.zzi.add(zzfs0);
    }

    public static void p0(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x1000;
        zzgc0.zzv = s;
    }

    public static void q(zzgc zzgc0, long v) {
        zzgc0.zzg |= 16;
        zzgc0.zzV = v;
    }

    public final void q0() {
        zzkl zzkl0 = this.zzi;
        if(!zzkl0.zzc()) {
            this.zzi = zzke.d(zzkl0);
        }
    }

    public static void r(zzgc zzgc0, long v) {
        zzgc0.zzg |= 0x20;
        zzgc0.zzW = v;
    }

    public final void r0() {
        zzkl zzkl0 = this.zzj;
        if(!zzkl0.zzc()) {
            this.zzj = zzke.d(zzkl0);
        }
    }

    public static void s(zzgc zzgc0, String s) {
        zzgc0.zzg |= 0x80;
        zzgc0.zzY = s;
    }

    public static void t(zzgc zzgc0, Iterable iterable0) {
        zzgc0.q0();
        zzin.b(iterable0, zzgc0.zzi);
    }

    public static void u(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x2000;
        zzgc0.zzw = s;
    }

    public static void v(zzgc zzgc0, long v) {
        zzgc0.zzf |= 0x4000;
        zzgc0.zzx = v;
    }

    public static void w(zzgc zzgc0) {
        zzgc0.zzf |= 0x8000;
        zzgc0.zzy = 68000L;
    }

    public static void x(zzgc zzgc0, String s) {
        s.getClass();
        zzgc0.zzf |= 0x10000;
        zzgc0.zzz = s;
    }

    public static void y(zzgc zzgc0) {
        zzgc0.zzf &= 0xFFFEFFFF;
        zzgc0.zzz = "";
    }

    public static void z(zzgc zzgc0, boolean z) {
        zzgc0.zzf |= 0x20000;
        zzgc0.zzA = z;
    }

    public final String zzA() [...] // Potential decryptor

    public final String zzB() [...] // Potential decryptor

    public final String zzC() [...] // Potential decryptor

    public final String zzD() [...] // Potential decryptor

    public final String zzE() [...] // Potential decryptor

    public final String zzF() [...] // Potential decryptor

    public final String zzG() [...] // Potential decryptor

    public final String zzH() [...] // Potential decryptor

    public final String zzI() [...] // Potential decryptor

    public final String zzJ() [...] // Potential decryptor

    public final String zzK() [...] // Potential decryptor

    public final String zzL() [...] // Potential decryptor

    public final List zzM() {
        return this.zzH;
    }

    public final List zzN() {
        return this.zzi;
    }

    public final List zzO() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaW() {
        return this.zzA;
    }

    public final boolean zzaX() {
        return this.zzG;
    }

    public final boolean zzaY() {
        return (this.zzf & 0x2000000) != 0;
    }

    public final boolean zzaZ() {
        return (this.zzf & 0x100000) != 0;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & 0x20000000) != 0;
    }

    public final boolean zzbb() {
        return (this.zzg & 0x80) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 0x80000) != 0;
    }

    public final boolean zzbd() {
        return (this.zzg & 16) != 0;
    }

    public final boolean zzbe() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 0x4000) != 0;
    }

    public final boolean zzbg() {
        return (this.zzf & 0x20000) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 0x20) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbk() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 0x800000) != 0;
    }

    public final boolean zzbm() {
        return (this.zzg & 0x2000) != 0;
    }

    public final boolean zzbn() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 0x400) != 0;
    }

    public final boolean zzbp() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & 0x8000) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzN;
    }

    public final long zzi() {
        return this.zzC;
    }

    public final long zzj() {
        return this.zzV;
    }

    public final long zzk() {
        return this.zzm;
    }

    public final long zzm() {
        return this.zzx;
    }

    public final long zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzn;
    }

    public final long zzp() {
        return this.zzl;
    }

    public final long zzq() {
        return this.zzk;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final zzfs zzs(int v) {
        return (zzfs)this.zzi.get(v);
    }

    public static zzgb zzt() {
        return (zzgb)zzgc.zze.g();
    }

    public final zzgl zzv(int v) {
        return (zzgl)this.zzj.get(v);
    }

    public final String zzw() [...] // Potential decryptor

    public final String zzx() [...] // Potential decryptor

    public final String zzy() [...] // Potential decryptor

    public final String zzz() [...] // Potential decryptor
}

