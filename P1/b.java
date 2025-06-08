package P1;

import q.e;

public final class b {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public b(String s, int v, String s1, String s2, long v1, long v2, String s3) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = v1;
        this.f = v2;
        this.g = s3;
    }

    public final a a() {
        a a0 = new a();
        a0.b = this.a;
        a0.c = this.b;
        a0.d = this.c;
        a0.e = this.d;
        a0.g = this.e;
        a0.h = this.f;
        a0.f = this.g;
        return a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((b)object0).a)) {
                label_8:
                    if(e.a(this.b, ((b)object0).b)) {
                        String s1 = ((b)object0).c;
                        String s2 = this.c;
                        if(s2 != null) {
                            if(s2.equals(s1)) {
                            label_15:
                                String s3 = ((b)object0).d;
                                String s4 = this.d;
                                if(s4 != null) {
                                    if(s4.equals(s3)) {
                                    label_21:
                                        if(this.e == ((b)object0).e && this.f == ((b)object0).f) {
                                            String s5 = ((b)object0).g;
                                            return this.g == null ? s5 == null : this.g.equals(s5);
                                        }
                                    }
                                }
                                else if(s3 == null) {
                                    goto label_21;
                                }
                            }
                        }
                        else if(s1 == null) {
                            goto label_15;
                        }
                    }
                }
            }
            else if(((b)object0).a == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = e.c(this.b);
        int v2 = (((((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ v1) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003;
        String s = this.g;
        if(s != null) {
            v = s.hashCode();
        }
        return v ^ v2;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", registrationStatus=");
        switch(this.b) {
            case 1: {
                s = "ATTEMPT_MIGRATION";
                break;
            }
            case 2: {
                s = "NOT_GENERATED";
                break;
            }
            case 3: {
                s = "UNREGISTERED";
                break;
            }
            case 4: {
                s = "REGISTERED";
                break;
            }
            case 5: {
                s = "REGISTER_ERROR";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", authToken=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", refreshToken=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", expiresInSecs=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", tokenCreationEpochInSecs=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", fisError=");
        return i3.e.h(stringBuilder0, this.g, "}");
    }
}

