package be.vives.ti;

import org.apache.commons.lang3.StringUtils;

public class StringProcessor {
    public String appendIfMissing (String str, String suffix) {
        int i = 0;
        return StringUtils.appendIfMissing(str, suffix);
    }

}
