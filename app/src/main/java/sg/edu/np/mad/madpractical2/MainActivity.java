package sg.edu.np.mad.madpractical2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // initialising a new User object
        User user = new User("Fariha Tasnim", "MAD Developer :P", 1, false);

        // get TextViews and Button from layout
        TextView tvName = findViewById(R.id.titleTextView);
        TextView tvDescription = findViewById(R.id.descriptionTextView);
        Button btnFollow = findViewById(R.id.followButton);
        Button btnMessage = findViewById(R.id.messageButton);

        // set TextViews with user's name, description, and default button message
        tvName.setText(user.getName());
        tvDescription.setText(user.getDescription());
        btnFollow.setText("Follow");
        btnMessage.setText("Message");
    }

}