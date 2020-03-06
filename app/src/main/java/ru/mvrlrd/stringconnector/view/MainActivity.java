package ru.mvrlrd.stringconnector.view;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import ru.mvrlrd.stringconnector.R;
import ru.mvrlrd.stringconnector.presenter.Presenter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends MvpAppCompatActivity implements MainView {
    private static final String TAG = "MainActivity";
    @InjectPresenter
    Presenter presenter;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonPresenter(editText.getText().toString());
            }
        };
        Button button = findViewById(R.id.button);
        button.setOnClickListener(onClickListener);
        Log.d(TAG,"onCreate");
    }

    @Override
    public void setText(String s) {
        Log.d(TAG,"setText "+ s);
        textView.setText(s);
    }
}
