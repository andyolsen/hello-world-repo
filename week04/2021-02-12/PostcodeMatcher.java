package mypackage;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PostcodeMatcher extends TypeSafeMatcher<Postcode> {

    @Override
    public boolean matchesSafely(Postcode p) {
        String s = p.getValue();
        return s != null && s.matches("^\\d{4}$");
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a valid Norwegian postcode");
    }

    @Factory
    public static Matcher<Postcode> isAValidPostCode() {
        return new PostcodeMatcher();
    }
}
