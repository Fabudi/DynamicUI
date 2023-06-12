package inc.fabudi.dynamicui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.toScreen1).setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
        findViewById<Button>(R.id.toScreen2).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        findViewById<Button>(R.id.toScreen3).setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}