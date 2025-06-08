package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u001F\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001A\u00020\u000E\u00A2\u0006\u0002\u0010\u000FJ\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010!\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0014J\t\u0010\"\u001A\u00020\tH\u00C6\u0003J\u0010\u0010#\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0014J\t\u0010$\u001A\u00020\tH\u00C6\u0003J\u000B\u0010%\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010&\u001A\u00020\u000EH\u00C6\u0003Jp\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001A\u00020\u000EH\u00C6\u0001\u00A2\u0006\u0002\u0010(J\u0013\u0010)\u001A\u00020\u000E2\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010+\u001A\u00020\u0007H\u00D6\u0001J\t\u0010,\u001A\u00020\u0003H\u00D6\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\n\n\u0002\u0010\u0015\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\n\n\u0002\u0010\u0015\u001A\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000B\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0017R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0011R\u0011\u0010\r\u001A\u00020\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0011\u00A8\u0006-"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7OpTeamRequirements;", "", "classTag", "", "teamName", "aiTypeDependence", "maxNumber", "", "maxPercentage", "", "minNumber", "minPercentage", "property", "reconsiderWhilePreparing", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;DLjava/lang/Integer;DLjava/lang/String;Z)V", "getAiTypeDependence", "()Ljava/lang/String;", "getClassTag", "getMaxNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxPercentage", "()D", "getMinNumber", "getMinPercentage", "getProperty", "getReconsiderWhilePreparing", "()Z", "getTeamName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;DLjava/lang/Integer;DLjava/lang/String;Z)Lcom/spears/civilopedia/db/tables/Civ7OpTeamRequirements;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7OpTeamRequirements {
    private final String aiTypeDependence;
    private final String classTag;
    private final Integer maxNumber;
    private final double maxPercentage;
    private final Integer minNumber;
    private final double minPercentage;
    private final String property;
    private final boolean reconsiderWhilePreparing;
    private final String teamName;

    public Civ7OpTeamRequirements(String s, String s1, String s2, Integer integer0, double f, Integer integer1, double f1, String s3, boolean z) {
        j.f(s, "classTag");
        j.f(s1, "teamName");
        super();
        this.classTag = s;
        this.teamName = s1;
        this.aiTypeDependence = s2;
        this.maxNumber = integer0;
        this.maxPercentage = f;
        this.minNumber = integer1;
        this.minPercentage = f1;
        this.property = s3;
        this.reconsiderWhilePreparing = z;
    }

    public final String component1() {
        return this.classTag;
    }

    public final String component2() {
        return this.teamName;
    }

    public final String component3() {
        return this.aiTypeDependence;
    }

    public final Integer component4() {
        return this.maxNumber;
    }

    public final double component5() {
        return this.maxPercentage;
    }

    public final Integer component6() {
        return this.minNumber;
    }

    public final double component7() {
        return this.minPercentage;
    }

    public final String component8() {
        return this.property;
    }

    public final boolean component9() {
        return this.reconsiderWhilePreparing;
    }

    public final Civ7OpTeamRequirements copy(String s, String s1, String s2, Integer integer0, double f, Integer integer1, double f1, String s3, boolean z) {
        j.f(s, "classTag");
        j.f(s1, "teamName");
        return new Civ7OpTeamRequirements(s, s1, s2, integer0, f, integer1, f1, s3, z);
    }

    public static Civ7OpTeamRequirements copy$default(Civ7OpTeamRequirements civ7OpTeamRequirements0, String s, String s1, String s2, Integer integer0, double f, Integer integer1, double f1, String s3, boolean z, int v, Object object0) {
        String s4 = (v & 1) == 0 ? s : civ7OpTeamRequirements0.classTag;
        String s5 = (v & 2) == 0 ? s1 : civ7OpTeamRequirements0.teamName;
        String s6 = (v & 4) == 0 ? s2 : civ7OpTeamRequirements0.aiTypeDependence;
        Integer integer2 = (v & 8) == 0 ? integer0 : civ7OpTeamRequirements0.maxNumber;
        double f2 = (v & 16) == 0 ? f : civ7OpTeamRequirements0.maxPercentage;
        Integer integer3 = (v & 0x20) == 0 ? integer1 : civ7OpTeamRequirements0.minNumber;
        double f3 = (v & 0x40) == 0 ? f1 : civ7OpTeamRequirements0.minPercentage;
        String s7 = (v & 0x80) == 0 ? s3 : civ7OpTeamRequirements0.property;
        return (v & 0x100) == 0 ? civ7OpTeamRequirements0.copy(s4, s5, s6, integer2, f2, integer3, f3, s7, z) : civ7OpTeamRequirements0.copy(s4, s5, s6, integer2, f2, integer3, f3, s7, civ7OpTeamRequirements0.reconsiderWhilePreparing);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7OpTeamRequirements)) {
            return false;
        }
        if(!j.a(this.classTag, ((Civ7OpTeamRequirements)object0).classTag)) {
            return false;
        }
        if(!j.a(this.teamName, ((Civ7OpTeamRequirements)object0).teamName)) {
            return false;
        }
        if(!j.a(this.aiTypeDependence, ((Civ7OpTeamRequirements)object0).aiTypeDependence)) {
            return false;
        }
        if(!j.a(this.maxNumber, ((Civ7OpTeamRequirements)object0).maxNumber)) {
            return false;
        }
        if(Double.compare(this.maxPercentage, ((Civ7OpTeamRequirements)object0).maxPercentage) != 0) {
            return false;
        }
        if(!j.a(this.minNumber, ((Civ7OpTeamRequirements)object0).minNumber)) {
            return false;
        }
        if(Double.compare(this.minPercentage, ((Civ7OpTeamRequirements)object0).minPercentage) != 0) {
            return false;
        }
        return j.a(this.property, ((Civ7OpTeamRequirements)object0).property) ? this.reconsiderWhilePreparing == ((Civ7OpTeamRequirements)object0).reconsiderWhilePreparing : false;
    }

    public final String getAiTypeDependence() {
        return this.aiTypeDependence;
    }

    public final String getClassTag() {
        return this.classTag;
    }

    public final Integer getMaxNumber() {
        return this.maxNumber;
    }

    public final double getMaxPercentage() {
        return this.maxPercentage;
    }

    public final Integer getMinNumber() {
        return this.minNumber;
    }

    public final double getMinPercentage() {
        return this.minPercentage;
    }

    public final String getProperty() {
        return this.property;
    }

    public final boolean getReconsiderWhilePreparing() {
        return this.reconsiderWhilePreparing;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.classTag.hashCode() * 0x1F, 0x1F, this.teamName);
        int v1 = 0;
        int v2 = this.aiTypeDependence == null ? 0 : this.aiTypeDependence.hashCode();
        int v3 = this.maxNumber == null ? 0 : this.maxNumber.hashCode();
        long v4 = Double.doubleToLongBits(this.maxPercentage);
        int v5 = this.minNumber == null ? 0 : this.minNumber.hashCode();
        long v6 = Double.doubleToLongBits(this.minPercentage);
        String s = this.property;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.reconsiderWhilePreparing ? ((((((v + v2) * 0x1F + v3) * 0x1F + ((int)(v4 ^ v4 >>> 0x20))) * 0x1F + v5) * 0x1F + ((int)(v6 ^ v6 >>> 0x20))) * 0x1F + v1) * 0x1F + 0x4CF : ((((((v + v2) * 0x1F + v3) * 0x1F + ((int)(v4 ^ v4 >>> 0x20))) * 0x1F + v5) * 0x1F + ((int)(v6 ^ v6 >>> 0x20))) * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7OpTeamRequirements(classTag=", this.classTag, ", teamName=", this.teamName, ", aiTypeDependence=");
        u9.p(this.maxNumber, this.aiTypeDependence, ", maxNumber=", ", maxPercentage=", stringBuilder0);
        stringBuilder0.append(this.maxPercentage);
        stringBuilder0.append(", minNumber=");
        stringBuilder0.append(this.minNumber);
        stringBuilder0.append(", minPercentage=");
        stringBuilder0.append(this.minPercentage);
        stringBuilder0.append(", property=");
        stringBuilder0.append(this.property);
        stringBuilder0.append(", reconsiderWhilePreparing=");
        stringBuilder0.append(this.reconsiderWhilePreparing);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

