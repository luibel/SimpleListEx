package kr.hkit.simplelistex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button posts1Button;
    Button posts2Button;
    Button posts3Button;
    Button postsTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        posts1Button = findViewById(R.id.posts1Button);
        posts2Button = findViewById(R.id.posts2Button);
        posts3Button = findViewById(R.id.posts3Button);
        postsTestButton = findViewById(R.id.postsTestButton);

        posts1Button.setOnClickListener(this);
        posts2Button.setOnClickListener(this);
        posts3Button.setOnClickListener(this);
        postsTestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.posts1Button:
                intent = new Intent(this, Posts1Activity.class);
                break;
            case R.id.posts2Button:
                intent = new Intent(this, Posts2Activity.class);
                break;
            case R.id.posts3Button:
                intent = new Intent(this, Posts3Activity.class);
                break;
            case R.id.postsTestButton:
                intent = new Intent(this, PostsTestActivity.class);
                break;
        }
        startActivity(intent);
    }
}
