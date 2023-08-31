package gamari.design.abstract_factory.listfactory;

import gamari.design.abstract_factory.factory.Factory;
import gamari.design.abstract_factory.factory.Link;
import gamari.design.abstract_factory.factory.Page;
import gamari.design.abstract_factory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
