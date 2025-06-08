package j2;

import J2.j;
import J2.q;
import X3.i;
import Y3.c;
import Y3.d;
import android.support.v4.media.session.a;
import com.spears.civilopedia.db.tables.HeroClassUnitCommands;
import com.spears.civilopedia.db.tables.HeroClasses;
import com.spears.civilopedia.db.tables.TypeProperties;
import com.spears.civilopedia.db.tables.UnitAbilities;
import com.spears.civilopedia.db.tables.UnitAbilityModifiers;
import com.spears.civilopedia.db.tables.UnitCommands;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o2.G;
import o2.K;
import x2.r;
import z1.a0;

public final class e extends f {
    @Override  // j2.g
    public final void a() {
        String s7;
        String s4;
        r r1;
        i i0 = new i(q.a(new q("UNIT_HERO_(.*)"), this.p().b));
        if(!i0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        String s = A.f.h("HEROCLASS_", ((String)((c)((d)i0.next()).a()).get(1)));
        o2.f f0 = this.m();
        j.f(s, "heroClass");
        K k0 = f0.z0;
        HeroClasses heroClasses0 = (HeroClasses)k0.h(s);
        r r0 = r.i;
        String s1 = "";
        if(heroClasses0 == null) {
            r1 = r0;
        }
        else {
            r1 = new ArrayList();
            List list0 = (List)o2.j.a.get(heroClasses0.getHeroClassType());
            if(list0 != null) {
                for(Object object0: list0) {
                    String s2 = (String)object0;
                    K k1 = f0.E1;
                    UnitAbilities unitAbilities0 = (UnitAbilities)k1.h(s2);
                    if(unitAbilities0 != null) {
                        String s3 = unitAbilities0.getName();
                        j.f(s2, "unitAbilityID");
                        UnitAbilities unitAbilities1 = (UnitAbilities)k1.h(s2);
                        if(unitAbilities1 == null) {
                            s4 = null;
                        }
                        else if(unitAbilities1.getDescription() != null && unitAbilities1.getDescription().length() > 0) {
                            s4 = a.H(unitAbilities1.getDescription(), new Object[0]);
                        }
                        else {
                            for(Object object1: ((Iterable)f0.F1)) {
                                if(!j.a(((UnitAbilityModifiers)object1).getUnitAbilityType(), s2)) {
                                    continue;
                                }
                                goto label_35;
                            }
                            object1 = null;
                        label_35:
                            if(((UnitAbilityModifiers)object1) != null) {
                                String s5 = ((UnitAbilityModifiers)object1).getModifierId();
                                if(s5 != null) {
                                    s4 = a0.y(f0, s5);
                                }
                            }
                        }
                        ((ArrayList)r1).add(new o2.i(s3, s4, ""));
                    }
                }
            }
        }
        HeroClasses heroClasses1 = (HeroClasses)k0.h(s);
        if(heroClasses1 != null) {
            r0 = new ArrayList();
            for(Object object2: ((List)f0.y0)) {
                HeroClassUnitCommands heroClassUnitCommands0 = (HeroClassUnitCommands)object2;
                if(j.a(heroClassUnitCommands0.getHeroClassType(), heroClasses1.getHeroClassType())) {
                    UnitCommands unitCommands0 = (UnitCommands)f0.G1.h(heroClassUnitCommands0.getUnitCommandType());
                    if(unitCommands0 != null) {
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object3: ((Iterable)f0.C1)) {
                            if(j.a(((TypeProperties)object3).getType(), unitCommands0.getCommandType())) {
                                arrayList0.add(object3);
                            }
                        }
                        String s6 = unitCommands0.getHelp();
                        if(s6 == null) {
                            s7 = null;
                        }
                        else {
                        alab1:
                            switch(s6) {
                                case "LOC_UNITCOMMAND_AREA_DAMAGE_HEAL_HELP": {
                                    for(Object object7: arrayList0) {
                                        TypeProperties typeProperties3 = (TypeProperties)object7;
                                        if(!j.a(typeProperties3.getName(), "STRENGTH")) {
                                            continue;
                                        }
                                        s7 = a.H(s6, new Object[]{typeProperties3.getValue()});
                                        break alab1;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                case "LOC_UNITCOMMAND_GRANT_ENVOY_HELP": {
                                    for(Object object8: arrayList0) {
                                        TypeProperties typeProperties4 = (TypeProperties)object8;
                                        if(!j.a(typeProperties4.getName(), "GRANT_ENVOY_SUZERAIN_FAITH")) {
                                            continue;
                                        }
                                        s7 = a.H(s6, new Object[]{typeProperties4.getValue()});
                                        break alab1;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                case "LOC_UNITCOMMAND_NAVAL_GOLD_RAID_HELP": {
                                    for(Object object6: arrayList0) {
                                        TypeProperties typeProperties2 = (TypeProperties)object6;
                                        if(!j.a(typeProperties2.getName(), "NAVAL_GOLD_RAID_YIELD")) {
                                            continue;
                                        }
                                        s7 = a.H(s6, new Object[]{typeProperties2.getValue()});
                                        break alab1;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                case "LOC_UNITCOMMAND_RESOURCE_INSPIRE_HELP": {
                                    for(Object object4: arrayList0) {
                                        TypeProperties typeProperties0 = (TypeProperties)object4;
                                        if(!j.a(typeProperties0.getName(), "RESOURCE_INSPIRE_SCIENCE")) {
                                            continue;
                                        }
                                        String s8 = typeProperties0.getValue();
                                        for(Object object5: arrayList0) {
                                            TypeProperties typeProperties1 = (TypeProperties)object5;
                                            if(!j.a(typeProperties1.getName(), "RESOURCE_INSPIRE_CULTURE")) {
                                                continue;
                                            }
                                            s7 = a.H(s6, new Object[]{s8, typeProperties1.getValue()});
                                            break alab1;
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                case "LOC_UNITCOMMAND_TRANSFORM_UNIT_HELP": {
                                    s7 = a.H(s6, new Object[]{12});
                                    break;
                                }
                                default: {
                                    s7 = a.H(s6, new Object[0]);
                                }
                            }
                        }
                        ((ArrayList)r0).add(new o2.i(unitCommands0.getDescription(), s7, unitCommands0.getIcon()));
                    }
                }
            }
        }
        if(!r1.isEmpty() || !r0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object9: r1) {
                o2.i i1 = (o2.i)object9;
                String s9 = i1.a;
                if(s9 != null) {
                    String s10 = i1.b;
                    if(s10 != null) {
                        arrayList1.add(a.H(s9, new Object[0]) + ": " + s10);
                    }
                }
            }
            for(Object object10: r0) {
                o2.i i2 = (o2.i)object10;
                String s11 = i2.a;
                if(s11 != null) {
                    String s12 = i2.b;
                    if(s12 != null) {
                        arrayList1.add(a.H(s11, new Object[0]) + ": " + s12);
                    }
                }
            }
            s1 = x2.i.Y(arrayList1, "[NEWLINE]", null, null, null, 62);
        }
        if(s1.length() > 0) {
            this.b("LOC_PEDIA_PAGE_CHAPTER_HEROABILITIES_TITLE", G.p(s1));
        }
        super.a();
    }
}

