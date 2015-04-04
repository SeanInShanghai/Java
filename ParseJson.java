package parse.json;
import parse.Parse;

import org.json.*;

public class ParseJson extends Parse{
	public void doParse(String jsonString) throws JSONException{
		jsonString="{\"users\":[{\"loginname\":\"zhangfan\",\"password\":\"userpass\",\"email\":\"10371443@qq.com\"},{\"loginname\":\"zf\",\"password\":\"userpass\",\"email\":\"822393@qq.com\"}]}";
		JSONObject jo = new JSONObject(jsonString);
		JSONArray ja = jo.getJSONArray("users");
		String names = "names: ";
		for(int i = 0; i < ja.length(); i++)
		{
			JSONObject user = (JSONObject)ja.get(i);
			String username = (String)user.get("loginname");
			
			if(i == ja.length() - 1){
				names += username;
			}else{
				names += username + ",";
			}
		}
		
		System.out.println(names);
	}	
}
