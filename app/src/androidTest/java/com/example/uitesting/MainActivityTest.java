package com.example.uitesting;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.JUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {
//    @Test
//    public void test_isActivityInView() {
//        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
//        onView(withId(R.id.main)).check(matches(isDisplayed()));
//    }
//
//    @Test
//    public void test_visibility_title_nextButton() {
//        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
//        onView(withId(R.id.activity_main_title))
//                .check(matches(isDisplayed()));
//
//        onView(withId(R.id.button_next_activity))
//                .check(matches(isDisplayed()));
//
//        onView(withId(R.id.button_next_activity))
//                .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
//    }
//
//    @Test
//    public void test_isTitleTextDisplayed() {
//        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
//        onView(withId(R.id.activity_main_title))
//                .check(matches(withText(R.string.text_mainactivity)));
//    }


    @Test
    public void test_navSecondaryActivity  () {
        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.button_next_activity)).perform(click());
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));
    }

    @Test
    public void test_backPress_toMainActivity() {
        ActivityScenario activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.button_next_activity)).perform(click());
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));
      //  onView(withId(R.id.button_back)).perform(click());
        pressBack();
        onView(withId(R.id.main)).check(matches(isDisplayed()));


    }
}