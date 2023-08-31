package gamari.design.abstract_factory.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;

        try {
            Class<?> clazz = Class.forName(className);
            factory = (Factory) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(className + "が見つかりません。");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
