package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NotificationSounds;", "", "context", "", "notificationType", "audio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudio", "()Ljava/lang/String;", "getContext", "getNotificationType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NotificationSounds {
    private final String audio;
    private final String context;
    private final String notificationType;

    public Civ7NotificationSounds(String s, String s1, String s2) {
        j.f(s, "context");
        j.f(s1, "notificationType");
        super();
        this.context = s;
        this.notificationType = s1;
        this.audio = s2;
    }

    public final String component1() {
        return this.context;
    }

    public final String component2() {
        return this.notificationType;
    }

    public final String component3() {
        return this.audio;
    }

    public final Civ7NotificationSounds copy(String s, String s1, String s2) {
        j.f(s, "context");
        j.f(s1, "notificationType");
        return new Civ7NotificationSounds(s, s1, s2);
    }

    public static Civ7NotificationSounds copy$default(Civ7NotificationSounds civ7NotificationSounds0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7NotificationSounds0.context;
        }
        if((v & 2) != 0) {
            s1 = civ7NotificationSounds0.notificationType;
        }
        if((v & 4) != 0) {
            s2 = civ7NotificationSounds0.audio;
        }
        return civ7NotificationSounds0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NotificationSounds)) {
            return false;
        }
        if(!j.a(this.context, ((Civ7NotificationSounds)object0).context)) {
            return false;
        }
        return j.a(this.notificationType, ((Civ7NotificationSounds)object0).notificationType) ? j.a(this.audio, ((Civ7NotificationSounds)object0).audio) : false;
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getContext() {
        return this.context;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    @Override
    public int hashCode() {
        int v = f.b(this.context.hashCode() * 0x1F, 0x1F, this.notificationType);
        return this.audio == null ? v : v + this.audio.hashCode();
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ7NotificationSounds(context=", this.context, ", notificationType=", this.notificationType, ", audio="), this.audio, ")");
    }
}

