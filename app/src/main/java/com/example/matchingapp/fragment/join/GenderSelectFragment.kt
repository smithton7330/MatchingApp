package com.example.matchingapp.fragment.join

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.matchingapp.R
import com.example.matchingapp.activity.JoinActivity
import com.example.matchingapp.databinding.FragmentGenderSelectBinding

class GenderSelectFragment : Fragment() {
    private lateinit var binding: FragmentGenderSelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_gender_select, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.genderRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                R.id.gender_male -> JoinActivity().gender = 1
                R.id.gender_female -> JoinActivity().gender = 2
            }
        }

        // 다음 선택 사항인 신장
        binding.genderSelectButton.setOnClickListener {

        }
    }
}