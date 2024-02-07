package com.example.webhook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public void handleWebhook(@RequestBody WebhookPayload payload) {
        // Your webhook handling logic here
        System.out.println("Received webhook payload: " + payload);

        // Extract data from the payload
        String eventType = payload.getEvent();
        String accountId = payload.getData().getAccountId();
        String envelopeId = payload.getData().getEnvelopeId();

        // Perform actions based on the event type
        if ("envelope-sent".equals(eventType)) {
            // Example: Process envelope sent event
            processEnvelopeSentEvent(accountId, envelopeId);
        } else {
            // Unknown event type
            System.out.println("Unknown event type: " + eventType);
        }
    }

    private void processEnvelopeSentEvent(String accountId, String envelopeId) {
        // Example: Handle envelope sent event
        System.out.println("Envelope sent for account " + accountId + ", envelope ID: " + envelopeId);
    }
}
