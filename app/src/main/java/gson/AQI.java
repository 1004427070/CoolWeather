package gson;

//aqi整体空气质量指数，pm25单项空气质量指数
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
