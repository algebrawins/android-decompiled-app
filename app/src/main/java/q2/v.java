package q2;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final String f4850a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4851b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4852c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4853d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4854e;

    public v(String str, int r5, int r6, int r7, int r8) {
        if ((r5 == -1 && r6 == -1) || (r5 >= 0 && r6 >= 0)) {
            if ((r7 == -1 && r8 == -1) || (r7 >= 0 && r7 <= r8)) {
                if (r8 <= str.length()) {
                    if (r5 <= str.length()) {
                        if (r6 <= str.length()) {
                            this.f4850a = str;
                            this.f4851b = r5;
                            this.f4852c = r6;
                            this.f4853d = r7;
                            this.f4854e = r8;
                            return;
                        }
                        throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(r6));
                    }
                    throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(r5));
                }
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(r7));
            }
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(r7) + ", " + String.valueOf(r8) + ")");
        }
        throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(r5) + ", " + String.valueOf(r6) + ")");
    }

    public static v a(JSONObject jSONObject) {
        return new v(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
