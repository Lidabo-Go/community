package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 *
 */
public class CommunityUtil {
    //生成随机的字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    //MD5算法加密
    //只能加密，不能解密，每次加密的结果都是一样的 例如：hello -> abc12345
    //hello + 随机字符串 会更安全
    public static String md5(String key) {
        //全是空格或者长度为0
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }


}
