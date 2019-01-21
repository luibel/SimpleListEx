package kr.hkit.simplelistex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Posts1Activity extends AppCompatActivity {

    ListView postsListView;
    ArrayAdapter<String> postsAdapter;
    String[] posts = {"hello1", "hello2", "hello3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts1);

        postsListView = findViewById(R.id.postsListView);

        postsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posts);
        postsListView.setAdapter(postsAdapter);
    }
}
