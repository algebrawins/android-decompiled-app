package A1;

import D.C;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i1.g;
import i1.h;
import j1.m;
import q0.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f169a;

    public i1.c a(Context context, Looper looper, V0.a aVar, Object obj, g gVar, h hVar) {
        switch (this.f169a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                a aVar2 = (a) obj;
                aVar.getClass();
                Integer num = (Integer) aVar.f1357K;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new B1.a(context, looper, aVar, bundle, gVar, hVar);
            case 1:
                throw C.u(obj);
            default:
                m mVar = (m) gVar;
                m mVar2 = (m) hVar;
                switch (this.f169a) {
                    case 2:
                        return new m1.c(context, looper, aVar, (k1.m) obj, mVar, mVar2);
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        i1.a aVar3 = (i1.a) obj;
                        return new com.google.android.gms.common.internal.a(context, looper, 308, aVar, mVar, mVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
