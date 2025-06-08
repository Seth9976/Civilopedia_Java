package R2;

import H2.a;
import J2.j;
import K3.l;
import K3.v;
import O2.A;
import X2.F;
import X2.M;
import X2.k;
import X2.p;
import Y3.n;
import a3.s;
import g3.w;
import java.util.regex.Pattern;
import o2.I;
import q3.G;
import s3.f;
import t3.e;
import u3.d;
import u3.h;
import v3.g;

public final class m extends A {
    public final M i;
    public final G j;
    public final e k;
    public final f l;
    public final s m;
    public final String n;

    public m(M m0, G g0, e e0, f f0, s s0) {
        j.f(g0, "proto");
        String s4;
        String s1;
        j.f(f0, "nameResolver");
        j.f(s0, "typeTable");
        super();
        this.i = m0;
        this.j = g0;
        this.k = e0;
        this.l = f0;
        this.m = s0;
        if((e0.j & 4) == 4) {
            s1 = f0.getString(e0.m.k) + f0.getString(e0.m.l);
        }
        else {
            d d0 = h.b(g0, f0, s0, true);
            if(d0 == null) {
                throw new a("No field signature for property: " + m0, 1);
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(w.a(d0.c));
            k k0 = m0.p();
            j.e(k0, "getContainingDeclaration(...)");
            if(j.a(m0.c(), p.d) && k0 instanceof l) {
                j.e(t3.k.i, "classModuleName");
                Integer integer0 = (Integer)I.k(((l)k0).m, t3.k.i);
                String s2 = integer0 == null ? "main" : f0.getString(integer0.intValue());
                String s3 = ((Pattern)g.a.j).matcher(s2).replaceAll("_");
                j.e(s3, "replaceAll(...)");
                s4 = "$" + s3;
            }
            else if(!j.a(m0.c(), p.a) || !(k0 instanceof F)) {
                s4 = "";
            }
            else {
                o3.f f1 = ((v)m0).M;
                if(!(f1 instanceof o3.f) || f1.j == null) {
                    s4 = "";
                }
                else {
                    String s5 = f1.i.e();
                    j.e(s5, "getInternalName(...)");
                    s4 = "$" + v3.f.e(n.J0(s5, '/')).b();
                }
            }
            stringBuilder0.append(s4);
            stringBuilder0.append("()");
            stringBuilder0.append(d0.d);
            s1 = stringBuilder0.toString();
        }
        this.n = s1;
    }

    @Override  // O2.A
    public final String d() {
        return this.n;
    }
}

