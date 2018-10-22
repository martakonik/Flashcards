package martakonik.flashcards.mainScreen

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import martakonik.flashcards.R
import martakonik.flashcards.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val adapter = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = adapter
        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.flashcard_list -> adapter.setCurrentPosition()
            }
            true
        }
    }
}