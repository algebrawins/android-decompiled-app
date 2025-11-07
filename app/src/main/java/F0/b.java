package F0;

import D.C;
import R.k;
import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f607d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f608e;

    /* renamed from: f  reason: collision with root package name */
    public final int f609f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final String f610h;

    /* renamed from: i  reason: collision with root package name */
    public int f611i;

    /* renamed from: j  reason: collision with root package name */
    public int f612j;

    /* renamed from: k  reason: collision with root package name */
    public int f613k;

    /* JADX WARN: Type inference failed for: r5v0, types: [R.b, R.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [R.b, R.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [R.b, R.k] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k(), new k(), new k());
    }

    @Override // F0.a
    public final b a() {
        Parcel parcel = this.f608e;
        int dataPosition = parcel.dataPosition();
        int r02 = this.f612j;
        if (r02 == this.f609f) {
            r02 = this.g;
        }
        return new b(parcel, dataPosition, r02, C.z(new StringBuilder(), this.f610h, "  "), this.f604a, this.f605b, this.f606c);
    }

    @Override // F0.a
    public final boolean e(int r5) {
        while (this.f612j < this.g) {
            int r02 = this.f613k;
            if (r02 == r5) {
                return true;
            }
            if (String.valueOf(r02).compareTo(String.valueOf(r5)) > 0) {
                return false;
            }
            int r03 = this.f612j;
            Parcel parcel = this.f608e;
            parcel.setDataPosition(r03);
            int readInt = parcel.readInt();
            this.f613k = parcel.readInt();
            this.f612j += readInt;
        }
        if (this.f613k != r5) {
            return false;
        }
        return true;
    }

    @Override // F0.a
    public final void h(int r6) {
        int r02 = this.f611i;
        SparseIntArray sparseIntArray = this.f607d;
        Parcel parcel = this.f608e;
        if (r02 >= 0) {
            int r03 = sparseIntArray.get(r02);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(r03);
            parcel.writeInt(dataPosition - r03);
            parcel.setDataPosition(dataPosition);
        }
        this.f611i = r6;
        sparseIntArray.put(r6, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(r6);
    }

    public b(Parcel parcel, int r22, int r3, String str, R.b bVar, R.b bVar2, R.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f607d = new SparseIntArray();
        this.f611i = -1;
        this.f613k = -1;
        this.f608e = parcel;
        this.f609f = r22;
        this.g = r3;
        this.f612j = r22;
        this.f610h = str;
    }
}
