import org.openqa.selenium.By;

public class Locators {
    //Search page
    public static final By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_MAX_AGE = By.cssSelector("select#age_max");
    public static final By DROP_DOWN_MIN_AGE = By.cssSelector("select#age_min");
    public static final By BUTTON_SEARCH = By.cssSelector("input#main_search_button_user_advanced");
    public static final By DROP_DOWN_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By PHOTOS_OF_WOMEN = By.xpath("//a[@class='g-pic-border g-rounded']");
    public static final By DROP_DOWN_BY_NAME = By.xpath("//div[@class='form-inline']//option[@value='name']");

    //Registration page
    public static final By LINK_SIGN_IN = By.cssSelector("a[href='https://romanceabroad.com/users/login_form']");
    public static final By EMAIL = By.cssSelector("#email");
    public static final By PASSWORD = By.cssSelector("#password");
    public static final By USER_NAME_INPUT_FIELD = By.cssSelector("#nickname");
    public static final By PHONE_INPUT_FIELD = By.cssSelector("input[name='data[phone]']");
    public static final By BIRTHDATE_DAY = By.cssSelector("#daySelect");
    public static final By BIRTHDATE_MONTH = By.cssSelector("#monthSelect");
    public static final By BIRTHDATE_YEAR = By.cssSelector("#yearSelect");
    public static final By CONFIRMATION_CHECKBOX = By.cssSelector("#confirmation");
    public static final By EMAIL_INPUT_FIELD = By.xpath("//input[@name='email']");
    public static final By PASSWORD_INPUT_FIELD = By.xpath("//input[@name='password']");
    public static final By TOOLTIP_ERROR_MESSAGE = By.xpath("//div[@class='tooltip']");
    public static final By SIGN_IN_BUTTON_MODAL_WINDOW = By.xpath("//div[@class='col-xs-12']//button[@type='submit']");
    public static final By SIGN_IN_BUTTON_LOGIN_FORM_PAGE = By.xpath("//div[@class='col-sm-12']//button[@type='submit']");
    public static final By JOIN_FOR_FREE_NOW_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By BIRTHDATE_DAY_SELECT = By.xpath("//ul//li[@data-handler='selectDay']");
    public static final By BIRTHDATE_MONTH_SELECT = By.xpath("//ul//li[@data-handler='selectMonth']");
    public static final By BIRTHDATE_YEAR_SELECT = By.xpath("//ul//li[@data-handler='selectYear']");
    public static final By LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//li");
    public static final By AUTOFILLING_FORM_LOCATION = By.xpath("//div[@class='input-group countries-input__input-group']//input[@class='form-control']");


    //Media page
    public static final By LINK_PHOTOS = By.xpath("//a[text()='PHOTOS']");
    public static final By DROP_DOWN_MEDIA = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    public static final By TAB_LINKS = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By TAB_HOME = By.xpath("//a[text()='HOME']");
    public static final By PHOTO_VIDEO_ALBUMS = By.xpath("//li[@class='b-tabs__item ']");
    public static final By DROP_DOWN_MEDIA_BY_VIEWS_COUNT = By.xpath("//select[@class='form-control']//option[@value='views']");


    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By LEFT_MENU = By.xpath("//div[@class='clearfix']");
    public static final By INFO_CONTENT_BLOG = By.xpath("//div[@class='info-content-block wysiwyg']//a");
    public static final By BACK_BUTTON_BLOG_PAGE = By.xpath("//ul//li[@class='back']");
    public static final By INFO_MENU_LEFT_SIDE = By.xpath("//div[@class='info-menu-inner']//a");

    //How we work
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By PAGE_CONTENT_LEFT_MENU = By.xpath("//div[@class='info-menu-inner']");
    public static final By MENU_SIGN_TOP_TAB = By.xpath("//a[@class='uam-top link-open-menu btn-slide']");
    public static final By LEFT_MENU_CONTENT = By.xpath("//div[@id='slidemenu']");
    public static final By LEFT_MENU_ITEMS = By.xpath("//li[@class='menu-group ']");

    //Gifts page
    public static final By LINK_GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By GIFT_TITLE = By.cssSelector(".title");
    public static final By BESTSELLERS = By.xpath("//div[@class='text-overflow']");
    public static final By BESTSELLERS_QUICK_VIEW = By.xpath("//div[@class='title-block pt5']");

    //Main page youtube
    public static final By YOUTUBE_BUTTON = By.cssSelector(".ytp-large-play-button.ytp-button");
    public static final By YOUTUBE_LINK = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");

    //Tour to Ukraine page
    public static final By PAY_WITH_PAYPAL_BUTTON = By.xpath("//a[@class='btn btn-primary btn-block'][@href='https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CNUP836ZN9G36']");

    //Contact us page
    public static final By YOUR_NAME = By.cssSelector("input[name='user_name']");
    public static final By YOUR_EMAIL = By.cssSelector("input[name='user_email']");
    public static final By SUBJECT = By.cssSelector("input[name='subject']");
    public static final By MESSAGE = By.cssSelector("textarea[name='message']");
    public static final By REASON_DROP_DOWN_LIST_CONTACT_US_PAGE = By.xpath("//select[@name='id_reason']");
    public static final By LIST_OF_REASONS = By.xpath("//select[@name='id_reason']//option");

    //Common
    public static final By TITLE = By.xpath("//h1");
    public static final By FOOTER_HELP = By.xpath("//a[@href='https://romanceabroad.com/tickets/']//div[@class='footer-menu-list-group-item-text']");

    //10 xpath with 2 attributes
    //MAIN PAGE
    public static final By REQUEST_TOUR_INFO = By.xpath("//a[@class='btn btn-primary btn-xl js-scroll-trigger'][@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    public static final By JOIN_TODAY_BUTTON = By.xpath("//a[@href='#'][@data-action='show-registration-block']");
    public static final By BOOK_NOW_SAVE_60_BUTTON = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine'][@style='color: #fff;']");
    //How we work page
    public static final By SIGN_GIFTS_TOP_TAB = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets'][@data-item='txt']");
    public static final By MENU_SIGN = By.xpath("//a[@class='uam-top link-open-menu btn-slide'][@data-slidemenu='#slidemenu']");
    public static final By FIND_PEOPLE_BUTTON = By.xpath("//button[@id='main_search_button_user_line'][@class='btn btn-primary btn-white']");
    public static final By TOUR_TO_UKRAINE_SIGN_TOP_TAB = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine'][@data-item='txt']");
    public static final By LOGIN_BUTTON_TOP_TAB = By.xpath("//a[@id='ajax_login_link'][@class='top-menu-item']");
    public static final By CROSS_TOP_TAB = By.xpath("//span[@id='slidemenu-close'][@class='fa fa-times close_left_menu']");
    public static final By FIND_PEOPLE_LEFT_MENU = By.xpath("//input[@type='text'][@class='form-control search-for-mobile']");


    //10 xpath with 2 parents
    //Pretty women
    public static final By LIST_VIEW = By.xpath("//div//div[@class='menu']//a[@title='List view']");
    public static final By GALLERY_VIEW = By.xpath("//div//div[@class='menu']//a[@title='Gallery view']");
    //Photos
    public static final By PHOTO_SORT_BUTTON = By.xpath("div//li[@data-param='photo']//a[@href='https://romanceabroad.com/media/photo']");
    public static final By VIDEO_SORT_BUTTON = By.xpath("//div//li[@data-param='video']//a[@href='https://romanceabroad.com/media/video']");
    public static final By ALL_SORT_BUTTON = By.xpath("//div[@class='col-sm-6 col-md-9']//li//a[@href='https://romanceabroad.com/media/all']");
    public static final By ADD_PHOTO_BUTTON = By.xpath("//div[@class='row g-flatty-block__header']//div//button[@class='btn btn-secondary']");
    public static final By ADD_PHOTO_DROP_DOWN = By.xpath("//div//div[@class='btn-group']//button[@class='btn btn-secondary dropdown-toggle']");
    //Gifts
    public static final By SPA_QUICK_VIEW_BUTTON = By.xpath("//div//div[@id='product_quick_view_2']//input[@class='btn btn-primary']");
    public static final By SPA_BUTTON = By.xpath("//div//a[@href='https://romanceabroad.com/store/sweets/2-massage_spa']//div[@class='text-overflow']");
    public static final By SEARCH_BUTTON = By.xpath("//div[@class='input-group input-group no-padding-left']//span//button[@id='search_friend']");
}
