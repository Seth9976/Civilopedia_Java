package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.play_billing.L0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import w3.A;

public final class aa extends AbstractSet {
    public final int i;
    public final AbstractMap j;

    public aa(AbstractMap abstractMap0, int v) {
        this.i = v;
        this.j = abstractMap0;
        super();
    }

    @Override
    public final boolean add(Object object0) {
        switch(this.i) {
            case 0: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable1 = (Comparable)((Map.Entry)object0).getKey();
                    Object object2 = ((Map.Entry)object0).getValue();
                    ((V9)this.j).b(comparable1, object2);
                    return true;
                }
                return false;
            }
            case 1: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable2 = (Comparable)((Map.Entry)object0).getKey();
                    Object object3 = ((Map.Entry)object0).getValue();
                    ((u0)this.j).b(comparable2, object3);
                    return true;
                }
                return false;
            }
            case 2: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable3 = (Comparable)((Map.Entry)object0).getKey();
                    Object object4 = ((Map.Entry)object0).getValue();
                    ((L0)this.j).d(comparable3, object4);
                    return true;
                }
                return false;
            }
            default: {
                if(!this.contains(((Map.Entry)object0))) {
                    Comparable comparable0 = (Comparable)((Map.Entry)object0).getKey();
                    Object object1 = ((Map.Entry)object0).getValue();
                    ((A)this.j).f(comparable0, object1);
                    return true;
                }
                return false;
            }
        }
    }

    @Override
    public final void clear() {
        switch(this.i) {
            case 0: {
                ((V9)this.j).clear();
                return;
            }
            case 1: {
                ((u0)this.j).clear();
                return;
            }
            case 2: {
                ((L0)this.j).clear();
                return;
            }
            default: {
                ((A)this.j).clear();
            }
        }
    }

    @Override
    public final boolean contains(Object object0) {
        switch(this.i) {
            case 0: {
                Object object4 = ((Map.Entry)object0).getKey();
                Object object5 = ((V9)this.j).get(object4);
                Object object6 = ((Map.Entry)object0).getValue();
                return object5 == object6 || object5 != null && object5.equals(object6);
            }
            case 1: {
                Object object7 = ((Map.Entry)object0).getKey();
                Object object8 = ((u0)this.j).get(object7);
                Object object9 = ((Map.Entry)object0).getValue();
                return object8 == object9 || object8 != null && object8.equals(object9);
            }
            case 2: {
                Object object10 = ((Map.Entry)object0).getKey();
                Object object11 = ((L0)this.j).get(object10);
                Object object12 = ((Map.Entry)object0).getValue();
                return object11 == object12 || object11 != null && object11.equals(object12);
            }
            default: {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((A)this.j).get(object1);
                Object object3 = ((Map.Entry)object0).getValue();
                return object2 == object3 || object2 != null && object2.equals(object3);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        switch(this.i) {
            case 0: {
                return new Z9(((V9)this.j), 0);
            }
            case 1: {
                return new Z9(((u0)this.j), 1);
            }
            case 2: {
                return new Z9(((L0)this.j), 2);
            }
            default: {
                return new Z9(((A)this.j), 3);
            }
        }
    }

    @Override
    public final boolean remove(Object object0) {
        switch(this.i) {
            case 0: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object2 = ((Map.Entry)object0).getKey();
                    ((V9)this.j).remove(object2);
                    return true;
                }
                return false;
            }
            case 1: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object3 = ((Map.Entry)object0).getKey();
                    ((u0)this.j).remove(object3);
                    return true;
                }
                return false;
            }
            case 2: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object4 = ((Map.Entry)object0).getKey();
                    ((L0)this.j).remove(object4);
                    return true;
                }
                return false;
            }
            default: {
                if(this.contains(((Map.Entry)object0))) {
                    Object object1 = ((Map.Entry)object0).getKey();
                    ((A)this.j).remove(object1);
                    return true;
                }
                return false;
            }
        }
    }

    @Override
    public final int size() {
        switch(this.i) {
            case 0: {
                return ((V9)this.j).size();
            }
            case 1: {
                return ((u0)this.j).size();
            }
            case 2: {
                return ((L0)this.j).size();
            }
            default: {
                return ((A)this.j).size();
            }
        }
    }
}

