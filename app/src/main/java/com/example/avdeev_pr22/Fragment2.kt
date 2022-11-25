package com.example.avdeev_pr22

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    private lateinit var infoTextView: TextView
    private lateinit var ItemImageView: ImageView
    private lateinit var ItemDescriptions: Array<String>

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
        ItemImageView = view.findViewById(R.id.imageView)
        ItemDescriptions = resources.getStringArray(R.array.items)
    }
    fun setDescription(buttonIndex: Int) {
        val description: String = ItemDescriptions[buttonIndex]
        infoTextView.text = description
        when (buttonIndex) {
            1 -> ItemImageView.setImageResource(R.drawable.lin)
            2 -> ItemImageView.setImageResource(R.drawable.pen)
            3 -> ItemImageView.setImageResource(R.drawable.pencil)
        }
    }
}