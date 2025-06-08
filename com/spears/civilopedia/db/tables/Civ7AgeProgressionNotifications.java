package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AgeProgressionNotifications;", "", "messageText", "", "notificationType", "percentComplete", "", "summaryText", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getMessageText", "()Ljava/lang/String;", "getNotificationType", "getPercentComplete", "()I", "getSummaryText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AgeProgressionNotifications {
    private final String messageText;
    private final String notificationType;
    private final int percentComplete;
    private final String summaryText;

    public Civ7AgeProgressionNotifications(String s, String s1, int v, String s2) {
        j.f(s, "messageText");
        j.f(s1, "notificationType");
        j.f(s2, "summaryText");
        super();
        this.messageText = s;
        this.notificationType = s1;
        this.percentComplete = v;
        this.summaryText = s2;
    }

    public final String component1() {
        return this.messageText;
    }

    public final String component2() {
        return this.notificationType;
    }

    public final int component3() {
        return this.percentComplete;
    }

    public final String component4() {
        return this.summaryText;
    }

    public final Civ7AgeProgressionNotifications copy(String s, String s1, int v, String s2) {
        j.f(s, "messageText");
        j.f(s1, "notificationType");
        j.f(s2, "summaryText");
        return new Civ7AgeProgressionNotifications(s, s1, v, s2);
    }

    public static Civ7AgeProgressionNotifications copy$default(Civ7AgeProgressionNotifications civ7AgeProgressionNotifications0, String s, String s1, int v, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7AgeProgressionNotifications0.messageText;
        }
        if((v1 & 2) != 0) {
            s1 = civ7AgeProgressionNotifications0.notificationType;
        }
        if((v1 & 4) != 0) {
            v = civ7AgeProgressionNotifications0.percentComplete;
        }
        if((v1 & 8) != 0) {
            s2 = civ7AgeProgressionNotifications0.summaryText;
        }
        return civ7AgeProgressionNotifications0.copy(s, s1, v, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AgeProgressionNotifications)) {
            return false;
        }
        if(!j.a(this.messageText, ((Civ7AgeProgressionNotifications)object0).messageText)) {
            return false;
        }
        if(!j.a(this.notificationType, ((Civ7AgeProgressionNotifications)object0).notificationType)) {
            return false;
        }
        return this.percentComplete == ((Civ7AgeProgressionNotifications)object0).percentComplete ? j.a(this.summaryText, ((Civ7AgeProgressionNotifications)object0).summaryText) : false;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final int getPercentComplete() {
        return this.percentComplete;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    @Override
    public int hashCode() {
        return this.summaryText.hashCode() + (f.b(this.messageText.hashCode() * 0x1F, 0x1F, this.notificationType) + this.percentComplete) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(e.j("Civ7AgeProgressionNotifications(messageText=", this.messageText, ", notificationType=", this.notificationType, ", percentComplete="), this.percentComplete, ", summaryText=", this.summaryText, ")");
    }
}

