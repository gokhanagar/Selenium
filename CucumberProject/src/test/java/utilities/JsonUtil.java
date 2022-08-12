package utilities;


import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    //1. Method: (De-Serialization) Json Data to Java Object

    public static <T> T convertJsonToJavaObject(String json, Class<T> cls){//Generic Method
        T javaResult = null;

        try {
            javaResult = mapper.readValue(json,cls);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return javaResult;
    }


    //2. Method: (Serialization)  Java Object to Json Data

    public static String convertJavaObjectToJson(Object obj){

        String jsonResult = null;

        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResult;
    }


}
