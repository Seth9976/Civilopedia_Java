package n2;

import I2.a;
import J2.j;
import com.spears.civilopedia.db.tables.DynamicModifiers;
import com.spears.civilopedia.db.tables.Improvement_ValidTerrains;
import com.spears.civilopedia.db.tables.LeaderTraits;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.TraitModifiers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o2.f;
import x2.k;

public final class l extends J2.l implements a {
    public final int i;
    public final m j;

    public l(m m0, int v) {
        this.i = v;
        this.j = m0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        f2.l l1;
        f2.l l0;
        if(this.i != 0) {
            m m0 = this.j;
            Iterable iterable0 = (List)m0.c.getValue();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = iterable0.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                l0 = m0.a;
                String s = null;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                DynamicModifiers dynamicModifiers0 = (DynamicModifiers)l0.b.b().c0.h(((Modifiers)object0).getModifierType());
                if(dynamicModifiers0 != null) {
                    s = dynamicModifiers0.getEffectType();
                }
                if(j.a(s, "EFFECT_ADJUST_IMPROVEMENT_VALID_TERRAIN")) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
            for(Object object1: arrayList0) {
                Modifiers modifiers0 = (Modifiers)object1;
                f f0 = l0.b.b();
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: ((Iterable)f0.P0)) {
                    if(j.a(((ModifierArguments)object2).getModifierId(), modifiers0.getModifierId())) {
                        arrayList2.add(object2);
                    }
                }
                String s1 = o1.a.t("ImprovementType", arrayList2);
                String s2 = "";
                if(s1 == null) {
                    s1 = "";
                }
                String s3 = o1.a.t("TerrainType", arrayList2);
                if(s3 != null) {
                    s2 = s3;
                }
                arrayList1.add(new Improvement_ValidTerrains(s1, s2, null, null));
            }
            return arrayList1;
        }
        m m1 = this.j;
        f f1 = m1.a.b.b();
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: ((Iterable)f1.N0)) {
            if(j.a(((LeaderTraits)object3).getLeaderType(), m1.b)) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator4 = arrayList3.iterator();
        while(true) {
            boolean z1 = iterator4.hasNext();
            l1 = m1.a;
            if(!z1) {
                break;
            }
            Object object4 = iterator4.next();
            LeaderTraits leaderTraits0 = (LeaderTraits)object4;
            f f2 = l1.b.b();
            ArrayList arrayList5 = new ArrayList();
            for(Object object5: ((Iterable)f2.A1)) {
                if(j.a(((TraitModifiers)object5).getTraitType(), leaderTraits0.getTraitType())) {
                    arrayList5.add(object5);
                }
            }
            arrayList4.add(arrayList5);
        }
        ArrayList arrayList6 = k.F(arrayList4);
        ArrayList arrayList7 = new ArrayList();
        for(Object object6: arrayList6) {
            f f3 = l1.b.b();
            String s4 = ((TraitModifiers)object6).getModifierId();
            Modifiers modifiers1 = (Modifiers)f3.R0.h(s4);
            if(modifiers1 != null) {
                arrayList7.add(modifiers1);
            }
        }
        return arrayList7;
    }
}

