//package dev.kuhuk.viewpager2_demo.transformations;
//
//import android.view.View;
//import androidx.viewpager2.widget.ViewPager2;
//import dev.kuhuk.viewpager2_demo.R;
//
//public class CustomPageTransformer implements ViewPager2.PageTransformer {
//    public void transformPage(View view, float position) {
//        int pageWidth = view.getWidth();
//        if (position < -1) { // [-Infinity,-1)
//            // This page is way off-screen to the left
//        } else if (position <= 0) { // [-1,0]
//            // This page is moving out to the left
//
//            // Counteract the default swipe
//            view.setTranslationX(pageWidth * -position);
//            if (contentView != null) {
//                // But swipe the contentView
//                contentView.setTranslationX(pageWidth * position);
//            }
//            if (imageView != null) {
//                // Fade the image in
//                imageView.setAlpha(1 + position);
//            }
//
//        } else if (position <= 1) { // (0,1]
//            // This page is moving in from the right
//
//            // Counteract the default swipe
//            view.setTranslationX(pageWidth * -position);
//            if (contentView != null) {
//                // But swipe the contentView
//                contentView.setTranslationX(pageWidth * position);
//            }
//            if (imageView != null) {
//                // Fade the image out
//                imageView.setAlpha(1 - position);
//            }
//        } else { // (1,+Infinity]
//            // This page is way off-screen to the right
//        }
//    }
//}