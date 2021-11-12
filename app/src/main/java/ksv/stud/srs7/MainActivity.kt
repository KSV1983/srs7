package ksv.stud.srs7

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val my_switch:Switch=findViewById(R.id.switch_1)
        val my_btn:Button=findViewById(R.id.btn1)

        my_btn.setOnClickListener(){
            my_switch.isChecked = !my_switch.isChecked
        }

    }
}



