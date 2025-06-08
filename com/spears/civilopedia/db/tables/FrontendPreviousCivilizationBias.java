package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u001A\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001A\u00020\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001EJ\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001A\u00020\bHÖ\u0001J\t\u0010#\u001A\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/spears/civilopedia/db/tables/FrontendPreviousCivilizationBias;", "", "previousCivilizationDomain", "", "previousCivilizationType", "civilizationDomain", "civilizationType", "bias", "", "reasonType", "reasonDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBias", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCivilizationDomain", "()Ljava/lang/String;", "getCivilizationType", "getPreviousCivilizationDomain", "getPreviousCivilizationType", "getReasonDescription", "getReasonType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/FrontendPreviousCivilizationBias;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FrontendPreviousCivilizationBias {
    private final Integer bias;
    private final String civilizationDomain;
    private final String civilizationType;
    private final String previousCivilizationDomain;
    private final String previousCivilizationType;
    private final String reasonDescription;
    private final String reasonType;

    public FrontendPreviousCivilizationBias(String s, String s1, String s2, String s3, Integer integer0, String s4, String s5) {
        j.f(s, "previousCivilizationDomain");
        j.f(s1, "previousCivilizationType");
        j.f(s2, "civilizationDomain");
        j.f(s3, "civilizationType");
        j.f(s4, "reasonType");
        super();
        this.previousCivilizationDomain = s;
        this.previousCivilizationType = s1;
        this.civilizationDomain = s2;
        this.civilizationType = s3;
        this.bias = integer0;
        this.reasonType = s4;
        this.reasonDescription = s5;
    }

    public final String component1() {
        return this.previousCivilizationDomain;
    }

    public final String component2() {
        return this.previousCivilizationType;
    }

    public final String component3() {
        return this.civilizationDomain;
    }

    public final String component4() {
        return this.civilizationType;
    }

    public final Integer component5() {
        return this.bias;
    }

    public final String component6() {
        return this.reasonType;
    }

    public final String component7() {
        return this.reasonDescription;
    }

    public final FrontendPreviousCivilizationBias copy(String s, String s1, String s2, String s3, Integer integer0, String s4, String s5) {
        j.f(s, "previousCivilizationDomain");
        j.f(s1, "previousCivilizationType");
        j.f(s2, "civilizationDomain");
        j.f(s3, "civilizationType");
        j.f(s4, "reasonType");
        return new FrontendPreviousCivilizationBias(s, s1, s2, s3, integer0, s4, s5);
    }

    public static FrontendPreviousCivilizationBias copy$default(FrontendPreviousCivilizationBias frontendPreviousCivilizationBias0, String s, String s1, String s2, String s3, Integer integer0, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = frontendPreviousCivilizationBias0.previousCivilizationDomain;
        }
        if((v & 2) != 0) {
            s1 = frontendPreviousCivilizationBias0.previousCivilizationType;
        }
        if((v & 4) != 0) {
            s2 = frontendPreviousCivilizationBias0.civilizationDomain;
        }
        if((v & 8) != 0) {
            s3 = frontendPreviousCivilizationBias0.civilizationType;
        }
        if((v & 16) != 0) {
            integer0 = frontendPreviousCivilizationBias0.bias;
        }
        if((v & 0x20) != 0) {
            s4 = frontendPreviousCivilizationBias0.reasonType;
        }
        if((v & 0x40) != 0) {
            s5 = frontendPreviousCivilizationBias0.reasonDescription;
        }
        return frontendPreviousCivilizationBias0.copy(s, s1, s2, s3, integer0, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FrontendPreviousCivilizationBias)) {
            return false;
        }
        if(!j.a(this.previousCivilizationDomain, ((FrontendPreviousCivilizationBias)object0).previousCivilizationDomain)) {
            return false;
        }
        if(!j.a(this.previousCivilizationType, ((FrontendPreviousCivilizationBias)object0).previousCivilizationType)) {
            return false;
        }
        if(!j.a(this.civilizationDomain, ((FrontendPreviousCivilizationBias)object0).civilizationDomain)) {
            return false;
        }
        if(!j.a(this.civilizationType, ((FrontendPreviousCivilizationBias)object0).civilizationType)) {
            return false;
        }
        if(!j.a(this.bias, ((FrontendPreviousCivilizationBias)object0).bias)) {
            return false;
        }
        return j.a(this.reasonType, ((FrontendPreviousCivilizationBias)object0).reasonType) ? j.a(this.reasonDescription, ((FrontendPreviousCivilizationBias)object0).reasonDescription) : false;
    }

    public final Integer getBias() {
        return this.bias;
    }

    public final String getCivilizationDomain() {
        return this.civilizationDomain;
    }

    public final String getCivilizationType() {
        return this.civilizationType;
    }

    public final String getPreviousCivilizationDomain() {
        return this.previousCivilizationDomain;
    }

    public final String getPreviousCivilizationType() {
        return this.previousCivilizationType;
    }

    public final String getReasonDescription() {
        return this.reasonDescription;
    }

    public final String getReasonType() {
        return this.reasonType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((f.b(f.b(f.b(this.previousCivilizationDomain.hashCode() * 0x1F, 0x1F, this.previousCivilizationType), 0x1F, this.civilizationDomain), 0x1F, this.civilizationType) + (this.bias == null ? 0 : this.bias.hashCode())) * 0x1F, 0x1F, this.reasonType);
        String s = this.reasonDescription;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("FrontendPreviousCivilizationBias(previousCivilizationDomain=", this.previousCivilizationDomain, ", previousCivilizationType=", this.previousCivilizationType, ", civilizationDomain=");
        f.t(stringBuilder0, this.civilizationDomain, ", civilizationType=", this.civilizationType, ", bias=");
        e.l(this.bias, ", reasonType=", this.reasonType, ", reasonDescription=", stringBuilder0);
        return e.h(stringBuilder0, this.reasonDescription, ")");
    }
}

