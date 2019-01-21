package kr.hkit.simplelistex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Posts3Activity extends AppCompatActivity {

    ListView postsListView;
    ArrayAdapter<String> postsAdapter;
    List<String> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts3);

        postsListView = findViewById(R.id.postsListView);
        posts = new ArrayList<>();
        String post1 = "Hello1";
        posts.add(post1);
        String post2 = "hello2";
        posts.add(post2);
        String post3 = "hello3";
        posts.add(post3);

        postsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posts);
        postsListView.setAdapter(postsAdapter);
    }
}
