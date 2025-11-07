package U0;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final long f1310a;

    public m(long j3) {
        this.f1310a = j3;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new m(Long.parseLong(jsonReader.nextString()));
                    }
                    return new m(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        if (this.f1310a == ((m) obj).f1310a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1310a;
        return 1000003 ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f1310a + "}";
    }
}
