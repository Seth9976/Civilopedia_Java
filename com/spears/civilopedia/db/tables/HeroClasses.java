package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u000EJ\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u000EJ\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u000EJ\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u000EJf\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u000EJ\u0010\u0010\u001B\u001A\u00020\u001AH\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010 \u001A\u00020\u001F2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u00D6\u0003\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010\"\u001A\u0004\b#\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010\"\u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010\"\u001A\u0004\b%\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010\"\u001A\u0004\b&\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010\"\u001A\u0004\b\'\u0010\u000ER\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010\"\u001A\u0004\b(\u0010\u000ER\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010\"\u001A\u0004\b)\u0010\u000ER\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010\"\u001A\u0004\b*\u0010\u000E\u00A8\u0006+"}, d2 = {"Lcom/spears/civilopedia/db/tables/HeroClasses;", "Lo2/m;", "", "heroClassType", "name", "description", "unitType", "creationProjectType", "artifactGreatWorkType", "epicGreatWorkType", "discoveryMinEraType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/HeroClasses;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeroClassType", "getName", "getDescription", "getUnitType", "getCreationProjectType", "getArtifactGreatWorkType", "getEpicGreatWorkType", "getDiscoveryMinEraType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HeroClasses implements m {
    private final String artifactGreatWorkType;
    private final String creationProjectType;
    private final String description;
    private final String discoveryMinEraType;
    private final String epicGreatWorkType;
    private final String heroClassType;
    private final String name;
    private final String unitType;

    public HeroClasses(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "heroClassType");
        j.f(s1, "name");
        j.f(s2, "description");
        j.f(s3, "unitType");
        j.f(s4, "creationProjectType");
        super();
        this.heroClassType = s;
        this.name = s1;
        this.description = s2;
        this.unitType = s3;
        this.creationProjectType = s4;
        this.artifactGreatWorkType = s5;
        this.epicGreatWorkType = s6;
        this.discoveryMinEraType = s7;
    }

    public final String component1() {
        return this.heroClassType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.unitType;
    }

    public final String component5() {
        return this.creationProjectType;
    }

    public final String component6() {
        return this.artifactGreatWorkType;
    }

    public final String component7() {
        return this.epicGreatWorkType;
    }

    public final String component8() {
        return this.discoveryMinEraType;
    }

    public final HeroClasses copy(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        j.f(s, "heroClassType");
        j.f(s1, "name");
        j.f(s2, "description");
        j.f(s3, "unitType");
        j.f(s4, "creationProjectType");
        return new HeroClasses(s, s1, s2, s3, s4, s5, s6, s7);
    }

    public static HeroClasses copy$default(HeroClasses heroClasses0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, Object object0) {
        String s8 = (v & 1) == 0 ? s : heroClasses0.heroClassType;
        String s9 = (v & 2) == 0 ? s1 : heroClasses0.name;
        String s10 = (v & 4) == 0 ? s2 : heroClasses0.description;
        String s11 = (v & 8) == 0 ? s3 : heroClasses0.unitType;
        String s12 = (v & 16) == 0 ? s4 : heroClasses0.creationProjectType;
        String s13 = (v & 0x20) == 0 ? s5 : heroClasses0.artifactGreatWorkType;
        String s14 = (v & 0x40) == 0 ? s6 : heroClasses0.epicGreatWorkType;
        return (v & 0x80) == 0 ? heroClasses0.copy(s8, s9, s10, s11, s12, s13, s14, s7) : heroClasses0.copy(s8, s9, s10, s11, s12, s13, s14, heroClasses0.discoveryMinEraType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HeroClasses)) {
            return false;
        }
        if(!j.a(this.heroClassType, ((HeroClasses)object0).heroClassType)) {
            return false;
        }
        if(!j.a(this.name, ((HeroClasses)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((HeroClasses)object0).description)) {
            return false;
        }
        if(!j.a(this.unitType, ((HeroClasses)object0).unitType)) {
            return false;
        }
        if(!j.a(this.creationProjectType, ((HeroClasses)object0).creationProjectType)) {
            return false;
        }
        if(!j.a(this.artifactGreatWorkType, ((HeroClasses)object0).artifactGreatWorkType)) {
            return false;
        }
        return j.a(this.epicGreatWorkType, ((HeroClasses)object0).epicGreatWorkType) ? j.a(this.discoveryMinEraType, ((HeroClasses)object0).discoveryMinEraType) : false;
    }

    public final String getArtifactGreatWorkType() {
        return this.artifactGreatWorkType;
    }

    public final String getCreationProjectType() {
        return this.creationProjectType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiscoveryMinEraType() {
        return this.discoveryMinEraType;
    }

    public final String getEpicGreatWorkType() {
        return this.epicGreatWorkType;
    }

    public final String getHeroClassType() {
        return this.heroClassType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(f.b(this.heroClassType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.description), 0x1F, this.unitType), 0x1F, this.creationProjectType);
        int v1 = 0;
        int v2 = this.artifactGreatWorkType == null ? 0 : this.artifactGreatWorkType.hashCode();
        int v3 = this.epicGreatWorkType == null ? 0 : this.epicGreatWorkType.hashCode();
        String s = this.discoveryMinEraType;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.heroClassType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("HeroClasses(heroClassType=", this.heroClassType, ", name=", this.name, ", description=");
        f.t(stringBuilder0, this.description, ", unitType=", this.unitType, ", creationProjectType=");
        f.t(stringBuilder0, this.creationProjectType, ", artifactGreatWorkType=", this.artifactGreatWorkType, ", epicGreatWorkType=");
        return e.i(stringBuilder0, this.epicGreatWorkType, ", discoveryMinEraType=", this.discoveryMinEraType, ")");
    }
}

