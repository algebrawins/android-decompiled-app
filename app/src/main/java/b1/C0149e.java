package b1;

import A0.C0001b;
import android.database.Cursor;
import android.util.Base64;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e1.AbstractC0248a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0149e implements InterfaceC0150f, X0.b {

    /* renamed from: K  reason: collision with root package name */
    public static final C0149e f2616K = new C0149e(0);

    /* renamed from: L  reason: collision with root package name */
    public static final C0149e f2617L = new C0149e(1);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f2618J;

    public /* synthetic */ C0149e(int r12) {
        this.f2618J = r12;
    }

    @Override // b1.InterfaceC0150f
    public Object apply(Object obj) {
        byte[] decode;
        Cursor cursor = (Cursor) obj;
        switch (this.f2618J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                S0.b bVar = h.f2621N;
                ArrayList arrayList = new ArrayList();
                int r3 = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    r3 += blob.length;
                }
                byte[] bArr = new byte[r3];
                int r4 = 0;
                for (int r32 = 0; r32 < arrayList.size(); r32++) {
                    byte[] bArr2 = (byte[]) arrayList.get(r32);
                    System.arraycopy(bArr2, 0, bArr, r4, bArr2.length);
                    r4 += bArr2.length;
                }
                return bArr;
            default:
                S0.b bVar2 = h.f2621N;
                ArrayList arrayList2 = new ArrayList();
                while (cursor.moveToNext()) {
                    C0001b a4 = V0.c.a();
                    String string = cursor.getString(1);
                    if (string != null) {
                        a4.f85L = string;
                        a4.f86M = AbstractC0248a.b(cursor.getInt(2));
                        String string2 = cursor.getString(3);
                        if (string2 == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string2, 0);
                        }
                        a4.f84K = decode;
                        arrayList2.add(a4.h());
                    } else {
                        throw new NullPointerException("Null backendName");
                    }
                }
                return arrayList2;
        }
    }

    @Override // A2.a
    public Object get() {
        List list = k.f2631L;
        return 4;
    }
}
