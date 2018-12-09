package study.kotlin.threebuttons

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHandler = ButtonHandler()
        findViewById<View>(R.id.button).setOnClickListener(buttonHandler)
        findViewById<View>(R.id.button).setOnClickListener(buttonHandler)
        findViewById<View>(R.id.button).setOnClickListener(buttonHandler)
    }

    inner class ButtonHandler: View.OnClickListener{
        override fun onClick(view:View){
            when(view.id){
                R.id.button  -> show("Button One")
                R.id.button2 -> show("Button Two")
                R.id.button3 -> show("Button Three")
            }
        }
    }
    internal  fun show(message: String){
        Toast.makeText(this,message, Toast.LENGTH_LONG).show()
        Log.i(javaClass.name, message)
    }

}
