package Y;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class f {
    public final HashMap a;
    public static final String b;
    public static final f c;

    static {
        f.b = "WM-Data";
        f.c = new f(new HashMap());
    }

    public f(f f0) {
        this.a = new HashMap(f0.a);
    }

    public f(HashMap hashMap0) {
        this.a = new HashMap(hashMap0);
    }

    public static f a(byte[] arr_b) {
        Throwable throwable1;
        IOException iOException1;
        ObjectInputStream objectInputStream0;
        String s = f.b;
        if(arr_b.length <= 0x2800) {
            HashMap hashMap0 = new HashMap();
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            try {
                objectInputStream0 = null;
                objectInputStream0 = new ObjectInputStream(byteArrayInputStream0);
            }
            catch(IOException | ClassNotFoundException iOException0) {
                iOException1 = iOException0;
                goto label_19;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                goto label_28;
            }
            try {
                int v = objectInputStream0.readInt();
                while(true) {
                    if(v <= 0) {
                        goto label_38;
                    }
                    hashMap0.put(objectInputStream0.readUTF(), objectInputStream0.readObject());
                    --v;
                }
            }
            catch(IOException | ClassNotFoundException iOException1) {
                try {
                label_19:
                    Log.e(s, "Error in Data#fromByteArray: ", iOException1);
                    if(objectInputStream0 != null) {
                        goto label_21;
                    }
                    goto label_25;
                }
                catch(Throwable throwable1) {
                    goto label_28;
                }
                try {
                label_21:
                    objectInputStream0.close();
                }
                catch(IOException iOException2) {
                    Log.e(s, "Error in Data#fromByteArray: ", iOException2);
                }
                try {
                label_25:
                    byteArrayInputStream0.close();
                }
                catch(IOException iOException3) {
                    Log.e(s, "Error in Data#fromByteArray: ", iOException3);
                    return new f(hashMap0);
                }
                return new f(hashMap0);
            }
            catch(Throwable throwable1) {
            }
        label_28:
            if(objectInputStream0 != null) {
                try {
                    objectInputStream0.close();
                }
                catch(IOException iOException4) {
                    Log.e(s, "Error in Data#fromByteArray: ", iOException4);
                }
            }
            try {
                byteArrayInputStream0.close();
            }
            catch(IOException iOException5) {
                Log.e(s, "Error in Data#fromByteArray: ", iOException5);
            }
            throw throwable1;
            try {
            label_38:
                objectInputStream0.close();
            }
            catch(IOException iOException6) {
                Log.e(s, "Error in Data#fromByteArray: ", iOException6);
            }
            try {
                byteArrayInputStream0.close();
                return new f(hashMap0);
            }
            catch(IOException iOException3) {
                Log.e(s, "Error in Data#fromByteArray: ", iOException3);
                return new f(hashMap0);
            }
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] b(f f0) {
        byte[] arr_b;
        String s = f.b;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream0 = null;
        try {
            try {
                objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
                objectOutputStream0.writeInt(f0.a.size());
                Iterator iterator0 = f0.a.entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_35;
                    }
                    Object object0 = iterator0.next();
                    objectOutputStream0.writeUTF(((String)((Map.Entry)object0).getKey()));
                    objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
                }
            }
            catch(IOException iOException0) {
            }
            Log.e(s, "Error in Data#toByteArray: ", iOException0);
            arr_b = byteArrayOutputStream0.toByteArray();
            if(objectOutputStream0 != null) {
                goto label_15;
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_15:
            objectOutputStream0.close();
        }
        catch(IOException iOException1) {
            Log.e(s, "Error in Data#toByteArray: ", iOException1);
        }
        try {
        label_19:
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException2) {
            Log.e(s, "Error in Data#toByteArray: ", iOException2);
        }
        return arr_b;
    label_25:
        if(objectOutputStream0 != null) {
            try {
                objectOutputStream0.close();
            }
            catch(IOException iOException3) {
                Log.e(s, "Error in Data#toByteArray: ", iOException3);
            }
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException4) {
            Log.e(s, "Error in Data#toByteArray: ", iOException4);
        }
        throw throwable0;
        try {
        label_35:
            objectOutputStream0.close();
        }
        catch(IOException iOException5) {
            Log.e(s, "Error in Data#toByteArray: ", iOException5);
        }
        try {
            byteArrayOutputStream0.close();
        }
        catch(IOException iOException6) {
            Log.e(s, "Error in Data#toByteArray: ", iOException6);
        }
        if(byteArrayOutputStream0.size() > 0x2800) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(f.class == class0) {
                HashMap hashMap0 = this.a;
                Set set0 = hashMap0.keySet();
                HashMap hashMap1 = ((f)object0).a;
                if(!set0.equals(hashMap1.keySet())) {
                    return false;
                }
                for(Object object1: set0) {
                    Object object2 = hashMap0.get(((String)object1));
                    Object object3 = hashMap1.get(((String)object1));
                    if(object2 == null || object3 == null) {
                        z = object2 == object3;
                    }
                    else if(!(object2 instanceof Object[]) || !(object3 instanceof Object[])) {
                        z = object2.equals(object3);
                    }
                    else {
                        z = Arrays.deepEquals(((Object[])object2), ((Object[])object3));
                    }
                    if(!z) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Data {");
        HashMap hashMap0 = this.a;
        if(!hashMap0.isEmpty()) {
            for(Object object0: hashMap0.keySet()) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(" : ");
                Object object1 = hashMap0.get(((String)object0));
                if(object1 instanceof Object[]) {
                    stringBuilder0.append(Arrays.toString(((Object[])object1)));
                }
                else {
                    stringBuilder0.append(object1);
                }
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

