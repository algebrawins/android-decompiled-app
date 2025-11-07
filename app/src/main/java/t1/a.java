package T1;

import Z1.n;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0217u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0225y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbk;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.w;

/* loaded from: classes.dex */
public final class a extends zzbk {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f1220o = {5, 7, 7, 7, 5, 5};

    /* renamed from: p  reason: collision with root package name */
    public static final double[][] f1221p = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* renamed from: l  reason: collision with root package name */
    public final Context f1222l;

    /* renamed from: m  reason: collision with root package name */
    public final RecognitionOptions f1223m;

    /* renamed from: n  reason: collision with root package name */
    public BarhopperV3 f1224n;

    public a(Context context, C0217u c0217u) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f1223m = recognitionOptions;
        this.f1222l = context;
        recognitionOptions.setBarcodeFormats(c0217u.f2981a);
        recognitionOptions.setOutputUnrecognizedBarcodes(c0217u.f2982b);
    }

    public static i Q(n nVar, String str, String str2) {
        String str3 = null;
        if (nVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int s3 = nVar.s();
        int q3 = nVar.q();
        int n3 = nVar.n();
        int o3 = nVar.o();
        int p2 = nVar.p();
        int r3 = nVar.r();
        boolean u3 = nVar.u();
        if (matcher.find()) {
            str3 = matcher.group(1);
        }
        return new i(s3, q3, n3, o3, p2, r3, u3, str3);
    }

    public final Z1.a Y(ByteBuffer byteBuffer, C0225y c0225y) {
        BarhopperV3 barhopperV3 = this.f1224n;
        w.e(barhopperV3);
        w.e(byteBuffer);
        boolean isDirect = byteBuffer.isDirect();
        int r22 = c0225y.f2991c;
        int r6 = c0225y.f2990b;
        RecognitionOptions recognitionOptions = this.f1223m;
        if (isDirect) {
            return barhopperV3.recognize(r6, r22, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(r6, r22, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(r6, r22, bArr, recognitionOptions);
    }
}
