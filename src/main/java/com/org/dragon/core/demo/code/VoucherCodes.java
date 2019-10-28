package com.org.dragon.core.demo.code;

import java.util.Random;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br> 兑换码
 * @date 2019/08/19 10:37 <br>
 * @see com.org.dragon.core.demo <br>
 */
public class VoucherCodes {



    private static final Random RND = new Random(System.currentTimeMillis());

    /**
     * Generates a random code according to given config.
     *
     * @param config
     *
     * @return Generated code.
     */
    public static String generate(CodeConfig config) {
        StringBuilder sb = new StringBuilder();
        char[] chars = config.getCharset().toCharArray();
        char[] pattern = config.getPattern().toCharArray();

        if (config.getPrefix() != null) {
            sb.append(config.getPrefix());
        }

        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == CodeConfig.PATTERN_PLACEHOLDER) {
                sb.append(chars[RND.nextInt(chars.length)]);
            } else {
                sb.append(pattern[i]);
            }
        }

        if (config.getPostfix() != null) {
            sb.append(config.getPostfix());
        }

        return sb.toString();
    }

}
