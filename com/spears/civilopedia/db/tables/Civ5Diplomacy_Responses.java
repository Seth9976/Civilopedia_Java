package com.spears.civilopedia.db.tables;

import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001A\u0010\t\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Diplomacy_Responses;", "", "bias", "", "(Ljava/lang/Integer;)V", "getBias", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Diplomacy_Responses;", "equals", "", "other", "hashCode", "toString", "", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Diplomacy_Responses {
    private final Integer bias;

    public Civ5Diplomacy_Responses(Integer integer0) {
        this.bias = integer0;
    }

    public final Integer component1() {
        return this.bias;
    }

    public final Civ5Diplomacy_Responses copy(Integer integer0) {
        return new Civ5Diplomacy_Responses(integer0);
    }

    public static Civ5Diplomacy_Responses copy$default(Civ5Diplomacy_Responses civ5Diplomacy_Responses0, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5Diplomacy_Responses0.bias;
        }
        return civ5Diplomacy_Responses0.copy(integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Civ5Diplomacy_Responses ? j.a(this.bias, ((Civ5Diplomacy_Responses)object0).bias) : false;
    }

    public final Integer getBias() {
        return this.bias;
    }

    @Override
    public int hashCode() {
        return this.bias == null ? 0 : this.bias.hashCode();
    }

    @Override
    public String toString() {
        return "Civ5Diplomacy_Responses(bias=" + this.bias + ")";
    }
}

