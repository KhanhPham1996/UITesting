package com.example.uitesting;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4ClassRunner.class)
public class SecondaryActivityTest {
    @Rule
    public ActivityScenarioRule<SecondaryActivity> activityRule =
            new ActivityScenarioRule(SecondaryActivity.class);

    @Test
    public void test_isActivityInView() {
        onView(withId(R.id.secondary)).check(matches(isDisplayed()));
    }
    @Test
    public void test_visibility_title_backButton() {
        onView(withId(R.id.activity_secondary_title))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_back))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_back))
                .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)));
    }
}