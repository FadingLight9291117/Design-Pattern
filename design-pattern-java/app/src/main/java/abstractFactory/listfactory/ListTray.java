package abstractFactory.listfactory;

import abstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>").append("\n");
        sb.append(caption).append("\n");
        sb.append("<ul>").append("\n");

        for (var i : tray) {
            sb.append(i.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
