package Utils;

import io.restassured.path.json.JsonPath;

public class JsonPathUtils {

    public static String getJsonPathValue(String response, String key){

        JsonPath js = new JsonPath(response);
        return js.get(key).toString();

    }


}

/*
 * JsonPathUtils
 * -------------
 * Tiny helper utility that extracts a value from a JSON string using
 * RestAssured's JsonPath. It returns the object's toString(); callers
 * should ensure the key exists to avoid NullPointerException.
 */

