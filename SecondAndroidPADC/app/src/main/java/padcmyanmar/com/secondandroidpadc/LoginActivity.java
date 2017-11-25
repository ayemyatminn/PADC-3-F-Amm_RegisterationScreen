package padcmyanmar.com.secondandroidpadc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by hp on 11/11/2017.
 */

public class LoginActivity extends AppCompatActivity {
    private Button btnlogin;
    private EditText etEmailOrPhone;
    private EditText etPassword;
    private TextView btnForgotPassword;
    private TextView btnUserCreate;


    private static final String CORRECT_EMAIL="abc@gmail.com";
    private static final String CORRECT_PASSWORD="Abcdefg";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmailOrPhone=findViewById(R.id.et_email_or_phone);
        etPassword=findViewById(R.id.et_password);
        btnForgotPassword=findViewById(R.id.btn_forgot_password);
        btnUserCreate=findViewById(R.id.btn_user_create);
        btnlogin=findViewById(R.id.btn_login);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaiiOrPhone=etEmailOrPhone.getText().toString();
                String password=etPassword.getText().toString();

                if (TextUtils.isEmpty(emaiiOrPhone)){
                    etEmailOrPhone.setError("Email or Phone cannot be empty.");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    etPassword.setError("Password cannot be empty.");
                }

                if (TextUtils.equals(emaiiOrPhone,CORRECT_EMAIL) && TextUtils.equals(password,CORRECT_PASSWORD)){
                    //Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_LONG).show();
                    Intent intent=Second_Android_PADC.newIntent(getApplicationContext());
                    startActivity(intent);
                }else{
                    Snackbar.make(view,"Incorrect email or password.Please try again.",Snackbar.LENGTH_INDEFINITE).show();
                }//                Snackbar.make(view, "You Clicked the button", Snackbar.LENGTH_LONG)
//                       .setAction("Action", null).show();

            }

        });
        btnForgotPassword.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Snackbar.make(v,"\"Forgot Password\" is coming soon",Snackbar.LENGTH_INDEFINITE).show();
            }
        });
        btnUserCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Registeration is coming Soon",Snackbar.LENGTH_INDEFINITE).show();
            }
        });
    }
}
