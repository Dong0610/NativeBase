package com.dong.nativeapp.test

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View
import com.dong.nativeapp.canvas.drawRoundedPolygon

class test  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val starPoints = listOf(
            PointF(300f, 100f), 
            PointF(350f, 200f),
            PointF(450f, 200f),
            PointF(375f, 275f),
            PointF(400f, 375f),
            PointF(300f, 325f),
            PointF(200f, 375f),
            PointF(225f, 275f),
            PointF(150f, 200f),
            PointF(250f, 200f)
        )
        val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.BLUE
            style = Paint.Style.STROKE
            strokeWidth = 5f
            isAntiAlias= true
        }

        val radius = 40f 

        canvas.drawRoundedPolygon(starPoints, radius, paint)

    }
}