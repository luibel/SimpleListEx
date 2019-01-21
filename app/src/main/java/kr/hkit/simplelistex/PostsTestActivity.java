package kr.hkit.simplelistex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PostsTestActivity extends AppCompatActivity implements View.OnClickListener {

    EditText postEditText;
    Button addButton;
    ListView postsListView;

    ArrayAdapter<String> postsAdapter;
    List<String> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts_test);

        postEditText = findViewById(R.id.postEditText);
        addButton = findViewById(R.id.addButton);
        postsListView = findViewById(R.id.postsListView);

        posts = new ArrayList<>();

        postsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, posts);
        postsListView.setAdapter(postsAdapter);

        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String post = postEditText.getText().toString();
        postEditText.setText("");

        posts.add(post);
        postsAdapter.notifyDataSetChanged();
    }
}
