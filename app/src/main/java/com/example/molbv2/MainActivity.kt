package com.example.molbv2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ініціалізація кнопок
        findViewById<MaterialButton>(R.id.breathingExerciseButton).setOnClickListener {
            Toast.makeText(this, "Дихальні вправи", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialButton>(R.id.meditationButton).setOnClickListener {
            Toast.makeText(this, "Медитація", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialButton>(R.id.studyTimerButton).setOnClickListener {
            Toast.makeText(this, "Таймер навчання", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialButton>(R.id.stressTestButton).setOnClickListener {
            Toast.makeText(this, "Тест на стрес", Toast.LENGTH_SHORT).show()
        }

        findViewById<MaterialButton>(R.id.motivationButton).setOnClickListener {
            Toast.makeText(this, "Мотиваційні цитати", Toast.LENGTH_SHORT).show()
        }
    }
}