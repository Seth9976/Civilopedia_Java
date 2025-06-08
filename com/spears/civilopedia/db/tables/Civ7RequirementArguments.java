package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003JK\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7RequirementArguments;", "", "name", "", "requirementId", "extra", "secondExtra", "type", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "getName", "getRequirementId", "getSecondExtra", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7RequirementArguments {
    private final String extra;
    private final String name;
    private final String requirementId;
    private final String secondExtra;
    private final String type;
    private final String value;

    public Civ7RequirementArguments(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "name");
        j.f(s1, "requirementId");
        j.f(s5, "value");
        super();
        this.name = s;
        this.requirementId = s1;
        this.extra = s2;
        this.secondExtra = s3;
        this.type = s4;
        this.value = s5;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.requirementId;
    }

    public final String component3() {
        return this.extra;
    }

    public final String component4() {
        return this.secondExtra;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.value;
    }

    public final Civ7RequirementArguments copy(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "name");
        j.f(s1, "requirementId");
        j.f(s5, "value");
        return new Civ7RequirementArguments(s, s1, s2, s3, s4, s5);
    }

    public static Civ7RequirementArguments copy$default(Civ7RequirementArguments civ7RequirementArguments0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7RequirementArguments0.name;
        }
        if((v & 2) != 0) {
            s1 = civ7RequirementArguments0.requirementId;
        }
        if((v & 4) != 0) {
            s2 = civ7RequirementArguments0.extra;
        }
        if((v & 8) != 0) {
            s3 = civ7RequirementArguments0.secondExtra;
        }
        if((v & 16) != 0) {
            s4 = civ7RequirementArguments0.type;
        }
        if((v & 0x20) != 0) {
            s5 = civ7RequirementArguments0.value;
        }
        return civ7RequirementArguments0.copy(s, s1, s2, s3, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7RequirementArguments)) {
            return false;
        }
        if(!j.a(this.name, ((Civ7RequirementArguments)object0).name)) {
            return false;
        }
        if(!j.a(this.requirementId, ((Civ7RequirementArguments)object0).requirementId)) {
            return false;
        }
        if(!j.a(this.extra, ((Civ7RequirementArguments)object0).extra)) {
            return false;
        }
        if(!j.a(this.secondExtra, ((Civ7RequirementArguments)object0).secondExtra)) {
            return false;
        }
        return j.a(this.type, ((Civ7RequirementArguments)object0).type) ? j.a(this.value, ((Civ7RequirementArguments)object0).value) : false;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public final String getSecondExtra() {
        return this.secondExtra;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.name.hashCode() * 0x1F, 0x1F, this.requirementId);
        int v1 = 0;
        int v2 = this.extra == null ? 0 : this.extra.hashCode();
        int v3 = this.secondExtra == null ? 0 : this.secondExtra.hashCode();
        String s = this.type;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.value.hashCode() + (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7RequirementArguments(name=", this.name, ", requirementId=", this.requirementId, ", extra=");
        f.t(stringBuilder0, this.extra, ", secondExtra=", this.secondExtra, ", type=");
        return e.i(stringBuilder0, this.type, ", value=", this.value, ")");
    }
}

