package gamari.design.abstract_factory.listfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gamari.design.abstract_factory.factory.Factory;
import gamari.design.abstract_factory.factory.Link;
import gamari.design.abstract_factory.factory.Page;
import gamari.design.abstract_factory.factory.Tray;

public class ListFactoryTest {
    @Test
    void test_integration() {
        Factory factory = Factory.getFactory("gamari.design.abstract_factory.listfactory.ListFactory");

        Link asahi = factory.createLink("朝日新聞", "/asahi");

        Tray traynews = factory.createTray("新聞");

        Page page = factory.createPage("LinkPage", "test");

        String expected = "<html><head><title>LinkPage</title></head>\n" + //
                "<body>\n" + //
                "<h1>LinkPage</h1><ul>\n" + //
                "</ul>\n" + //
                "<hr><address>test</address></body></html>\n";

        assertEquals(expected, page.makeHTML());
    }
}
