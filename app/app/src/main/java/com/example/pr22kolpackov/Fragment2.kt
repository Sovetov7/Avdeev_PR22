package com.example.pr22kolpackov

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    private lateinit var infoTextView: TextView
    private lateinit var fruktImageView: ImageView
    private lateinit var fruktDescriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        infoTextView = view.findViewById(R.id.textView)
        fruktImageView = view.findViewById(R.id.imageView)
        fruktDescriptions = resources.getStringArray(R.array.frukts)
    }
    fun setDescription(buttonIndex: Int) {
        val description: String = fruktDescriptions[buttonIndex]
        infoTextView.text = description
        when (buttonIndex) {
            1 -> fruktImageView.setImageResource(R.drawable.apple)
            2 -> fruktImageView.setImageResource(R.drawable.persik)
            3 -> fruktImageView.setImageResource(R.drawable.grusha)
        }
    }

}