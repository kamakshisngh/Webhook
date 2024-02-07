package com.example.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebhookPayload {
    private String event;
    private Data data;

    // Getters and setters
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    // Inner class representing the "data" field
    public static class Data {
        private String accountId;
        private String envelopeId;

        // Getters and setters
        @JsonProperty("accountId")
        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        @JsonProperty("envelopeId")
        public String getEnvelopeId() {
            return envelopeId;
        }

        public void setEnvelopeId(String envelopeId) {
            this.envelopeId = envelopeId;
        }
    }
}

