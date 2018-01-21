package com.example.james.cruzhacks2018jmmm.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by james on 1/20/18.
 */

public class ChallengeFactory {

    //tags should be comma separated...
    public static JSONObject makeChallenge(String challenge, String difficulty, String tags)
    {
        JSONObject retVal = new JSONObject();
        try{
            retVal.put("challenge", challenge);
            retVal.put("difficulty", difficulty);
            JSONArray tagArray = new JSONArray(tags.split("\\s+,\\s+|,\\s+|\\s+,|,"));
            retVal.put("tags", tagArray);
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return retVal;
    }
}
