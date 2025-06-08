package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Notifications;", "", "ID", "", "notificationType", "", "welcomeness", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotificationType", "()Ljava/lang/String;", "getWelcomeness", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ5Notifications;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Notifications {
    private final Integer ID;
    private final String notificationType;
    private final Integer welcomeness;

    public Civ5Notifications(Integer integer0, String s, Integer integer1) {
        this.ID = integer0;
        this.notificationType = s;
        this.welcomeness = integer1;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.notificationType;
    }

    public final Integer component3() {
        return this.welcomeness;
    }

    public final Civ5Notifications copy(Integer integer0, String s, Integer integer1) {
        return new Civ5Notifications(integer0, s, integer1);
    }

    public static Civ5Notifications copy$default(Civ5Notifications civ5Notifications0, Integer integer0, String s, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5Notifications0.ID;
        }
        if((v & 2) != 0) {
            s = civ5Notifications0.notificationType;
        }
        if((v & 4) != 0) {
            integer1 = civ5Notifications0.welcomeness;
        }
        return civ5Notifications0.copy(integer0, s, integer1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Notifications)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5Notifications)object0).ID)) {
            return false;
        }
        return j.a(this.notificationType, ((Civ5Notifications)object0).notificationType) ? j.a(this.welcomeness, ((Civ5Notifications)object0).welcomeness) : false;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final Integer getWelcomeness() {
        return this.welcomeness;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ID == null ? 0 : this.ID.hashCode();
        int v2 = this.notificationType == null ? 0 : this.notificationType.hashCode();
        Integer integer0 = this.welcomeness;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return u9.f(u9.h("Civ5Notifications(ID=", this.ID, ", notificationType=", this.notificationType, ", welcomeness="), this.welcomeness, ")");
    }
}

