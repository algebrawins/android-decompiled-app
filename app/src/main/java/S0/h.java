package s0;

import D.C;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import x1.R4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f4918A;

    /* renamed from: B  reason: collision with root package name */
    public static final byte[] f4919B;

    /* renamed from: C  reason: collision with root package name */
    public static final byte[] f4920C;

    /* renamed from: D  reason: collision with root package name */
    public static final byte[] f4921D;

    /* renamed from: E  reason: collision with root package name */
    public static final byte[] f4922E;

    /* renamed from: F  reason: collision with root package name */
    public static final byte[] f4923F;

    /* renamed from: G  reason: collision with root package name */
    public static final byte[] f4924G;

    /* renamed from: H  reason: collision with root package name */
    public static final byte[] f4925H;

    /* renamed from: I  reason: collision with root package name */
    public static final byte[] f4926I;

    /* renamed from: J  reason: collision with root package name */
    public static final byte[] f4927J;

    /* renamed from: K  reason: collision with root package name */
    public static final byte[] f4928K;

    /* renamed from: L  reason: collision with root package name */
    public static final byte[] f4929L;

    /* renamed from: M  reason: collision with root package name */
    public static final byte[] f4930M;

    /* renamed from: N  reason: collision with root package name */
    public static final byte[] f4931N;

    /* renamed from: O  reason: collision with root package name */
    public static final byte[] f4932O;

    /* renamed from: P  reason: collision with root package name */
    public static final String[] f4933P;

    /* renamed from: Q  reason: collision with root package name */
    public static final int[] f4934Q;

    /* renamed from: R  reason: collision with root package name */
    public static final byte[] f4935R;

    /* renamed from: S  reason: collision with root package name */
    public static final e f4936S;

    /* renamed from: T  reason: collision with root package name */
    public static final e[][] f4937T;

    /* renamed from: U  reason: collision with root package name */
    public static final e[] f4938U;

    /* renamed from: V  reason: collision with root package name */
    public static final HashMap[] f4939V;

    /* renamed from: W  reason: collision with root package name */
    public static final HashMap[] f4940W;

    /* renamed from: X  reason: collision with root package name */
    public static final HashSet f4941X;

    /* renamed from: Y  reason: collision with root package name */
    public static final HashMap f4942Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final Charset f4943Z;
    public static final byte[] a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f4944b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final Pattern f4945c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final Pattern f4946d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f4947e0;

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f4948t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f4949u;

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f4950v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f4951w;

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f4952x;

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f4953y;

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f4954z;

    /* renamed from: a  reason: collision with root package name */
    public final String f4955a;

    /* renamed from: b  reason: collision with root package name */
    public final FileDescriptor f4956b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager.AssetInputStream f4957c;

    /* renamed from: d  reason: collision with root package name */
    public int f4958d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap[] f4959e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f4960f;
    public ByteOrder g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4961h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4962i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4963j;

    /* renamed from: k  reason: collision with root package name */
    public int f4964k;

    /* renamed from: l  reason: collision with root package name */
    public int f4965l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f4966m;

    /* renamed from: n  reason: collision with root package name */
    public int f4967n;

    /* renamed from: o  reason: collision with root package name */
    public int f4968o;

    /* renamed from: p  reason: collision with root package name */
    public int f4969p;

    /* renamed from: q  reason: collision with root package name */
    public int f4970q;

    /* renamed from: r  reason: collision with root package name */
    public int f4971r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4972s;

    static {
        e[] eVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f4949u = new int[]{8, 8, 8};
        f4950v = new int[]{8};
        f4951w = new byte[]{-1, -40, -1};
        f4952x = new byte[]{102, 116, 121, 112};
        f4953y = new byte[]{109, 105, 102, 49};
        f4954z = new byte[]{104, 101, 105, 99};
        f4918A = new byte[]{79, 76, 89, 77, 80, 0};
        f4919B = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f4920C = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f4921D = new byte[]{101, 88, 73, 102};
        f4922E = new byte[]{73, 72, 68, 82};
        f4923F = new byte[]{73, 69, 78, 68};
        f4924G = new byte[]{82, 73, 70, 70};
        f4925H = new byte[]{87, 69, 66, 80};
        f4926I = new byte[]{69, 88, 73, 70};
        f4927J = new byte[]{-99, 1, 42};
        f4928K = "VP8X".getBytes(Charset.defaultCharset());
        f4929L = "VP8L".getBytes(Charset.defaultCharset());
        f4930M = "VP8 ".getBytes(Charset.defaultCharset());
        f4931N = "ANIM".getBytes(Charset.defaultCharset());
        f4932O = "ANMF".getBytes(Charset.defaultCharset());
        f4933P = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f4934Q = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f4935R = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        e[] eVarArr2 = {new e(254, 4, "NewSubfileType"), new e(255, 4, "SubfileType"), new e(RecognitionOptions.QR_CODE, 3, 4, "ImageWidth"), new e(257, 3, 4, "ImageLength"), new e(258, 3, "BitsPerSample"), new e(259, 3, "Compression"), new e(262, 3, "PhotometricInterpretation"), new e(270, 2, "ImageDescription"), new e(271, 2, "Make"), new e(272, 2, "Model"), new e(273, 3, 4, "StripOffsets"), new e(274, 3, "Orientation"), new e(277, 3, "SamplesPerPixel"), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e(282, 5, "XResolution"), new e(283, 5, "YResolution"), new e(284, 3, "PlanarConfiguration"), new e(296, 3, "ResolutionUnit"), new e(301, 3, "TransferFunction"), new e(305, 2, "Software"), new e(306, 2, "DateTime"), new e(315, 2, "Artist"), new e(318, 5, "WhitePoint"), new e(319, 5, "PrimaryChromaticities"), new e(330, 4, "SubIFDPointer"), new e(513, 4, "JPEGInterchangeFormat"), new e(514, 4, "JPEGInterchangeFormatLength"), new e(529, 5, "YCbCrCoefficients"), new e(530, 3, "YCbCrSubSampling"), new e(531, 3, "YCbCrPositioning"), new e(532, 5, "ReferenceBlackWhite"), new e(33432, 2, "Copyright"), new e(34665, 4, "ExifIFDPointer"), new e(34853, 4, "GPSInfoIFDPointer"), new e(4, 4, "SensorTopBorder"), new e(5, 4, "SensorLeftBorder"), new e(6, 4, "SensorBottomBorder"), new e(7, 4, "SensorRightBorder"), new e(23, 3, "ISO"), new e(46, 7, "JpgFromRaw"), new e(700, 1, "Xmp")};
        f4936S = new e(273, 3, "StripOffsets");
        f4937T = new e[][]{eVarArr2, new e[]{new e(33434, 5, "ExposureTime"), new e(33437, 5, "FNumber"), new e(34850, 3, "ExposureProgram"), new e(34852, 2, "SpectralSensitivity"), new e(34855, 3, "PhotographicSensitivity"), new e(34856, 7, "OECF"), new e(34864, 3, "SensitivityType"), new e(34865, 4, "StandardOutputSensitivity"), new e(34866, 4, "RecommendedExposureIndex"), new e(34867, 4, "ISOSpeed"), new e(34868, 4, "ISOSpeedLatitudeyyy"), new e(34869, 4, "ISOSpeedLatitudezzz"), new e(36864, 2, "ExifVersion"), new e(36867, 2, "DateTimeOriginal"), new e(36868, 2, "DateTimeDigitized"), new e(36880, 2, "OffsetTime"), new e(36881, 2, "OffsetTimeOriginal"), new e(36882, 2, "OffsetTimeDigitized"), new e(37121, 7, "ComponentsConfiguration"), new e(37122, 5, "CompressedBitsPerPixel"), new e(37377, 10, "ShutterSpeedValue"), new e(37378, 5, "ApertureValue"), new e(37379, 10, "BrightnessValue"), new e(37380, 10, "ExposureBiasValue"), new e(37381, 5, "MaxApertureValue"), new e(37382, 5, "SubjectDistance"), new e(37383, 3, "MeteringMode"), new e(37384, 3, "LightSource"), new e(37385, 3, "Flash"), new e(37386, 5, "FocalLength"), new e(37396, 3, "SubjectArea"), new e(37500, 7, "MakerNote"), new e(37510, 7, "UserComment"), new e(37520, 2, "SubSecTime"), new e(37521, 2, "SubSecTimeOriginal"), new e(37522, 2, "SubSecTimeDigitized"), new e(40960, 7, "FlashpixVersion"), new e(40961, 3, "ColorSpace"), new e(40962, 3, 4, "PixelXDimension"), new e(40963, 3, 4, "PixelYDimension"), new e(40964, 2, "RelatedSoundFile"), new e(40965, 4, "InteroperabilityIFDPointer"), new e(41483, 5, "FlashEnergy"), new e(41484, 7, "SpatialFrequencyResponse"), new e(41486, 5, "FocalPlaneXResolution"), new e(41487, 5, "FocalPlaneYResolution"), new e(41488, 3, "FocalPlaneResolutionUnit"), new e(41492, 3, "SubjectLocation"), new e(41493, 5, "ExposureIndex"), new e(41495, 3, "SensingMethod"), new e(41728, 7, "FileSource"), new e(41729, 7, "SceneType"), new e(41730, 7, "CFAPattern"), new e(41985, 3, "CustomRendered"), new e(41986, 3, "ExposureMode"), new e(41987, 3, "WhiteBalance"), new e(41988, 5, "DigitalZoomRatio"), new e(41989, 3, "FocalLengthIn35mmFilm"), new e(41990, 3, "SceneCaptureType"), new e(41991, 3, "GainControl"), new e(41992, 3, "Contrast"), new e(41993, 3, "Saturation"), new e(41994, 3, "Sharpness"), new e(41995, 7, "DeviceSettingDescription"), new e(41996, 3, "SubjectDistanceRange"), new e(42016, 2, "ImageUniqueID"), new e(42032, 2, "CameraOwnerName"), new e(42033, 2, "BodySerialNumber"), new e(42034, 5, "LensSpecification"), new e(42035, 2, "LensMake"), new e(42036, 2, "LensModel"), new e(42240, 5, "Gamma"), new e(50706, 1, "DNGVersion"), new e(50720, 3, 4, "DefaultCropSize")}, new e[]{new e(0, 1, "GPSVersionID"), new e(1, 2, "GPSLatitudeRef"), new e(2, 5, 10, "GPSLatitude"), new e(3, 2, "GPSLongitudeRef"), new e(4, 5, 10, "GPSLongitude"), new e(5, 1, "GPSAltitudeRef"), new e(6, 5, "GPSAltitude"), new e(7, 5, "GPSTimeStamp"), new e(8, 2, "GPSSatellites"), new e(9, 2, "GPSStatus"), new e(10, 2, "GPSMeasureMode"), new e(11, 5, "GPSDOP"), new e(12, 2, "GPSSpeedRef"), new e(13, 5, "GPSSpeed"), new e(14, 2, "GPSTrackRef"), new e(15, 5, "GPSTrack"), new e(16, 2, "GPSImgDirectionRef"), new e(17, 5, "GPSImgDirection"), new e(18, 2, "GPSMapDatum"), new e(19, 2, "GPSDestLatitudeRef"), new e(20, 5, "GPSDestLatitude"), new e(21, 2, "GPSDestLongitudeRef"), new e(22, 5, "GPSDestLongitude"), new e(23, 2, "GPSDestBearingRef"), new e(24, 5, "GPSDestBearing"), new e(25, 2, "GPSDestDistanceRef"), new e(26, 5, "GPSDestDistance"), new e(27, 7, "GPSProcessingMethod"), new e(28, 7, "GPSAreaInformation"), new e(29, 2, "GPSDateStamp"), new e(30, 3, "GPSDifferential"), new e(31, 5, "GPSHPositioningError")}, new e[]{new e(1, 2, "InteroperabilityIndex")}, new e[]{new e(254, 4, "NewSubfileType"), new e(255, 4, "SubfileType"), new e(RecognitionOptions.QR_CODE, 3, 4, "ThumbnailImageWidth"), new e(257, 3, 4, "ThumbnailImageLength"), new e(258, 3, "BitsPerSample"), new e(259, 3, "Compression"), new e(262, 3, "PhotometricInterpretation"), new e(270, 2, "ImageDescription"), new e(271, 2, "Make"), new e(272, 2, "Model"), new e(273, 3, 4, "StripOffsets"), new e(274, 3, "ThumbnailOrientation"), new e(277, 3, "SamplesPerPixel"), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e(282, 5, "XResolution"), new e(283, 5, "YResolution"), new e(284, 3, "PlanarConfiguration"), new e(296, 3, "ResolutionUnit"), new e(301, 3, "TransferFunction"), new e(305, 2, "Software"), new e(306, 2, "DateTime"), new e(315, 2, "Artist"), new e(318, 5, "WhitePoint"), new e(319, 5, "PrimaryChromaticities"), new e(330, 4, "SubIFDPointer"), new e(513, 4, "JPEGInterchangeFormat"), new e(514, 4, "JPEGInterchangeFormatLength"), new e(529, 5, "YCbCrCoefficients"), new e(530, 3, "YCbCrSubSampling"), new e(531, 3, "YCbCrPositioning"), new e(532, 5, "ReferenceBlackWhite"), new e(33432, 2, "Copyright"), new e(34665, 4, "ExifIFDPointer"), new e(34853, 4, "GPSInfoIFDPointer"), new e(50706, 1, "DNGVersion"), new e(50720, 3, 4, "DefaultCropSize")}, eVarArr2, new e[]{new e(RecognitionOptions.QR_CODE, 7, "ThumbnailImage"), new e(8224, 4, "CameraSettingsIFDPointer"), new e(8256, 4, "ImageProcessingIFDPointer")}, new e[]{new e(257, 4, "PreviewImageStart"), new e(258, 4, "PreviewImageLength")}, new e[]{new e(4371, 3, "AspectFrame")}, new e[]{new e(55, 3, "ColorSpace")}};
        f4938U = new e[]{new e(330, 4, "SubIFDPointer"), new e(34665, 4, "ExifIFDPointer"), new e(34853, 4, "GPSInfoIFDPointer"), new e(40965, 4, "InteroperabilityIFDPointer"), new e(8224, 1, "CameraSettingsIFDPointer"), new e(8256, 1, "ImageProcessingIFDPointer")};
        f4939V = new HashMap[10];
        f4940W = new HashMap[10];
        f4941X = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4942Y = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f4943Z = forName;
        a0 = "Exif\u0000\u0000".getBytes(forName);
        f4944b0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int r15 = 0;
        while (true) {
            e[][] eVarArr3 = f4937T;
            if (r15 < eVarArr3.length) {
                f4939V[r15] = new HashMap();
                f4940W[r15] = new HashMap();
                for (e eVar : eVarArr3[r15]) {
                    f4939V[r15].put(Integer.valueOf(eVar.f4912a), eVar);
                    f4940W[r15].put(eVar.f4913b, eVar);
                }
                r15++;
            } else {
                HashMap hashMap = f4942Y;
                e[] eVarArr4 = f4938U;
                hashMap.put(Integer.valueOf(eVarArr4[0].f4912a), 5);
                hashMap.put(Integer.valueOf(eVarArr4[1].f4912a), 1);
                hashMap.put(Integer.valueOf(eVarArr4[2].f4912a), 2);
                hashMap.put(Integer.valueOf(eVarArr4[3].f4912a), 3);
                hashMap.put(Integer.valueOf(eVarArr4[4].f4912a), 7);
                hashMap.put(Integer.valueOf(eVarArr4[5].f4912a), 8);
                Pattern.compile(".*[1-9].*");
                f4945c0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f4946d0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f4947e0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public h(String str) {
        boolean z3;
        e[][] eVarArr = f4937T;
        this.f4959e = new HashMap[eVarArr.length];
        this.f4960f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f4957c = null;
            this.f4955a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        i.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z3 = true;
                    } catch (Exception unused) {
                        if (f4948t) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z3 = false;
                    }
                    if (z3) {
                        this.f4956b = fileInputStream2.getFD();
                    } else {
                        this.f4956b = null;
                    }
                    q(fileInputStream2);
                    R4.a(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    R4.a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static Pair n(String str) {
        int intValue;
        int r12;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair n3 = n(split[0]);
            if (((Integer) n3.first).intValue() == 2) {
                return n3;
            }
            for (int r3 = 1; r3 < split.length; r3++) {
                Pair n4 = n(split[r3]);
                if (!((Integer) n4.first).equals(n3.first) && !((Integer) n4.second).equals(n3.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) n3.first).intValue();
                }
                if (((Integer) n3.second).intValue() != -1 && (((Integer) n4.first).equals(n3.second) || ((Integer) n4.second).equals(n3.second))) {
                    r12 = ((Integer) n3.second).intValue();
                } else {
                    r12 = -1;
                }
                if (intValue == -1 && r12 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    n3 = new Pair(Integer.valueOf(r12), -1);
                } else if (r12 == -1) {
                    n3 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return n3;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        } else {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    int r32 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                    if (r32 >= 0 && parseLong <= 65535) {
                        return new Pair(3, 4);
                    }
                    if (r32 < 0) {
                        return new Pair(9, -1);
                    }
                    return new Pair(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair(2, -1);
            }
        }
    }

    public static ByteOrder t(C0449b c0449b) {
        short readShort = c0449b.readShort();
        boolean z3 = f4948t;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z3) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z3) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void A(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        int r15;
        int r7;
        int r14;
        boolean z3;
        int r19;
        C0450c c0450c;
        byte[] bArr;
        int r10;
        boolean z4;
        if (f4948t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C0449b c0449b = new C0449b(bufferedInputStream, byteOrder);
        C0450c c0450c2 = new C0450c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = f4924G;
        R4.d(c0449b, c0450c2, bArr2.length);
        byte[] bArr3 = f4925H;
        c0449b.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C0450c c0450c3 = new C0450c(byteArrayOutputStream2, byteOrder);
                    int r4 = this.f4968o;
                    if (r4 != 0) {
                        R4.d(c0449b, c0450c3, (r4 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        c0449b.a(4);
                        int readInt = c0449b.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        c0449b.a(readInt);
                        F(c0450c3);
                    } else {
                        byte[] bArr4 = new byte[4];
                        c0449b.readFully(bArr4);
                        byte[] bArr5 = f4928K;
                        boolean equals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = f4930M;
                        byte[] bArr7 = f4929L;
                        boolean z5 = false;
                        if (equals) {
                            int readInt2 = c0449b.readInt();
                            if (readInt2 % 2 == 1) {
                                r10 = readInt2 + 1;
                            } else {
                                r10 = readInt2;
                            }
                            byte[] bArr8 = new byte[r10];
                            c0449b.readFully(bArr8);
                            byte b3 = (byte) (8 | bArr8[0]);
                            bArr8[0] = b3;
                            if (((b3 >> 1) & 1) == 1) {
                                z5 = true;
                            }
                            c0450c3.write(bArr5);
                            c0450c3.b(readInt2);
                            c0450c3.write(bArr8);
                            if (z5) {
                                byte[] bArr9 = f4931N;
                                while (true) {
                                    byte[] bArr10 = new byte[4];
                                    c0449b.readFully(bArr10);
                                    int readInt3 = c0449b.readInt();
                                    c0450c3.write(bArr10);
                                    c0450c3.b(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    R4.d(c0449b, c0450c3, readInt3);
                                    if (Arrays.equals(bArr10, bArr9)) {
                                        break;
                                    }
                                }
                                while (true) {
                                    byte[] bArr11 = new byte[4];
                                    try {
                                        c0449b.readFully(bArr11);
                                        z4 = !Arrays.equals(bArr11, f4932O);
                                    } catch (EOFException unused) {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        break;
                                    }
                                    int readInt4 = c0449b.readInt();
                                    c0450c3.write(bArr11);
                                    c0450c3.b(readInt4);
                                    if (readInt4 % 2 == 1) {
                                        readInt4++;
                                    }
                                    R4.d(c0449b, c0450c3, readInt4);
                                }
                                F(c0450c3);
                            } else {
                                while (true) {
                                    byte[] bArr12 = new byte[4];
                                    c0449b.readFully(bArr12);
                                    int readInt5 = c0449b.readInt();
                                    c0450c3.write(bArr12);
                                    c0450c3.b(readInt5);
                                    if (readInt5 % 2 == 1) {
                                        readInt5++;
                                    }
                                    R4.d(c0449b, c0450c3, readInt5);
                                    if (Arrays.equals(bArr12, bArr6) || (bArr7 != null && Arrays.equals(bArr12, bArr7))) {
                                        break;
                                    }
                                }
                                F(c0450c3);
                            }
                        } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                            int readInt6 = c0449b.readInt();
                            if (readInt6 % 2 == 1) {
                                r15 = readInt6 + 1;
                            } else {
                                r15 = readInt6;
                            }
                            byte[] bArr13 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr4, bArr6);
                            byte[] bArr14 = f4927J;
                            if (equals2) {
                                c0449b.readFully(bArr13);
                                byte[] bArr15 = new byte[3];
                                c0449b.readFully(bArr15);
                                if (Arrays.equals(bArr14, bArr15)) {
                                    r7 = c0449b.readInt();
                                    r15 -= 10;
                                    r14 = (r7 << 18) >> 18;
                                    r19 = (r7 << 2) >> 18;
                                    z3 = false;
                                } else {
                                    throw new IOException("Error checking VP8 signature");
                                }
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                if (c0449b.readByte() == 47) {
                                    r7 = c0449b.readInt();
                                    z3 = true;
                                    r14 = (r7 & 16383) + 1;
                                    r19 = ((r7 & 268419072) >>> 14) + 1;
                                    if ((r7 & 268435456) == 0) {
                                        z3 = false;
                                    }
                                    r15 -= 5;
                                } else {
                                    throw new IOException("Error checking VP8L signature");
                                }
                            } else {
                                r7 = 0;
                                r14 = 0;
                                z3 = false;
                                r19 = 0;
                            }
                            c0450c3.write(bArr5);
                            c0450c3.b(10);
                            byte[] bArr16 = new byte[10];
                            if (z3) {
                                c0450c = c0450c2;
                                bArr16[0] = (byte) (bArr16[0] | 16);
                            } else {
                                c0450c = c0450c2;
                            }
                            bArr = bArr3;
                            bArr16[0] = (byte) (bArr16[0] | 8);
                            int r142 = r14 - 1;
                            int r02 = r19 - 1;
                            bArr16[4] = (byte) r142;
                            bArr16[5] = (byte) (r142 >> 8);
                            bArr16[6] = (byte) (r142 >> 16);
                            bArr16[7] = (byte) r02;
                            bArr16[8] = (byte) (r02 >> 8);
                            bArr16[9] = (byte) (r02 >> 16);
                            c0450c3.write(bArr16);
                            c0450c3.write(bArr4);
                            c0450c3.b(readInt6);
                            if (Arrays.equals(bArr4, bArr6)) {
                                c0450c3.write(bArr13);
                                c0450c3.write(bArr14);
                                c0450c3.b(r7);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                c0450c3.write(47);
                                c0450c3.b(r7);
                            }
                            R4.d(c0449b, c0450c3, r15);
                            F(c0450c3);
                            R4.c(c0449b, c0450c3);
                            byte[] bArr17 = bArr;
                            C0450c c0450c4 = c0450c;
                            c0450c4.b(byteArrayOutputStream2.size() + bArr17.length);
                            c0450c4.write(bArr17);
                            byteArrayOutputStream2.writeTo(c0450c4);
                            R4.a(byteArrayOutputStream2);
                        }
                    }
                    c0450c = c0450c2;
                    bArr = bArr3;
                    R4.c(c0449b, c0450c3);
                    byte[] bArr172 = bArr;
                    C0450c c0450c42 = c0450c;
                    c0450c42.b(byteArrayOutputStream2.size() + bArr172.length);
                    c0450c42.write(bArr172);
                    byteArrayOutputStream2.writeTo(c0450c42);
                    R4.a(byteArrayOutputStream2);
                } catch (Exception e4) {
                    e = e4;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    R4.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public final void B(C0449b c0449b) {
        String str;
        C0451d c0451d;
        int h3;
        HashMap hashMap = this.f4959e[4];
        C0451d c0451d2 = (C0451d) hashMap.get("Compression");
        if (c0451d2 != null) {
            int h4 = c0451d2.h(this.g);
            this.f4967n = h4;
            int r5 = 1;
            if (h4 != 1) {
                if (h4 != 6) {
                    if (h4 != 7) {
                        return;
                    }
                } else {
                    o(c0449b, hashMap);
                    return;
                }
            }
            C0451d c0451d3 = (C0451d) hashMap.get("BitsPerSample");
            String str2 = "ExifInterface";
            if (c0451d3 != null) {
                int[] r3 = (int[]) c0451d3.j(this.g);
                int[] r7 = f4949u;
                if (Arrays.equals(r7, r3) || (this.f4958d == 3 && (c0451d = (C0451d) hashMap.get("PhotometricInterpretation")) != null && (((h3 = c0451d.h(this.g)) == 1 && Arrays.equals(r3, f4950v)) || (h3 == 6 && Arrays.equals(r3, r7))))) {
                    C0451d c0451d4 = (C0451d) hashMap.get("StripOffsets");
                    C0451d c0451d5 = (C0451d) hashMap.get("StripByteCounts");
                    if (c0451d4 != null && c0451d5 != null) {
                        long[] b3 = R4.b(c0451d4.j(this.g));
                        long[] b4 = R4.b(c0451d5.j(this.g));
                        if (b3 != null && b3.length != 0) {
                            if (b4 != null && b4.length != 0) {
                                if (b3.length != b4.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j3 = 0;
                                for (long j4 : b4) {
                                    j3 += j4;
                                }
                                int r72 = (int) j3;
                                byte[] bArr = new byte[r72];
                                this.f4963j = true;
                                this.f4962i = true;
                                this.f4961h = true;
                                int r10 = 0;
                                int r11 = 0;
                                int r12 = 0;
                                while (r10 < b3.length) {
                                    int r14 = (int) b3[r10];
                                    byte[] bArr2 = bArr;
                                    int r9 = (int) b4[r10];
                                    if (r10 < b3.length - r5) {
                                        str = str2;
                                        if (r14 + r9 != b3[r10 + 1]) {
                                            this.f4963j = false;
                                        }
                                    } else {
                                        str = str2;
                                    }
                                    int r142 = r14 - r11;
                                    if (r142 < 0) {
                                        Log.d(str, "Invalid strip offset value");
                                        return;
                                    }
                                    String str3 = str;
                                    try {
                                        c0449b.a(r142);
                                        int r112 = r11 + r142;
                                        byte[] bArr3 = new byte[r9];
                                        try {
                                            c0449b.readFully(bArr3);
                                            r11 = r112 + r9;
                                            System.arraycopy(bArr3, 0, bArr2, r12, r9);
                                            r12 += r9;
                                            r10++;
                                            str2 = str3;
                                            bArr = bArr2;
                                            r5 = 1;
                                        } catch (EOFException unused) {
                                            Log.d(str3, "Failed to read " + r9 + " bytes.");
                                            return;
                                        }
                                    } catch (EOFException unused2) {
                                        Log.d(str3, "Failed to skip " + r142 + " bytes.");
                                        return;
                                    }
                                }
                                this.f4966m = bArr;
                                if (this.f4963j) {
                                    this.f4964k = (int) b3[0];
                                    this.f4965l = r72;
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f4948t) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.f4967n = 6;
        o(c0449b, hashMap);
    }

    public final void C(int r9, int r10) {
        HashMap[] hashMapArr = this.f4959e;
        boolean isEmpty = hashMapArr[r9].isEmpty();
        boolean z3 = f4948t;
        if (!isEmpty && !hashMapArr[r10].isEmpty()) {
            C0451d c0451d = (C0451d) hashMapArr[r9].get("ImageLength");
            C0451d c0451d2 = (C0451d) hashMapArr[r9].get("ImageWidth");
            C0451d c0451d3 = (C0451d) hashMapArr[r10].get("ImageLength");
            C0451d c0451d4 = (C0451d) hashMapArr[r10].get("ImageWidth");
            if (c0451d != null && c0451d2 != null) {
                if (c0451d3 != null && c0451d4 != null) {
                    int h3 = c0451d.h(this.g);
                    int h4 = c0451d2.h(this.g);
                    int h5 = c0451d3.h(this.g);
                    int h6 = c0451d4.h(this.g);
                    if (h3 < h5 && h4 < h6) {
                        HashMap hashMap = hashMapArr[r9];
                        hashMapArr[r9] = hashMapArr[r10];
                        hashMapArr[r10] = hashMap;
                    }
                } else if (z3) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z3) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void D(g gVar, int r12) {
        C0451d e4;
        C0451d e5;
        HashMap[] hashMapArr = this.f4959e;
        C0451d c0451d = (C0451d) hashMapArr[r12].get("DefaultCropSize");
        C0451d c0451d2 = (C0451d) hashMapArr[r12].get("SensorTopBorder");
        C0451d c0451d3 = (C0451d) hashMapArr[r12].get("SensorLeftBorder");
        C0451d c0451d4 = (C0451d) hashMapArr[r12].get("SensorBottomBorder");
        C0451d c0451d5 = (C0451d) hashMapArr[r12].get("SensorRightBorder");
        if (c0451d != null) {
            if (c0451d.f4908a == 5) {
                f[] fVarArr = (f[]) c0451d.j(this.g);
                if (fVarArr != null && fVarArr.length == 2) {
                    e4 = C0451d.d(new f[]{fVarArr[0]}, this.g);
                    e5 = C0451d.d(new f[]{fVarArr[1]}, this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
            } else {
                int[] r11 = (int[]) c0451d.j(this.g);
                if (r11 != null && r11.length == 2) {
                    e4 = C0451d.e(r11[0], this.g);
                    e5 = C0451d.e(r11[1], this.g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r11));
                    return;
                }
            }
            hashMapArr[r12].put("ImageWidth", e4);
            hashMapArr[r12].put("ImageLength", e5);
        } else if (c0451d2 != null && c0451d3 != null && c0451d4 != null && c0451d5 != null) {
            int h3 = c0451d2.h(this.g);
            int h4 = c0451d4.h(this.g);
            int h5 = c0451d5.h(this.g);
            int h6 = c0451d3.h(this.g);
            if (h4 > h3 && h5 > h6) {
                C0451d e6 = C0451d.e(h4 - h3, this.g);
                C0451d e7 = C0451d.e(h5 - h6, this.g);
                hashMapArr[r12].put("ImageLength", e6);
                hashMapArr[r12].put("ImageWidth", e7);
            }
        } else {
            C0451d c0451d6 = (C0451d) hashMapArr[r12].get("ImageLength");
            C0451d c0451d7 = (C0451d) hashMapArr[r12].get("ImageWidth");
            if (c0451d6 == null || c0451d7 == null) {
                C0451d c0451d8 = (C0451d) hashMapArr[r12].get("JPEGInterchangeFormat");
                C0451d c0451d9 = (C0451d) hashMapArr[r12].get("JPEGInterchangeFormatLength");
                if (c0451d8 != null && c0451d9 != null) {
                    int h7 = c0451d8.h(this.g);
                    int h8 = c0451d8.h(this.g);
                    gVar.b(h7);
                    byte[] bArr = new byte[h8];
                    gVar.readFully(bArr);
                    e(new C0449b(bArr), h7, r12);
                }
            }
        }
    }

    public final void E() {
        C(0, 5);
        C(0, 4);
        C(5, 4);
        HashMap[] hashMapArr = this.f4959e;
        C0451d c0451d = (C0451d) hashMapArr[1].get("PixelXDimension");
        C0451d c0451d2 = (C0451d) hashMapArr[1].get("PixelYDimension");
        if (c0451d != null && c0451d2 != null) {
            hashMapArr[0].put("ImageWidth", c0451d);
            hashMapArr[0].put("ImageLength", c0451d2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void F(C0450c c0450c) {
        HashMap[] hashMapArr;
        int[] r6;
        short s3;
        HashMap[] hashMapArr2;
        HashMap[] hashMapArr3;
        Object[] objArr;
        e[][] eVarArr = f4937T;
        int[] r8 = new int[eVarArr.length];
        int[] r9 = new int[eVarArr.length];
        e[] eVarArr2 = f4938U;
        for (e eVar : eVarArr2) {
            w(eVar.f4913b);
        }
        if (this.f4961h) {
            if (this.f4962i) {
                w("StripOffsets");
                w("StripByteCounts");
            } else {
                w("JPEGInterchangeFormat");
                w("JPEGInterchangeFormatLength");
            }
        }
        int r11 = 0;
        while (true) {
            int length = eVarArr.length;
            hashMapArr = this.f4959e;
            if (r11 >= length) {
                break;
            }
            Object[] array = hashMapArr[r11].entrySet().toArray();
            int length2 = array.length;
            int r12 = 0;
            while (r12 < length2) {
                Map.Entry entry = (Map.Entry) array[r12];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[r11].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                r12++;
                array = objArr;
            }
            r11++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f4913b, C0451d.b(0L, this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(eVarArr2[2].f4913b, C0451d.b(0L, this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(eVarArr2[3].f4913b, C0451d.b(0L, this.g));
        }
        if (this.f4961h) {
            if (this.f4962i) {
                hashMapArr[4].put("StripOffsets", C0451d.e(0, this.g));
                hashMapArr[4].put("StripByteCounts", C0451d.e(this.f4965l, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", C0451d.b(0L, this.g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", C0451d.b(this.f4965l, this.g));
            }
        }
        int r3 = 0;
        while (true) {
            int length3 = eVarArr.length;
            r6 = f4934Q;
            if (r3 >= length3) {
                break;
            }
            int r112 = 0;
            for (Map.Entry entry2 : hashMapArr[r3].entrySet()) {
                C0451d c0451d = (C0451d) entry2.getValue();
                c0451d.getClass();
                int r13 = r6[c0451d.f4908a] * c0451d.f4909b;
                if (r13 > 4) {
                    r112 += r13;
                }
            }
            r9[r3] = r9[r3] + r112;
            r3++;
        }
        int r5 = 8;
        for (int r32 = 0; r32 < eVarArr.length; r32++) {
            if (!hashMapArr[r32].isEmpty()) {
                r8[r32] = r5;
                r5 += (hashMapArr[r32].size() * 12) + 6 + r9[r32];
            }
        }
        if (this.f4961h) {
            if (this.f4962i) {
                hashMapArr[4].put("StripOffsets", C0451d.e(r5, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", C0451d.b(r5, this.g));
            }
            this.f4964k = r5;
            r5 += this.f4965l;
        }
        if (this.f4958d == 4) {
            r5 += 8;
        }
        if (f4948t) {
            for (int r22 = 0; r22 < eVarArr.length; r22++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(r22), Integer.valueOf(r8[r22]), Integer.valueOf(hashMapArr[r22].size()), Integer.valueOf(r9[r22]), Integer.valueOf(r5)));
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f4913b, C0451d.b(r8[1], this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(eVarArr2[2].f4913b, C0451d.b(r8[2], this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(eVarArr2[3].f4913b, C0451d.b(r8[3], this.g));
        }
        int r23 = this.f4958d;
        if (r23 != 4) {
            if (r23 != 13) {
                if (r23 == 14) {
                    c0450c.write(f4926I);
                    c0450c.b(r5);
                }
            } else {
                c0450c.b(r5);
                c0450c.write(f4921D);
            }
        } else if (r5 <= 65535) {
            c0450c.j(r5);
            c0450c.write(a0);
        } else {
            throw new IllegalStateException(C.v(r5, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
        }
        if (this.g == ByteOrder.BIG_ENDIAN) {
            s3 = 19789;
        } else {
            s3 = 18761;
        }
        c0450c.f(s3);
        c0450c.f4907K = this.g;
        c0450c.j(42);
        c0450c.h(8L);
        int r24 = 0;
        while (r24 < eVarArr.length) {
            if (!hashMapArr[r24].isEmpty()) {
                c0450c.j(hashMapArr[r24].size());
                int size = (hashMapArr[r24].size() * 12) + r8[r24] + 2 + 4;
                for (Map.Entry entry3 : hashMapArr[r24].entrySet()) {
                    int r122 = ((e) f4940W[r24].get(entry3.getKey())).f4912a;
                    C0451d c0451d2 = (C0451d) entry3.getValue();
                    c0451d2.getClass();
                    int r132 = c0451d2.f4908a;
                    int r14 = r6[r132];
                    int r15 = c0451d2.f4909b;
                    int r142 = r14 * r15;
                    c0450c.j(r122);
                    c0450c.j(r132);
                    c0450c.b(r15);
                    if (r142 > 4) {
                        hashMapArr3 = hashMapArr;
                        c0450c.h(size);
                        size += r142;
                    } else {
                        hashMapArr3 = hashMapArr;
                        c0450c.write(c0451d2.f4911d);
                        if (r142 < 4) {
                            while (r142 < 4) {
                                c0450c.a(0);
                                r142++;
                            }
                        }
                    }
                    hashMapArr = hashMapArr3;
                }
                hashMapArr2 = hashMapArr;
                if (r24 == 0 && !hashMapArr2[4].isEmpty()) {
                    c0450c.h(r8[4]);
                } else {
                    c0450c.h(0L);
                }
                for (Map.Entry entry4 : hashMapArr2[r24].entrySet()) {
                    byte[] bArr = ((C0451d) entry4.getValue()).f4911d;
                    if (bArr.length > 4) {
                        c0450c.write(bArr, 0, bArr.length);
                    }
                }
            } else {
                hashMapArr2 = hashMapArr;
            }
            r24++;
            hashMapArr = hashMapArr2;
        }
        if (this.f4961h) {
            c0450c.write(l());
        }
        if (this.f4958d == 14 && r5 % 2 == 1) {
            c0450c.a(0);
        }
        c0450c.f4907K = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String b3 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f4959e;
        if (b3 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", C0451d.a(b3));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C0451d.b(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C0451d.b(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C0451d.b(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C0451d.b(0L, this.g));
        }
    }

    public final String b(String str) {
        if (str != null) {
            C0451d c4 = c(str);
            if (c4 != null) {
                if (!f4941X.contains(str)) {
                    return c4.i(this.g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int r7 = c4.f4908a;
                    if (r7 != 5 && r7 != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + r7);
                        return null;
                    }
                    f[] fVarArr = (f[]) c4.j(this.g);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) fVar.f4916a) / ((float) fVar.f4917b)));
                        f fVar2 = fVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) fVar2.f4916a) / ((float) fVar2.f4917b)));
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) fVar3.f4916a) / ((float) fVar3.f4917b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                try {
                    return Double.toString(c4.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final C0451d c(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f4948t) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int r02 = 0; r02 < f4937T.length; r02++) {
                C0451d c0451d = (C0451d) this.f4959e[r02].get(str);
                if (c0451d != null) {
                    return c0451d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final void d(g gVar) {
        String str;
        String str2;
        String str3;
        int r10;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    j.a(mediaMetadataRetriever, new C0448a(gVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f4959e;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C0451d.e(Integer.parseInt(str), this.g));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C0451d.e(Integer.parseInt(str2), this.g));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    r10 = 1;
                                } else {
                                    r10 = 8;
                                }
                            } else {
                                r10 = 3;
                            }
                        } else {
                            r10 = 6;
                        }
                        hashMapArr[0].put("Orientation", C0451d.e(r10, this.g));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            gVar.b(parseInt2);
                            byte[] bArr = new byte[6];
                            gVar.readFully(bArr);
                            int r3 = parseInt2 + 6;
                            int r4 = parseInt3 - 6;
                            if (Arrays.equals(bArr, a0)) {
                                byte[] bArr2 = new byte[r4];
                                gVar.readFully(bArr2);
                                this.f4968o = r3;
                                u(bArr2, 0);
                            } else {
                                throw new IOException("Invalid identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f4948t) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
        r23.f4903L = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179 A[LOOP:0: B:10:0x0033->B:78:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(s0.C0449b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.e(s0.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0156, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bb, code lost:
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.f(java.io.BufferedInputStream):int");
    }

    public final void g(g gVar) {
        int r5;
        int r12;
        j(gVar);
        HashMap[] hashMapArr = this.f4959e;
        C0451d c0451d = (C0451d) hashMapArr[1].get("MakerNote");
        if (c0451d != null) {
            g gVar2 = new g(c0451d.f4911d);
            gVar2.f4903L = this.g;
            byte[] bArr = f4918A;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.b(0L);
            byte[] bArr3 = f4919B;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.b(12L);
            }
            v(gVar2, 6);
            C0451d c0451d2 = (C0451d) hashMapArr[7].get("PreviewImageStart");
            C0451d c0451d3 = (C0451d) hashMapArr[7].get("PreviewImageLength");
            if (c0451d2 != null && c0451d3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c0451d2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c0451d3);
            }
            C0451d c0451d4 = (C0451d) hashMapArr[8].get("AspectFrame");
            if (c0451d4 != null) {
                int[] r13 = (int[]) c0451d4.j(this.g);
                if (r13 != null && r13.length == 4) {
                    int r22 = r13[2];
                    int r4 = r13[0];
                    if (r22 > r4 && (r5 = r13[3]) > (r12 = r13[1])) {
                        int r23 = (r22 - r4) + 1;
                        int r52 = (r5 - r12) + 1;
                        if (r23 < r52) {
                            int r24 = r23 + r52;
                            r52 = r24 - r52;
                            r23 = r24 - r52;
                        }
                        C0451d e4 = C0451d.e(r23, this.g);
                        C0451d e5 = C0451d.e(r52, this.g);
                        hashMapArr[0].put("ImageWidth", e4);
                        hashMapArr[0].put("ImageLength", e5);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(r13));
            }
        }
    }

    public final void h(C0449b c0449b) {
        if (f4948t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0449b);
        }
        c0449b.f4903L = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4920C;
        c0449b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c0449b.readInt();
                byte[] bArr2 = new byte[4];
                c0449b.readFully(bArr2);
                int r02 = length + 8;
                if (r02 == 16 && !Arrays.equals(bArr2, f4922E)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (!Arrays.equals(bArr2, f4923F)) {
                    if (Arrays.equals(bArr2, f4921D)) {
                        byte[] bArr3 = new byte[readInt];
                        c0449b.readFully(bArr3);
                        int readInt2 = c0449b.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f4968o = r02;
                            u(bArr3, 0);
                            E();
                            B(new C0449b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int r12 = readInt + 4;
                    c0449b.a(r12);
                    length = r02 + r12;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C0449b c0449b) {
        boolean z3 = f4948t;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0449b);
        }
        c0449b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0449b.readFully(bArr);
        c0449b.readFully(bArr2);
        c0449b.readFully(bArr3);
        int r3 = ByteBuffer.wrap(bArr).getInt();
        int r4 = ByteBuffer.wrap(bArr2).getInt();
        int r22 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[r4];
        c0449b.a(r3 - c0449b.f4902K);
        c0449b.readFully(bArr4);
        e(new C0449b(bArr4), r3, 5);
        c0449b.a(r22 - c0449b.f4902K);
        c0449b.f4903L = ByteOrder.BIG_ENDIAN;
        int readInt = c0449b.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int r42 = 0; r42 < readInt; r42++) {
            int readUnsignedShort = c0449b.readUnsignedShort();
            int readUnsignedShort2 = c0449b.readUnsignedShort();
            if (readUnsignedShort == f4936S.f4912a) {
                short readShort = c0449b.readShort();
                short readShort2 = c0449b.readShort();
                C0451d e4 = C0451d.e(readShort, this.g);
                C0451d e5 = C0451d.e(readShort2, this.g);
                HashMap[] hashMapArr = this.f4959e;
                hashMapArr[0].put("ImageLength", e4);
                hashMapArr[0].put("ImageWidth", e5);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0449b.a(readUnsignedShort2);
        }
    }

    public final void j(g gVar) {
        r(gVar);
        v(gVar, 0);
        D(gVar, 0);
        D(gVar, 5);
        D(gVar, 4);
        E();
        if (this.f4958d == 8) {
            HashMap[] hashMapArr = this.f4959e;
            C0451d c0451d = (C0451d) hashMapArr[1].get("MakerNote");
            if (c0451d != null) {
                g gVar2 = new g(c0451d.f4911d);
                gVar2.f4903L = this.g;
                gVar2.a(6);
                v(gVar2, 9);
                C0451d c0451d2 = (C0451d) hashMapArr[9].get("ColorSpace");
                if (c0451d2 != null) {
                    hashMapArr[1].put("ColorSpace", c0451d2);
                }
            }
        }
    }

    public final void k(g gVar) {
        if (f4948t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        j(gVar);
        HashMap[] hashMapArr = this.f4959e;
        C0451d c0451d = (C0451d) hashMapArr[0].get("JpgFromRaw");
        if (c0451d != null) {
            e(new C0449b(c0451d.f4911d), (int) c0451d.f4910c, 5);
        }
        C0451d c0451d2 = (C0451d) hashMapArr[0].get("ISO");
        C0451d c0451d3 = (C0451d) hashMapArr[1].get("PhotographicSensitivity");
        if (c0451d2 != null && c0451d3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c0451d2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] l() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f4961h
            r4 = 0
            if (r3 != 0) goto Lc
            return r4
        Lc:
            byte[] r3 = r10.f4966m
            if (r3 == 0) goto L11
            return r3
        L11:
            android.content.res.AssetManager$AssetInputStream r3 = r10.f4957c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L33
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            if (r5 == 0) goto L2a
            r3.reset()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
        L1e:
            r5 = r4
            goto L5c
        L20:
            r2 = move-exception
            r5 = r4
        L22:
            r4 = r3
            goto L9c
        L25:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L8a
        L2a:
            java.lang.String r5 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L25
            x1.R4.a(r3)
            return r4
        L33:
            java.lang.String r3 = r10.f4955a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L47
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r5 = r10.f4955a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            goto L1e
        L3f:
            r2 = move-exception
            r5 = r4
            goto L9c
        L42:
            r5 = move-exception
            r3 = r4
            r6 = r5
            r5 = r3
            goto L8a
        L47:
            java.io.FileDescriptor r3 = r10.f4956b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.io.FileDescriptor r3 = s0.i.b(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r6 = 0
            s0.i.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r9 = r5
            r5 = r3
            r3 = r9
        L5c:
            s0.b r6 = new s0.b     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f4964k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r8 = r10.f4968o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            int r7 = r10.f4965l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r10.f4966m = r7     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            x1.R4.a(r3)
            if (r5 == 0) goto L7e
            s0.i.a(r5)     // Catch: java.lang.Exception -> L7b
            goto L7e
        L7b:
            android.util.Log.e(r1, r0)
        L7e:
            return r7
        L7f:
            r2 = move-exception
            goto L22
        L81:
            r6 = move-exception
            goto L8a
        L83:
            r2 = move-exception
            r5 = r3
            goto L9c
        L86:
            r5 = move-exception
            r6 = r5
            r5 = r3
            r3 = r4
        L8a:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r6)     // Catch: java.lang.Throwable -> L7f
            x1.R4.a(r3)
            if (r5 == 0) goto L9b
            s0.i.a(r5)     // Catch: java.lang.Exception -> L98
            goto L9b
        L98:
            android.util.Log.e(r1, r0)
        L9b:
            return r4
        L9c:
            x1.R4.a(r4)
            if (r5 == 0) goto La8
            s0.i.a(r5)     // Catch: java.lang.Exception -> La5
            goto La8
        La5:
            android.util.Log.e(r1, r0)
        La8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.l():byte[]");
    }

    public final void m(C0449b c0449b) {
        if (f4948t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0449b);
        }
        c0449b.f4903L = ByteOrder.LITTLE_ENDIAN;
        c0449b.a(f4924G.length);
        int readInt = c0449b.readInt() + 8;
        byte[] bArr = f4925H;
        c0449b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0449b.readFully(bArr2);
                int readInt2 = c0449b.readInt();
                int r12 = length + 8;
                if (Arrays.equals(f4926I, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c0449b.readFully(bArr3);
                    this.f4968o = r12;
                    u(bArr3, 0);
                    B(new C0449b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = r12 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length <= readInt) {
                    c0449b.a(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(C0449b c0449b, HashMap hashMap) {
        C0451d c0451d = (C0451d) hashMap.get("JPEGInterchangeFormat");
        C0451d c0451d2 = (C0451d) hashMap.get("JPEGInterchangeFormatLength");
        if (c0451d != null && c0451d2 != null) {
            int h3 = c0451d.h(this.g);
            int h4 = c0451d2.h(this.g);
            if (this.f4958d == 7) {
                h3 += this.f4969p;
            }
            if (h3 > 0 && h4 > 0) {
                this.f4961h = true;
                if (this.f4955a == null && this.f4957c == null && this.f4956b == null) {
                    byte[] bArr = new byte[h4];
                    c0449b.a(h3);
                    c0449b.readFully(bArr);
                    this.f4966m = bArr;
                }
                this.f4964k = h3;
                this.f4965l = h4;
            }
            if (f4948t) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h3 + ", length: " + h4);
            }
        }
    }

    public final boolean p(HashMap hashMap) {
        C0451d c0451d = (C0451d) hashMap.get("ImageLength");
        C0451d c0451d2 = (C0451d) hashMap.get("ImageWidth");
        if (c0451d != null && c0451d2 != null) {
            int h3 = c0451d.h(this.g);
            int h4 = c0451d2.h(this.g);
            if (h3 <= 512 && h4 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:42:0x008f), top: B:52:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = s0.h.f4948t
            r1 = 0
            r2 = 0
        L4:
            s0.e[][] r3 = s0.h.f4937T     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.f4959e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.f(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.f4958d = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            s0.g r8 = new s0.g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.f4958d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.d(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.g(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.k(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.j(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.f4968o     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.b(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.B(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            s0.b r8 = new s0.b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.f4958d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.e(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.h(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.i(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.m(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.a()
            if (r0 == 0) goto La6
        L89:
            r7.s()
            goto La6
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.a()
            if (r0 == 0) goto L9f
            r7.s()
        L9f:
            throw r8
        La0:
            r7.a()
            if (r0 == 0) goto La6
            goto L89
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.q(java.io.InputStream):void");
    }

    public final void r(g gVar) {
        ByteOrder t3 = t(gVar);
        this.g = t3;
        gVar.f4903L = t3;
        int readUnsignedShort = gVar.readUnsignedShort();
        int r12 = this.f4958d;
        if (r12 != 7 && r12 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = gVar.readInt();
        if (readInt >= 8) {
            int r02 = readInt - 8;
            if (r02 > 0) {
                gVar.a(r02);
                return;
            }
            return;
        }
        throw new IOException(C.w("Invalid first Ifd offset: ", readInt));
    }

    public final void s() {
        int r02 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f4959e;
            if (r02 < hashMapArr.length) {
                Log.d("ExifInterface", "The size of tag group[" + r02 + "]: " + hashMapArr[r02].size());
                for (Map.Entry entry : hashMapArr[r02].entrySet()) {
                    C0451d c0451d = (C0451d) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0451d.toString() + ", tagValue: '" + c0451d.i(this.g) + "'");
                }
                r02++;
            } else {
                return;
            }
        }
    }

    public final void u(byte[] bArr, int r3) {
        g gVar = new g(bArr);
        r(gVar);
        v(gVar, r3);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(s0.g r29, int r30) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.h.v(s0.g, int):void");
    }

    public final void w(String str) {
        for (int r02 = 0; r02 < f4937T.length; r02++) {
            this.f4959e[r02].remove(str);
        }
    }

    public final void x(int r4, String str, String str2) {
        HashMap[] hashMapArr = this.f4959e;
        if (!hashMapArr[r4].isEmpty() && hashMapArr[r4].get(str) != null) {
            HashMap hashMap = hashMapArr[r4];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[r4].remove(str);
        }
    }

    public final void y(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        C0451d c0451d;
        if (f4948t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C0449b c0449b = new C0449b(bufferedInputStream);
        C0450c c0450c = new C0450c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (c0449b.readByte() == -1) {
            c0450c.a(-1);
            if (c0449b.readByte() == -40) {
                c0450c.a(-40);
                String b3 = b("Xmp");
                HashMap[] hashMapArr = this.f4959e;
                if (b3 != null && this.f4972s) {
                    c0451d = (C0451d) hashMapArr[0].remove("Xmp");
                } else {
                    c0451d = null;
                }
                c0450c.a(-1);
                c0450c.a(-31);
                F(c0450c);
                if (c0451d != null) {
                    hashMapArr[0].put("Xmp", c0451d);
                }
                byte[] bArr = new byte[RecognitionOptions.AZTEC];
                while (c0449b.readByte() == -1) {
                    byte readByte = c0449b.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c0450c.a(-1);
                            c0450c.a(readByte);
                            int readUnsignedShort = c0449b.readUnsignedShort();
                            c0450c.j(readUnsignedShort);
                            int r4 = readUnsignedShort - 2;
                            if (r4 >= 0) {
                                while (r4 > 0) {
                                    int read = c0449b.read(bArr, 0, Math.min(r4, (int) RecognitionOptions.AZTEC));
                                    if (read >= 0) {
                                        c0450c.write(bArr, 0, read);
                                        r4 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = c0449b.readUnsignedShort();
                            int r9 = readUnsignedShort2 - 2;
                            if (r9 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (r9 >= 6) {
                                    c0449b.readFully(bArr2);
                                    if (Arrays.equals(bArr2, a0)) {
                                        c0449b.a(readUnsignedShort2 - 8);
                                    }
                                }
                                c0450c.a(-1);
                                c0450c.a(readByte);
                                c0450c.j(readUnsignedShort2);
                                if (r9 >= 6) {
                                    r9 = readUnsignedShort2 - 8;
                                    c0450c.write(bArr2);
                                }
                                while (r9 > 0) {
                                    int read2 = c0449b.read(bArr, 0, Math.min(r9, (int) RecognitionOptions.AZTEC));
                                    if (read2 >= 0) {
                                        c0450c.write(bArr, 0, read2);
                                        r9 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c0450c.a(-1);
                        c0450c.a(readByte);
                        R4.c(c0449b, c0450c);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f4948t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C0449b c0449b = new C0449b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C0450c c0450c = new C0450c(bufferedOutputStream, byteOrder);
        byte[] bArr = f4920C;
        R4.d(c0449b, c0450c, bArr.length);
        int r22 = this.f4968o;
        if (r22 == 0) {
            int readInt = c0449b.readInt();
            c0450c.b(readInt);
            R4.d(c0449b, c0450c, readInt + 8);
        } else {
            R4.d(c0449b, c0450c, (r22 - bArr.length) - 8);
            c0449b.a(c0449b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C0450c c0450c2 = new C0450c(byteArrayOutputStream, byteOrder);
            F(c0450c2);
            byte[] byteArray = ((ByteArrayOutputStream) c0450c2.f4906J).toByteArray();
            c0450c.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c0450c.b((int) crc32.getValue());
            R4.a(byteArrayOutputStream);
            R4.c(c0449b, c0450c);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            R4.a(byteArrayOutputStream2);
            throw th;
        }
    }

    public h(InputStream inputStream) {
        e[][] eVarArr = f4937T;
        this.f4959e = new HashMap[eVarArr.length];
        this.f4960f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.f4955a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f4957c = (AssetManager.AssetInputStream) inputStream;
            this.f4956b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f4957c = null;
                    this.f4956b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f4948t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f4957c = null;
            this.f4956b = null;
        }
        q(inputStream);
    }
}
