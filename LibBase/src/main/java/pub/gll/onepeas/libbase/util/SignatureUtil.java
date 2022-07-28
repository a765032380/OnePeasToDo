package pub.gll.onepeas.libbase.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SignatureUtil {

    private static final String SECRET = "MJwUzkDiL2aUEo6s";

    public static String getSignature(Map<String, Object> data) {
        try {
            return md5(getSortedContent(data));
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String getSortedContent(Map<String, Object> data) {
        StringBuffer content = new StringBuffer();
        List<String> keys = new ArrayList<String>(data.keySet());
        Collections.sort(keys);
        int index = 0;
        for (String key : keys) {
            Object value = data.get(key);
            content.append((index == 0 ? "" : "|")).append(getEncodeParams(value));
            index++;
        }
        content.append("|").append(SECRET);

        return content.toString();
    }

    private static String md5(String src) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bs = md.digest(src.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : bs) {
            String s = Integer.toHexString(b & 0xFF);
            if (s.length() == 1) {
                sb.append("0");
            }
            //转为大写字母
            sb.append(s.toLowerCase());
        }
        return sb.toString();
    }

    /**
     * 将参数值encode后使用
     */
    private static String getEncodeParams(Object param) {
        try {
            return URLEncoder.encode(param.toString(), "UTF-8").replace("+", "%20").replace("*", "%2A");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
