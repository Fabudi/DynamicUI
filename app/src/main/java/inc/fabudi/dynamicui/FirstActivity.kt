package inc.fabudi.dynamicui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        val iv = findViewById<ImageView>(R.id.imageView1)
        val textView = findViewById<View>(R.id.hidden)
        Glide.with(this).load("https://loremflickr.com/300/300?t=${System.currentTimeMillis()}").centerCrop().into(iv)
        findViewById<Button>(R.id.show).setOnClickListener {
            iv.visibility = View.VISIBLE
            textView.visibility = View.INVISIBLE
        }
        findViewById<Button>(R.id.hide).setOnClickListener {
            iv.visibility = View.INVISIBLE
            textView.visibility = View.VISIBLE
        }
    }
}