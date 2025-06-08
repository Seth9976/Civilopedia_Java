package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5GreatWorkArtifactClasses;", "", "ID", "", "type", "", "value", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5GreatWorkArtifactClasses;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5GreatWorkArtifactClasses {
    private final Integer ID;
    private final String type;
    private final Integer value;

    public Civ5GreatWorkArtifactClasses(Integer integer0, String s, Integer integer1) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.value = integer1;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final Integer component3() {
        return this.value;
    }

    public final Civ5GreatWorkArtifactClasses copy(Integer integer0, String s, Integer integer1) {
        j.f(s, "type");
        return new Civ5GreatWorkArtifactClasses(integer0, s, integer1);
    }

    public static Civ5GreatWorkArtifactClasses copy$default(Civ5GreatWorkArtifactClasses civ5GreatWorkArtifactClasses0, Integer integer0, String s, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5GreatWorkArtifactClasses0.ID;
        }
        if((v & 2) != 0) {
            s = civ5GreatWorkArtifactClasses0.type;
        }
        if((v & 4) != 0) {
            integer1 = civ5GreatWorkArtifactClasses0.value;
        }
        return civ5GreatWorkArtifactClasses0.copy(integer0, s, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5GreatWorkArtifactClasses)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5GreatWorkArtifactClasses)object0).ID)) {
            return false;
        }
        return j.a(this.type, ((Civ5GreatWorkArtifactClasses)object0).type) ? j.a(this.value, ((Civ5GreatWorkArtifactClasses)object0).value) : false;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        Integer integer0 = this.value;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public String toString() {
        return u9.f(u9.h("Civ5GreatWorkArtifactClasses(ID=", this.ID, ", type=", this.type, ", value="), this.value, ")");
    }
}

