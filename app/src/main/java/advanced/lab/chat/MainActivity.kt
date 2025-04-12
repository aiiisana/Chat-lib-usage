package advanced.lab.chat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import advanced.lab.chatlibrary.ChatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Запуск чата
        val button = findViewById<Button>(R.id.startChatButton)
        button.setOnClickListener {
            ChatActivity.start(this) // вызов метода start() из библиотеки
        }
    }
}