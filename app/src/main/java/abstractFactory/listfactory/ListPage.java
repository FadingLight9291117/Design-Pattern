package abstractFactory.listfactory;

import abstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>").append(title).append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>").append(title).append("</h1>\n");
        sb.append("<ul>\n");
        for (var i : this.contents) {
            sb.append(i.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>").append(author).append("</address>");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
