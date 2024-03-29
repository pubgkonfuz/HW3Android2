package com.example.hw3android2.noteapp.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw3android2.noteapp.ui.fragments.BoardFragment
import com.example.hw3android2.noteapp.ui.fragments.FirstFragment
import com.example.hw3android2.noteapp.ui.fragments.SecondFragment
import com.example.hw3android2.noteapp.ui.fragments.ThirdFragment

class RacersAdapter(fragment: BoardFragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
        0 -> FirstFragment()
        1 -> SecondFragment()
        else -> ThirdFragment()
        }
    }
}
