package dev.kuhuk.viewpager2_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import dev.kuhuk.viewpager2_demo.transformations.DepthPageTransformer;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_pager = findViewById(R.id.view_pager);
        viewPagerInit();
        view_pager.setAdapter(new FragmentStateAdapter(this) {
            @Override
            public int getItemCount() {
                return 10;
            }

            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return new PhotoFragment();
            }
        });
    }

    private void viewPagerInit() {
        view_pager.setPageTransformer(new DepthPageTransformer());
        view_pager.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        view_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        });
    }
}
