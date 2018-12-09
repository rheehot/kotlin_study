package study.kotlin.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

//import android.widget.TextView
// import android.view.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    val tvView = findViewById<TextView>(R.id.text);
//    findViewById<TextView>
//    fun addNumber(){
//
//    }

//    var mButton: Button = findViewById(R.id.button)
//    fun addNumber(v: View){
//        val currVal =
//    }

//    var objButton = findViewById<View>(R.id.button) as Button


    fun addNumber(v: View){
        val tvView = findViewById<TextView>(R.id.textHello)
//        val currVal = tvView.text.toString().toInt()
//        val nextVal = currVal + 1
//        textHello.text = nextVal.toString()
        textHello.text = 1.toString()
    }
}
