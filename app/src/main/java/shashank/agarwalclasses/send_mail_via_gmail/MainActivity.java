package shashank.agarwalclasses.send_mail_via_gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText sender_mail, message;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sender_mail = findViewById(R.id.sender_mail);
        message = findViewById(R.id.message);

    }

    public void send(View view) {
        String s = sender_mail.getText().toString().trim();
        String subject = "Subject of the mail";
        String message_string = message.getText().toString().trim();
        JavaMailAPI javaMailAPI = new JavaMailAPI(MainActivity.this, s, subject, message_string);
        javaMailAPI.execute();


    }
}