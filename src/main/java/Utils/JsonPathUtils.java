package Utils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonPathUtils {

    public static String getJsonPathValue(String response, String key){

        JsonPath js = new JsonPath(response);
        return js.get(key).toString();

    }


}
