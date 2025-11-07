package x1;

import androidx.datastore.preferences.protobuf.C0111h;

/* loaded from: classes.dex */
public abstract class W3 {
    public static String a(C0111h c0111h) {
        StringBuilder sb = new StringBuilder(c0111h.size());
        for (int r12 = 0; r12 < c0111h.size(); r12++) {
            byte e4 = c0111h.e(r12);
            if (e4 != 34) {
                if (e4 != 39) {
                    if (e4 != 92) {
                        switch (e4) {
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (e4 >= 32 && e4 <= 126) {
                                    sb.append((char) e4);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((e4 >>> 6) & 3) + 48));
                                    sb.append((char) (((e4 >>> 3) & 7) + 48));
                                    sb.append((char) ((e4 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
