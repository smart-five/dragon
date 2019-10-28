package com.org.dragon.core.demo.code;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @date 2019/08/19 10:37 <br>
 * @see com.org.dragon.core.demo <br>
 */
@Getter
@ToString
public class CodeConfig {



    public final static char PATTERN_PLACEHOLDER = '#';

    public static class Charset {
        public static final String ALPHABETIC   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String NUMBERS      = "0123456789";
    }

    private final int length;
    private final String charset;
    private final String prefix;
    private final String postfix;
    private final String pattern;

    public CodeConfig(Integer length, String charset, String prefix, String postfix, String pattern) {
        if (length == null) {
            length = 8;
        }

        if (charset == null) {
            charset = Charset.ALPHANUMERIC;
        }

        if (pattern == null) {
            char[] chars = new char[length];
            Arrays.fill(chars, PATTERN_PLACEHOLDER);
            pattern = new String(chars);
        }

        this.length = length;
        this.charset = charset;
        this.prefix = prefix;
        this.postfix = postfix;
        this.pattern = pattern;
    }

    public static CodeConfig length(int length) {
        return new CodeConfig(length, null, null, null, null);
    }

    public static CodeConfig pattern(String pattern) {
        return new CodeConfig(null, null, null, null, pattern);
    }

    public CodeConfig withPrefix(String prefix) {
        return new CodeConfig(length, charset, prefix, postfix, pattern);
    }

    public CodeConfig withPostfix(String postfix) {
        return new CodeConfig(length, charset, prefix, postfix, pattern);
    }



}
