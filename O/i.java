package O;

import java.util.HashMap;
import java.util.Map.Entry;

public final class i {
    public HashMap a;

    public i() {
        this.a = new HashMap();
    }

    public void a(HashMap hashMap0) {
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            HashMap hashMap1 = this.a;
            if(object1 == null) {
                hashMap1.put(s, null);
            }
            else {
                int v = 0;
                Class class0 = object1.getClass();
                if(class0 != Boolean.class && class0 != Byte.class && class0 != Integer.class && class0 != Long.class && class0 != Float.class && class0 != Double.class && class0 != String.class && class0 != Boolean[].class && class0 != Byte[].class && class0 != Integer[].class && class0 != Long[].class && class0 != Float[].class && class0 != Double[].class && class0 != String[].class) {
                    if(class0 == boolean[].class) {
                        boolean[] arr_z = (boolean[])object1;
                        Boolean[] arr_boolean = new Boolean[arr_z.length];
                        while(v < arr_z.length) {
                            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
                            ++v;
                        }
                        hashMap1.put(s, arr_boolean);
                    }
                    else if(class0 == byte[].class) {
                        byte[] arr_b = (byte[])object1;
                        Byte[] arr_byte = new Byte[arr_b.length];
                        while(v < arr_b.length) {
                            arr_byte[v] = (byte)arr_b[v];
                            ++v;
                        }
                        hashMap1.put(s, arr_byte);
                    }
                    else if(class0 == int[].class) {
                        int[] arr_v = (int[])object1;
                        Integer[] arr_integer = new Integer[arr_v.length];
                        while(v < arr_v.length) {
                            arr_integer[v] = (int)arr_v[v];
                            ++v;
                        }
                        hashMap1.put(s, arr_integer);
                    }
                    else if(class0 == long[].class) {
                        long[] arr_v1 = (long[])object1;
                        Long[] arr_long = new Long[arr_v1.length];
                        while(v < arr_v1.length) {
                            arr_long[v] = (long)arr_v1[v];
                            ++v;
                        }
                        hashMap1.put(s, arr_long);
                    }
                    else if(class0 == float[].class) {
                        float[] arr_f = (float[])object1;
                        Float[] arr_float = new Float[arr_f.length];
                        while(v < arr_f.length) {
                            arr_float[v] = (float)arr_f[v];
                            ++v;
                        }
                        hashMap1.put(s, arr_float);
                    }
                    else {
                        if(class0 != double[].class) {
                            throw new IllegalArgumentException("Key " + s + " has invalid type " + class0);
                        }
                        double[] arr_f1 = (double[])object1;
                        Double[] arr_double = new Double[arr_f1.length];
                        while(v < arr_f1.length) {
                            arr_double[v] = (double)arr_f1[v];
                            ++v;
                        }
                        hashMap1.put(s, arr_double);
                    }
                    continue;
                }
                hashMap1.put(s, object1);
            }
        }
    }
}

