import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;
import java.util.ArrayList;

class CodeKata {
    static public void main(String[] args) {
        ReadFileAndOutput("/Users/stephenterapak/IdeaProjects/CommandLine/Data/weather.dat");
    }

    public static void ReadFileAndOutput(String inVal) {
        try{
            ArrayList<WeatherData> wdLIst = new ArrayList<>();

            // pass the path to the file as a parameter
            File file =
                    new File("/Users/stephenterapak/IdeaProjects/CommandLine/Data/weather.dat");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                WeatherData wd = new WeatherData();
                String curStr=sc.nextLine();
                String[] splitStr = curStr.trim().split("\\s+");

                if(!numberUtils.IsNumber(splitStr[0]))
                    continue;

                wd.day=splitStr[0];
                int max = Integer.parseInt(numberUtils.CleanString(splitStr[1]));
                int min = Integer.parseInt(numberUtils.CleanString(splitStr[2]));
                wd.variance=max-min;

                //System.out.printf("The day with the least temperature variance was %s and the value was %s..\n", wd.day, wd.variance);

                wdLIst.add(wd);
            }

            numberUtils.PrintSmallestDayVariance(wdLIst);
        }
        catch(Exception e){
            System.out.println("!!!!!!!!!!EXCEPTION:" + e.getMessage());

        }

    }
}

class WeatherData{
    String day;
    int variance;
}

class numberUtils{
    public static Boolean IsNumber(String inStr){
        //should turn into function
        try{
            Integer.parseInt(inStr);
        }
        catch (NumberFormatException e){
            return false;
        }

        return true;
    }

    public static String CleanString(String inStr){
        var str =  inStr.replace('*', ' ');
        return str.trim();

    }

    public static void PrintSmallestDayVariance(ArrayList<WeatherData> inList) {

        int variance = inList.get(0).variance;
        String day = "";

        for (WeatherData curWD : inList) {

            if(curWD.variance < variance) {
                variance = curWD.variance;
                day = curWD.day;
            }
        }

        System.out.printf("The day with the least temperature variance was %s and the value was %s..", day, variance);
    }

}