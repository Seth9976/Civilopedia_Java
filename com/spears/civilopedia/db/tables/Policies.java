package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000F\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000FJ\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u000FJ\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u000FJ\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000FJ\u0012\u0010\u0016\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019Jh\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000B\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u000FJ\u0010\u0010\u001E\u001A\u00020\u001DH\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010\"\u001A\u00020\t2\b\u0010!\u001A\u0004\u0018\u00010 H\u00D6\u0003\u00A2\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010$\u001A\u0004\b%\u0010\u000FR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010$\u001A\u0004\b&\u0010\u000FR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010$\u001A\u0004\b\'\u0010\u000FR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010$\u001A\u0004\b(\u0010\u000FR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010$\u001A\u0004\b)\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010$\u001A\u0004\b*\u0010\u000FR\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b\n\u0010+\u001A\u0004\b,\u0010\u0017R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010-\u001A\u0004\b.\u0010\u0019\u00A8\u0006/"}, d2 = {"Lcom/spears/civilopedia/db/tables/Policies;", "Lo2/m;", "", "policyType", "description", "prereqCivic", "prereqTech", "name", "governmentSlotType", "", "requiresGovernmentUnlock", "explicitUnlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/spears/civilopedia/db/tables/Policies;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPolicyType", "getDescription", "getPrereqCivic", "getPrereqTech", "getName", "getGovernmentSlotType", "Ljava/lang/Boolean;", "getRequiresGovernmentUnlock", "Z", "getExplicitUnlock", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Policies implements m {
    private final String description;
    private final boolean explicitUnlock;
    private final String governmentSlotType;
    private final String name;
    private final String policyType;
    private final String prereqCivic;
    private final String prereqTech;
    private final Boolean requiresGovernmentUnlock;

    public Policies(String s, String s1, String s2, String s3, String s4, String s5, Boolean boolean0, boolean z) {
        j.f(s, "policyType");
        j.f(s4, "name");
        j.f(s5, "governmentSlotType");
        super();
        this.policyType = s;
        this.description = s1;
        this.prereqCivic = s2;
        this.prereqTech = s3;
        this.name = s4;
        this.governmentSlotType = s5;
        this.requiresGovernmentUnlock = boolean0;
        this.explicitUnlock = z;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.prereqCivic;
    }

    public final String component4() {
        return this.prereqTech;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.governmentSlotType;
    }

    public final Boolean component7() {
        return this.requiresGovernmentUnlock;
    }

    public final boolean component8() {
        return this.explicitUnlock;
    }

    public final Policies copy(String s, String s1, String s2, String s3, String s4, String s5, Boolean boolean0, boolean z) {
        j.f(s, "policyType");
        j.f(s4, "name");
        j.f(s5, "governmentSlotType");
        return new Policies(s, s1, s2, s3, s4, s5, boolean0, z);
    }

    public static Policies copy$default(Policies policies0, String s, String s1, String s2, String s3, String s4, String s5, Boolean boolean0, boolean z, int v, Object object0) {
        String s6 = (v & 1) == 0 ? s : policies0.policyType;
        String s7 = (v & 2) == 0 ? s1 : policies0.description;
        String s8 = (v & 4) == 0 ? s2 : policies0.prereqCivic;
        String s9 = (v & 8) == 0 ? s3 : policies0.prereqTech;
        String s10 = (v & 16) == 0 ? s4 : policies0.name;
        String s11 = (v & 0x20) == 0 ? s5 : policies0.governmentSlotType;
        Boolean boolean1 = (v & 0x40) == 0 ? boolean0 : policies0.requiresGovernmentUnlock;
        return (v & 0x80) == 0 ? policies0.copy(s6, s7, s8, s9, s10, s11, boolean1, z) : policies0.copy(s6, s7, s8, s9, s10, s11, boolean1, policies0.explicitUnlock);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Policies)) {
            return false;
        }
        if(!j.a(this.policyType, ((Policies)object0).policyType)) {
            return false;
        }
        if(!j.a(this.description, ((Policies)object0).description)) {
            return false;
        }
        if(!j.a(this.prereqCivic, ((Policies)object0).prereqCivic)) {
            return false;
        }
        if(!j.a(this.prereqTech, ((Policies)object0).prereqTech)) {
            return false;
        }
        if(!j.a(this.name, ((Policies)object0).name)) {
            return false;
        }
        if(!j.a(this.governmentSlotType, ((Policies)object0).governmentSlotType)) {
            return false;
        }
        return j.a(this.requiresGovernmentUnlock, ((Policies)object0).requiresGovernmentUnlock) ? this.explicitUnlock == ((Policies)object0).explicitUnlock : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getExplicitUnlock() {
        return this.explicitUnlock;
    }

    public final String getGovernmentSlotType() {
        return this.governmentSlotType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final Boolean getRequiresGovernmentUnlock() {
        return this.requiresGovernmentUnlock;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b((((this.policyType.hashCode() * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.prereqCivic == null ? 0 : this.prereqCivic.hashCode())) * 0x1F + (this.prereqTech == null ? 0 : this.prereqTech.hashCode())) * 0x1F, 0x1F, this.name), 0x1F, this.governmentSlotType);
        Boolean boolean0 = this.requiresGovernmentUnlock;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return this.explicitUnlock ? (v1 + v) * 0x1F + 0x4CF : (v1 + v) * 0x1F + 0x4D5;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.policyType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Policies(policyType=", this.policyType, ", description=", this.description, ", prereqCivic=");
        f.t(stringBuilder0, this.prereqCivic, ", prereqTech=", this.prereqTech, ", name=");
        f.t(stringBuilder0, this.name, ", governmentSlotType=", this.governmentSlotType, ", requiresGovernmentUnlock=");
        stringBuilder0.append(this.requiresGovernmentUnlock);
        stringBuilder0.append(", explicitUnlock=");
        stringBuilder0.append(this.explicitUnlock);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

