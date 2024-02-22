package com.example.android_tab_views.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android_tab_views.R
import com.example.android_tab_views.databinding.FragmentHomeBinding
import com.example.android_tab_views.databinding.UserFragmentBinding

/**
 * A simple [Fragment] subclass.
 * Use the [UserFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UserFragment : Fragment() {

    private var _binding: UserFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // val inflate = inflater.inflate(R.layout.user_fragment, container, false)

        //Insert Code. . .
        _binding = UserFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.userText.text = "This is a cool textView"

        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}