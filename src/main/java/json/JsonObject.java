package json;

import java.util.Arrays;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    private JsonPair[] jsonObject;

    public JsonObject(JsonPair... jsonPairs) {
        jsonObject = jsonPairs;
    }

    @Override
    public String toJson() {
        String result = "{";
        if (jsonObject.length > 1) {
            for (int i = 0; i < jsonObject.length - 1; i++) {
                JsonPair jsp = jsonObject[i];
                result += jsp.toString() + ",";
            }
            result += jsonObject[jsonObject.length - 1].toString() + "}";
        }
        else{
            result = "{" + jsonObject[0].toString() + "}";
        };

        return  result;
    }

    public void add(JsonPair jsonPair) {
        JsonPair[] newJo = new JsonPair[jsonObject.length + 1];
        int c = 0;
        for(JsonPair jsp : jsonObject){
            newJo[c] = jsp;
            c++;
        }
        newJo[c] =  jsonPair;
        jsonObject = newJo;
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return this;
    }
}
