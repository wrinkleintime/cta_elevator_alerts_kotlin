package com.github.cta_elevator_alerts_kotlin.ui


import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.cta_elevator_alerts_kotlin.R
import com.github.cta_elevator_alerts_kotlin.databinding.FragmentAboutBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {

        // Inflate view and obtain an instance of the binding class
        val binding: FragmentAboutBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_about,
                container,
                false
        )

        binding.txtPrivacy.movementMethod = LinkMovementMethod.getInstance()
        binding.txtContactEmail.movementMethod = LinkMovementMethod.getInstance()

//        //        val about = findViewById<ImageView>(R.id.img_home_icon)
//        about.visibility = View.INVISIBLE

        return binding.root
    }
}
