package Report;

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
        List<String> screenshots = (List<String>) result.getAttribute("screenshots");
        if (!screenshots.isEmpty()) {
            for (String str : screenshots) {
                String str1 = "<li><a href=\"../../" + str + "\" target=\"_blank\"><img src=\"../../" + str
                        + "\" alt=\"\"></a></li>";
                output.add(str1);
            }
        }
        return output;
    }
}
