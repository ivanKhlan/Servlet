import javax.servlet.http.HttpServletRequest;

public class Timezone {

    public static String getTimezone(HttpServletRequest req) {

        return req.getParameter("timezone");
    }

    public static String[] parsing(String time) {
        String[] argument;

        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ' ') {
                argument = time.split(" ");
                TimeServlet.sign = "+";
                return argument;
            } else if (time.charAt(i) == '-') {
                argument = time.split("-");
                TimeServlet.sign = "-";
                return argument;
            }

        }
        if (TimeServlet.sign == null) {
            return new String[]{time};
        }
        return null;
    }
}
