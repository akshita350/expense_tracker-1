package com.example.expense_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton createExpense = findViewById(R.id.new_expense);
        FloatingActionButton showHistory = findViewById(R.id.view_history);

        final Intent addExpenseActivityIntent =
                new Intent(this,addExpenseActivity.class);
        final Intent historyActivityIntent =
                new Intent(this,addExpenseActivity.class);

        createExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(addExpenseActivityIntent);
            }
        });

        showHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(historyActivityIntent);
            }
        });

    }
}
