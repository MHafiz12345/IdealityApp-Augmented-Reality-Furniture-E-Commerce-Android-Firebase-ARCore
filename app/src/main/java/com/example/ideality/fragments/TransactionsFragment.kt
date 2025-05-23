package com.example.ideality.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ideality.R
import com.example.ideality.activities.Home
import com.example.ideality.databinding.FragmentTransactionsBinding
import com.google.android.material.tabs.TabLayoutMediator

class TransactionsFragment : Fragment() {
    private var _binding: FragmentTransactionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTransactionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hide the main toolbar when transaction fragment is shown
        (requireActivity() as? Home)?.let { homeActivity ->
            homeActivity.findViewById<View>(R.id.toolbar)?.visibility = View.GONE
        }

        setupViewPager()

    }

    private fun setupViewPager() {
        binding.viewPager.adapter = TransactionsPagerAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Ongoing"
                1 -> "Completed"
                else -> ""
            }
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()

        // Show the main toolbar again when leaving transaction fragment
        (requireActivity() as? Home)?.let { homeActivity ->
            homeActivity.findViewById<View>(R.id.toolbar)?.visibility = View.VISIBLE
        }

        _binding = null
    }

    private inner class TransactionsPagerAdapter(fragment: Fragment) :
        FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> OrderListFragment.newInstance(isCompleted = false)
                1 -> OrderListFragment.newInstance(isCompleted = true)
                else -> throw IllegalArgumentException("Invalid position $position")
            }
        }
    }

    companion object {
        fun newInstance() = TransactionsFragment()
    }
}