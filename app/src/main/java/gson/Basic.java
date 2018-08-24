package gson;

import com.google.gson.annotations.SerializedName;

//城市天气信息基础数据
public class Basic {

    //使用@SerializedName注解，让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
