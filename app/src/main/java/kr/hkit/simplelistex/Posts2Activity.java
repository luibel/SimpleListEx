package kr.hkit.simplelistex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Posts2Activity extends AppCompatActivity {

    ListView postsListView;
    ArrayAdapter<String> postsAdapter;
    String[] posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts2);

        postsListView = findViewById(R.id.postsListView);

        posts = new String[3];
        posts[0] = "Hello1";
        posts[1] = "Hello2";
        posts[2] = "Hello3";

        postsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posts);
        postsListView.setAdapter(postsAdapter);
    }
}
