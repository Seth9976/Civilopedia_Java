package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003JI\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7KeywordAbilities;", "", "keywordAbilityType", "", "civilopediaKey", "fullDescription", "iconString", "name", "summary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCivilopediaKey", "()Ljava/lang/String;", "getFullDescription", "getIconString", "getKeywordAbilityType", "getName", "getSummary", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7KeywordAbilities {
    private final String civilopediaKey;
    private final String fullDescription;
    private final String iconString;
    private final String keywordAbilityType;
    private final String name;
    private final String summary;

    public Civ7KeywordAbilities(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "keywordAbilityType");
        j.f(s2, "fullDescription");
        j.f(s4, "name");
        j.f(s5, "summary");
        super();
        this.keywordAbilityType = s;
        this.civilopediaKey = s1;
        this.fullDescription = s2;
        this.iconString = s3;
        this.name = s4;
        this.summary = s5;
    }

    public final String component1() {
        return this.keywordAbilityType;
    }

    public final String component2() {
        return this.civilopediaKey;
    }

    public final String component3() {
        return this.fullDescription;
    }

    public final String component4() {
        return this.iconString;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.summary;
    }

    public final Civ7KeywordAbilities copy(String s, String s1, String s2, String s3, String s4, String s5) {
        j.f(s, "keywordAbilityType");
        j.f(s2, "fullDescription");
        j.f(s4, "name");
        j.f(s5, "summary");
        return new Civ7KeywordAbilities(s, s1, s2, s3, s4, s5);
    }

    public static Civ7KeywordAbilities copy$default(Civ7KeywordAbilities civ7KeywordAbilities0, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7KeywordAbilities0.keywordAbilityType;
        }
        if((v & 2) != 0) {
            s1 = civ7KeywordAbilities0.civilopediaKey;
        }
        if((v & 4) != 0) {
            s2 = civ7KeywordAbilities0.fullDescription;
        }
        if((v & 8) != 0) {
            s3 = civ7KeywordAbilities0.iconString;
        }
        if((v & 16) != 0) {
            s4 = civ7KeywordAbilities0.name;
        }
        if((v & 0x20) != 0) {
            s5 = civ7KeywordAbilities0.summary;
        }
        return civ7KeywordAbilities0.copy(s, s1, s2, s3, s4, s5);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7KeywordAbilities)) {
            return false;
        }
        if(!j.a(this.keywordAbilityType, ((Civ7KeywordAbilities)object0).keywordAbilityType)) {
            return false;
        }
        if(!j.a(this.civilopediaKey, ((Civ7KeywordAbilities)object0).civilopediaKey)) {
            return false;
        }
        if(!j.a(this.fullDescription, ((Civ7KeywordAbilities)object0).fullDescription)) {
            return false;
        }
        if(!j.a(this.iconString, ((Civ7KeywordAbilities)object0).iconString)) {
            return false;
        }
        return j.a(this.name, ((Civ7KeywordAbilities)object0).name) ? j.a(this.summary, ((Civ7KeywordAbilities)object0).summary) : false;
    }

    public final String getCivilopediaKey() {
        return this.civilopediaKey;
    }

    public final String getFullDescription() {
        return this.fullDescription;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final String getKeywordAbilityType() {
        return this.keywordAbilityType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSummary() {
        return this.summary;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.keywordAbilityType.hashCode() * 0x1F + (this.civilopediaKey == null ? 0 : this.civilopediaKey.hashCode())) * 0x1F, 0x1F, this.fullDescription);
        String s = this.iconString;
        if(s != null) {
            v = s.hashCode();
        }
        return this.summary.hashCode() + f.b((v1 + v) * 0x1F, 0x1F, this.name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7KeywordAbilities(keywordAbilityType=", this.keywordAbilityType, ", civilopediaKey=", this.civilopediaKey, ", fullDescription=");
        f.t(stringBuilder0, this.fullDescription, ", iconString=", this.iconString, ", name=");
        return e.i(stringBuilder0, this.name, ", summary=", this.summary, ")");
    }
}

