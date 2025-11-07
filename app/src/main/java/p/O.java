package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import k.C0312e;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4561a;

    public /* synthetic */ O(int r12) {
        this.f4561a = r12;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f4561a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                try {
                    return C0312e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    E0.e eVar = new E0.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e5) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    E0.q qVar = new E0.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e6) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e6);
                    return null;
                }
        }
    }
}
