package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u008B\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001A\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0015J\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0015J\u0012\u0010!\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u0015J\u0012\u0010$\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u0015J\u0012\u0010%\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u0015J\u00B0\u0001\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u0015J\u0010\u0010)\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u001BJ\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010/\u001A\u0004\b0\u0010\u0015R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010/\u001A\u0004\b1\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010/\u001A\u0004\b2\u0010\u0015R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010/\u001A\u0004\b3\u0010\u0015R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b\b\u00104\u001A\u0004\b5\u0010\u001BR\u0019\u0010\t\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b\t\u00106\u001A\u0004\b7\u0010\u001DR\u0019\u0010\n\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b\n\u00106\u001A\u0004\b8\u0010\u001DR\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010/\u001A\u0004\b9\u0010\u0015R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\f\u0010/\u001A\u0004\b:\u0010\u0015R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010/\u001A\u0004\b;\u0010\u0015R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010/\u001A\u0004\b<\u0010\u0015R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010/\u001A\u0004\b=\u0010\u0015R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010/\u001A\u0004\b>\u0010\u0015R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010/\u001A\u0004\b?\u0010\u0015\u00A8\u0006@"}, d2 = {"Lcom/spears/civilopedia/db/tables/Moments;", "Lo2/m;", "", "momentType", "name", "description", "instanceDescription", "", "interestLevel", "eraScore", "repeatTurnCooldown", "commemorationType", "minimumGameEra", "maximumGameEra", "backgroundTexture", "iconTexture", "momentIllustrationType", "obsoleteEra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()I", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Moments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMomentType", "getName", "getDescription", "getInstanceDescription", "I", "getInterestLevel", "Ljava/lang/Integer;", "getEraScore", "getRepeatTurnCooldown", "getCommemorationType", "getMinimumGameEra", "getMaximumGameEra", "getBackgroundTexture", "getIconTexture", "getMomentIllustrationType", "getObsoleteEra", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Moments implements m {
    private final String backgroundTexture;
    private final String commemorationType;
    private final String description;
    private final Integer eraScore;
    private final String iconTexture;
    private final String instanceDescription;
    private final int interestLevel;
    private final String maximumGameEra;
    private final String minimumGameEra;
    private final String momentIllustrationType;
    private final String momentType;
    private final String name;
    private final String obsoleteEra;
    private final Integer repeatTurnCooldown;

    public Moments(String s, String s1, String s2, String s3, int v, Integer integer0, Integer integer1, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
        j.f(s, "momentType");
        j.f(s1, "name");
        j.f(s2, "description");
        super();
        this.momentType = s;
        this.name = s1;
        this.description = s2;
        this.instanceDescription = s3;
        this.interestLevel = v;
        this.eraScore = integer0;
        this.repeatTurnCooldown = integer1;
        this.commemorationType = s4;
        this.minimumGameEra = s5;
        this.maximumGameEra = s6;
        this.backgroundTexture = s7;
        this.iconTexture = s8;
        this.momentIllustrationType = s9;
        this.obsoleteEra = s10;
    }

    public final String component1() {
        return this.momentType;
    }

    public final String component10() {
        return this.maximumGameEra;
    }

    public final String component11() {
        return this.backgroundTexture;
    }

    public final String component12() {
        return this.iconTexture;
    }

    public final String component13() {
        return this.momentIllustrationType;
    }

    public final String component14() {
        return this.obsoleteEra;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.instanceDescription;
    }

    public final int component5() {
        return this.interestLevel;
    }

    public final Integer component6() {
        return this.eraScore;
    }

    public final Integer component7() {
        return this.repeatTurnCooldown;
    }

    public final String component8() {
        return this.commemorationType;
    }

    public final String component9() {
        return this.minimumGameEra;
    }

    public final Moments copy(String s, String s1, String s2, String s3, int v, Integer integer0, Integer integer1, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
        j.f(s, "momentType");
        j.f(s1, "name");
        j.f(s2, "description");
        return new Moments(s, s1, s2, s3, v, integer0, integer1, s4, s5, s6, s7, s8, s9, s10);
    }

    public static Moments copy$default(Moments moments0, String s, String s1, String s2, String s3, int v, Integer integer0, Integer integer1, String s4, String s5, String s6, String s7, String s8, String s9, String s10, int v1, Object object0) {
        String s11 = (v1 & 1) == 0 ? s : moments0.momentType;
        String s12 = (v1 & 2) == 0 ? s1 : moments0.name;
        String s13 = (v1 & 4) == 0 ? s2 : moments0.description;
        String s14 = (v1 & 8) == 0 ? s3 : moments0.instanceDescription;
        int v2 = (v1 & 16) == 0 ? v : moments0.interestLevel;
        Integer integer2 = (v1 & 0x20) == 0 ? integer0 : moments0.eraScore;
        Integer integer3 = (v1 & 0x40) == 0 ? integer1 : moments0.repeatTurnCooldown;
        String s15 = (v1 & 0x80) == 0 ? s4 : moments0.commemorationType;
        String s16 = (v1 & 0x100) == 0 ? s5 : moments0.minimumGameEra;
        String s17 = (v1 & 0x200) == 0 ? s6 : moments0.maximumGameEra;
        String s18 = (v1 & 0x400) == 0 ? s7 : moments0.backgroundTexture;
        String s19 = (v1 & 0x800) == 0 ? s8 : moments0.iconTexture;
        String s20 = (v1 & 0x1000) == 0 ? s9 : moments0.momentIllustrationType;
        return (v1 & 0x2000) == 0 ? moments0.copy(s11, s12, s13, s14, v2, integer2, integer3, s15, s16, s17, s18, s19, s20, s10) : moments0.copy(s11, s12, s13, s14, v2, integer2, integer3, s15, s16, s17, s18, s19, s20, moments0.obsoleteEra);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Moments)) {
            return false;
        }
        if(!j.a(this.momentType, ((Moments)object0).momentType)) {
            return false;
        }
        if(!j.a(this.name, ((Moments)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((Moments)object0).description)) {
            return false;
        }
        if(!j.a(this.instanceDescription, ((Moments)object0).instanceDescription)) {
            return false;
        }
        if(this.interestLevel != ((Moments)object0).interestLevel) {
            return false;
        }
        if(!j.a(this.eraScore, ((Moments)object0).eraScore)) {
            return false;
        }
        if(!j.a(this.repeatTurnCooldown, ((Moments)object0).repeatTurnCooldown)) {
            return false;
        }
        if(!j.a(this.commemorationType, ((Moments)object0).commemorationType)) {
            return false;
        }
        if(!j.a(this.minimumGameEra, ((Moments)object0).minimumGameEra)) {
            return false;
        }
        if(!j.a(this.maximumGameEra, ((Moments)object0).maximumGameEra)) {
            return false;
        }
        if(!j.a(this.backgroundTexture, ((Moments)object0).backgroundTexture)) {
            return false;
        }
        if(!j.a(this.iconTexture, ((Moments)object0).iconTexture)) {
            return false;
        }
        return j.a(this.momentIllustrationType, ((Moments)object0).momentIllustrationType) ? j.a(this.obsoleteEra, ((Moments)object0).obsoleteEra) : false;
    }

    public final String getBackgroundTexture() {
        return this.backgroundTexture;
    }

    public final String getCommemorationType() {
        return this.commemorationType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getEraScore() {
        return this.eraScore;
    }

    public final String getIconTexture() {
        return this.iconTexture;
    }

    public final String getInstanceDescription() {
        return this.instanceDescription;
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final String getMaximumGameEra() {
        return this.maximumGameEra;
    }

    public final String getMinimumGameEra() {
        return this.minimumGameEra;
    }

    public final String getMomentIllustrationType() {
        return this.momentIllustrationType;
    }

    public final String getMomentType() {
        return this.momentType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObsoleteEra() {
        return this.obsoleteEra;
    }

    public final Integer getRepeatTurnCooldown() {
        return this.repeatTurnCooldown;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((f.b(f.b(this.momentType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.description) + (this.instanceDescription == null ? 0 : this.instanceDescription.hashCode())) * 0x1F + this.interestLevel) * 0x1F;
        int v2 = this.eraScore == null ? 0 : this.eraScore.hashCode();
        int v3 = this.repeatTurnCooldown == null ? 0 : this.repeatTurnCooldown.hashCode();
        int v4 = this.commemorationType == null ? 0 : this.commemorationType.hashCode();
        int v5 = this.minimumGameEra == null ? 0 : this.minimumGameEra.hashCode();
        int v6 = this.maximumGameEra == null ? 0 : this.maximumGameEra.hashCode();
        int v7 = this.backgroundTexture == null ? 0 : this.backgroundTexture.hashCode();
        int v8 = this.iconTexture == null ? 0 : this.iconTexture.hashCode();
        int v9 = this.momentIllustrationType == null ? 0 : this.momentIllustrationType.hashCode();
        String s = this.obsoleteEra;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.momentType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Moments(momentType=", this.momentType, ", name=", this.name, ", description=");
        f.t(stringBuilder0, this.description, ", instanceDescription=", this.instanceDescription, ", interestLevel=");
        stringBuilder0.append(this.interestLevel);
        stringBuilder0.append(", eraScore=");
        stringBuilder0.append(this.eraScore);
        stringBuilder0.append(", repeatTurnCooldown=");
        e.l(this.repeatTurnCooldown, ", commemorationType=", this.commemorationType, ", minimumGameEra=", stringBuilder0);
        f.t(stringBuilder0, this.minimumGameEra, ", maximumGameEra=", this.maximumGameEra, ", backgroundTexture=");
        f.t(stringBuilder0, this.backgroundTexture, ", iconTexture=", this.iconTexture, ", momentIllustrationType=");
        return e.i(stringBuilder0, this.momentIllustrationType, ", obsoleteEra=", this.obsoleteEra, ")");
    }
}

