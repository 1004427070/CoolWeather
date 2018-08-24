package gson;

import com.google.gson.annotations.SerializedName;

//目前天气状况以及气温
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
