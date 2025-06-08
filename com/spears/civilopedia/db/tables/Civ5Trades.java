package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0013\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJ\u0010\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJH\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001D\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\r\u0010\u000BR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u0010\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000F¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Trades;", "", "ID", "", "type", "", "description", "initialPercent", "aIWeightPercent", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAIWeightPercent", "getDescription", "()Ljava/lang/String;", "getInitialPercent", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Trades;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Trades {
    private final Integer ID;
    private final Integer aIWeightPercent;
    private final String description;
    private final Integer initialPercent;
    private final String type;

    public Civ5Trades(Integer integer0, String s, String s1, Integer integer1, Integer integer2) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.initialPercent = integer1;
        this.aIWeightPercent = integer2;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final Integer component4() {
        return this.initialPercent;
    }

    public final Integer component5() {
        return this.aIWeightPercent;
    }

    public final Civ5Trades copy(Integer integer0, String s, String s1, Integer integer1, Integer integer2) {
        j.f(s, "type");
        return new Civ5Trades(integer0, s, s1, integer1, integer2);
    }

    public static Civ5Trades copy$default(Civ5Trades civ5Trades0, Integer integer0, String s, String s1, Integer integer1, Integer integer2, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5Trades0.ID;
        }
        if((v & 2) != 0) {
            s = civ5Trades0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5Trades0.description;
        }
        if((v & 8) != 0) {
            integer1 = civ5Trades0.initialPercent;
        }
        if((v & 16) != 0) {
            integer2 = civ5Trades0.aIWeightPercent;
        }
        return civ5Trades0.copy(integer0, s, s1, integer1, integer2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Trades)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5Trades)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5Trades)object0).type)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5Trades)object0).description)) {
            return false;
        }
        return j.a(this.initialPercent, ((Civ5Trades)object0).initialPercent) ? j.a(this.aIWeightPercent, ((Civ5Trades)object0).aIWeightPercent) : false;
    }

    public final Integer getAIWeightPercent() {
        return this.aIWeightPercent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final Integer getInitialPercent() {
        return this.initialPercent;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.initialPercent == null ? 0 : this.initialPercent.hashCode();
        Integer integer0 = this.aIWeightPercent;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5Trades(ID=", this.ID, ", type=", this.type, ", description=");
        u9.p(this.initialPercent, this.description, ", initialPercent=", ", aIWeightPercent=", stringBuilder0);
        return u9.f(stringBuilder0, this.aIWeightPercent, ")");
    }
}

