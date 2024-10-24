import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdkBuilder;
import com.azure.monitor.opentelemetry.exporter.AzureMonitorExporter;

public class ReproAiEnvConnStr
{
    public static void main(String[] args) {
        System.out.println(System.getenv("APPLICATIONINSIGHTS_CONNECTION_STRING"));
        
        AutoConfiguredOpenTelemetrySdkBuilder sdkBuilder = AutoConfiguredOpenTelemetrySdk.builder();
        AzureMonitorExporter.customize(sdkBuilder);
        OpenTelemetry openTelemetry = sdkBuilder.build().getOpenTelemetrySdk();
    }
}