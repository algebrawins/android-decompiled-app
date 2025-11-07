package O1;

import N2.g;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import d1.InterfaceC0232a;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import q0.k;
import y0.e;

/* loaded from: classes.dex */
public final class a implements InterfaceC0232a, e {
    public String a(List list) {
        g.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        g.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    @Override // d1.InterfaceC0232a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // y0.e
    public void e(int r4, Serializable serializable) {
        String str;
        switch (r4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (r4 != 6 && r4 != 7 && r4 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override // y0.e
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
}
