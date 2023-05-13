package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "미공개";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        // 예외 처리
        try {
            URL url = new URL(urlString); // url 이 정확한 url 인지 알아보기 위해서 URL class 를 사용한다 (잘못된 url 이면 에러가 발생한다.)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // url 연결 시키기 위한 객체 생성 (캐스팅 필요)
            connection.setRequestMethod("GET"); // 연결할 때 어떤 방식으로 요청 할 것인지? ex) get, post ...
            connection.setRequestProperty("Accept", "application/json"); // 받을 데이터 형식을 정해줌

            int responseCode = connection.getResponseCode(); // 응답 코드를 받을 수 있음 정상(200)
            if (responseCode == 200) {
                // 스트림(Stream = 입력, 출력에 관련된 스트림, collection 에 관련된 스트림이 아님)의 연결
                // getInputStream 으로 연결통로(빨대)를 만들어서 받음 -> 여기서 연결통로는 1byte 씩 전송되기 때문에 한글이 깨짐
                // (ex) '밥'이라는 문자는 2byte 이기 때문에 1byte 씩 전송해서 받으면 글자가 깨짐)
                // 따라서 InputStreamReader 를 사용해서 전송되는 데이터가 깨지지 않게 해줌
                // BufferedReader 는 데이터를 모아서 한번에 보거나 전송하기 위해서 사용
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content.toString() = " + content);
                // jsonObject 는 {     } 안에 값들이 통채로 담겨있다.
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();
                // 현재 서울의 온도 출력
                System.out.println("현재 서울의 온도 출력 = " + temp);
                connection.disconnect();


            }else {
                System.out.println("응답 코드 오류 : " + responseCode);
            }


        } catch (Exception e) {
            e.printStackTrace(); // 에러메세지 출력
        }
    }
}
