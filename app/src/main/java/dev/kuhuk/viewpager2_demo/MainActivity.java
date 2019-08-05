package dev.kuhuk.viewpager2_demo;

import androidx.appcompat.app.AppCompatActivity;
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
        viewPager();

        view_pager.setAdapter(new AdapterViewPager(this, view_pager));
    }

    private void viewPager() {
/*        view_pager.setPageTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                if (position <= -1.0F) {
                    view_pager.setAlpha(0);
                } else if (position < 0F) {
                    view_pager.setAlpha(1);
                    view_pager.setTranslationX((int) ((float) (view_pager.getWidth()) * -position));
                } else if (position >= 0F) {
                    view_pager.setAlpha(1);
                } else if (position > 1.0F) {
                    view_pager.setAlpha(0);
                }
            }
        });*/

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
