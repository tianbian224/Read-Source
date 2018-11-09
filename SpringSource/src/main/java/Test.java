/**
 * @author cang.lv
 * @date 2018/11/9
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        String aa="${cdscs},${bbbb}";
        Pattern p=Pattern.compile("\\$\\{(.*?)\\}");
        Matcher m=p.matcher(aa);
        while(m.find())
        {
            System.out.println(m.group(1));
        }
    }

}
