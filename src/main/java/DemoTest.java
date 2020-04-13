


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DemoTest {

    private static Object String;

    public static void main(String[] args) throws IOException {

        


        /**
         * JSON转换为List对象
         */

        ObjectMapper mapper = new ObjectMapper();

        String json = "{\n" +
                "\t\"programmeId\": \"ENDCUSTOMER\",\n" +
                "\t\"customerTypeId\": \"COS\",\n" +
                "\t\"customerGroupId\": {\n" +
                "\t\t\"$in\": [\"CUSTGROUP2018001\", \"CUSTOMERGROUP\", \"IMAGE\"]\n" +
                "\t},\n" +
                "\t\"roleId\": \"ALL_READ\"\n" +
                "}";

        JsonNode map = mapper.readValue(json, JsonNode.class);
        System.out.println( map.get("customerTypeId"));

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(",\"subdivision\":{\"$eq\":" + map.get("customerTypeId") + "}");
        sBuilder.append(",\"xxx\""+":"+map.get("customerGroupId"));
        System.out.println(sBuilder);

          /*  String json = "[{\"uid\":1,\"uname\":\"www\",\"number\":234,\"upwd\":\"456\"},"
                    + "{\"uid\":5,\"uname\":\"tom\",\"number\":3.44,\"upwd\":\"123\"}]";
            try {
                List<LinkedHashMap<String, Object>> list = mapper.readValue(json, List.class);
                System.out.println(list.size());
                for (int i = 0; i < list.size(); i++) {
                    Map<String, Object> map = list.get(i);
                    Set<String> set = map.keySet();
                    for (Iterator<String> it = set.iterator(); it.hasNext();) {
                        String key = it.next();
                        System.out.println(key + ":" + map.get(key));
                    }
                }
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }
}
