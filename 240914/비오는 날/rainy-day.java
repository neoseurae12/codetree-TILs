import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class WeatherDatum {
    String date;
    String day;
    String weather;

    public WeatherDatum(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // todo
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        WeatherDatum[] weatherData = new WeatherDatum[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();
            weatherData[i] = new WeatherDatum(date, day, weather);
        }

        WeatherDatum nearestRainyDatum = null;
        for (int i = 0; i < n; i++) {
            if (weatherData[i].weather.equals("Rain")) {
                if (nearestRainyDatum == null) {
                    nearestRainyDatum = weatherData[i];
                    continue;
                }

                if (weatherData[i].date.compareTo(nearestRainyDatum.date) < 0) {
                    nearestRainyDatum = weatherData[i];
                }
            }
        }

        System.out.printf("%s %s %s\n", nearestRainyDatum.date, nearestRainyDatum.day, nearestRainyDatum.weather);
    }
}