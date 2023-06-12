package inc.fabudi.dynamicui

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.size
import com.bumptech.glide.Glide

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val ll = findViewById<LinearLayout>(R.id.ll)
        findViewById<View>(R.id.add).setOnClickListener {
            val iv = ImageView(this)
            iv.layoutParams = ViewGroup.LayoutParams(
                resources.getDimension(R.dimen.imageSize).toInt(),
                resources.getDimension(R.dimen.imageSize).toInt()
            )
            Glide.with(this).load("https://loremflickr.com/300/300?t=${System.currentTimeMillis()}").centerCrop().into(iv)
            ll.addView(iv)
        }
        findViewById<View>(R.id.remove).setOnClickListener {
            if (ll.size != 0) ll.removeViewAt(ll.size - 1)
        }
    }
}