package com.example.test_kotlin_images

import android.content.Intent
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

class messages_activity : AppCompatActivity(), GestureDetector.OnGestureListener{

    //gesture detector start
    lateinit var gestureDetector: GestureDetector
    var x2:Float = 0.0f
    var x1:Float = 0.0f
    var y2:Float = 0.0f
    var y1:Float = 0.0f

    companion object{
        const val MIN_DISTANCE = 150
    }
    //gesture detector end

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)
        //gesture detector inside onCreate function
        gestureDetector = GestureDetector(this, this)
    }
    //Left/Right detector functionality
    override fun onTouchEvent(event: MotionEvent?): Boolean {

        if (event != null) {
            gestureDetector.onTouchEvent(event)
        }

        when(event?.action){
            //start to swipe
            0->
            {
                x1 = event.x
                y1 = event.y
            }
            //end to swipe
            1->
            {
                x2 = event.x
                y2 = event.y
                val valueX:Float = x2-x1
                if(abs(valueX) > MainActivity.MIN_DISTANCE)
                {
                    //Right swipe to the MainActivity
                    if(x2 > x1)
                    {
                        Toast.makeText(this,"Right swipe", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    }
                    //Left swipe
                    else
                    {
                        Toast.makeText(this, "Left swipe", Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }

        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onShowPress(p0: MotionEvent) {
        //TODO("Not yet implemented")
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        //TODO("Not yet implemented")
        return false
    }

    override fun onLongPress(p0: MotionEvent) {
        //TODO("Not yet implemented")
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        //TODO("Not yet implemented")
        return false
    }

}