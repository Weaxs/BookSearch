import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.weaxsey.QuickStart;
import org.weaxsey.allsagesbooks.api.IAllsagesbook;
import org.weaxsey.domain.BookMessage;

@SpringBootTest(classes = QuickStart.class)
@RunWith(SpringRunner.class)
public class AllsagesbookTest {

    private static final Logger logger = LoggerFactory.getLogger(AllsagesbookTest.class);

    @Autowired
    private IAllsagesbook allsagesbook;

    @Test
    public void getBookTest() {
        BookMessage book = new BookMessage();
        book.setBookName("傲慢与偏见");
//        book.setBookName("月落荒寺");
//        book.setBookName("pride and prejudice");
        JSONObject re = allsagesbook.getBookMessageByRequest(book);
        logger.info(re.toJSONString());
    }
}
