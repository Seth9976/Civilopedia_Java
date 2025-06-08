package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/spears/civilopedia/db/tables/Policy_GovernmentExclusives_XP2;", "", "policyType", "", "governmentType", "(Ljava/lang/String;Ljava/lang/String;)V", "getGovernmentType", "()Ljava/lang/String;", "getPolicyType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Policy_GovernmentExclusives_XP2 {
    private final String governmentType;
    private final String policyType;

    public Policy_GovernmentExclusives_XP2(String s, String s1) {
        this.policyType = s;
        this.governmentType = s1;
    }

    public final String component1() {
        return this.policyType;
    }

    public final String component2() {
        return this.governmentType;
    }

    public final Policy_GovernmentExclusives_XP2 copy(String s, String s1) {
        return new Policy_GovernmentExclusives_XP2(s, s1);
    }

    public static Policy_GovernmentExclusives_XP2 copy$default(Policy_GovernmentExclusives_XP2 policy_GovernmentExclusives_XP20, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = policy_GovernmentExclusives_XP20.policyType;
        }
        if((v & 2) != 0) {
            s1 = policy_GovernmentExclusives_XP20.governmentType;
        }
        return policy_GovernmentExclusives_XP20.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Policy_GovernmentExclusives_XP2)) {
            return false;
        }
        return j.a(this.policyType, ((Policy_GovernmentExclusives_XP2)object0).policyType) ? j.a(this.governmentType, ((Policy_GovernmentExclusives_XP2)object0).governmentType) : false;
    }

    public final String getGovernmentType() {
        return this.governmentType;
    }

    public final String getPolicyType() {
        return this.policyType;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.policyType == null ? 0 : this.policyType.hashCode();
        String s = this.governmentType;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public String toString() {
        return f.k("Policy_GovernmentExclusives_XP2(policyType=", this.policyType, ", governmentType=", this.governmentType, ")");
    }
}

