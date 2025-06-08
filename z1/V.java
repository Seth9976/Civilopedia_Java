package z1;

import n2.A;

public final class v extends q0 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final B h;
    public final y i;

    public v(String s, String s1, int v, String s2, String s3, String s4, B b0, y y0) {
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = b0;
        this.i = y0;
    }

    public final A a() {
        A a0 = new A();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.a = this.b;
        a0.b = this.c;
        a0.c = this.d;
        a0.d = this.e;
        a0.e = this.f;
        a0.f = this.g;
        a0.g = this.h;
        a0.h = this.i;
        return a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof q0 && (this.b.equals(((v)(((q0)object0))).b) && this.c.equals(((v)(((q0)object0))).c) && this.d == ((v)(((q0)object0))).d && this.e.equals(((v)(((q0)object0))).e) && this.f.equals(((v)(((q0)object0))).f) && this.g.equals(((v)(((q0)object0))).g))) {
            B b0 = ((v)(((q0)object0))).h;
            B b1 = this.h;
            if(b1 != null) {
                if(b1.equals(b0)) {
                label_9:
                    y y0 = ((v)(((q0)object0))).i;
                    return this.i == null ? y0 == null : this.i.equals(y0);
                }
            }
            else if(b0 == null) {
                goto label_9;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = ((((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003;
        int v1 = 0;
        int v2 = this.h == null ? 0 : this.h.hashCode();
        y y0 = this.i;
        if(y0 != null) {
            v1 = y0.hashCode();
        }
        return (v ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}

