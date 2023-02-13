import java.io.IOException;

public class Questions_43 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        launch_Notepad();
//        launch_Vls();
        launch_Chrome();
    }

    public static void launch_Notepad() throws IOException, InterruptedException {
        Runtime runtime=Runtime.getRuntime();
        Process process= runtime.exec("notepad.exe");
        Thread.sleep(4000);
        process.destroy();
    }


    public static void launch_Chrome() throws IOException, InterruptedException {
        Runtime runtime=Runtime.getRuntime();
        String[]str=new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","https://www.google.com"};
        Process process= runtime.exec(str);
        Thread.sleep(4000);
        process.destroy();
    }


    public static void launch_Vls() throws IOException, InterruptedException {
        Runtime runtime=Runtime.getRuntime();
        String[] str=new String[]{"c:\\program Files\\VideoLAN\\VLC\\vlc.exe",""};

    }
}

