package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001D\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001D\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00032\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001A\u00020\u00052\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001A\u00020#HÖ\u0001J\t\u0010$\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\n\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0011¨\u0006%"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7Defeats;", "", "defeatType", "", "allowAgeTransition", "", "allowOneMoreTurn", "blurb", "enabledByDefault", "global", "name", "requirementSetId", "(Ljava/lang/String;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getAllowAgeTransition", "()Z", "getAllowOneMoreTurn", "getBlurb", "()Ljava/lang/String;", "getDefeatType", "getEnabledByDefault", "getGlobal", "getName", "getRequirementSetId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7Defeats {
    private final boolean allowAgeTransition;
    private final boolean allowOneMoreTurn;
    private final String blurb;
    private final String defeatType;
    private final boolean enabledByDefault;
    private final boolean global;
    private final String name;
    private final String requirementSetId;

    public Civ7Defeats(String s, boolean z, boolean z1, String s1, boolean z2, boolean z3, String s2, String s3) {
        j.f(s, "defeatType");
        j.f(s1, "blurb");
        j.f(s2, "name");
        super();
        this.defeatType = s;
        this.allowAgeTransition = z;
        this.allowOneMoreTurn = z1;
        this.blurb = s1;
        this.enabledByDefault = z2;
        this.global = z3;
        this.name = s2;
        this.requirementSetId = s3;
    }

    public final String component1() {
        return this.defeatType;
    }

    public final boolean component2() {
        return this.allowAgeTransition;
    }

    public final boolean component3() {
        return this.allowOneMoreTurn;
    }

    public final String component4() {
        return this.blurb;
    }

    public final boolean component5() {
        return this.enabledByDefault;
    }

    public final boolean component6() {
        return this.global;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.requirementSetId;
    }

    public final Civ7Defeats copy(String s, boolean z, boolean z1, String s1, boolean z2, boolean z3, String s2, String s3) {
        j.f(s, "defeatType");
        j.f(s1, "blurb");
        j.f(s2, "name");
        return new Civ7Defeats(s, z, z1, s1, z2, z3, s2, s3);
    }

    public static Civ7Defeats copy$default(Civ7Defeats civ7Defeats0, String s, boolean z, boolean z1, String s1, boolean z2, boolean z3, String s2, String s3, int v, Object object0) {
        String s4 = (v & 1) == 0 ? s : civ7Defeats0.defeatType;
        boolean z4 = (v & 2) == 0 ? z : civ7Defeats0.allowAgeTransition;
        boolean z5 = (v & 4) == 0 ? z1 : civ7Defeats0.allowOneMoreTurn;
        String s5 = (v & 8) == 0 ? s1 : civ7Defeats0.blurb;
        boolean z6 = (v & 16) == 0 ? z2 : civ7Defeats0.enabledByDefault;
        boolean z7 = (v & 0x20) == 0 ? z3 : civ7Defeats0.global;
        String s6 = (v & 0x40) == 0 ? s2 : civ7Defeats0.name;
        return (v & 0x80) == 0 ? civ7Defeats0.copy(s4, z4, z5, s5, z6, z7, s6, s3) : civ7Defeats0.copy(s4, z4, z5, s5, z6, z7, s6, civ7Defeats0.requirementSetId);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7Defeats)) {
            return false;
        }
        if(!j.a(this.defeatType, ((Civ7Defeats)object0).defeatType)) {
            return false;
        }
        if(this.allowAgeTransition != ((Civ7Defeats)object0).allowAgeTransition) {
            return false;
        }
        if(this.allowOneMoreTurn != ((Civ7Defeats)object0).allowOneMoreTurn) {
            return false;
        }
        if(!j.a(this.blurb, ((Civ7Defeats)object0).blurb)) {
            return false;
        }
        if(this.enabledByDefault != ((Civ7Defeats)object0).enabledByDefault) {
            return false;
        }
        if(this.global != ((Civ7Defeats)object0).global) {
            return false;
        }
        return j.a(this.name, ((Civ7Defeats)object0).name) ? j.a(this.requirementSetId, ((Civ7Defeats)object0).requirementSetId) : false;
    }

    public final boolean getAllowAgeTransition() {
        return this.allowAgeTransition;
    }

    public final boolean getAllowOneMoreTurn() {
        return this.allowOneMoreTurn;
    }

    public final String getBlurb() {
        return this.blurb;
    }

    public final String getDefeatType() {
        return this.defeatType;
    }

    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    public final boolean getGlobal() {
        return this.global;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequirementSetId() {
        return this.requirementSetId;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = f.b(((this.defeatType.hashCode() * 0x1F + (this.allowAgeTransition ? 0x4CF : 0x4D5)) * 0x1F + (this.allowOneMoreTurn ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.blurb);
        int v2 = this.enabledByDefault ? 0x4CF : 0x4D5;
        if(this.global) {
            v = 0x4CF;
        }
        int v3 = f.b(((v1 + v2) * 0x1F + v) * 0x1F, 0x1F, this.name);
        return this.requirementSetId == null ? v3 : v3 + this.requirementSetId.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7Defeats(defeatType=", this.defeatType, this.allowAgeTransition, ", allowAgeTransition=", ", allowOneMoreTurn=");
        u9.z(stringBuilder0, this.allowOneMoreTurn, ", blurb=", this.blurb, ", enabledByDefault=");
        u9.A(stringBuilder0, this.enabledByDefault, ", global=", this.global, ", name=");
        return e.i(stringBuilder0, this.name, ", requirementSetId=", this.requirementSetId, ")");
    }
}

