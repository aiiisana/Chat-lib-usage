package advanced.lab.chat

import advanced.lab.chatlibrary.ChatLauncher
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
//import com.github.aiiisana.chatlibrary.ChatLauncher

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startChatButton)
        button.setOnClickListener {
            ChatLauncher.start(this)
        }
    }
}

