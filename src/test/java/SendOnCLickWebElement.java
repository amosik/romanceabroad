/*

import org.openqa.selenium.*;
import java.util.List;

public class SendOnCLickWebElement implements WebElement {

    private WebElement delegate;

    public SendOnCLickWebElement(WebElement delegate) {
        this.delegate = delegate;
    }

    @Override
    public void click() {
        delegate.sendKeys("\n");
    }

    @Override
    public void submit() {
        delegate.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        delegate.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public String getTagName() {
        return delegate.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        return delegate.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        return delegate.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return delegate.isEnabled();
    }

    @Override
    public String getText() {
        return delegate.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return delegate.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return delegate.findElement(by);
    }

    @Override
    public boolean isDisplayed() {
        return delegate.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return delegate.getLocation();
    }

    @Override
    public Dimension getSize() {
        return delegate.getSize();
    }

    @Override
    public Rectangle getRect() {
        return delegate.getRect();
    }

    @Override
    public String getCssValue(String s) {
        return delegate.getCssValue(s);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return delegate.getScreenshotAs(outputType);
    }
}
*/
