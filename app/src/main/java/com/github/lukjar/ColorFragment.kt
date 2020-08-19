package com.github.lukjar

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment

private const val ARG_COLOR = "arg_color"

class ColorFragment : Fragment() {

    companion object {
        fun newInstance(@ColorInt color: Int): ColorFragment {
            return ColorFragment().apply {
                arguments = Bundle().apply { putInt(ARG_COLOR, color) }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(arguments?.getInt(ARG_COLOR) ?: Color.WHITE)
    }

}
