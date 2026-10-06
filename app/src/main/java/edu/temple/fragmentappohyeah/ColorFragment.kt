package edu.temple.fragmentappohyeah

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val colors = arrayOf("Blue", "Red", "Green", "Black", "Purple", "Maroon", "Navy", "Teal", "Cyan")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply{
            setOnClickListener {
                setBackgroundColor(Color.parseColor(colors.random()))
            }
        }
    }

}