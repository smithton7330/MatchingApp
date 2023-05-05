package com.example.matchingapp.fragment.join

import android.content.Context
import android.graphics.Paint.Join
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.matchingapp.R
import com.example.matchingapp.activity.JoinActivity
import com.example.matchingapp.databinding.FragmentJoinCompletedBinding

class JoinCompletedFragment : Fragment() {
    private lateinit var binding: FragmentJoinCompletedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_join_completed, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gender = arguments?.getInt("gender")
        val height = arguments?.getInt("height")
        binding.joinCompletedTv.text = "gender: " + gender + "\nheight: " + height + "cm"
    }
}