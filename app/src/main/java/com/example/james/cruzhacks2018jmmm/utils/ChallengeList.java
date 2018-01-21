package com.example.james.cruzhacks2018jmmm.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by james on 1/20/18.
 *
 * Purpose: a challengelist. Recreating the wheel slightly.
 */

public class ChallengeList {
    private JSONArray list;
    private FileOutputStream os;

    public static JSONObject challengeTemplate = null;
    static {
        try {
            challengeTemplate = new JSONObject();
            challengeTemplate.put("challenge", "");
            challengeTemplate.put("difficulty", "0");
            challengeTemplate.put("tags", "");
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    public ChallengeList()
    {
        list = new JSONArray();
    }

    //if there's something here already, it isn't destructive
    public ChallengeList(FileInputStream is, FileOutputStream os) throws IOException
    {
        this.os = os;
        int size = is.available();
        byte[] jsonStream = new byte[size];
        is.read(jsonStream);
        try {
            list = new JSONArray(jsonStream);
        }
        catch(JSONException e)
        {
            e.printStackTrace(System.err);
        }
        is.close();

    }

    //we want to sort these challenges to get easier pulling later. It's fine for now.
    public boolean addChallenge(JSONObject challenge)
    {
        if(validateChallenge(challenge))
        {
            list.put(challenge);
            return true;
        }
        return false;
    }

    //validates that the challenge being added is legit
    public boolean validateChallenge(JSONObject challenge)
    {

        Iterator<String> itr = challengeTemplate.keys();
        while(itr.hasNext())
        {

            String key = itr.next();
            if(!challenge.has(key))
            {
                return false;
            }

        }

        return true;
    }

    //filters the challenges based on if they have a specific key, value pair
    public ChallengeList filterChallengesByString(String attribute, String value)
    {
        ChallengeList retVal = new ChallengeList();

        if(!challengeTemplate.has(attribute)) return retVal;

        for(int i = 0; i < list.length(); i++)
        {
            try {
                JSONObject obj = list.getJSONObject(i);
                if (obj.get(attribute).equals(value)) retVal.list.put(obj);
            }
            catch(JSONException e)
            {
                e.printStackTrace(System.err);
            }
        }
        return retVal;
    }

    //wrapper around list.get, can return null tho :P
    public JSONObject get(int index)
    {
        try {
            return (JSONObject) list.get(index);
        }
        catch(JSONException e)
        {
            e.printStackTrace(System.err);
        }
        return null;
    }

    //will save our list to the mem, testing stuff rn
    public void saveList() {
        try{
            System.out.println(list.toString());
            os.write(list.toString().getBytes());
        }
        catch(IOException e)
        {
            e.printStackTrace(System.err);
        }
    }

    public void close() {
        try{
            os.close();
        }
        catch(IOException e)
        {
            e.printStackTrace(System.err);
        }
    }
    public String toString()
    {
        return list.toString();
    }



}
