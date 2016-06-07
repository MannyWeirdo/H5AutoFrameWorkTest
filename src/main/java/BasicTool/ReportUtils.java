package BasicTool;

import java.util.List;

import org.testng.ITestResult;
import org.uncommons.reportng.ReportNGUtils;

public class ReportUtils extends ReportNGUtils {

    public List<String> getTestOutput(final ITestResult result) {
        final List<String> output = super.getTestOutput(result);
        final Exception error = (Exception) result.getAttribute("reportGeneratingException");

        if (error != null) {
            output.add("Generating report error: " + error);
            return output;
        }
        List<String> attribute = (List<String>) result.getAttribute("screenshots");
        List<String> screenshots = attribute;
        if (!screenshots.isEmpty()) {
            for (String str : screenshots) {
                // String str1 = "<a href=\"../../" + str + "\" target=\"_blank\">Screenshot</a>";

                String str1 = "<li><img src=\"../../" + str + "\" alt=\"\"+ data-large-src=\"../../" + str + "\"></li>";
                output.add(str1);
            }
        }
        return output;
    }
}
