package ramdan.ramdanhagi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView browser = (WebView) findViewById(R.id.about);
        browser.loadData("" +
                "<html>" +
                " <body>" +
                " <title>About Aplikasi </title>" +
                "<p>" +
                "<p>" +
                "Aplikasi ini aplikasi pencatatan waktu olahraga." +
                "<p>" +
                "Aplikasi ini dibuat oleh : <br/>" +
                "(1406089) - Ramdan Abdul Hk Alrosid <br/>" +
                "Teknik Informatika C <br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}