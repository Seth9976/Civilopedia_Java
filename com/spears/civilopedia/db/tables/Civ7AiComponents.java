package com.spears.civilopedia.db.tables;

import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J=\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00052\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AiComponents;", "", "component", "", "broker", "", "consumer", "defaultPriority", "producer", "(Ljava/lang/String;ZZLjava/lang/String;Z)V", "getBroker", "()Z", "getComponent", "()Ljava/lang/String;", "getConsumer", "getDefaultPriority", "getProducer", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AiComponents {
    private final boolean broker;
    private final String component;
    private final boolean consumer;
    private final String defaultPriority;
    private final boolean producer;

    public Civ7AiComponents(String s, boolean z, boolean z1, String s1, boolean z2) {
        j.f(s, "component");
        super();
        this.component = s;
        this.broker = z;
        this.consumer = z1;
        this.defaultPriority = s1;
        this.producer = z2;
    }

    public final String component1() {
        return this.component;
    }

    public final boolean component2() {
        return this.broker;
    }

    public final boolean component3() {
        return this.consumer;
    }

    public final String component4() {
        return this.defaultPriority;
    }

    public final boolean component5() {
        return this.producer;
    }

    public final Civ7AiComponents copy(String s, boolean z, boolean z1, String s1, boolean z2) {
        j.f(s, "component");
        return new Civ7AiComponents(s, z, z1, s1, z2);
    }

    public static Civ7AiComponents copy$default(Civ7AiComponents civ7AiComponents0, String s, boolean z, boolean z1, String s1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ7AiComponents0.component;
        }
        if((v & 2) != 0) {
            z = civ7AiComponents0.broker;
        }
        if((v & 4) != 0) {
            z1 = civ7AiComponents0.consumer;
        }
        if((v & 8) != 0) {
            s1 = civ7AiComponents0.defaultPriority;
        }
        if((v & 16) != 0) {
            z2 = civ7AiComponents0.producer;
        }
        return civ7AiComponents0.copy(s, z, z1, s1, z2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AiComponents)) {
            return false;
        }
        if(!j.a(this.component, ((Civ7AiComponents)object0).component)) {
            return false;
        }
        if(this.broker != ((Civ7AiComponents)object0).broker) {
            return false;
        }
        if(this.consumer != ((Civ7AiComponents)object0).consumer) {
            return false;
        }
        return j.a(this.defaultPriority, ((Civ7AiComponents)object0).defaultPriority) ? this.producer == ((Civ7AiComponents)object0).producer : false;
    }

    public final boolean getBroker() {
        return this.broker;
    }

    public final String getComponent() {
        return this.component;
    }

    public final boolean getConsumer() {
        return this.consumer;
    }

    public final String getDefaultPriority() {
        return this.defaultPriority;
    }

    public final boolean getProducer() {
        return this.producer;
    }

    @Override
    public int hashCode() {
        int v = this.component.hashCode();
        int v1 = 0x4D5;
        int v2 = this.broker ? 0x4CF : 0x4D5;
        int v3 = this.consumer ? 0x4CF : 0x4D5;
        int v4 = this.defaultPriority == null ? 0 : this.defaultPriority.hashCode();
        if(this.producer) {
            v1 = 0x4CF;
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7AiComponents(component=", this.component, this.broker, ", broker=", ", consumer=");
        u9.z(stringBuilder0, this.consumer, ", defaultPriority=", this.defaultPriority, ", producer=");
        return u9.g(stringBuilder0, this.producer, ")");
    }
}

